package com.smitsworks.toursmodule.config.async;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.AsyncListenableTaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@EnableAsync
@Configuration
public class AsyncConfig {

    @Bean(name = "mainExecutor", destroyMethod = "shutdown")
    public AsyncListenableTaskExecutor getAsyncExecutor(
            @Value("${v24.executor.corePoolSize:3}") int corePoolSize,
            @Value("${v24.executor.maxPoolSize:30}") int maxPoolSize,
            @Value("${v24.executor.queueCapacity:250}") int queueCapacity,
            @Value("${v24.executor.threadNamePrefix:apiConsumerThread-}") String prefix) {

        return newTaskExecutor(corePoolSize, maxPoolSize, queueCapacity, prefix);
    }

    @Bean(name = "consumerMainExecutor", destroyMethod = "shutdown")
    public AsyncListenableTaskExecutor consumerMainExecutor(
            @Value("${v24.consumerMainExecutor.corePoolSizeя:3}") int corePoolSize,
            @Value("${v24.consumerMainExecutor.maxPoolSize:30}") int maxPoolSize,
            @Value("${v24.consumerMainExecutor.queueCapacity:250}") int queueCapacity,
            @Value("${v24.consumerMainExecutor.threadNamePrefix:apiConsumerThread-}") String prefix) {

        return newTaskExecutor(corePoolSize, maxPoolSize, queueCapacity, prefix);
    }

    private static AsyncListenableTaskExecutor newTaskExecutor(
            int corePoolSize, int maxPoolSize, int queueCapacity, String prefix) {

        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(corePoolSize);
        executor.setMaxPoolSize(maxPoolSize);
        executor.setQueueCapacity(queueCapacity);
        executor.setThreadNamePrefix(prefix);
        executor.initialize();

        return executor;
    }
}
