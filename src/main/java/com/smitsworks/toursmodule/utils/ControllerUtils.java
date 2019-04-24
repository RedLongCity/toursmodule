package com.smitsworks.toursmodule.utils;

import com.google.common.base.Throwables;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.context.request.async.DeferredResult;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

/**
 * Некоторые утилитные методя для контроллеров
 *
 * @author E.Yusipiv
 */
public class ControllerUtils {

    private static final Logger LOG = LogManager.getLogger(ControllerUtils.class);
    private static final Object RESULT_NONE = new Object();

    public static <T> DeferredResult<ResponseEntity<T>> prepareExecuted(
            Supplier<T> supplier, Long deferredTimeout, Executor executor) {

        return prepareExecuted(supplier, deferredTimeout, executor, RESULT_NONE);
    }

    /**
     * Создаёт обёртку для асинхронных запросов на основании пар. supplier, и
     * отправляет на выполнение в executor
     *
     * @param <T> тип возвращаемого значения метода supplier
     * @param supplier обёртка над кодом, который выполнится в асинхронном
     * режиме
     * @param deferredTimeout таймаут нахождения обьекта отложенного результата
     * в очереди executor`а
     * @param executor сервис-"выполнялка" для supplier
     * @param defaultResult обьект ответа, в случае таймаута deferredTimeout
     * @return
     */
    public static <T> DeferredResult<ResponseEntity<T>> prepareExecuted(Supplier<T> supplier,
                                                                        Long deferredTimeout, Executor executor, Object defaultResult) {

        DeferredResult<ResponseEntity<T>> result = new DeferredResult<>(deferredTimeout, defaultResult);
        CompletableFuture<T> supplied = CompletableFuture.supplyAsync(supplier, executor);

        result.onTimeout(() -> supplied.cancel(true));

        supplied
                .thenApply(res -> new ResponseEntity<>(res, HttpStatus.OK))
                .thenApply(result::setErrorResult)
                .exceptionally(thrwbl -> {
                    // TODO here need to add an exception registration in MSG service
                    logErrors(thrwbl);
                    return result.setErrorResult(new ResponseEntity<>("{}", HttpStatus.INTERNAL_SERVER_ERROR));
                });

        return result;
    }

    private static void logErrors(Throwable thrwbl) {
        if (thrwbl.getCause() != null
                && thrwbl.getCause().getClass().isAssignableFrom(CancellationException.class)) {
            LOG.error("Error: {}. CompletionException happened during to try cancel already runned thread.", thrwbl.getMessage());
        } else {
            LOG.error("{}\n{}", thrwbl.getMessage(), Throwables.getStackTraceAsString(thrwbl));
        }
    }

    public static void writePdf(HttpServletResponse response, byte[] data, String name) {

        response.setHeader("Content-Disposition", "inline; filename=\"" + name + "\"");
        response.setContentType("application/pdf");
        response.setHeader("Accept-Ranges", "bytes");

        try (OutputStream os = response.getOutputStream()) {
            os.write(data);
            os.flush();
        } catch (IOException ex) {
            LOG.error("Can't write receipt to output.", ex);
        }
    }

    /**
     * ствтический обработчик исключений для контроллеров
     *
     * @param ex
     * @param req
     * @param resp
     * @throws IOException в случае ошибки записи ответа
     */
    public static void handleException(Throwable ex, HttpServletRequest req, HttpServletResponse resp) throws IOException {

        if (ex instanceof IOException) {
            LOG.error("IO error: {}", ex.getMessage());
            resp.setHeader("Content-Type", "application/json");
            resp.sendError(500, "{}");
        } else if (RestClientResponseException.class.isAssignableFrom(ex.getClass())) {
            LOG.error(((RestClientResponseException) ex).getResponseBodyAsString());
            resp.setHeader("Content-Type", "application/json");
            resp.sendError(500, "{}");
        } else if (HttpMessageNotReadableException.class.isAssignableFrom(ex.getClass())) {
            LOG.error("{}", ex.getMessage());
            resp.setHeader("Content-Type", "application/json");
            resp.sendError(230, "{\"error\": \"Request body is invalid.\", \"cause\":\"" + ex.getMessage() + "\"}");
        } else {
            LOG.error("{}", ex.getMessage(), ex);
            resp.setHeader("Content-Type", "application/json");
            resp.sendError(500, "{}");
        }
    }
}
