package com.smitsworks.toursmodule.model.otpusk;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalTime;
import java.util.Map;

/**
 * tours/dates - даты и длительности для заполнения календаря формы поиска доступными датами
 * https://otpusk.api.domain/tours/dates?to=115&regionId=1&access_token=ACCESS_TOKEN
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Dates {

    @JsonIgnore
    private LocalTime expired = LocalTime.now();

    private String api_version;
    private double time;
    private Map<String, String> dates;
}
