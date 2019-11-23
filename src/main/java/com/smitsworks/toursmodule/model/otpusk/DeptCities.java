package com.smitsworks.toursmodule.model.otpusk;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;

import java.time.LocalTime;
import java.util.List;
import java.util.Objects;

/**
 * tours/deptCities - список городов вылета
 * https://otpusk.api.domain/tours/deptCities?geoId=55&access_token=ACCESS_TOKEN
 */
public class DeptCities {

    /**
     * deptCities : [{"id":"1925","name":"Белая Церковь","rel":"Белой Церкви"},{"id":"1934","name":"Винница","rel":"Винницы"},{"id":"1874","name":"Днепр","rel":"Днепра"},{"id":"2056","name":"Житомир","rel":"Житомира","selected":true},{"id":"1875","name":"Запорожье","rel":"Запорожья"},{"id":"1760","name":"Ивано-Франковск","rel":"Ивано-Франковска"},{"id":"1544","name":"Киев","rel":"Киева"},{"id":"1883","name":"Кривой Рог","rel":"Кривого Рога"},{"id":"2024","name":"Луцк","rel":"Луцка"},{"id":"1397","name":"Львов","rel":"Львова"},{"id":"2166","name":"Мелитополь","rel":"Мелитополя"},{"id":"1963","name":"Николаев","rel":"Николаева"},{"id":"1358","name":"Одесса","rel":"Одессы"},{"id":"1952","name":"Полтава","rel":"Полтавы"},{"id":"1981","name":"Ровно","rel":"Ровно"},{"id":"1962","name":"Сумы","rel":"Сум"},{"id":"1398","name":"Ужгород","rel":"Ужгорода"},{"id":"1698","name":"Умань","rel":"Умани"},{"id":"1880","name":"Харьков","rel":"Харькова"},{"id":"2012","name":"Херсон","rel":"Херсона"},{"id":"2025","name":"Хмельницкий","rel":"Хмельницкого"},{"id":"1708","name":"Черновцы","rel":"Черновцов"}]
     * api_version : 2.4
     * time : 0.0055
     */

    @JsonIgnore
    private LocalTime expired = LocalTime.now();

    private String api_version;
    private double time;
    private List<DeptCitiesBean> deptCities;

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

    public List<DeptCitiesBean> getDeptCities() {
        return deptCities;
    }

    public void setDeptCities(List<DeptCitiesBean> deptCities) {
        this.deptCities = deptCities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeptCities that = (DeptCities) o;
        return Double.compare(that.time, time) == 0 &&
                Objects.equals(api_version, that.api_version) &&
                Objects.equals(deptCities, that.deptCities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(api_version, time, deptCities);
    }

    @Override
    public String toString() {
        return "DeptCities{" +
                "api_version='" + api_version + '\'' +
                ", time=" + time +
                ", deptCities=" + deptCities +
                '}';
    }

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

        public String getRel() {
            return rel;
        }

        public void setRel(String rel) {
            this.rel = rel;
        }

        public boolean isSelected() {
            return selected;
        }

        public void setSelected(boolean selected) {
            this.selected = selected;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            DeptCitiesBean that = (DeptCitiesBean) o;
            return selected == that.selected &&
                    Objects.equals(id, that.id) &&
                    Objects.equals(name, that.name) &&
                    Objects.equals(rel, that.rel);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, rel, selected);
        }

        @Override
        public String toString() {
            return "DeptCitiesBean{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", rel='" + rel + '\'' +
                    ", selected=" + selected +
                    '}';
        }
    }
}
