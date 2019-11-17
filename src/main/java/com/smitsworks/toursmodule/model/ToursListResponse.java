package com.smitsworks.toursmodule.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

public class ToursListResponse {

    /**
     * page : 1
     * items_per_page : 100
     * offers : [{"key":"01-03-1e3fb3891a40c9025d145e58014b80d4","type":1,"country":"Египет","region_id":5996,"region":"Шарм Эль Шейх","hotel_id":68,"hotel":"Luna Sharm","hotel_rating":"4","meal_type":"BB","meal_type_full":"Завтрак","adult_amount":2,"child_amount":0,"accomodation":"DBL","room_type":"Standart","duration":6,"date_from":"2017-01-26","is_combined":0,"currency_id":1,"prices":{"1":483,"2":12509,"10":434},"from_city":"Киев","transport_type":"flight","operator_id":7,"operator":"Tez Tour","hotel_images":[{"full":"http://ittour.com.ua/images/hotel_image/2/1/6/6/6/file_name/21666.jpg","thumb":"http://ittour.com.ua/images/hotel_image_thumb/2/1/6/6/6/file_name/21666.jpg","is_main":0}],"hotel_review_rate":"2.3","hotel_review_count":12,"hotel_facilities":[{"id":"1","name":"Wi-fi","category_id":"1","category":"Интернет","is_main":0,"is_paid":0}]}]
     * has_more_pages : true
     */

    private int page;
    private int items_per_page;
    private boolean has_more_pages;
    private List<OffersBean> offers;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getItems_per_page() {
        return items_per_page;
    }

    public void setItems_per_page(int items_per_page) {
        this.items_per_page = items_per_page;
    }

    public boolean isHas_more_pages() {
        return has_more_pages;
    }

    public void setHas_more_pages(boolean has_more_pages) {
        this.has_more_pages = has_more_pages;
    }

    public List<OffersBean> getOffers() {
        return offers;
    }

    public void setOffers(List<OffersBean> offers) {
        this.offers = offers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToursListResponse that = (ToursListResponse) o;
        return page == that.page &&
                items_per_page == that.items_per_page &&
                has_more_pages == that.has_more_pages &&
                Objects.equals(offers, that.offers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(page, items_per_page, has_more_pages, offers);
    }

    public static class OffersBean {
        /**
         * key : 01-03-1e3fb3891a40c9025d145e58014b80d4
         * type : 1
         * country : Египет
         * region_id : 5996
         * region : Шарм Эль Шейх
         * hotel_id : 68
         * hotel : Luna Sharm
         * hotel_rating : 4
         * meal_type : BB
         * meal_type_full : Завтрак
         * adult_amount : 2
         * child_amount : 0
         * accomodation : DBL
         * room_type : Standart
         * duration : 6
         * date_from : 2017-01-26
         * is_combined : 0
         * currency_id : 1
         * prices : {"1":483,"2":12509,"10":434}
         * from_city : Киев
         * transport_type : flight
         * operator_id : 7
         * operator : Tez Tour
         * hotel_images : [{"full":"http://ittour.com.ua/images/hotel_image/2/1/6/6/6/file_name/21666.jpg","thumb":"http://ittour.com.ua/images/hotel_image_thumb/2/1/6/6/6/file_name/21666.jpg","is_main":0}]
         * hotel_review_rate : 2.3
         * hotel_review_count : 12
         * hotel_facilities : [{"id":"1","name":"Wi-fi","category_id":"1","category":"Интернет","is_main":0,"is_paid":0}]
         */

        private String key;
        private int type;
        private String country;
        private int region_id;
        private String region;
        private int hotel_id;
        private String hotel;
        private String hotel_rating;
        private String meal_type;
        private String meal_type_full;
        private int adult_amount;
        private int child_amount;
        private String accomodation;
        private String room_type;
        private int duration;
        private String date_from;
        private int is_combined;
        private int currency_id;
        private PricesBean prices;
        private String from_city;
        private String transport_type;
        private int operator_id;
        private String operator;
        private String hotel_review_rate;
        private int hotel_review_count;
        private List<HotelImagesBean> hotel_images;
        private List<HotelFacilitiesBean> hotel_facilities;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public int getRegion_id() {
            return region_id;
        }

        public void setRegion_id(int region_id) {
            this.region_id = region_id;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public int getHotel_id() {
            return hotel_id;
        }

        public void setHotel_id(int hotel_id) {
            this.hotel_id = hotel_id;
        }

        public String getHotel() {
            return hotel;
        }

        public void setHotel(String hotel) {
            this.hotel = hotel;
        }

        public String getHotel_rating() {
            return hotel_rating;
        }

        public void setHotel_rating(String hotel_rating) {
            this.hotel_rating = hotel_rating;
        }

        public String getMeal_type() {
            return meal_type;
        }

        public void setMeal_type(String meal_type) {
            this.meal_type = meal_type;
        }

        public String getMeal_type_full() {
            return meal_type_full;
        }

        public void setMeal_type_full(String meal_type_full) {
            this.meal_type_full = meal_type_full;
        }

        public int getAdult_amount() {
            return adult_amount;
        }

        public void setAdult_amount(int adult_amount) {
            this.adult_amount = adult_amount;
        }

        public int getChild_amount() {
            return child_amount;
        }

        public void setChild_amount(int child_amount) {
            this.child_amount = child_amount;
        }

        public String getAccomodation() {
            return accomodation;
        }

        public void setAccomodation(String accomodation) {
            this.accomodation = accomodation;
        }

        public String getRoom_type() {
            return room_type;
        }

        public void setRoom_type(String room_type) {
            this.room_type = room_type;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public String getDate_from() {
            return date_from;
        }

        public void setDate_from(String date_from) {
            this.date_from = date_from;
        }

        public int getIs_combined() {
            return is_combined;
        }

        public void setIs_combined(int is_combined) {
            this.is_combined = is_combined;
        }

        public int getCurrency_id() {
            return currency_id;
        }

        public void setCurrency_id(int currency_id) {
            this.currency_id = currency_id;
        }

        public PricesBean getPrices() {
            return prices;
        }

        public void setPrices(PricesBean prices) {
            this.prices = prices;
        }

        public String getFrom_city() {
            return from_city;
        }

        public void setFrom_city(String from_city) {
            this.from_city = from_city;
        }

        public String getTransport_type() {
            return transport_type;
        }

        public void setTransport_type(String transport_type) {
            this.transport_type = transport_type;
        }

        public int getOperator_id() {
            return operator_id;
        }

        public void setOperator_id(int operator_id) {
            this.operator_id = operator_id;
        }

        public String getOperator() {
            return operator;
        }

        public void setOperator(String operator) {
            this.operator = operator;
        }

        public String getHotel_review_rate() {
            return hotel_review_rate;
        }

        public void setHotel_review_rate(String hotel_review_rate) {
            this.hotel_review_rate = hotel_review_rate;
        }

        public int getHotel_review_count() {
            return hotel_review_count;
        }

        public void setHotel_review_count(int hotel_review_count) {
            this.hotel_review_count = hotel_review_count;
        }

        public List<HotelImagesBean> getHotel_images() {
            return hotel_images;
        }

        public void setHotel_images(List<HotelImagesBean> hotel_images) {
            this.hotel_images = hotel_images;
        }

        public List<HotelFacilitiesBean> getHotel_facilities() {
            return hotel_facilities;
        }

        public void setHotel_facilities(List<HotelFacilitiesBean> hotel_facilities) {
            this.hotel_facilities = hotel_facilities;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            OffersBean that = (OffersBean) o;
            return type == that.type &&
                    region_id == that.region_id &&
                    hotel_id == that.hotel_id &&
                    adult_amount == that.adult_amount &&
                    child_amount == that.child_amount &&
                    duration == that.duration &&
                    is_combined == that.is_combined &&
                    currency_id == that.currency_id &&
                    operator_id == that.operator_id &&
                    hotel_review_count == that.hotel_review_count &&
                    Objects.equals(key, that.key) &&
                    Objects.equals(country, that.country) &&
                    Objects.equals(region, that.region) &&
                    Objects.equals(hotel, that.hotel) &&
                    Objects.equals(hotel_rating, that.hotel_rating) &&
                    Objects.equals(meal_type, that.meal_type) &&
                    Objects.equals(meal_type_full, that.meal_type_full) &&
                    Objects.equals(accomodation, that.accomodation) &&
                    Objects.equals(room_type, that.room_type) &&
                    Objects.equals(date_from, that.date_from) &&
                    Objects.equals(prices, that.prices) &&
                    Objects.equals(from_city, that.from_city) &&
                    Objects.equals(transport_type, that.transport_type) &&
                    Objects.equals(operator, that.operator) &&
                    Objects.equals(hotel_review_rate, that.hotel_review_rate) &&
                    Objects.equals(hotel_images, that.hotel_images) &&
                    Objects.equals(hotel_facilities, that.hotel_facilities);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key, type, country, region_id, region, hotel_id, hotel, hotel_rating, meal_type, meal_type_full, adult_amount, child_amount, accomodation, room_type, duration, date_from, is_combined, currency_id, prices, from_city, transport_type, operator_id, operator, hotel_review_rate, hotel_review_count, hotel_images, hotel_facilities);
        }

        public static class PricesBean {
            /**
             * 1 : 483
             * 2 : 12509
             * 10 : 434
             */

            @JsonProperty("1")
            private int priceUS;
            @JsonProperty("2")
            private int priceUA;
            @JsonProperty("10")
            private int priceEU;

            public int getPriceUS() {
                return priceUS;
            }

            public void setPriceUS(int priceUS) {
                this.priceUS = priceUS;
            }

            public int getPriceEU() {
                return priceEU;
            }

            public void setPriceEU(int priceEU) {
                this.priceEU = priceEU;
            }

            public int getPriceUA() {
                return priceUA;
            }

            public void setPriceUA(int priceUA) {
                this.priceUA = priceUA;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                PricesBean that = (PricesBean) o;
                return priceUS == that.priceUS &&
                        priceEU == that.priceEU &&
                        priceUA == that.priceUA;
            }

            @Override
            public int hashCode() {
                return Objects.hash(priceUS, priceEU, priceUA);
            }
        }

        public static class HotelImagesBean {
            /**
             * full : http://ittour.com.ua/images/hotel_image/2/1/6/6/6/file_name/21666.jpg
             * thumb : http://ittour.com.ua/images/hotel_image_thumb/2/1/6/6/6/file_name/21666.jpg
             * is_main : 0
             */

            private String full;
            private String thumb;
            private int is_main;

            public String getFull() {
                return full;
            }

            public void setFull(String full) {
                this.full = full;
            }

            public String getThumb() {
                return thumb;
            }

            public void setThumb(String thumb) {
                this.thumb = thumb;
            }

            public int getIs_main() {
                return is_main;
            }

            public void setIs_main(int is_main) {
                this.is_main = is_main;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                HotelImagesBean that = (HotelImagesBean) o;
                return is_main == that.is_main &&
                        Objects.equals(full, that.full) &&
                        Objects.equals(thumb, that.thumb);
            }

            @Override
            public int hashCode() {
                return Objects.hash(full, thumb, is_main);
            }
        }

        public static class HotelFacilitiesBean {
            /**
             * id : 1
             * name : Wi-fi
             * category_id : 1
             * category : Интернет
             * is_main : 0
             * is_paid : 0
             */

            private String id;
            private String name;
            private String category_id;
            private String category;
            private int is_main;
            private int is_paid;

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

            public String getCategory_id() {
                return category_id;
            }

            public void setCategory_id(String category_id) {
                this.category_id = category_id;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public int getIs_main() {
                return is_main;
            }

            public void setIs_main(int is_main) {
                this.is_main = is_main;
            }

            public int getIs_paid() {
                return is_paid;
            }

            public void setIs_paid(int is_paid) {
                this.is_paid = is_paid;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                HotelFacilitiesBean that = (HotelFacilitiesBean) o;
                return is_main == that.is_main &&
                        is_paid == that.is_paid &&
                        Objects.equals(id, that.id) &&
                        Objects.equals(name, that.name) &&
                        Objects.equals(category_id, that.category_id) &&
                        Objects.equals(category, that.category);
            }

            @Override
            public int hashCode() {
                return Objects.hash(id, name, category_id, category, is_main, is_paid);
            }
        }
    }
}
