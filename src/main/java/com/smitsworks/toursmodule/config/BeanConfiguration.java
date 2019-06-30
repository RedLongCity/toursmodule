package com.smitsworks.toursmodule.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import static java.util.concurrent.TimeUnit.SECONDS;

@Configuration
@ComponentScan(basePackages = "com.smitsworks.toursmodule")
@PropertySource("classpath:application.properties")
public class BeanConfiguration {

    private static final Logger log = LogManager.getLogger();

    @Bean
    public RestTemplate getRestTemplate(@Value("${tours.module.rest.timeoutSeconds:2}") int timeout) {
        RestTemplate restTemplate = new RestTemplate();
        SimpleClientHttpRequestFactory factory
                = (SimpleClientHttpRequestFactory) restTemplate.getRequestFactory();
        factory.setReadTimeout((int) SECONDS.toMillis(timeout));
        factory.setConnectTimeout((int) SECONDS.toMillis(timeout));

        return restTemplate;
    }
}
