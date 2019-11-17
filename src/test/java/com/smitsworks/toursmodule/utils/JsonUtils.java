package com.smitsworks.toursmodule.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;

public class JsonUtils {

    private static final Logger log = LogManager.getLogger();

    /**
     * For not instant
     */
    private JsonUtils() {
    }

    public static JsonNode getJsonFromResources(String path) {
        JsonNode result = null;
        File file = new File(JsonUtils.class.getClassLoader().getResource(path).getFile());
        ObjectMapper mapper = new ObjectMapper();
        try {
            result = mapper.readTree(file);
        } catch (IOException ex) {
            log.error(ex);
        }
        return result;
    }

}
