package com.smitsworks.toursmodule.model.otpusk;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;

import java.util.Map;
import java.util.Objects;

/**
 * tours/static - статические данные
 * https://otpusk.api.domain/tours/static?access_token=ACCESS_TOKEN
 */
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

    public String getImageHost() {
        return imageHost;
    }

    public void setImageHost(String imageHost) {
        this.imageHost = imageHost;
    }

    public Map<String, String> getTransport() {
        return transport;
    }

    public PocketToursStaticData setTransport(Map<String, String> transport) {
        this.transport = transport;
        return this;
    }

    public Map<String, String> getStars() {
        return stars;
    }

    public PocketToursStaticData setStars(Map<String, String> stars) {
        this.stars = stars;
        return this;
    }

    public Map<String, String> getFood() {
        return food;
    }

    public PocketToursStaticData setFood(Map<String, String> food) {
        this.food = food;
        return this;
    }

    public Map<String, String> getCat() {
        return cat;
    }

    public PocketToursStaticData setCat(Map<String, String> cat) {
        this.cat = cat;
        return this;
    }

    public Map<String, String> getForm() {
        return form;
    }

    public PocketToursStaticData setForm(Map<String, String> form) {
        this.form = form;
        return this;
    }

    public Map<String, String> getRates() {
        return rates;
    }

    public PocketToursStaticData setRates(Map<String, String> rates) {
        this.rates = rates;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PocketToursStaticData data = (PocketToursStaticData) o;
        return Objects.equals(id, data.id) &&
                Objects.equals(imageHost, data.imageHost) &&
                Objects.equals(transport, data.transport) &&
                Objects.equals(stars, data.stars) &&
                Objects.equals(food, data.food) &&
                Objects.equals(cat, data.cat) &&
                Objects.equals(form, data.form) &&
                Objects.equals(rates, data.rates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, imageHost, transport, stars, food, cat, form, rates);
    }

    @Override
    public String toString() {
        return "PocketToursStaticData{" +
                "id='" + id + '\'' +
                ", imageHost='" + imageHost + '\'' +
                ", transport=" + transport +
                ", stars=" + stars +
                ", food=" + food +
                ", cat=" + cat +
                ", form=" + form +
                ", rates=" + rates +
                '}';
    }
}