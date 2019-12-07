package com.smitsworks.toursmodule.model.otpusk;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

/**
 * tours/search - поиск туров
 * https://otpusk.api.domain/tours/search?from=1&to=115&checkIn=2016-10-10&checkTo=2016-10-22&length=6&length
 * To=8&people=2&access_token=ACCESS_TOKEN
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class PocketToursResponse {

    /**
     * lastResult : true
     * cnt : {"id":"115","code":"turkey","name":"Турция","nameDt":"Турции","namePr":"Турции","nameRd":"Турции","nameTr":"Turkey","nameVn":"Турцию","latLng":{"lat":"38.98290","lng":"35.19060","zoom":"5"},"cid":"tr"}
     * dept : {"id":"1544","name":"Киев","nameDt":"Киеву","namePr":"Киеве","nameRd":"Киева","nameTr":"kiev","nameVn":"Киев","latLng":{"lat":"50.45010","lng":"30.52960","zoom":"12"}}
     * total : 139
     * stars : {"3":11541,"4":12105,"2":12623,"4+":16829,"5":15930,"5+":19170}
     * operators : {"269":13937,"1416":11541,"2":13545,"2700":13635,"594":12983,"2835":12105,"717":12285}
     * originalStars : {"3":512.92,"4":538,"2":561,"4+":747.95,"5":708,"5+":852}
     * originalOperators : {"269":619.41,"1416":512.92,"2":602,"2700":606,"594":577,"2835":538,"717":546}
     * hotels : {"1":{"20178":{"a":"Отель построен в 2000году и былотреставрирован в 2010.Отель представляетсобой комплекс издвух зданий,соединенныхпереходом. Зданияпостроены втропическом стиле.Оформлениеосновного корпусавыдержано всредиземноморскомстиле с арочнымипроходами итеррасами,выложеннымиплиткой. Недалеко ототеля...","c":{"i":953,"c":"alanja","n":"Алания"},"t":{"i":115,"c":"turkey","cid":"tr","n":"Турция"},"e":["aerobics","animation","billiards","cafe","chairs","childmenu","childpool","conditioning","towels","tv","umbrella","volleyball","waterslides","wifi"],"h":"Sunside_Beach_Hotel","i":20178,"f":"00/00/32/39/323960.jpg","fc":8,"g":{"a":"36.59355","o":"31.84603"},"n":"Sunside Beach Hotel","r":3.8,"v":"61","s":3,"p":11541,"po":512.92,"offers":{"3024821":{"i":3024821,"oi":1416,"ti":16679,"o":["insurance","transfer","visa"],"c":1544,"d":"2016-10-12","y":"dbl","a":"2","h":0,"ha":"","ci":953,"l":8,"f":"ai","ri":"35174","r":"Standard Room","p":512.92,"pl":11541,"u":"usd","ur":26.85,"t":"air","to":{"from":[{"code":"PS 5411","craft":"Boeing 737-800","line":"Ukraine International Airlines","portFr":"KBP","portTo":"AYT","begin":"2016-10-10 04:30:00","end":"2016-10-10 07:00:00"}],"to":[{"code":"PS 5416","craft":"Boeing 737-800","line":"Ukraine International Airlines","portFr":"AYT","portTo":"KBP","begin":"2016-10-13 14:05:00","end":"2016-10-13 16:40:00"}]},"ss":{"avia":1,"aviaBack":0,"hotel":-1},"s":"FIX Price 7%"},"3024822":{"i":3024822,"oi":1416,"ti":16679,"o":["insurance","transfer"],"c":1544,"d":"2016-10-13","y":"dbl","a":"2","h":0,"ha":0,"ci":953,"l":8,"f":"ai","ri":"35174","r":"Standard Room","p":512.92,"pl":11541,"u":"usd","t":"air","to":{"from":[{"code":"PS 5411","craft":"Boeing 737-800","line":"Ukraine International Airlines","portFr":"KBP","portTo":"AYT","begin":"2016-10-10 04:30:00","end":"2016-10-10 07:00:00"}],"to":[{"code":"PS 5416","craft":"Boeing 737-800","line":"Ukraine International Airlines","portFr":"AYT","portTo":"KBP","begin":"2016-10-13 14:05:00","end":"2016-10-13 16:40:00"}]},"ss":{"avia":1,"aviaBack":1,"hotel":1}}}},"8987":{"a":"Отель расположенна побережьеАнталии, в 300 метрах отпляжа. Здание отеляпокрыто яркимицветами.","c":{"i":955,"c":"antalija","n":"Анталия"},"t":{"i":115,"c":"turkey","cid":"tr","n":"Турция"},"e":["cafe","chairs","childpool","cleaners","conditioning","elevator","hairdryer","laundry","network","non_smoking","outdoor_pool","park","parking","pebble","phone","rent_car","restaurant","safe","shower","table_tennis","terrace","town","tv","umbrella","visa","water_sports","wifi"],"h":"Benna_Hotel","i":8987,"f":"00/00/24/07/240732.jpg","fc":14,"g":{"a":"36.86231","o":"30.63359"},"n":"Benna Hotel","r":7.2,"v":"2","s":2,"p":12690,"po":564,"offers":{"3025168":{"i":3025168,"oi":717,"ti":786,"o":["transfer","insurance"],"c":1544,"d":"2016-10-13","dt":"2016-10-20","y":"dbl","a":"2","h":"0","ha":0,"ci":955,"l":8,"f":"hb","ri":"193276","r":"Standard Room","p":564,"pl":12690,"u":"usd","t":"air","to":{"from":[{"code":"PS 5411","craft":"Boeing 737-800","line":"Ukraine International Airlines","portFr":"KBP","portTo":"AYT","begin":"2016-10-10 04:30:00","end":"2016-10-10 07:00:00"}],"to":[{"code":"PS 5416","craft":"Boeing 737-800","line":"Ukraine International Airlines","portFr":"AYT","portTo":"KBP","begin":"2016-10-13 14:05:00","end":"2016-10-13 16:40:00"}]},"ss":{"hotel":1,"avia":1,"aviaBack":1}}}}}}
     * progress : {"269":true,"1416":true,"2":true,"2700":true,"594":true,"2835":true,"717":true}
     */

    private boolean lastResult;
    private CntBean cnt;
    private DeptBean dept;
    private int total;
    private Map<String, Integer> stars;
    private Map<String, Integer> operators;
    private Map<String, Float> originalStars;
    private Map<String, Float> originalOperators;
    private Map<String, Map<String, HotelBean>> hotels;
    private Map<String, Boolean> progress;

    @Getter
    @Setter
    @EqualsAndHashCode
    @ToString
    public static class CntBean {
        /**
         * id : 115
         * code : turkey
         * name : Турция
         * nameDt : Турции
         * namePr : Турции
         * nameRd : Турции
         * nameTr : Turkey
         * nameVn : Турцию
         * latLng : {"lat":"38.98290","lng":"35.19060","zoom":"5"}
         * cid : tr
         */

        private String id;
        private String code;
        private String name;
        private String nameDt;
        private String namePr;
        private String nameRd;
        private String nameTr;
        private String nameVn;
        private LatLngBean latLng;
        private String cid;

        @Getter
        @Setter
        @EqualsAndHashCode
        @ToString
        public static class LatLngBean {
            /**
             * lat : 38.98290
             * lng : 35.19060
             * zoom : 5
             */

            private String lat;
            private String lng;
            private String zoom;
        }
    }

    @Getter
    @Setter
    @EqualsAndHashCode
    @ToString
    public static class DeptBean {
        /**
         * id : 1544
         * name : Киев
         * nameDt : Киеву
         * namePr : Киеве
         * nameRd : Киева
         * nameTr : kiev
         * nameVn : Киев
         * latLng : {"lat":"50.45010","lng":"30.52960","zoom":"12"}
         */

        private String id;
        private String name;
        private String nameDt;
        private String namePr;
        private String nameRd;
        private String nameTr;
        private String nameVn;
        private LatLngBeanX latLng;

        @Getter
        @Setter
        @EqualsAndHashCode
        @ToString
        public static class LatLngBeanX {
            /**
             * lat : 50.45010
             * lng : 30.52960
             * zoom : 12
             */

            private String lat;
            private String lng;
            private String zoom;
        }
    }

    @Getter
    @Setter
    @EqualsAndHashCode
    @ToString
    public static class HotelBean {
        /**
         * a : Отель построен в 2000году и былотреставрирован в 2010.Отель представляетсобой комплекс издвух зданий,соединенныхпереходом. Зданияпостроены втропическом стиле.Оформлениеосновного корпусавыдержано всредиземноморскомстиле с арочнымипроходами итеррасами,выложеннымиплиткой. Недалеко ототеля...
         * c : {"i":953,"c":"alanja","n":"Алания"}
         * t : {"i":115,"c":"turkey","cid":"tr","n":"Турция"}
         * e : ["aerobics","animation","billiards","cafe","chairs","childmenu","childpool","conditioning","towels","tv","umbrella","volleyball","waterslides","wifi"]
         * h : Sunside_Beach_Hotel
         * i : 20178
         * f : 00/00/32/39/323960.jpg
         * fc : 8
         * g : {"a":"36.59355","o":"31.84603"}
         * n : Sunside Beach Hotel
         * r : 3.8
         * v : 61
         * s : 3
         * p : 11541
         * po : 512.92
         * offers : {"3024821":{"i":3024821,"oi":1416,"ti":16679,"o":["insurance","transfer","visa"],"c":1544,"d":"2016-10-12","y":"dbl","a":"2","h":0,"ha":"","ci":953,"l":8,"f":"ai","ri":"35174","r":"Standard Room","p":512.92,"pl":11541,"u":"usd","ur":26.85,"t":"air","to":{"from":[{"code":"PS 5411","craft":"Boeing 737-800","line":"Ukraine International Airlines","portFr":"KBP","portTo":"AYT","begin":"2016-10-10 04:30:00","end":"2016-10-10 07:00:00"}],"to":[{"code":"PS 5416","craft":"Boeing 737-800","line":"Ukraine International Airlines","portFr":"AYT","portTo":"KBP","begin":"2016-10-13 14:05:00","end":"2016-10-13 16:40:00"}]},"ss":{"avia":1,"aviaBack":0,"hotel":-1},"s":"FIX Price 7%"},"3024822":{"i":3024822,"oi":1416,"ti":16679,"o":["insurance","transfer"],"c":1544,"d":"2016-10-13","y":"dbl","a":"2","h":0,"ha":0,"ci":953,"l":8,"f":"ai","ri":"35174","r":"Standard Room","p":512.92,"pl":11541,"u":"usd","t":"air","to":{"from":[{"code":"PS 5411","craft":"Boeing 737-800","line":"Ukraine International Airlines","portFr":"KBP","portTo":"AYT","begin":"2016-10-10 04:30:00","end":"2016-10-10 07:00:00"}],"to":[{"code":"PS 5416","craft":"Boeing 737-800","line":"Ukraine International Airlines","portFr":"AYT","portTo":"KBP","begin":"2016-10-13 14:05:00","end":"2016-10-13 16:40:00"}]},"ss":{"avia":1,"aviaBack":1,"hotel":1}}}
         */

        private String a;
        private CBean c;
        private TBean t;
        private String h;
        private int i;
        private String f;
        private int fc;
        private GBean g;
        private String n;
        private double r;
        private String v;
        private int s;
        private int p;
        private double po;
        private Map<String, OfferBean> offers;
        private List<String> e;

        @Getter
        @Setter
        @EqualsAndHashCode
        @ToString
        public static class CBean {
            /**
             * i : 953
             * c : alanja
             * n : Алания
             */

            private int i;
            private String c;
            private String n;
        }

        @Getter
        @Setter
        @EqualsAndHashCode
        @ToString
        public static class TBean {
            /**
             * i : 115
             * c : turkey
             * cid : tr
             * n : Турция
             */

            private int i;
            private String c;
            private String cid;
            private String n;
        }

        @Getter
        @Setter
        @EqualsAndHashCode
        @ToString
        public static class GBean {
            /**
             * a : 36.59355
             * o : 31.84603
             */

            private String a;
            private String o;
        }

        @Getter
        @Setter
        @EqualsAndHashCode
        @ToString
        public static class OfferBean {
            /**
             * i : 3024821
             * oi : 1416
             * ti : 16679
             * o : ["insurance","transfer","visa"]
             * c : 1544
             * d : 2016-10-12
             * y : dbl
             * a : 2
             * h : 0
             * ha :
             * ci : 953
             * l : 8
             * f : ai
             * ri : 35174
             * r : Standard Room
             * p : 512.92
             * pl : 11541
             * u : usd
             * ur : 26.85
             * t : air
             * to : {"from":[{"code":"PS 5411","craft":"Boeing 737-800","line":"Ukraine International Airlines","portFr":"KBP","portTo":"AYT","begin":"2016-10-10 04:30:00","end":"2016-10-10 07:00:00"}],"to":[{"code":"PS 5416","craft":"Boeing 737-800","line":"Ukraine International Airlines","portFr":"AYT","portTo":"KBP","begin":"2016-10-13 14:05:00","end":"2016-10-13 16:40:00"}]}
             * ss : {"avia":1,"aviaBack":0,"hotel":-1}
             * s : FIX Price 7%
             */

            private int i;
            private int oi;
            private int ti;
            private int c;
            private String d;
            private String dt;
            private String y;
            private String a;
            private int h;
            private String ha;
            private int ci;
            private int l;
            private String f;
            private String ri;
            private String r;
            private double p;
            private int pl;
            private String u;
            private double ur;
            private String t;
            private ToBeanX to;
            private SsBean ss;
            private String s;
            private List<String> o;

            @Getter
            @Setter
            @EqualsAndHashCode
            @ToString
            public static class ToBeanX {
                private List<FromBean> from;
                private List<ToBean> to;

                @Getter
                @Setter
                @EqualsAndHashCode
                @ToString
                public static class FromBean {
                    /**
                     * code : PS 5411
                     * craft : Boeing 737-800
                     * line : Ukraine International Airlines
                     * portFr : KBP
                     * portTo : AYT
                     * begin : 2016-10-10 04:30:00
                     * end : 2016-10-10 07:00:00
                     */

                    private String code;
                    private String craft;
                    private String line;
                    private String portFr;
                    private String portTo;
                    private String begin;
                    private String end;
                }

                @Getter
                @Setter
                @EqualsAndHashCode
                @ToString
                public static class ToBean {
                    /**
                     * code : PS 5416
                     * craft : Boeing 737-800
                     * line : Ukraine International Airlines
                     * portFr : AYT
                     * portTo : KBP
                     * begin : 2016-10-13 14:05:00
                     * end : 2016-10-13 16:40:00
                     */

                    private String code;
                    private String craft;
                    private String line;
                    private String portFr;
                    private String portTo;
                    private String begin;
                    private String end;
                }
            }

            @Getter
            @Setter
            @EqualsAndHashCode
            @ToString
            public static class SsBean {
                /**
                 * avia : 1
                 * aviaBack : 0
                 * hotel : -1
                 */

                private int avia;
                private int aviaBack;
                private int hotel;
            }
        }

    }
}