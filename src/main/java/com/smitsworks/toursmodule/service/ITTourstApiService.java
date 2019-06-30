package com.smitsworks.toursmodule.service;

import com.smitsworks.toursmodule.model.Filters;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class ITTourstApiService {

    private static final Logger log = LogManager.getLogger();

    private final String filtersUrl;
    private final String authToken;

    private final RestTemplate restTemplate;

    public ITTourstApiService(RestTemplate restTemplate,
                              @Value("it.tours.url.params") String filtersUrl,
                              @Value("it.tours.token") String token) {
        this.restTemplate = restTemplate;
        this.filtersUrl = filtersUrl;
        this.authToken = token;
    }

    public Optional<Filters> getFilters() {
        Optional<Filters> result;
        ResponseEntity<Filters> filtersResponseEntity = restTemplate.exchange(filtersUrl, HttpMethod.GET, getItToursHttpEntity("ru"), Filters.class);
        if (filtersResponseEntity.getStatusCode() == HttpStatus.FORBIDDEN) {
            log.error("\n\tAPI ITTours returned Status Forbidden." +
                    "\n\t Possibly ip of deployed machine changed, or incorrect token");
            return Optional.empty();
        }
    }

    public HttpEntity getItToursHttpEntity(String lang) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", authToken);
        headers.add("Accept-Language", lang);
        HttpEntity httpEntity = new HttpEntity(headers);
    }
}
