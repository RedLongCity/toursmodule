package com.smitsworks.toursmodule.model.otpusk.request;

import java.time.LocalDate;
import java.util.List;

public class SearchRequest extends AbstractRequest {

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


    public SearchRequest(String prefix, String accessToken) {
        super(prefix, accessToken);
    }
}
