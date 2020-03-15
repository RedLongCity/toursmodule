package com.smitsworks.toursmodule.parsing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.smitsworks.toursmodule.model.otpusk.response.PocketToursResponse;
import com.smitsworks.toursmodule.utils.JsonUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class PocketToursResponseParsingTest {

    @Autowired
    private ObjectMapper objectMapper;

    private PocketToursResponse response;

    @Before
    public void populate() {
        response = new PocketToursResponse();
        response.setLastResult(true);

        PocketToursResponse.CntBean cntBean = new PocketToursResponse.CntBean();
        cntBean.setId("115");
        cntBean.setCode("turkey");
        cntBean.setName("\u0422\u0443\u0440\u0446\u0438\u044f");
        cntBean.setNameDt("\u0422\u0443\u0440\u0446\u0438\u0438");
        cntBean.setNamePr("\u0422\u0443\u0440\u0446\u0438\u0438");
        cntBean.setNameRd("\u0422\u0443\u0440\u0446\u0438\u0438");
        cntBean.setNameTr("Turkey");
        cntBean.setNameVn("\u0422\u0443\u0440\u0446\u0438\u044e");

        PocketToursResponse.CntBean.LatLngBean latLngBean = new PocketToursResponse.CntBean.LatLngBean();
        latLngBean.setLat("38.98290");
        latLngBean.setLng("35.19060");
        latLngBean.setZoom("5");

        cntBean.setLatLng(latLngBean);
        cntBean.setCid("tr");
        response.setCnt(cntBean);

        PocketToursResponse.DeptBean deptBean = new PocketToursResponse.DeptBean();
        deptBean.setId("1544");
        deptBean.setName("\u041a\u0438\u0435\u0432");
        deptBean.setNameDt("\u041a\u0438\u0435\u0432\u0443");
        deptBean.setNamePr("\u041a\u0438\u0435\u0432\u0435");
        deptBean.setNameRd("\u041a\u0438\u0435\u0432\u0430");
        deptBean.setNameTr("kiev");
        deptBean.setNameVn("\u041a\u0438\u0435\u0432");
        response.setDept(deptBean);

        PocketToursResponse.DeptBean.LatLngBeanX latLngBeanX = new PocketToursResponse.DeptBean.LatLngBeanX();
        latLngBeanX.setLat("50.45010");
        latLngBeanX.setLng("30.52960");
        latLngBeanX.setZoom("12");
        deptBean.setLatLng(latLngBeanX);

        response.setTotal(139);

        Map<String, Integer> stars = new HashMap<>();
        stars.put("3", 11541);
        stars.put("4", 12105);
        stars.put("2", 12623);
        stars.put("4+", 16829);
        stars.put("5", 15930);
        stars.put("5+", 19170);
        response.setStars(stars);

        Map<String, Integer> operators = new HashMap<>();
        operators.put("269", 13937);
        operators.put("1416", 11541);
        operators.put("2", 13545);
        operators.put("2700", 13635);
        operators.put("594", 12983);
        operators.put("2835", 12105);
        operators.put("717", 12285);
        response.setOperators(operators);

        Map<String, Float> originalStars = new HashMap<>();
        originalStars.put("3", 512.92f);
        originalStars.put("4", 538f);
        originalStars.put("2", 561f);
        originalStars.put("4+", 747.95f);
        originalStars.put("5", 708f);
        originalStars.put("5+", 852f);
        response.setOriginalStars(originalStars);

        Map<String, Float> originalOperators = new HashMap<>();
        originalOperators.put("269", 619.41f);
        originalOperators.put("1416", 512.92f);
        originalOperators.put("2", 602f);
        originalOperators.put("2700", 606f);
        originalOperators.put("594", 577f);
        originalOperators.put("2835", 538f);
        originalOperators.put("717", 546f);
        response.setOriginalOperators(originalOperators);

        Map<String, Map<String, PocketToursResponse.HotelBean>> hotels = new HashMap<>();
        response.setHotels(hotels);

        Map<String, PocketToursResponse.HotelBean> hotelBeanMap = new HashMap<>();
        hotels.put("1", hotelBeanMap);

        PocketToursResponse.HotelBean hotelFirst = new PocketToursResponse.HotelBean();
        hotelBeanMap.put("20178", hotelFirst);

        hotelFirst.setA("\u041e\u0442\u0435\u043b\u044c \u043f\u043e\u0441\u0442\u0440\u043e\u0435\u043d \u0432 2000\u0433\u043e\u0434\u0443 \u0438 \u0431\u044b\u043b\u043e\u0442\u0440\u0435\u0441\u0442\u0430\u0432\u0440\u0438\u0440\u043e\u0432\u0430\u043d \u0432 2010.\u041e\u0442\u0435\u043b\u044c \u043f\u0440\u0435\u0434\u0441\u0442\u0430\u0432\u043b\u044f\u0435\u0442\u0441\u043e\u0431\u043e\u0439 \u043a\u043e\u043c\u043f\u043b\u0435\u043a\u0441 \u0438\u0437\u0434\u0432\u0443\u0445 \u0437\u0434\u0430\u043d\u0438\u0439,\u0441\u043e\u0435\u0434\u0438\u043d\u0435\u043d\u043d\u044b\u0445\u043f\u0435\u0440\u0435\u0445\u043e\u0434\u043e\u043c. \u0417\u0434\u0430\u043d\u0438\u044f\u043f\u043e\u0441\u0442\u0440\u043e\u0435\u043d\u044b \u0432\u0442\u0440\u043e\u043f\u0438\u0447\u0435\u0441\u043a\u043e\u043c \u0441\u0442\u0438\u043b\u0435.\u041e\u0444\u043e\u0440\u043c\u043b\u0435\u043d\u0438\u0435\u043e\u0441\u043d\u043e\u0432\u043d\u043e\u0433\u043e \u043a\u043e\u0440\u043f\u0443\u0441\u0430\u0432\u044b\u0434\u0435\u0440\u0436\u0430\u043d\u043e \u0432\u0441\u0440\u0435\u0434\u0438\u0437\u0435\u043c\u043d\u043e\u043c\u043e\u0440\u0441\u043a\u043e\u043c\u0441\u0442\u0438\u043b\u0435 \u0441 \u0430\u0440\u043e\u0447\u043d\u044b\u043c\u0438\u043f\u0440\u043e\u0445\u043e\u0434\u0430\u043c\u0438 \u0438\u0442\u0435\u0440\u0440\u0430\u0441\u0430\u043c\u0438,\u0432\u044b\u043b\u043e\u0436\u0435\u043d\u043d\u044b\u043c\u0438\u043f\u043b\u0438\u0442\u043a\u043e\u0439. \u041d\u0435\u0434\u0430\u043b\u0435\u043a\u043e \u043e\u0442\u043e\u0442\u0435\u043b\u044f...");

        PocketToursResponse.HotelBean.CBean cBean = new PocketToursResponse.HotelBean.CBean();
        cBean.setI(953);
        cBean.setC("alanja");
        cBean.setN("\u0410\u043b\u0430\u043d\u0438\u044f");
        hotelFirst.setC(cBean);

        PocketToursResponse.HotelBean.TBean tBean = new PocketToursResponse.HotelBean.TBean();
        tBean.setI(115);
        tBean.setC("turkey");
        tBean.setCid("tr");
        tBean.setN("\u0422\u0443\u0440\u0446\u0438\u044f");
        hotelFirst.setT(tBean);

        hotelFirst.setE(Arrays.asList("aerobics",
                "animation",
                "billiards",
                "cafe",
                "chairs",
                "childmenu",
                "childpool",
                "conditioning",
                "towels",
                "tv",
                "umbrella",
                "volleyball",
                "waterslides",
                "wifi"));

        hotelFirst.setH("Sunside_Beach_Hotel");
        hotelFirst.setI(20178);
        hotelFirst.setF("00003239323960.jpg");
        hotelFirst.setFc(8);

        PocketToursResponse.HotelBean.GBean gBean = new PocketToursResponse.HotelBean.GBean();
        gBean.setA("36.59355");
        gBean.setO("31.84603");
        hotelFirst.setG(gBean);

        hotelFirst.setN("Sunside Beach Hotel");
        hotelFirst.setR(3.8);
        hotelFirst.setV("61");
        hotelFirst.setS(3);
        hotelFirst.setP(11541);
        hotelFirst.setPo(512.92);

        Map<String, PocketToursResponse.HotelBean.OfferBean> offerBeanMap = new HashMap<>();
        hotelFirst.setOffers(offerBeanMap);

        PocketToursResponse.HotelBean.OfferBean offerBean = new PocketToursResponse.HotelBean.OfferBean();
        offerBeanMap.put("3024821", offerBean);
        offerBean.setI(3024821);
        offerBean.setOi(1416);
        offerBean.setTi(16679);
        offerBean.setO(Arrays.asList("insurance",
                "transfer",
                "visa"));
        offerBean.setC(1544);
        offerBean.setD("2016-10-12");
        offerBean.setY("dbl");
        offerBean.setA("2");
        offerBean.setH(0);
        offerBean.setHa("");
        offerBean.setCi(953);
        offerBean.setL(8);
        offerBean.setF("ai");
        offerBean.setRi("35174");
        offerBean.setR("Standard Room");
        offerBean.setP(512.92);
        offerBean.setPl(11541);
        offerBean.setU("usd");
        offerBean.setUr(26.85);
        offerBean.setT("air");

        PocketToursResponse.HotelBean.OfferBean.ToBeanX toBeanX = new PocketToursResponse.HotelBean.OfferBean.ToBeanX();
        offerBean.setTo(toBeanX);

        PocketToursResponse.HotelBean.OfferBean.ToBeanX.FromBean fromBean = new PocketToursResponse.HotelBean.OfferBean.ToBeanX.FromBean();
        List<PocketToursResponse.HotelBean.OfferBean.ToBeanX.FromBean> fromBeanList = new ArrayList<>();
        fromBeanList.add(fromBean);
        toBeanX.setFrom(fromBeanList);
        fromBean.setCode("PS 5411");
        fromBean.setCraft("Boeing 737-800");
        fromBean.setLine("Ukraine International Airlines");
        fromBean.setPortFr("KBP");
        fromBean.setPortTo("AYT");
        fromBean.setBegin("2016-10-10 04:30:00");
        fromBean.setEnd("2016-10-10 07:00:00");

        PocketToursResponse.HotelBean.OfferBean.ToBeanX.ToBean toBean = new PocketToursResponse.HotelBean.OfferBean.ToBeanX.ToBean();
        List<PocketToursResponse.HotelBean.OfferBean.ToBeanX.ToBean> toBeanList = new ArrayList<>();
        toBeanList.add(toBean);
        toBeanX.setTo(toBeanList);
        toBean.setCode("PS 5416");
        toBean.setCraft("Boeing 737-800");
        toBean.setLine("Ukraine International Airlines");
        toBean.setPortFr("AYT");
        toBean.setPortTo("KBP");
        toBean.setBegin("2016-10-13 14:05:00");
        toBean.setEnd("2016-10-13 16:40:00");

        PocketToursResponse.HotelBean.OfferBean.SsBean ssBean = new PocketToursResponse.HotelBean.OfferBean.SsBean();
        ssBean.setAvia(1);
        ssBean.setAviaBack(0);
        ssBean.setHotel(-1);
        offerBean.setSs(ssBean);

        offerBean.setS("FIX Price 7%");

        PocketToursResponse.HotelBean.OfferBean offerBean2 = new PocketToursResponse.HotelBean.OfferBean();
        offerBeanMap.put("3024822", offerBean2);
        offerBean2.setI(3024822);
        offerBean2.setOi(1416);
        offerBean2.setTi(16679);
        offerBean2.setO(Arrays.asList("insurance",
                "transfer"));
        offerBean2.setC(1544);
        offerBean2.setD("2016-10-13");
        offerBean2.setY("dbl");
        offerBean2.setA("2");
        offerBean2.setH(0);
        offerBean2.setHa("0");
        offerBean2.setCi(953);
        offerBean2.setL(8);
        offerBean2.setF("ai");
        offerBean2.setRi("35174");
        offerBean2.setR("Standard Room");
        offerBean2.setP(512.92);
        offerBean2.setPl(11541);
        offerBean2.setU("usd");
        offerBean2.setT("air");

        PocketToursResponse.HotelBean.OfferBean.ToBeanX toBeanX2 = new PocketToursResponse.HotelBean.OfferBean.ToBeanX();
        offerBean2.setTo(toBeanX2);

        PocketToursResponse.HotelBean.OfferBean.ToBeanX.FromBean fromBean2 = new PocketToursResponse.HotelBean.OfferBean.ToBeanX.FromBean();
        List<PocketToursResponse.HotelBean.OfferBean.ToBeanX.FromBean> fromBeanList2 = new ArrayList<>();
        fromBeanList2.add(fromBean2);
        toBeanX2.setFrom(fromBeanList2);
        fromBean2.setCode("PS 5411");
        fromBean2.setCraft("Boeing 737-800");
        fromBean2.setLine("Ukraine International Airlines");
        fromBean2.setPortFr("KBP");
        fromBean2.setPortTo("AYT");
        fromBean2.setBegin("2016-10-10 04:30:00");
        fromBean2.setEnd("2016-10-10 07:00:00");

        PocketToursResponse.HotelBean.OfferBean.ToBeanX.ToBean toBean2 = new PocketToursResponse.HotelBean.OfferBean.ToBeanX.ToBean();
        List<PocketToursResponse.HotelBean.OfferBean.ToBeanX.ToBean> toBeanList2 = new ArrayList<>();
        toBeanList2.add(toBean2);
        toBeanX2.setTo(toBeanList2);
        toBean2.setCode("PS 5416");
        toBean2.setCraft("Boeing 737-800");
        toBean2.setLine("Ukraine International Airlines");
        toBean2.setPortFr("AYT");
        toBean2.setPortTo("KBP");
        toBean2.setBegin("2016-10-13 14:05:00");
        toBean2.setEnd("2016-10-13 16:40:00");

        PocketToursResponse.HotelBean.OfferBean.SsBean ssBean2 = new PocketToursResponse.HotelBean.OfferBean.SsBean();
        ssBean2.setAvia(1);
        ssBean2.setAviaBack(1);
        ssBean2.setHotel(1);
        offerBean2.setSs(ssBean2);

        PocketToursResponse.HotelBean hotelSecond = new PocketToursResponse.HotelBean();
        hotelBeanMap.put("8987", hotelSecond);

        hotelSecond.setA("\u041e\u0442\u0435\u043b\u044c \u0440\u0430\u0441\u043f\u043e\u043b\u043e\u0436\u0435\u043d\u043d\u0430 \u043f\u043e\u0431\u0435\u0440\u0435\u0436\u044c\u0435\u0410\u043d\u0442\u0430\u043b\u0438\u0438, \u0432 300 \u043c\u0435\u0442\u0440\u0430\u0445 \u043e\u0442\u043f\u043b\u044f\u0436\u0430. \u0417\u0434\u0430\u043d\u0438\u0435 \u043e\u0442\u0435\u043b\u044f\u043f\u043e\u043a\u0440\u044b\u0442\u043e \u044f\u0440\u043a\u0438\u043c\u0438\u0446\u0432\u0435\u0442\u0430\u043c\u0438.");

        PocketToursResponse.HotelBean.CBean cBean3 = new PocketToursResponse.HotelBean.CBean();
        cBean3.setI(955);
        cBean3.setC("antalija");
        cBean3.setN("\u0410\u043d\u0442\u0430\u043b\u0438\u044f");
        hotelSecond.setC(cBean3);

        PocketToursResponse.HotelBean.TBean tBean3 = new PocketToursResponse.HotelBean.TBean();
        tBean3.setI(115);
        tBean3.setC("turkey");
        tBean3.setCid("tr");
        tBean3.setN("\u0422\u0443\u0440\u0446\u0438\u044f");
        hotelSecond.setT(tBean3);

        hotelSecond.setE(Arrays.asList("cafe",
                "chairs",
                "childpool",
                "cleaners",
                "conditioning",
                "elevator",
                "hairdryer",
                "laundry",
                "network",
                "non_smoking",
                "outdoor_pool",
                "park",
                "parking",
                "pebble",
                "phone",
                "rent_car",
                "restaurant",
                "safe",
                "shower",
                "table_tennis",
                "terrace",
                "town",
                "tv",
                "umbrella",
                "visa",
                "water_sports",
                "wifi"));

        hotelSecond.setH("Benna_Hotel");
        hotelSecond.setI(8987);
        hotelSecond.setF("00002407240732.jpg");
        hotelSecond.setFc(14);

        PocketToursResponse.HotelBean.GBean gBean3 = new PocketToursResponse.HotelBean.GBean();
        gBean3.setA("36.86231");
        gBean3.setO("30.63359");
        hotelSecond.setG(gBean3);

        hotelSecond.setN("Benna Hotel");
        hotelSecond.setR(7.2);
        hotelSecond.setV("2");
        hotelSecond.setS(2);
        hotelSecond.setP(12690);
        hotelSecond.setPo(564);

        Map<String, PocketToursResponse.HotelBean.OfferBean> offerBeanMap2 = new HashMap<>();
        hotelSecond.setOffers(offerBeanMap2);

        PocketToursResponse.HotelBean.OfferBean offerBean3 = new PocketToursResponse.HotelBean.OfferBean();
        offerBeanMap2.put("3025168", offerBean3);
        offerBean3.setI(3025168);
        offerBean3.setOi(717);
        offerBean3.setTi(786);
        offerBean3.setO(Arrays.asList("transfer",
                "insurance"));
        offerBean3.setC(1544);
        offerBean3.setD("2016-10-13");
        offerBean3.setDt("2016-10-20");
        offerBean3.setY("dbl");
        offerBean3.setA("2");
        offerBean3.setH(0);
        offerBean3.setHa("0");
        offerBean3.setCi(955);
        offerBean3.setL(8);
        offerBean3.setF("hb");
        offerBean3.setRi("193276");
        offerBean3.setR("Standard Room");
        offerBean3.setP(564);
        offerBean3.setPl(12690);
        offerBean3.setU("usd");
        offerBean3.setT("air");

        PocketToursResponse.HotelBean.OfferBean.ToBeanX toBeanX3 = new PocketToursResponse.HotelBean.OfferBean.ToBeanX();
        offerBean3.setTo(toBeanX3);

        PocketToursResponse.HotelBean.OfferBean.ToBeanX.FromBean fromBean3 = new PocketToursResponse.HotelBean.OfferBean.ToBeanX.FromBean();
        List<PocketToursResponse.HotelBean.OfferBean.ToBeanX.FromBean> fromBeanList3 = new ArrayList<>();
        fromBeanList3.add(fromBean3);
        toBeanX3.setFrom(fromBeanList3);
        fromBean3.setCode("PS 5411");
        fromBean3.setCraft("Boeing 737-800");
        fromBean3.setLine("Ukraine International Airlines");
        fromBean3.setPortFr("KBP");
        fromBean3.setPortTo("AYT");
        fromBean3.setBegin("2016-10-10 04:30:00");
        fromBean3.setEnd("2016-10-10 07:00:00");

        PocketToursResponse.HotelBean.OfferBean.ToBeanX.ToBean toBean3 = new PocketToursResponse.HotelBean.OfferBean.ToBeanX.ToBean();
        List<PocketToursResponse.HotelBean.OfferBean.ToBeanX.ToBean> toBeanList3 = new ArrayList<>();
        toBeanList3.add(toBean3);
        toBeanX3.setTo(toBeanList3);
        toBean3.setCode("PS 5416");
        toBean3.setCraft("Boeing 737-800");
        toBean3.setLine("Ukraine International Airlines");
        toBean3.setPortFr("AYT");
        toBean3.setPortTo("KBP");
        toBean3.setBegin("2016-10-13 14:05:00");
        toBean3.setEnd("2016-10-13 16:40:00");

        PocketToursResponse.HotelBean.OfferBean.SsBean ssBean3 = new PocketToursResponse.HotelBean.OfferBean.SsBean();
        ssBean3.setAvia(1);
        ssBean3.setAviaBack(1);
        ssBean3.setHotel(1);
        offerBean3.setSs(ssBean3);

        Map<String, Boolean> progress = new HashMap<>();
        progress.put("269", true);
        progress.put("1416", true);
        progress.put("22", true);
        progress.put("2700", true);
        progress.put("594", true);
        progress.put("2835", true);
        progress.put("717", true);

        response.setProgress(progress);
    }

    @Test
    public void test() throws JsonProcessingException {
        JsonNode jsonNode = JsonUtils.getJsonFromResources("json/otpusk_pocket_tours_response.json");
        PocketToursResponse test = objectMapper.treeToValue(jsonNode, PocketToursResponse.class);
        Assert.assertEquals(test.getCnt(), response.getCnt());
        Assert.assertEquals(test.getDept(), response.getDept());
        Assert.assertEquals(test.getStars(), response.getStars());
        Assert.assertEquals(test.getOperators(), response.getOperators());
        Assert.assertEquals(test.getOriginalStars(), response.getOriginalStars());
        Assert.assertEquals(test.getOriginalOperators(), response.getOriginalOperators());
        Assert.assertEquals(test.getHotels().get("1").get("20178").getC(),
                response.getHotels().get("1").get("20178").getC());
        Assert.assertEquals(test.getHotels().get("1").get("20178").getT(),
                response.getHotels().get("1").get("20178").getT());
        Assert.assertEquals(test.getHotels().get("1").get("20178").getG(),
                response.getHotels().get("1").get("20178").getG());
        Assert.assertEquals(test.getHotels().get("1").get("20178").getOffers().get("3024821"),
                response.getHotels().get("1").get("20178").getOffers().get("3024821"));
        Assert.assertEquals(test.getHotels().get("1").get("20178").getOffers().get("3024822"),
                response.getHotels().get("1").get("20178").getOffers().get("3024822"));

        Assert.assertEquals(test.getHotels().get("1").get("8987").getC(),
                response.getHotels().get("1").get("8987").getC());
        Assert.assertEquals(test.getHotels().get("1").get("8987").getT(),
                response.getHotels().get("1").get("8987").getT());
        Assert.assertEquals(test.getHotels().get("1").get("8987").getG(),
                response.getHotels().get("1").get("8987").getG());
        Assert.assertEquals(test.getHotels().get("1").get("8987").getOffers().get("3025168"),
                response.getHotels().get("1").get("8987").getOffers().get("3025168"));

        Assert.assertEquals(test.getProgress(), response.getProgress());

        Assert.assertEquals(test, response);
    }
}
