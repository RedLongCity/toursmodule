package com.smitsworks.toursmodule.model.otpusk;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalTime;
import java.util.Map;
import java.util.Objects;

/**
 * tours/dates - даты и длительности для заполнения календаря формы поиска доступными датами
 * https://otpusk.api.domain/tours/dates?to=115&regionId=1&access_token=ACCESS_TOKEN
 */
public class Dates {

    @JsonIgnore
    private LocalTime expired = LocalTime.now();

    private String api_version;
    private double time;
    private Map<String, String> dates;

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

    public Map<String, String> getDates() {
        return dates;
    }

    public void setDates(Map<String, String> dates) {
        this.dates = dates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dates dates1 = (Dates) o;
        return Double.compare(dates1.time, time) == 0 &&
                Objects.equals(api_version, dates1.api_version) &&
                Objects.equals(dates, dates1.dates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(api_version, time, dates);
    }

    @Override
    public String toString() {
        return "Dates{" +
                "api_version='" + api_version + '\'' +
                ", time=" + time +
                ", dates=" + dates +
                '}';
    }
}
