package com.smitsworks.toursmodule.asynccontroller;

import com.google.common.collect.Lists;
import com.smitsworks.toursmodule.model.Tour;
import com.smitsworks.toursmodule.utils.ControllerUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(
        value = "/api",
        method = GET,
        produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class AsyncToursController {

    private static final Logger log = LogManager.getLogger();

    @Value("${async.back.tran.timeout:120000}")
    private Long apiTimeout;

    @Autowired
    @Qualifier("consumerMainExecutor")
    private Executor apiExecutor;

    @RequestMapping("/tours")
    public DeferredResult<ResponseEntity<List<Tour>>> getTours() {
        return ControllerUtils.prepareExecuted(() -> {
            List<Tour> tours = Lists.newArrayList(Collections.EMPTY_LIST);
            return tours;
        }, apiTimeout, apiExecutor);
    }



}
