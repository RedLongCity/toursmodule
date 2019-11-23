package com.smitsworks.toursmodule.model.otpusk;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalTime;
import java.util.Map;
import java.util.Objects;

/**
 * tours/operators - список операторов
 * https://otpusk.api.domain/tours/operators?countryId=115&regionId=1&access_token=ACCESS_TOKEN
 */
public class Operators {

    @JsonIgnore
    private LocalTime expired = LocalTime.now();

    private Map<String, OperatorBean> operators;
    private String api_version;
    private double time;

    public Map<String, OperatorBean> getOperators() {
        return operators;
    }

    public void setOperators(Map<String, OperatorBean> operators) {
        this.operators = operators;
    }

    public String getApi_version() {
        return api_version;
    }

    public void setApi_version(String api_version) {
        this.api_version = api_version;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Operators operators1 = (Operators) o;
        return Double.compare(operators1.time, time) == 0 &&
                Objects.equals(operators, operators1.operators) &&
                Objects.equals(api_version, operators1.api_version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operators, api_version, time);
    }

    @Override
    public String toString() {
        return "Operators{" +
                "operators=" + operators +
                ", api_version='" + api_version + '\'' +
                ", time=" + time +
                '}';
    }

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

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public Map<String, String> getCountries() {
            return countries;
        }

        public void setCountries(Map<String, String> countries) {
            this.countries = countries;
        }

        public Map<String, String> getCurrencies() {
            return currencies;
        }

        public void setCurrencies(Map<String, String> currencies) {
            this.currencies = currencies;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            OperatorBean that = (OperatorBean) o;
            return Objects.equals(id, that.id) &&
                    Objects.equals(name, that.name) &&
                    Objects.equals(url, that.url) &&
                    Objects.equals(countries, that.countries) &&
                    Objects.equals(currencies, that.currencies);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, url, countries, currencies);
        }

        @Override
        public String toString() {
            return "OperatorBean{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", url='" + url + '\'' +
                    ", countries=" + countries +
                    ", currencies=" + currencies +
                    '}';
        }
    }
}
