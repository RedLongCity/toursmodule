package com.smitsworks.toursmodule.model;

import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.Objects;

public class TourRequest {

    @Id
    private String id;
    private Integer type;
    private Integer kind;
    private Integer country;
    private Integer city;
    private String region;
    private String hotel;
    private String hotelRating;
    private Integer adultAmount;
    private Integer childAmount;
    private String childAge;
    private Integer nightFrom;
    private Integer nightTill;
    /**
     * dd/MM/yy
     */
    private LocalDate dateFrom;
    private LocalDate dateTill;

    private String mealType;
    private Integer priceFrom;
    private Integer priceTill;
    private Integer currency;
    private Integer onlyStandartPrice;
    private Integer page;
    private Integer itemsPerPage;
    private Integer hotelInfo;
    private LocalDate updateDate;

    public String getId() {
        return id;
    }

    public TourRequest setId(String id) {
        this.id = id;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public TourRequest setType(Integer type) {
        this.type = type;
        return this;
    }

    public Integer getKind() {
        return kind;
    }

    public TourRequest setKind(Integer kind) {
        this.kind = kind;
        return this;
    }

    public Integer getCountry() {
        return country;
    }

    public TourRequest setCountry(Integer country) {
        this.country = country;
        return this;
    }

    public Integer getCity() {
        return city;
    }

    public TourRequest setCity(Integer city) {
        this.city = city;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public TourRequest setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getHotel() {
        return hotel;
    }

    public TourRequest setHotel(String hotel) {
        this.hotel = hotel;
        return this;
    }

    public String getHotelRating() {
        return hotelRating;
    }

    public TourRequest setHotelRating(String hotelRating) {
        this.hotelRating = hotelRating;
        return this;
    }

    public Integer getAdultAmount() {
        return adultAmount;
    }

    public TourRequest setAdultAmount(Integer adultAmount) {
        this.adultAmount = adultAmount;
        return this;
    }

    public Integer getChildAmount() {
        return childAmount;
    }

    public TourRequest setChildAmount(Integer childAmount) {
        this.childAmount = childAmount;
        return this;
    }

    public String getChildAge() {
        return childAge;
    }

    public TourRequest setChildAge(String childAge) {
        this.childAge = childAge;
        return this;
    }

    public Integer getNightFrom() {
        return nightFrom;
    }

    public TourRequest setNightFrom(Integer nightFrom) {
        this.nightFrom = nightFrom;
        return this;
    }

    public Integer getNightTill() {
        return nightTill;
    }

    public TourRequest setNightTill(Integer nightTill) {
        this.nightTill = nightTill;
        return this;
    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public TourRequest setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
        return this;
    }

    public LocalDate getDateTill() {
        return dateTill;
    }

    public TourRequest setDateTill(LocalDate dateTill) {
        this.dateTill = dateTill;
        return this;
    }

    public String getMealType() {
        return mealType;
    }

    public TourRequest setMealType(String mealType) {
        this.mealType = mealType;
        return this;
    }

    public Integer getPriceFrom() {
        return priceFrom;
    }

    public TourRequest setPriceFrom(Integer priceFrom) {
        this.priceFrom = priceFrom;
        return this;
    }

    public Integer getPriceTill() {
        return priceTill;
    }

    public TourRequest setPriceTill(Integer priceTill) {
        this.priceTill = priceTill;
        return this;
    }

    public Integer getCurrency() {
        return currency;
    }

    public TourRequest setCurrency(Integer currency) {
        this.currency = currency;
        return this;
    }

    public Integer getOnlyStandartPrice() {
        return onlyStandartPrice;
    }

    public TourRequest setOnlyStandartPrice(Integer onlyStandartPrice) {
        this.onlyStandartPrice = onlyStandartPrice;
        return this;
    }

    public Integer getPage() {
        return page;
    }

    public TourRequest setPage(Integer page) {
        this.page = page;
        return this;
    }

    public Integer getItemsPerPage() {
        return itemsPerPage;
    }

    public TourRequest setItemsPerPage(Integer itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
        return this;
    }

    public Integer getHotelInfo() {
        return hotelInfo;
    }

    public TourRequest setHotelInfo(Integer hotelInfo) {
        this.hotelInfo = hotelInfo;
        return this;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public TourRequest setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TourRequest that = (TourRequest) o;
        return Objects.equals(type, that.type) &&
                Objects.equals(kind, that.kind) &&
                Objects.equals(country, that.country) &&
                Objects.equals(city, that.city) &&
                Objects.equals(region, that.region) &&
                Objects.equals(hotel, that.hotel) &&
                Objects.equals(hotelRating, that.hotelRating) &&
                Objects.equals(adultAmount, that.adultAmount) &&
                Objects.equals(childAmount, that.childAmount) &&
                Objects.equals(childAge, that.childAge) &&
                Objects.equals(nightFrom, that.nightFrom) &&
                Objects.equals(nightTill, that.nightTill) &&
                Objects.equals(dateFrom, that.dateFrom) &&
                Objects.equals(dateTill, that.dateTill) &&
                Objects.equals(mealType, that.mealType) &&
                Objects.equals(priceFrom, that.priceFrom) &&
                Objects.equals(priceTill, that.priceTill) &&
                Objects.equals(currency, that.currency) &&
                Objects.equals(onlyStandartPrice, that.onlyStandartPrice) &&
                Objects.equals(page, that.page) &&
                Objects.equals(itemsPerPage, that.itemsPerPage) &&
                Objects.equals(hotelInfo, that.hotelInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, kind, country, city, region, hotel, hotelRating, adultAmount, childAmount, childAge, nightFrom, nightTill, dateFrom, dateTill, mealType, priceFrom, priceTill, currency, onlyStandartPrice, page, itemsPerPage, hotelInfo);
    }

    @Override
    public String toString() {
        return "TourRequest{" +
                "id=" + id +
                "type=" + type +
                ", kind=" + kind +
                ", country=" + country +
                ", city=" + city +
                ", region='" + region + '\'' +
                ", hotel='" + hotel + '\'' +
                ", hotelRating='" + hotelRating + '\'' +
                ", adultAmount=" + adultAmount +
                ", childAmount=" + childAmount +
                ", childAge='" + childAge + '\'' +
                ", nightFrom=" + nightFrom +
                ", nightTill=" + nightTill +
                ", dateFrom=" + dateFrom +
                ", dateTill=" + dateTill +
                ", mealType='" + mealType + '\'' +
                ", priceFrom=" + priceFrom +
                ", priceTill=" + priceTill +
                ", currency=" + currency +
                ", onlyStandartPrice=" + onlyStandartPrice +
                ", page=" + page +
                ", itemsPerPage=" + itemsPerPage +
                ", hotelInfo=" + hotelInfo +
                ", updateDate=" + updateDate +
                '}';
    }
}
