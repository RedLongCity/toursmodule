package com.smitsworks.toursmodule.model.otpusk.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;

import java.time.LocalTime;
import java.util.Map;

/**
 * tours/dates - даты и длительности для заполнения календаря формы поиска доступными датами
 * https://otpusk.api.domain/tours/dates?to=115&regionId=1&access_token=ACCESS_TOKEN
 */
@Data
@EqualsAndHashCode
public class Dates {

    @JsonIgnore
    @EqualsAndHashCode.Exclude
    private LocalTime expired = LocalTime.now();

    @Id
    @JsonIgnore
    private String id = "_id";

    private String api_version;
    private double time;
    private Map<String, String> dates;
}
