package com.smitsworks.toursmodule.convertor;

import org.springframework.web.util.DefaultUriBuilderFactory;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class RequestPathBuilder {

    private Map<String, Object> params;

    public RequestPathBuilder addParam(String key, Object value) {
        if (this.params == null) {
            this.params = new HashMap<>();
        }
        if (key != null && value != null)
            this.params.put(key, value);
        return this;
    }

    public URI build() {
        return new DefaultUriBuilderFactory().builder().build(params);
    }

}
