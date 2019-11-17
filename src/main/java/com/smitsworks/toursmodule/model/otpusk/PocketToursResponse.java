package com.smitsworks.toursmodule.model.otpusk;

import java.util.List;
import java.util.Map;
import java.util.Objects;

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

    public boolean isLastResult() {
        return lastResult;
    }

    public PocketToursResponse setLastResult(boolean lastResult) {
        this.lastResult = lastResult;
        return this;
    }

    public CntBean getCnt() {
        return cnt;
    }

    public PocketToursResponse setCnt(CntBean cnt) {
        this.cnt = cnt;
        return this;
    }

    public DeptBean getDept() {
        return dept;
    }

    public PocketToursResponse setDept(DeptBean dept) {
        this.dept = dept;
        return this;
    }

    public int getTotal() {
        return total;
    }

    public PocketToursResponse setTotal(int total) {
        this.total = total;
        return this;
    }

    public Map<String, Integer> getStars() {
        return stars;
    }

    public PocketToursResponse setStars(Map<String, Integer> stars) {
        this.stars = stars;
        return this;
    }

    public Map<String, Integer> getOperators() {
        return operators;
    }

    public PocketToursResponse setOperators(Map<String, Integer> operators) {
        this.operators = operators;
        return this;
    }

    public Map<String, Float> getOriginalStars() {
        return originalStars;
    }

    public PocketToursResponse setOriginalStars(Map<String, Float> originalStars) {
        this.originalStars = originalStars;
        return this;
    }

    public Map<String, Float> getOriginalOperators() {
        return originalOperators;
    }

    public PocketToursResponse setOriginalOperators(Map<String, Float> originalOperators) {
        this.originalOperators = originalOperators;
        return this;
    }

    public Map<String, Map<String, HotelBean>> getHotels() {
        return hotels;
    }

    public PocketToursResponse setHotels(Map<String, Map<String, HotelBean>> hotels) {
        this.hotels = hotels;
        return this;
    }

    public Map<String, Boolean> getProgress() {
        return progress;
    }

    public PocketToursResponse setProgress(Map<String, Boolean> progress) {
        this.progress = progress;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PocketToursResponse that = (PocketToursResponse) o;
        return lastResult == that.lastResult &&
                total == that.total &&
                Objects.equals(cnt, that.cnt) &&
                Objects.equals(dept, that.dept) &&
                Objects.equals(stars, that.stars) &&
                Objects.equals(operators, that.operators) &&
                Objects.equals(originalStars, that.originalStars) &&
                Objects.equals(originalOperators, that.originalOperators) &&
                Objects.equals(hotels, that.hotels) &&
                Objects.equals(progress, that.progress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastResult, cnt, dept, total, stars, operators, originalStars, originalOperators, hotels, progress);
    }

    @Override
    public String toString() {
        return "PocketToursResponse{" +
                "lastResult=" + lastResult +
                ", cnt=" + cnt +
                ", dept=" + dept +
                ", total=" + total +
                ", stars=" + stars +
                ", operators=" + operators +
                ", originalStars=" + originalStars +
                ", originalOperators=" + originalOperators +
                ", hotels=" + hotels +
                ", progress=" + progress +
                '}';
    }

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

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNameDt() {
            return nameDt;
        }

        public void setNameDt(String nameDt) {
            this.nameDt = nameDt;
        }

        public String getNamePr() {
            return namePr;
        }

        public void setNamePr(String namePr) {
            this.namePr = namePr;
        }

        public String getNameRd() {
            return nameRd;
        }

        public void setNameRd(String nameRd) {
            this.nameRd = nameRd;
        }

        public String getNameTr() {
            return nameTr;
        }

        public void setNameTr(String nameTr) {
            this.nameTr = nameTr;
        }

        public String getNameVn() {
            return nameVn;
        }

        public void setNameVn(String nameVn) {
            this.nameVn = nameVn;
        }

        public LatLngBean getLatLng() {
            return latLng;
        }

        public void setLatLng(LatLngBean latLng) {
            this.latLng = latLng;
        }

        public String getCid() {
            return cid;
        }

        public void setCid(String cid) {
            this.cid = cid;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CntBean cntBean = (CntBean) o;
            return Objects.equals(id, cntBean.id) &&
                    Objects.equals(code, cntBean.code) &&
                    Objects.equals(name, cntBean.name) &&
                    Objects.equals(nameDt, cntBean.nameDt) &&
                    Objects.equals(namePr, cntBean.namePr) &&
                    Objects.equals(nameRd, cntBean.nameRd) &&
                    Objects.equals(nameTr, cntBean.nameTr) &&
                    Objects.equals(nameVn, cntBean.nameVn) &&
                    Objects.equals(latLng, cntBean.latLng) &&
                    Objects.equals(cid, cntBean.cid);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, code, name, nameDt, namePr, nameRd, nameTr, nameVn, latLng, cid);
        }

        @Override
        public String toString() {
            return "CntBean{" +
                    "id='" + id + '\'' +
                    ", code='" + code + '\'' +
                    ", name='" + name + '\'' +
                    ", nameDt='" + nameDt + '\'' +
                    ", namePr='" + namePr + '\'' +
                    ", nameRd='" + nameRd + '\'' +
                    ", nameTr='" + nameTr + '\'' +
                    ", nameVn='" + nameVn + '\'' +
                    ", latLng=" + latLng +
                    ", cid='" + cid + '\'' +
                    '}';
        }

        public static class LatLngBean {
            /**
             * lat : 38.98290
             * lng : 35.19060
             * zoom : 5
             */

            private String lat;
            private String lng;
            private String zoom;

            public String getLat() {
                return lat;
            }

            public void setLat(String lat) {
                this.lat = lat;
            }

            public String getLng() {
                return lng;
            }

            public void setLng(String lng) {
                this.lng = lng;
            }

            public String getZoom() {
                return zoom;
            }

            public void setZoom(String zoom) {
                this.zoom = zoom;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                LatLngBean that = (LatLngBean) o;
                return Objects.equals(lat, that.lat) &&
                        Objects.equals(lng, that.lng) &&
                        Objects.equals(zoom, that.zoom);
            }

            @Override
            public int hashCode() {
                return Objects.hash(lat, lng, zoom);
            }

            @Override
            public String toString() {
                return "LatLngBean{" +
                        "lat='" + lat + '\'' +
                        ", lng='" + lng + '\'' +
                        ", zoom='" + zoom + '\'' +
                        '}';
            }
        }
    }

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

        public String getNameDt() {
            return nameDt;
        }

        public void setNameDt(String nameDt) {
            this.nameDt = nameDt;
        }

        public String getNamePr() {
            return namePr;
        }

        public void setNamePr(String namePr) {
            this.namePr = namePr;
        }

        public String getNameRd() {
            return nameRd;
        }

        public void setNameRd(String nameRd) {
            this.nameRd = nameRd;
        }

        public String getNameTr() {
            return nameTr;
        }

        public void setNameTr(String nameTr) {
            this.nameTr = nameTr;
        }

        public String getNameVn() {
            return nameVn;
        }

        public void setNameVn(String nameVn) {
            this.nameVn = nameVn;
        }

        public LatLngBeanX getLatLng() {
            return latLng;
        }

        public void setLatLng(LatLngBeanX latLng) {
            this.latLng = latLng;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            DeptBean deptBean = (DeptBean) o;
            return Objects.equals(id, deptBean.id) &&
                    Objects.equals(name, deptBean.name) &&
                    Objects.equals(nameDt, deptBean.nameDt) &&
                    Objects.equals(namePr, deptBean.namePr) &&
                    Objects.equals(nameRd, deptBean.nameRd) &&
                    Objects.equals(nameTr, deptBean.nameTr) &&
                    Objects.equals(nameVn, deptBean.nameVn) &&
                    Objects.equals(latLng, deptBean.latLng);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, nameDt, namePr, nameRd, nameTr, nameVn, latLng);
        }

        @Override
        public String toString() {
            return "DeptBean{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", nameDt='" + nameDt + '\'' +
                    ", namePr='" + namePr + '\'' +
                    ", nameRd='" + nameRd + '\'' +
                    ", nameTr='" + nameTr + '\'' +
                    ", nameVn='" + nameVn + '\'' +
                    ", latLng=" + latLng +
                    '}';
        }

        public static class LatLngBeanX {
            /**
             * lat : 50.45010
             * lng : 30.52960
             * zoom : 12
             */

            private String lat;
            private String lng;
            private String zoom;

            public String getLat() {
                return lat;
            }

            public void setLat(String lat) {
                this.lat = lat;
            }

            public String getLng() {
                return lng;
            }

            public void setLng(String lng) {
                this.lng = lng;
            }

            public String getZoom() {
                return zoom;
            }

            public void setZoom(String zoom) {
                this.zoom = zoom;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                LatLngBeanX that = (LatLngBeanX) o;
                return Objects.equals(lat, that.lat) &&
                        Objects.equals(lng, that.lng) &&
                        Objects.equals(zoom, that.zoom);
            }

            @Override
            public int hashCode() {
                return Objects.hash(lat, lng, zoom);
            }

            @Override
            public String toString() {
                return "LatLngBeanX{" +
                        "lat='" + lat + '\'' +
                        ", lng='" + lng + '\'' +
                        ", zoom='" + zoom + '\'' +
                        '}';
            }
        }
    }

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

        public String getA() {
            return a;
        }

        public HotelBean setA(String a) {
            this.a = a;
            return this;
        }

        public CBean getC() {
            return c;
        }

        public HotelBean setC(CBean c) {
            this.c = c;
            return this;
        }

        public TBean getT() {
            return t;
        }

        public HotelBean setT(TBean t) {
            this.t = t;
            return this;
        }

        public String getH() {
            return h;
        }

        public HotelBean setH(String h) {
            this.h = h;
            return this;
        }

        public int getI() {
            return i;
        }

        public HotelBean setI(int i) {
            this.i = i;
            return this;
        }

        public String getF() {
            return f;
        }

        public HotelBean setF(String f) {
            this.f = f;
            return this;
        }

        public int getFc() {
            return fc;
        }

        public HotelBean setFc(int fc) {
            this.fc = fc;
            return this;
        }

        public GBean getG() {
            return g;
        }

        public HotelBean setG(GBean g) {
            this.g = g;
            return this;
        }

        public String getN() {
            return n;
        }

        public HotelBean setN(String n) {
            this.n = n;
            return this;
        }

        public double getR() {
            return r;
        }

        public HotelBean setR(double r) {
            this.r = r;
            return this;
        }

        public String getV() {
            return v;
        }

        public HotelBean setV(String v) {
            this.v = v;
            return this;
        }

        public int getS() {
            return s;
        }

        public HotelBean setS(int s) {
            this.s = s;
            return this;
        }

        public int getP() {
            return p;
        }

        public HotelBean setP(int p) {
            this.p = p;
            return this;
        }

        public double getPo() {
            return po;
        }

        public HotelBean setPo(double po) {
            this.po = po;
            return this;
        }

        public Map<String, OfferBean> getOffers() {
            return offers;
        }

        public HotelBean setOffers(Map<String, OfferBean> offers) {
            this.offers = offers;
            return this;
        }

        public List<String> getE() {
            return e;
        }

        public HotelBean setE(List<String> e) {
            this.e = e;
            return this;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            HotelBean hotelBean = (HotelBean) o;
            return i == hotelBean.i &&
                    fc == hotelBean.fc &&
                    Double.compare(hotelBean.r, r) == 0 &&
                    s == hotelBean.s &&
                    p == hotelBean.p &&
                    Double.compare(hotelBean.po, po) == 0 &&
                    Objects.equals(a, hotelBean.a) &&
                    Objects.equals(c, hotelBean.c) &&
                    Objects.equals(t, hotelBean.t) &&
                    Objects.equals(h, hotelBean.h) &&
                    Objects.equals(f, hotelBean.f) &&
                    Objects.equals(g, hotelBean.g) &&
                    Objects.equals(n, hotelBean.n) &&
                    Objects.equals(v, hotelBean.v) &&
                    Objects.equals(offers, hotelBean.offers) &&
                    Objects.equals(e, hotelBean.e);
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, c, t, h, i, f, fc, g, n, r, v, s, p, po, offers, e);
        }

        @Override
        public String toString() {
            return "HotelBean{" +
                    "a='" + a + '\'' +
                    ", c=" + c +
                    ", t=" + t +
                    ", h='" + h + '\'' +
                    ", i=" + i +
                    ", f='" + f + '\'' +
                    ", fc=" + fc +
                    ", g=" + g +
                    ", n='" + n + '\'' +
                    ", r=" + r +
                    ", v='" + v + '\'' +
                    ", s=" + s +
                    ", p=" + p +
                    ", po=" + po +
                    ", offers=" + offers +
                    ", e=" + e +
                    '}';
        }

        public static class CBean {
            /**
             * i : 953
             * c : alanja
             * n : Алания
             */

            private int i;
            private String c;
            private String n;

            public int getI() {
                return i;
            }

            public void setI(int i) {
                this.i = i;
            }

            public String getC() {
                return c;
            }

            public void setC(String c) {
                this.c = c;
            }

            public String getN() {
                return n;
            }

            public void setN(String n) {
                this.n = n;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                CBean cBean = (CBean) o;
                return i == cBean.i &&
                        Objects.equals(c, cBean.c) &&
                        Objects.equals(n, cBean.n);
            }

            @Override
            public int hashCode() {
                return Objects.hash(i, c, n);
            }

            @Override
            public String toString() {
                return "CBean{" +
                        "i=" + i +
                        ", c='" + c + '\'' +
                        ", n='" + n + '\'' +
                        '}';
            }
        }

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

            public int getI() {
                return i;
            }

            public void setI(int i) {
                this.i = i;
            }

            public String getC() {
                return c;
            }

            public void setC(String c) {
                this.c = c;
            }

            public String getCid() {
                return cid;
            }

            public void setCid(String cid) {
                this.cid = cid;
            }

            public String getN() {
                return n;
            }

            public void setN(String n) {
                this.n = n;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                TBean tBean = (TBean) o;
                return i == tBean.i &&
                        Objects.equals(c, tBean.c) &&
                        Objects.equals(cid, tBean.cid) &&
                        Objects.equals(n, tBean.n);
            }

            @Override
            public int hashCode() {
                return Objects.hash(i, c, cid, n);
            }

            @Override
            public String toString() {
                return "TBean{" +
                        "i=" + i +
                        ", c='" + c + '\'' +
                        ", cid='" + cid + '\'' +
                        ", n='" + n + '\'' +
                        '}';
            }
        }

        public static class GBean {
            /**
             * a : 36.59355
             * o : 31.84603
             */

            private String a;
            private String o;

            public String getA() {
                return a;
            }

            public void setA(String a) {
                this.a = a;
            }

            public String getO() {
                return o;
            }

            public void setO(String o) {
                this.o = o;
            }

            @Override
            public boolean equals(Object o1) {
                if (this == o1) return true;
                if (o1 == null || getClass() != o1.getClass()) return false;
                GBean gBean = (GBean) o1;
                return Objects.equals(a, gBean.a) &&
                        Objects.equals(o, gBean.o);
            }

            @Override
            public int hashCode() {
                return Objects.hash(a, o);
            }

            @Override
            public String toString() {
                return "GBean{" +
                        "a='" + a + '\'' +
                        ", o='" + o + '\'' +
                        '}';
            }
        }

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

            public int getI() {
                return i;
            }

            public OfferBean setI(int i) {
                this.i = i;
                return this;
            }

            public int getOi() {
                return oi;
            }

            public OfferBean setOi(int oi) {
                this.oi = oi;
                return this;
            }

            public int getTi() {
                return ti;
            }

            public OfferBean setTi(int ti) {
                this.ti = ti;
                return this;
            }

            public int getC() {
                return c;
            }

            public OfferBean setC(int c) {
                this.c = c;
                return this;
            }

            public String getD() {
                return d;
            }

            public OfferBean setD(String d) {
                this.d = d;
                return this;
            }

            public String getY() {
                return y;
            }

            public OfferBean setY(String y) {
                this.y = y;
                return this;
            }

            public String getA() {
                return a;
            }

            public OfferBean setA(String a) {
                this.a = a;
                return this;
            }

            public int getH() {
                return h;
            }

            public OfferBean setH(int h) {
                this.h = h;
                return this;
            }

            public String getHa() {
                return ha;
            }

            public OfferBean setHa(String ha) {
                this.ha = ha;
                return this;
            }

            public int getCi() {
                return ci;
            }

            public OfferBean setCi(int ci) {
                this.ci = ci;
                return this;
            }

            public int getL() {
                return l;
            }

            public OfferBean setL(int l) {
                this.l = l;
                return this;
            }

            public String getF() {
                return f;
            }

            public OfferBean setF(String f) {
                this.f = f;
                return this;
            }

            public String getRi() {
                return ri;
            }

            public OfferBean setRi(String ri) {
                this.ri = ri;
                return this;
            }

            public String getR() {
                return r;
            }

            public OfferBean setR(String r) {
                this.r = r;
                return this;
            }

            public double getP() {
                return p;
            }

            public OfferBean setP(double p) {
                this.p = p;
                return this;
            }

            public int getPl() {
                return pl;
            }

            public OfferBean setPl(int pl) {
                this.pl = pl;
                return this;
            }

            public String getU() {
                return u;
            }

            public OfferBean setU(String u) {
                this.u = u;
                return this;
            }

            public double getUr() {
                return ur;
            }

            public OfferBean setUr(double ur) {
                this.ur = ur;
                return this;
            }

            public String getT() {
                return t;
            }

            public OfferBean setT(String t) {
                this.t = t;
                return this;
            }

            public ToBeanX getTo() {
                return to;
            }

            public OfferBean setTo(ToBeanX to) {
                this.to = to;
                return this;
            }

            public SsBean getSs() {
                return ss;
            }

            public OfferBean setSs(SsBean ss) {
                this.ss = ss;
                return this;
            }

            public String getS() {
                return s;
            }

            public OfferBean setS(String s) {
                this.s = s;
                return this;
            }

            public List<String> getO() {
                return o;
            }

            public OfferBean setO(List<String> o) {
                this.o = o;
                return this;
            }

            public String getDt() {
                return dt;
            }

            public OfferBean setDt(String dt) {
                this.dt = dt;
                return this;
            }

            @Override
            public boolean equals(Object o1) {
                if (this == o1) return true;
                if (o1 == null || getClass() != o1.getClass()) return false;
                OfferBean offerBean = (OfferBean) o1;
                return i == offerBean.i &&
                        oi == offerBean.oi &&
                        ti == offerBean.ti &&
                        c == offerBean.c &&
                        h == offerBean.h &&
                        ci == offerBean.ci &&
                        l == offerBean.l &&
                        Double.compare(offerBean.p, p) == 0 &&
                        pl == offerBean.pl &&
                        Double.compare(offerBean.ur, ur) == 0 &&
                        Objects.equals(d, offerBean.d) &&
                        Objects.equals(dt, offerBean.dt) &&
                        Objects.equals(y, offerBean.y) &&
                        Objects.equals(a, offerBean.a) &&
                        Objects.equals(ha, offerBean.ha) &&
                        Objects.equals(f, offerBean.f) &&
                        Objects.equals(ri, offerBean.ri) &&
                        Objects.equals(r, offerBean.r) &&
                        Objects.equals(u, offerBean.u) &&
                        Objects.equals(t, offerBean.t) &&
                        Objects.equals(to, offerBean.to) &&
                        Objects.equals(ss, offerBean.ss) &&
                        Objects.equals(s, offerBean.s) &&
                        Objects.equals(o, offerBean.o);
            }

            @Override
            public int hashCode() {
                return Objects.hash(i, oi, ti, c, d, dt, y, a, h, ha, ci, l, f, ri, r, p, pl, u, ur, t, to, ss, s, o);
            }

            @Override
            public String toString() {
                return "OfferBean{" +
                        "i=" + i +
                        ", oi=" + oi +
                        ", ti=" + ti +
                        ", c=" + c +
                        ", d='" + d + '\'' +
                        ", dt='" + dt + '\'' +
                        ", y='" + y + '\'' +
                        ", a='" + a + '\'' +
                        ", h=" + h +
                        ", ha='" + ha + '\'' +
                        ", ci=" + ci +
                        ", l=" + l +
                        ", f='" + f + '\'' +
                        ", ri='" + ri + '\'' +
                        ", r='" + r + '\'' +
                        ", p=" + p +
                        ", pl=" + pl +
                        ", u='" + u + '\'' +
                        ", ur=" + ur +
                        ", t='" + t + '\'' +
                        ", to=" + to +
                        ", ss=" + ss +
                        ", s='" + s + '\'' +
                        ", o=" + o +
                        '}';
            }

            public static class ToBeanX {
                private List<FromBean> from;
                private List<ToBean> to;

                public List<FromBean> getFrom() {
                    return from;
                }

                public void setFrom(List<FromBean> from) {
                    this.from = from;
                }

                public List<ToBean> getTo() {
                    return to;
                }

                public void setTo(List<ToBean> to) {
                    this.to = to;
                }

                @Override
                public boolean equals(Object o) {
                    if (this == o) return true;
                    if (o == null || getClass() != o.getClass()) return false;
                    ToBeanX toBeanX = (ToBeanX) o;
                    return Objects.equals(from, toBeanX.from) &&
                            Objects.equals(to, toBeanX.to);
                }

                @Override
                public int hashCode() {
                    return Objects.hash(from, to);
                }

                @Override
                public String toString() {
                    return "ToBeanX{" +
                            "from=" + from +
                            ", to=" + to +
                            '}';
                }

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

                    public String getCode() {
                        return code;
                    }

                    public void setCode(String code) {
                        this.code = code;
                    }

                    public String getCraft() {
                        return craft;
                    }

                    public void setCraft(String craft) {
                        this.craft = craft;
                    }

                    public String getLine() {
                        return line;
                    }

                    public void setLine(String line) {
                        this.line = line;
                    }

                    public String getPortFr() {
                        return portFr;
                    }

                    public void setPortFr(String portFr) {
                        this.portFr = portFr;
                    }

                    public String getPortTo() {
                        return portTo;
                    }

                    public void setPortTo(String portTo) {
                        this.portTo = portTo;
                    }

                    public String getBegin() {
                        return begin;
                    }

                    public void setBegin(String begin) {
                        this.begin = begin;
                    }

                    public String getEnd() {
                        return end;
                    }

                    public void setEnd(String end) {
                        this.end = end;
                    }

                    @Override
                    public boolean equals(Object o) {
                        if (this == o) return true;
                        if (o == null || getClass() != o.getClass()) return false;
                        FromBean fromBean = (FromBean) o;
                        return Objects.equals(code, fromBean.code) &&
                                Objects.equals(craft, fromBean.craft) &&
                                Objects.equals(line, fromBean.line) &&
                                Objects.equals(portFr, fromBean.portFr) &&
                                Objects.equals(portTo, fromBean.portTo) &&
                                Objects.equals(begin, fromBean.begin) &&
                                Objects.equals(end, fromBean.end);
                    }

                    @Override
                    public int hashCode() {
                        return Objects.hash(code, craft, line, portFr, portTo, begin, end);
                    }

                    @Override
                    public String toString() {
                        return "FromBean{" +
                                "code='" + code + '\'' +
                                ", craft='" + craft + '\'' +
                                ", line='" + line + '\'' +
                                ", portFr='" + portFr + '\'' +
                                ", portTo='" + portTo + '\'' +
                                ", begin='" + begin + '\'' +
                                ", end='" + end + '\'' +
                                '}';
                    }
                }

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

                    public String getCode() {
                        return code;
                    }

                    public void setCode(String code) {
                        this.code = code;
                    }

                    public String getCraft() {
                        return craft;
                    }

                    public void setCraft(String craft) {
                        this.craft = craft;
                    }

                    public String getLine() {
                        return line;
                    }

                    public void setLine(String line) {
                        this.line = line;
                    }

                    public String getPortFr() {
                        return portFr;
                    }

                    public void setPortFr(String portFr) {
                        this.portFr = portFr;
                    }

                    public String getPortTo() {
                        return portTo;
                    }

                    public void setPortTo(String portTo) {
                        this.portTo = portTo;
                    }

                    public String getBegin() {
                        return begin;
                    }

                    public void setBegin(String begin) {
                        this.begin = begin;
                    }

                    public String getEnd() {
                        return end;
                    }

                    public void setEnd(String end) {
                        this.end = end;
                    }

                    @Override
                    public boolean equals(Object o) {
                        if (this == o) return true;
                        if (o == null || getClass() != o.getClass()) return false;
                        ToBean toBean = (ToBean) o;
                        return Objects.equals(code, toBean.code) &&
                                Objects.equals(craft, toBean.craft) &&
                                Objects.equals(line, toBean.line) &&
                                Objects.equals(portFr, toBean.portFr) &&
                                Objects.equals(portTo, toBean.portTo) &&
                                Objects.equals(begin, toBean.begin) &&
                                Objects.equals(end, toBean.end);
                    }

                    @Override
                    public int hashCode() {
                        return Objects.hash(code, craft, line, portFr, portTo, begin, end);
                    }

                    @Override
                    public String toString() {
                        return "ToBean{" +
                                "code='" + code + '\'' +
                                ", craft='" + craft + '\'' +
                                ", line='" + line + '\'' +
                                ", portFr='" + portFr + '\'' +
                                ", portTo='" + portTo + '\'' +
                                ", begin='" + begin + '\'' +
                                ", end='" + end + '\'' +
                                '}';
                    }
                }
            }

            public static class SsBean {
                /**
                 * avia : 1
                 * aviaBack : 0
                 * hotel : -1
                 */

                private int avia;
                private int aviaBack;
                private int hotel;

                public int getAvia() {
                    return avia;
                }

                public void setAvia(int avia) {
                    this.avia = avia;
                }

                public int getAviaBack() {
                    return aviaBack;
                }

                public void setAviaBack(int aviaBack) {
                    this.aviaBack = aviaBack;
                }

                public int getHotel() {
                    return hotel;
                }

                public void setHotel(int hotel) {
                    this.hotel = hotel;
                }

                @Override
                public boolean equals(Object o) {
                    if (this == o) return true;
                    if (o == null || getClass() != o.getClass()) return false;
                    SsBean ssBean = (SsBean) o;
                    return avia == ssBean.avia &&
                            aviaBack == ssBean.aviaBack &&
                            hotel == ssBean.hotel;
                }

                @Override
                public int hashCode() {
                    return Objects.hash(avia, aviaBack, hotel);
                }

                @Override
                public String toString() {
                    return "SsBean{" +
                            "avia=" + avia +
                            ", aviaBack=" + aviaBack +
                            ", hotel=" + hotel +
                            '}';
                }
            }
        }

    }
}