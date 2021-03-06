package com.smitsworks.toursmodule.model.otpusk.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.time.LocalTime;
import java.util.Map;

/**
 * tours/operators - список операторов
 * https://otpusk.api.domain/tours/operators?countryId=115&regionId=1&access_token=ACCESS_TOKEN
 */
@EqualsAndHashCode
@Data
public class Operators {

    @JsonIgnore
    @EqualsAndHashCode.Exclude
    private LocalTime expired = LocalTime.now();

    private Map<String, OperatorBean> operators;
    private String api_version;
    private double time;

    @EqualsAndHashCode
    @Data
    public static class OperatorBean {
        /**
         * id : 3019
         * name : AdriaHit
         * url : http://www.adriahit.com
         * countries : {"109":"Словения","134":"Хорватия","135":"Черногория"}
         * currencies : {"EUR":"27.86","USD":"25.44"}
         */

        private String id;
        private String name;
        private String url;
        private Map<String, String> countries;
        private Map<String, String> currencies;

    }
}
