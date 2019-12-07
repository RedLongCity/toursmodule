package com.smitsworks.toursmodule.model.otpusk;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * tours/cities - список курортов по стране
 * https://otpusk.api.domain/tours/cities?countryId=115&with=price&access_token=ACCESS_TOKEN
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Cities {

    /**
     * cities : [{"id":1038,"name":"Дахаб","nameVn":"Дахаб","code":"dahab","lat":28.4989,"lng":34.5083,"zoom":14,"bold":false,"uah":19139,"price":753.52,"currency":"usd","transport":"air"},{"id":710,"name":"Каир","nameVn":"Каир","code":"kair","lat":30.047,"lng":31.2269,"zoom":13,"bold":false,"uah":90740,"price":3572.44,"currency":"usd","transport":"air"},{"id":1262,"name":"Макади Бей","nameVn":"Макади Бей","code":"makadi","lat":26.9918,"lng":33.9008,"zoom":14,"bold":true,"uah":16199,"price":639,"currency":"usd","transport":"air"},{"id":1247,"name":"Марса Алам","nameVn":"Марса Алам","code":"marsa_alam","lat":25.0723,"lng":34.8927,"zoom":15,"bold":false,"uah":19722,"price":776.45,"currency":"usd","transport":"air"},{"id":714,"name":"Сафага","nameVn":"Сафагу","code":"safaga","lat":26.7619,"lng":33.9382,"zoom":15,"bold":false,"uah":15438,"price":609,"currency":"usd","transport":"air"},{"id":1037,"name":"Сома Бэй","nameVn":"Сома Бэй","code":"soma_bay","lat":26.8472,"lng":33.994,"zoom":15,"bold":false,"uah":17137,"price":676,"currency":"usd","transport":"air"},{"id":1035,"name":"Таба","nameVn":"Табу","code":"taba","lat":29.439,"lng":34.8476,"zoom":12,"bold":true,"uah":19976,"price":786.46,"currency":"usd","transport":"air"},{"id":712,"name":"Хургада","nameVn":"Хургаду","code":"hurgada","lat":27.2471,"lng":33.8275,"zoom":14,"bold":true,"uah":11129,"price":439,"currency":"usd","transport":"air"},{"id":715,"name":"Шарм эль Шейх","nameVn":"Шарм эль Шейх","code":"sharm_el_sheyh","lat":27.8782,"lng":34.3079,"zoom":13,"bold":true,"uah":14179,"price":558.23,"currency":"usd","transport":"air"},{"id":1901,"name":"Эль Кусейр","nameVn":"Эль Кусейр","code":"el_kuzeyr","lat":26.1048,"lng":34.2788,"zoom":10,"bold":false,"uah":24383,"price":959.98,"currency":"usd","transport":"air"},{"id":711,"name":"Эль-Гуна","nameVn":"Эль-Гуну","code":"el_guna","lat":27.3895,"lng":33.6801,"zoom":14,"bold":false,"uah":21993,"price":865.86,"currency":"usd","transport":"air"}]
     * api_version : 2.4
     * time : 0.0121
     */

    @Id
    @JsonIgnore
    private String id = "_id";

    private String api_version;
    private double time;
    private List<CitiesBean> cities;

    @Getter
    @Setter
    @EqualsAndHashCode
    @ToString
    public static class CitiesBean {
        /**
         * id : 1038
         * name : Дахаб
         * nameVn : Дахаб
         * code : dahab
         * lat : 28.4989
         * lng : 34.5083
         * zoom : 14
         * bold : false
         * uah : 19139
         * price : 753.52
         * currency : usd
         * transport : air
         */

        private int id;
        private String name;
        private String nameVn;
        private String code;
        private double lat;
        private double lng;
        private int zoom;
        private boolean bold;
        private int uah;
        private double price;
        private String currency;
        private String transport;

    }
}
