package com.smitsworks.toursmodule.model.otpusk.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * tours/regions - список городов пользователя (с определением рекомендуемого по IP)
 * https://otpusk.api.domain/tours/regions?access_token=ACCESS_TOKEN
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Regions {

    /**
     * regions : [{"id":"1922","name":"Александрия","deptCities":"1874,1544,1875","rel":"Александрии","IPselected":false},{"id":"1811","name":"Белая Церковь","deptCities":"1544","rel":"Белой Церкви","IPselected":false},{"id":"1813","name":"Борисполь","deptCities":"1544","rel":"Борисполя","IPselected":false},{"id":"1816","name":"Бровары","deptCities":"1544","rel":"Броваров","IPselected":false},{"id":"5072","name":"Буча","deptCities":"1928","rel":"Бучи","IPselected":false},{"id":"1012","name":"Винница","deptCities":"1934,1544,2101,1907","rel":"Винницы","IPselected":false},{"id":"3","name":"Днепр","deptCities":"1874,1875,1880,1544","rel":"Днепра","IPselected":false},{"id":"1415","name":"Житомир","deptCities":"1544,1397,1760","rel":"Житомира","IPselected":true},{"id":"1614","name":"Запорожье","deptCities":"1875,1874,1870,1880,1544,1358","rel":"Запорожья","IPselected":false},{"id":"1714","name":"Ивано-Франковск","deptCities":"1397,1708,1544,1358","rel":"Ивано-Франковска","IPselected":false},{"id":"1822","name":"Ирпень","deptCities":"1544","rel":"Ирпеня","IPselected":false},{"id":"3117","name":"Каменец-Подольский","deptCities":"1544","rel":"Каменца-Подольского","IPselected":false},{"id":"1212","name":"Каменское","deptCities":"2378,1874,1875,1870,1880,1544","rel":"Каменского","IPselected":false},{"id":"1","name":"Киев","deptCities":"1544,1358,1874,1880,1397,1870","rel":"Киева","IPselected":false},{"id":"1116","name":"Ковель","deptCities":"1397,1544","rel":"Ковеля","IPselected":false},{"id":"1323","name":"Краматорск","deptCities":"1544","rel":"Краматорска","IPselected":false},{"id":"2599","name":"Кременчуг","deptCities":"1544,1874,1880,1358","rel":"Кременчуга","IPselected":false},{"id":"1231","name":"Кривой Рог","deptCities":"1883,1875,1874,1358,1544","rel":"Кривого Рога","IPselected":false},{"id":"1916","name":"Кропивницкий","deptCities":"1544","rel":"Кропивницкого","IPselected":false},{"id":"3577","name":"Лисичанск","deptCities":"1544","rel":"Лисичанска","IPselected":false},{"id":"1117","name":"Луцк","deptCities":"1397,1907,1544","rel":"Луцка","IPselected":false},{"id":"5","name":"Львов","deptCities":"1397,1760,1544,1358","rel":"Львова","IPselected":false},{"id":"3574","name":"Мариуполь","deptCities":"1877,1870,1874,1880,1875,1544","rel":"Мариуполя","IPselected":false},{"id":"5101","name":"Мена","deptCities":"","rel":"Мены","IPselected":false},{"id":"2319","name":"Николаев","deptCities":"1358,2101,1544","rel":"Николаева","IPselected":false},{"id":"4","name":"Одесса","deptCities":"1358,1544,1875,1874,1870,1880","rel":"Одессы","IPselected":false},{"id":"1218","name":"Павлоград","deptCities":"2263,1874,1875,1870,1880,1544","rel":"Павлограда","IPselected":false},{"id":"2523","name":"Полтава","deptCities":"1952,1544,1880,1874","rel":"Полтавы","IPselected":false},{"id":"2622","name":"Ровно","deptCities":"1981,1544","rel":"Ровно","IPselected":false},{"id":"3579","name":"Северодонецк","deptCities":"2402,1879,1870,1880,1874,1875,1544","rel":"Северодонецка","IPselected":false},{"id":"3582","name":"Стрый","deptCities":"2401,1397,1760,1544,1358","rel":"Стрыя","IPselected":false},{"id":"2720","name":"Сумы","deptCities":"1880,1544,1874","rel":"Сум","IPselected":false},{"id":"2821","name":"Тернополь","deptCities":"1397,1544,1358","rel":"Тернополя","IPselected":false},{"id":"2228","name":"Трускавец","deptCities":"1357,1397,1760,1544,1358","rel":"Трускавца","IPselected":false},{"id":"1519","name":"Ужгород","deptCities":"1397,1544,1358","rel":"Ужгорода","IPselected":false},{"id":"2","name":"Харьков","deptCities":"1880,1874,1870,1544,1875,1358","rel":"Харькова","IPselected":false},{"id":"3023","name":"Херсон","deptCities":"2012,1358,1874,1544","rel":"Херсона","IPselected":false},{"id":"3126","name":"Хмельницкий","deptCities":"2025,1544,1397,1358","rel":"Хмельницкого","IPselected":false},{"id":"3223","name":"Черкассы","deptCities":"1544,1874,2101,1878","rel":"Черкасс","IPselected":false},{"id":"3326","name":"Чернигов","deptCities":"1544","rel":"Чернигова","IPselected":false},{"id":"3421","name":"Черновцы","deptCities":"1708,1760,1397,1544","rel":"Черновцов","IPselected":false},{"id":"2417","name":"Черноморск","deptCities":"2100,1358,1544,1875,1874,1870,1880","rel":"Черноморска","IPselected":false},{"id":"3575","name":"Чоп","deptCities":"1878,1760,1397,1544","rel":"Чопа","IPselected":false}]
     * api_version : 2.4
     * time : 0.3638
     */

    @Id
    @JsonIgnore
    private String id = "_id";

    private String api_version;
    private double time;
    private List<RegionsBean> regions;

    @Getter
    @Setter
    @EqualsAndHashCode
    @ToString
    public static class RegionsBean {
        /**
         * id : 1922
         * name : Александрия
         * deptCities : 1874,1544,1875
         * rel : Александрии
         * IPselected : false
         */

        private String id;
        private String name;
        private String deptCities;
        private String rel;
        @JsonSetter("IPselected")
        private boolean iPselected;
    }
}
