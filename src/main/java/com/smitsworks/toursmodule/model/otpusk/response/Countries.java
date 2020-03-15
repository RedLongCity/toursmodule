package com.smitsworks.toursmodule.model.otpusk.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * tours/countries - список стран
 * https://otpusk.api.domain/tours/countries?with=price&access_token=ACCESS_TOKEN
 */
@Data
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Countries {

    @Id
    @JsonIgnore
    private String id = "_id";

    private String api_version;
    private double time;
    private List<CountriesBean> countries;

    @Data
    @EqualsAndHashCode
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CountriesBean {
        /**
         * id : 7
         * name : Австралия
         * nameVn : Австралию
         * namePr : Австралии
         * iso : au
         * iata : AUL
         * code : Australia
         * visa :
         * transport : air
         * default : usd
         * lat : -28.8447
         * lng : 135.08791
         * zoom : 4
         * bold : false
         */

        private int id;
        private String name;
        private String nameVn;
        private String namePr;
        private String iso;
        private String iata;
        private String code;
        private String visa;
        private String transport;

        @JsonSetter("default")
        private String defaultX;

        private double lat;
        private double lng;
        private int zoom;
        private boolean bold;
        private double uah;
        private double price;
        private String currency;
    }
}
