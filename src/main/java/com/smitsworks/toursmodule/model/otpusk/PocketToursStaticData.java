package com.smitsworks.toursmodule.model.otpusk;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.util.Map;

/**
 * tours/static - статические данные
 * https://otpusk.api.domain/tours/static?access_token=ACCESS_TOKEN
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class PocketToursStaticData {

    /**
     * imageHost : http://newimg.otpusk.com
     * transport : {"air":"авіа","bus":"автобус","train":"поїзд","ship":"морський","trainbus":"залізнично-автобусний тур","no":"без транспорту"}
     * stars : {"one":"1*","two":"2*","three":"3*","four":"4*","five":"5*"}
     * food : {"ob":"без харчування","bb":"сніданки","hb":"сніданок і вечеря","fb":"повний пансіон","al":"все включено","ai":"все включено","uai":"ультра все включено"}
     * cat : {"beach":"пляжний","ski":"гірськолижний","city":"екскурсійний","treat":"лікувальний","eco":"екологічний"}
     * form : {"hotel":"готель","inn":"гостиница","hostel":"хостел","pension":"пансіонат","sanatorium":"санаторій","recreation":"базавідпочинку","apartment":"апартаменти","cottage":"котедж","camp":"дитячийтабір"}
     * rates : {"eur":"29.43","rub":"0.416","usd":"26.8"}
     */

    @Id
    @JsonIgnore
    private String id = "_id";

    private String imageHost;
    private Map<String, String> transport;
    private Map<String, String> stars;
    private Map<String, String> food;
    private Map<String, String> cat;
    private Map<String, String> form;
    private Map<String, String> rates;
}