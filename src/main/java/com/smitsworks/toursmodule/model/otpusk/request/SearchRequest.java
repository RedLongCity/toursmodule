package com.smitsworks.toursmodule.model.otpusk.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SearchRequest {

    @Id
    private Integer id;

    @JsonIgnore
    private LocalDateTime expired;

    private int deptCity;
    private String to;
    private LocalDate checkIn;
    private LocalDate checkTo;
    private int length;
    private int lengthTo;
    private String people;
    private List<String> food;
    private List<String> transport;
    private List<String> stars;
    private List<String> services;
    private String rate;
    private int reviews;
    private String cat;
    private String form;
    private int price;
    private int priceTo;
    private String currency;
    private int number;
    private int page;
    private boolean show;
    private boolean shorT;
    private boolean returnNow;
    private List<String> hotelsList;
    private List<String> notHotelsList;
    private List<String> toCitiesList;
    private List<String> toOperators;
    private String availableFlight;
    private String stopSale;
    private boolean noPromo;
    private boolean offerId;
    private boolean tsr;

    public Integer setId() {
        this.id = this.hashCode();
        return this.id;
    }
}
