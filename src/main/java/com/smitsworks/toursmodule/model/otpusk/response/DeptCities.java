package com.smitsworks.toursmodule.model.otpusk.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.time.LocalTime;
import java.util.List;

/**
 * tours/deptCities - список городов вылета
 * https://otpusk.api.domain/tours/deptCities?geoId=55&access_token=ACCESS_TOKEN
 */
@EqualsAndHashCode
@Data
public class DeptCities {

    /**
     * deptCities : [{"id":"1925","name":"Белая Церковь","rel":"Белой Церкви"},{"id":"1934","name":"Винница","rel":"Винницы"},{"id":"1874","name":"Днепр","rel":"Днепра"},{"id":"2056","name":"Житомир","rel":"Житомира","selected":true},{"id":"1875","name":"Запорожье","rel":"Запорожья"},{"id":"1760","name":"Ивано-Франковск","rel":"Ивано-Франковска"},{"id":"1544","name":"Киев","rel":"Киева"},{"id":"1883","name":"Кривой Рог","rel":"Кривого Рога"},{"id":"2024","name":"Луцк","rel":"Луцка"},{"id":"1397","name":"Львов","rel":"Львова"},{"id":"2166","name":"Мелитополь","rel":"Мелитополя"},{"id":"1963","name":"Николаев","rel":"Николаева"},{"id":"1358","name":"Одесса","rel":"Одессы"},{"id":"1952","name":"Полтава","rel":"Полтавы"},{"id":"1981","name":"Ровно","rel":"Ровно"},{"id":"1962","name":"Сумы","rel":"Сум"},{"id":"1398","name":"Ужгород","rel":"Ужгорода"},{"id":"1698","name":"Умань","rel":"Умани"},{"id":"1880","name":"Харьков","rel":"Харькова"},{"id":"2012","name":"Херсон","rel":"Херсона"},{"id":"2025","name":"Хмельницкий","rel":"Хмельницкого"},{"id":"1708","name":"Черновцы","rel":"Черновцов"}]
     * api_version : 2.4
     * time : 0.0055
     */

    @JsonIgnore
    @EqualsAndHashCode.Exclude
    private LocalTime expired = LocalTime.now();

    private String api_version;
    private double time;
    private List<DeptCitiesBean> deptCities;

    @EqualsAndHashCode
    @Data
    public static class DeptCitiesBean {
        /**
         * id : 1925
         * name : Белая Церковь
         * rel : Белой Церкви
         * selected : true
         */

        private String id;
        private String name;
        private String rel;
        private boolean selected;
    }
}
