package com.smitsworks.toursmodule.model.otpusk;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalTime;
import java.util.List;

/**
 * tours/hotels - список отелей по стране или курортам
 * https://otpusk.api.domain/tours/hotels?countryId=115&cityId=953,955,956&with=price&access_token=ACCESS_TOK
 * EN
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Hotels {

    /**
     * hotels : [{"id":39631,"name":"Cleopatra Luxury Resort Makadi Bay","code":"Cleopatra_Luxury_Resort_Makadi_Bay","stars":"5","cityId":1262,"countryId":43,"lastUpdate":"2019-10-16 12:09:18","minPrice":"1177.00","currency":"usd","rating":0,"services":"lage_area"},{"id":21724,"name":"Ecotel Dahab Resort","code":"Sol_Dahab_Red_Sea","stars":"4","cityId":1038,"countryId":43,"lastUpdate":"2019-08-24 23:23:49","minPrice":"934.70","currency":"usd","rating":0,"services":"lage_area"},{"id":11652,"name":"Fort Arabesque","code":"Fort_Arabesque","stars":"4","cityId":1262,"countryId":43,"lastUpdate":"2019-07-01 21:52:20","minPrice":"1475.00","currency":"usd","rating":0},{"id":83228,"name":"Four Seasons Cairo At The First Residence","code":"Four_Seasons_Cairo_At_The_First_Residence","stars":"5","cityId":710,"countryId":43,"lastUpdate":"2018-10-24 22:49:56","minPrice":"3572.44","currency":"usd","rating":0},{"id":18369,"name":"Happy Life Village","code":"Happy_Life_Village","stars":"4","cityId":1038,"countryId":43,"lastUpdate":"2019-06-21 15:40:57","minPrice":"769.99","currency":"usd","rating":0,"services":"lage_area"},{"id":11832,"name":"Iberotel Makadi Beach","code":"Iberotel_Makadi_Beach","stars":"5","cityId":1262,"countryId":43,"lastUpdate":"2019-07-02 12:12:46","minPrice":"1426.00","currency":"usd","rating":0},{"id":46172,"name":"Jaz Aquaviva Makadi Bay","code":"Jaz_Aquaviva_Makadi_Bay","stars":"5","cityId":1262,"countryId":43,"lastUpdate":"2019-03-28 15:25:56","minPrice":"919.00","currency":"usd","rating":0,"services":"lage_area"},{"id":16378,"name":"Jaz Dahabeya","code":"Jaz_Dahabeya","stars":"4","cityId":1038,"countryId":43,"lastUpdate":"2019-07-01 22:19:35","minPrice":"1066.46","currency":"usd","rating":0},{"id":11830,"name":"Jaz Makadi Oasis Resort","code":"Iberotel_Makadi_Oasis_Resort","stars":"5","cityId":1262,"countryId":43,"lastUpdate":"2019-07-01 21:53:50","minPrice":"938.00","currency":"usd","rating":0,"services":"lage_area"},{"id":42229,"name":"Jaz Makadi Saraya Palms","code":"Jaz_Makadi_Saraya_Palms","stars":"4","cityId":1262,"countryId":43,"lastUpdate":"2019-06-07 11:48:46","minPrice":"884.00","currency":"usd","rating":0,"services":"lage_area"},{"id":11836,"name":"Jaz Makadi Saraya Resort","code":"Jaz_Makadi_Saraya_Resort","stars":"5","cityId":1262,"countryId":43,"lastUpdate":"2019-08-26 14:55:37","minPrice":"1027.00","currency":"usd","rating":0,"services":"lage_area"},{"id":17987,"name":"Jaz Makadi Star & Spa","code":"Jaz_Makadi_Star___Spa","stars":"5","cityId":1262,"countryId":43,"lastUpdate":"2019-06-20 13:53:18","minPrice":"1257.00","currency":"usd","rating":0},{"id":16381,"name":"Jaz Makadina","code":"Jaz_Makadina","stars":"5","cityId":1262,"countryId":43,"lastUpdate":"2019-09-04 13:04:37","minPrice":"1243.00","currency":"usd","rating":0},{"id":10614,"name":"Labranda Club Makadi","code":"Club_Azur_Resort_Makadi_Bay","stars":"4","cityId":1262,"countryId":43,"lastUpdate":"2019-08-12 13:23:03","minPrice":"813.00","currency":"usd","rating":0,"services":"lage_area"},{"id":10617,"name":"Labranda Royal Makadi","code":"labranda_royal_makadi","stars":"5","cityId":1262,"countryId":43,"lastUpdate":"2019-10-11 12:55:31","minPrice":"850.00","currency":"usd","rating":0,"services":"lage_area"},{"id":19181,"name":"Le Meridien Dahab Resort","code":"Le_Meridien_Dahab_Resort","stars":"5","cityId":1038,"countryId":43,"lastUpdate":"2019-06-20 14:02:27","minPrice":"1132.34","currency":"usd","rating":0,"services":"lage_area"},{"id":42225,"name":"Lemon & Soul Makadi Bay","code":"labranda_garden_makadi","stars":"4","cityId":1262,"countryId":43,"lastUpdate":"2019-09-17 15:48:08","minPrice":"802.00","currency":"usd","rating":0,"services":"lage_area"},{"id":17933,"name":"Makadi Palace","code":"Makadi_Palace","stars":"5","cityId":1262,"countryId":43,"lastUpdate":"2019-09-17 16:58:52","minPrice":"1065.87","currency":"usd","rating":0,"services":"lage_area"},{"id":40156,"name":"Makadi Spa Hotel","code":"Makadi_Spa","stars":"5","cityId":1262,"countryId":43,"lastUpdate":"2019-01-11 11:34:27","minPrice":"1212.63","currency":"usd","rating":0},{"id":18066,"name":"Prima Life Makadi","code":"Prima_Life_Makadi","stars":"5","cityId":1262,"countryId":43,"lastUpdate":"2019-08-12 12:59:39","minPrice":"1192.40","currency":"usd","rating":0,"services":"lage_area"},{"id":85347,"name":"Rixos Makadi Bay","code":"Rixos_Makadi_Bay","stars":"5","cityId":1262,"countryId":43,"lastUpdate":"2019-09-11 13:30:34","minPrice":"2367.00","currency":"usd","rating":0,"services":"lage_area"},{"id":18183,"name":"Royal Pharaohs Makadi","code":"Harmony_Makadi_Bay_Hotel___Resort","stars":"4","cityId":1262,"countryId":43,"lastUpdate":"2019-10-16 10:34:01","minPrice":"715.28","currency":"usd","rating":0,"services":"lage_area"},{"id":33746,"name":"Serenity Fun City","code":"Serenity_Fun_City","stars":"5","cityId":1262,"countryId":43,"lastUpdate":"2019-09-03 10:20:07","minPrice":"911.00","currency":"usd","rating":0,"services":"lage_area"},{"id":18464,"name":"Serenity Makadi Beach","code":"Serenity_Makadi_Beach","stars":"5","cityId":1262,"countryId":43,"lastUpdate":"2019-07-23 14:33:56","minPrice":"1019.00","currency":"usd","rating":0,"services":"lage_area"},{"id":40313,"name":"Steigenberger Makadi","code":"Steigenberger_Makadi","stars":"5","cityId":1262,"countryId":43,"lastUpdate":"2019-01-24 14:35:40","minPrice":"1423.00","currency":"usd","rating":0},{"id":35100,"name":"Stella Di Mare Gardens Resort & Spa","code":"Stella_Makadi_Garden_Resort","stars":"5","cityId":1262,"countryId":43,"lastUpdate":"2019-06-20 13:16:58","minPrice":"694.00","currency":"usd","rating":0,"services":"lage_area"},{"id":21097,"name":"Stella Di Mare Makadi Beach Resort & Spa","code":"Stella_Di_Mare_Beach_Resort_Spa","stars":"5","cityId":1262,"countryId":43,"lastUpdate":"2019-06-26 12:02:08","minPrice":"897.00","currency":"usd","rating":0,"services":"lage_area"},{"id":16977,"name":"Sunrise Royal Makadi Aqua Resort","code":"Sunrise_Royal_Makadi_Resort","stars":"5","cityId":1262,"countryId":43,"lastUpdate":"2019-10-17 01:58:20","minPrice":"1167.00","currency":"usd","rating":0,"services":"lage_area"},{"id":42233,"name":"Sunwing Family Star Hotel","code":"Sunwing_Family_Star_Hotel","stars":"5","cityId":1262,"countryId":43,"lastUpdate":"2019-01-14 04:00:06","minPrice":"903.16","currency":"usd","rating":0},{"id":40157,"name":"Sunwing Waterworld Makadi","code":"Sunwing_Waterworld_Makadi","stars":"5","cityId":1262,"countryId":43,"lastUpdate":"2019-02-15 14:24:41","minPrice":"1202.34","currency":"usd","rating":0,"services":"lage_area"},{"id":18448,"name":"Swiss Inn Resort","code":"Swiss_Inn_Resort","stars":"4","cityId":1038,"countryId":43,"lastUpdate":"2019-10-17 02:16:27","minPrice":"1132.34","currency":"usd","rating":0},{"id":17791,"name":"The Grand Makadi","code":"The_Grand_Makadi","stars":"5","cityId":1262,"countryId":43,"lastUpdate":"2019-02-15 14:19:52","minPrice":"983.51","currency":"usd","rating":0},{"id":10616,"name":"Tia Heights Makadi Bay","code":"Tia_Heights_Makadi_Bay","stars":"5","cityId":1262,"countryId":43,"lastUpdate":"2019-07-01 21:45:36","minPrice":"639.00","currency":"usd","rating":0,"services":"lage_area"},{"id":12264,"name":"Tirana Dahab Resort","code":"tirana_dahab_resort","stars":"4","cityId":1038,"countryId":43,"lastUpdate":"2019-08-26 14:33:57","minPrice":"1000.58","currency":"usd","rating":0,"services":"lage_area"},{"id":18357,"name":"Tropitel Dahab Oasis","code":"Tropitel_Dahab_Oasis","stars":"4","cityId":1038,"countryId":43,"lastUpdate":"2019-08-09 14:51:58","minPrice":"753.52","currency":"usd","rating":0}]
     * api_version : 2.4
     * time : 0.0135
     */

    @JsonIgnore
    private LocalTime expired = LocalTime.now();

    private String api_version;
    private double time;
    private List<HotelsBean> hotels;

    @Getter
    @Setter
    @EqualsAndHashCode
    @ToString
    public static class HotelsBean {
        /**
         * id : 39631
         * name : Cleopatra Luxury Resort Makadi Bay
         * code : Cleopatra_Luxury_Resort_Makadi_Bay
         * stars : 5
         * cityId : 1262
         * countryId : 43
         * lastUpdate : 2019-10-16 12:09:18
         * minPrice : 1177.00
         * currency : usd
         * rating : 0
         * services : lage_area
         */

        private int id;
        private String name;
        private String code;
        private String stars;
        private int cityId;
        private int countryId;
        private String lastUpdate;
        private String minPrice;
        private String currency;
        private int rating;
        private String services;
    }
}
