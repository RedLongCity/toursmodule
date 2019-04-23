package com.smitsworks.toursmodule.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RequestPathBuilder {

    private Map<String, Object> params;

    public RequestPathBuilder addParam(String key, Object value) {
        if (this.params == null) {
            this.params = new HashMap<>();
        }
        if (key != null)
            this.params.put(key, value);
        return this;
    }

    public String build() {
        String result = null;
        if (this.params != null) {
            result = this.params.entrySet().stream()
                    .map(entry -> entry.getKey() + "=" + entry.getValue().toString())
                    .collect(Collectors.joining("&"));
        }
        return result;
    }

}
