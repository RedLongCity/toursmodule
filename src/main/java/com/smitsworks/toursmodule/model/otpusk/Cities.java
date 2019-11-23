package com.smitsworks.toursmodule.model.otpusk;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.Objects;

/**
 * tours/cities - список курортов по стране
 * https://otpusk.api.domain/tours/cities?countryId=115&with=price&access_token=ACCESS_TOKEN
 */
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

    public List<CitiesBean> getCities() {
        return cities;
    }

    public void setCities(List<CitiesBean> cities) {
        this.cities = cities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cities cities1 = (Cities) o;
        return Double.compare(cities1.time, time) == 0 &&
                Objects.equals(api_version, cities1.api_version) &&
                Objects.equals(cities, cities1.cities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(api_version, time, cities);
    }

    @Override
    public String toString() {
        return "Cities{" +
                "api_version='" + api_version + '\'' +
                ", time=" + time +
                ", cities=" + cities +
                '}';
    }

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

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNameVn() {
            return nameVn;
        }

        public void setNameVn(String nameVn) {
            this.nameVn = nameVn;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public double getLat() {
            return lat;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }

        public double getLng() {
            return lng;
        }

        public void setLng(double lng) {
            this.lng = lng;
        }

        public int getZoom() {
            return zoom;
        }

        public void setZoom(int zoom) {
            this.zoom = zoom;
        }

        public boolean isBold() {
            return bold;
        }

        public void setBold(boolean bold) {
            this.bold = bold;
        }

        public int getUah() {
            return uah;
        }

        public void setUah(int uah) {
            this.uah = uah;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public String getTransport() {
            return transport;
        }

        public void setTransport(String transport) {
            this.transport = transport;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CitiesBean that = (CitiesBean) o;
            return id == that.id &&
                    Double.compare(that.lat, lat) == 0 &&
                    Double.compare(that.lng, lng) == 0 &&
                    zoom == that.zoom &&
                    bold == that.bold &&
                    uah == that.uah &&
                    Double.compare(that.price, price) == 0 &&
                    Objects.equals(name, that.name) &&
                    Objects.equals(nameVn, that.nameVn) &&
                    Objects.equals(code, that.code) &&
                    Objects.equals(currency, that.currency) &&
                    Objects.equals(transport, that.transport);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, nameVn, code, lat, lng, zoom, bold, uah, price, currency, transport);
        }

        @Override
        public String toString() {
            return "CitiesBean{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", nameVn='" + nameVn + '\'' +
                    ", code='" + code + '\'' +
                    ", lat=" + lat +
                    ", lng=" + lng +
                    ", zoom=" + zoom +
                    ", bold=" + bold +
                    ", uah=" + uah +
                    ", price=" + price +
                    ", currency='" + currency + '\'' +
                    ", transport='" + transport + '\'' +
                    '}';
        }
    }
}
