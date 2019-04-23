package com.smitsworks.toursmodule.model;

import com.smitsworks.toursmodule.utils.RequestPathBuilder;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.Objects;

public class TourRequest implements RequestConvertor {

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

    public void setId(String id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getKind() {
        return kind;
    }

    public void setKind(Integer kind) {
        this.kind = kind;
    }

    public Integer getCountry() {
        return country;
    }

    public void setCountry(Integer country) {
        this.country = country;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getHotelRating() {
        return hotelRating;
    }

    public void setHotelRating(String hotelRating) {
        this.hotelRating = hotelRating;
    }

    public Integer getAdultAmount() {
        return adultAmount;
    }

    public void setAdultAmount(Integer adultAmount) {
        this.adultAmount = adultAmount;
    }

    public Integer getChildAmount() {
        return childAmount;
    }

    public void setChildAmount(Integer childAmount) {
        this.childAmount = childAmount;
    }

    public String getChildAge() {
        return childAge;
    }

    public void setChildAge(String childAge) {
        this.childAge = childAge;
    }

    public Integer getNightFrom() {
        return nightFrom;
    }

    public void setNightFrom(Integer nightFrom) {
        this.nightFrom = nightFrom;
    }

    public Integer getNightTill() {
        return nightTill;
    }

    public void setNightTill(Integer nightTill) {
        this.nightTill = nightTill;
    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDate getDateTill() {
        return dateTill;
    }

    public void setDateTill(LocalDate dateTill) {
        this.dateTill = dateTill;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public Integer getPriceFrom() {
        return priceFrom;
    }

    public void setPriceFrom(Integer priceFrom) {
        this.priceFrom = priceFrom;
    }

    public Integer getPriceTill() {
        return priceTill;
    }

    public void setPriceTill(Integer priceTill) {
        this.priceTill = priceTill;
    }

    public Integer getCurrency() {
        return currency;
    }

    public void setCurrency(Integer currency) {
        this.currency = currency;
    }

    public Integer getOnlyStandartPrice() {
        return onlyStandartPrice;
    }

    public void setOnlyStandartPrice(Integer onlyStandartPrice) {
        this.onlyStandartPrice = onlyStandartPrice;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getItemsPerPage() {
        return itemsPerPage;
    }

    public void setItemsPerPage(Integer itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
    }

    public Integer getHotelInfo() {
        return hotelInfo;
    }

    public void setHotelInfo(Integer hotelInfo) {
        this.hotelInfo = hotelInfo;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String getRequestConvertedToPath() {
        RequestPathBuilder builder = new RequestPathBuilder();
        return builder
                .addParam("type", getType())
                .addParam("kind", getKind())
                .addParam("country", getCountry())
                .addParam("from_city", getCity())
                .addParam("region", getRegion())
                .addParam("hotel", getHotel())
                .addParam("hotel_rating", getHotelRating())
                .addParam("adult_amount", getAdultAmount())
                .addParam("child_amount", getChildAmount())
                .addParam("child_age", getChildAge())
                .addParam("night_from", getNightFrom())
                .addParam("night_till", getNightTill())
                .addParam("date_from", getDateFrom())
                .addParam("date_till", getDateTill())
                .addParam("meal_type", getMealType())
                .addParam("price_from", getPriceFrom())
                .addParam("price_till", getPriceTill())
                .addParam("currency", getCurrency())
                .addParam("only_standard_price", getOnlyStandartPrice())
                .addParam("page", getPage())
                .addParam("items_per_page", getItemsPerPage())
                .addParam("hotel_info", getHotelInfo())
                .build();
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
