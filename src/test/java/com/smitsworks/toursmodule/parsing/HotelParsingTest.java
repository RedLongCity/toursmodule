package com.smitsworks.toursmodule.parsing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.smitsworks.toursmodule.model.otpusk.Hotel;
import com.smitsworks.toursmodule.utils.JsonUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class HotelParsingTest {

    @Autowired
    @Qualifier("simple")
    private ObjectMapper objectMapper;

    private Hotel hotel;

    @Before
    public void populate() {
        hotel = new Hotel();
        Hotel.HotelBean hotelBean = new Hotel.HotelBean();

        hotel.setApi_version("2.4")
                .setTime(0.3859)
                .setHotel(hotelBean);

        Map<String, String> s = new HashMap<>();
        s.put("s", "four");
        s.put("n", "4*");
        s.put("c", "&#9733;&#9733;&#9733;&#9733;");

        Map<String, String> ad = new HashMap<>();
        ad.put("a", "Kucukgol Mevkii Buyukyer Mahallesi, Konakli, Alanya, Antalya, Turkey");
        ad.put("ml", "info@sunsidebeachhotel.com");
        ad.put("u", "http://www.sunsidebeachhotel.com/");
        ad.put("ph", "Tel: +90 (242) 545 43 42, <br />\nFax: +90 (242) 545 43");

        Map<String, String> p = new HashMap<>();
        p.put("p", "578.00");
        p.put("c", "eur");
        p.put("d", "2020-04-22");
        p.put("f", "ai");
        p.put("i", "2054775970898418");
        p.put("l", "8");
        p.put("t", "air");
        p.put("up", "2019-04-25 14:24:39");

        Map<String, String> fm = new HashMap<>();
        fm.put("i", "hotel");
        fm.put("n", "Отель");
        fm.put("vn", "Отели");
        fm.put("vns", "Отелей");
        fm.put("rd", "Отеля");
        fm.put("pr", "Отеле");
        fm.put("wh", "Отель");

        Map<String, String> tp = new HashMap<>();
        tp.put("i", "beach");
        tp.put("n", "пляжный");

        Map<String, Hotel.HotelBean.EBean.ROptionBean> r = new HashMap<>();
        r.put("shower", new Hotel.HotelBean.EBean.ROptionBean("ванна / душ", true, "false", null));
        r.put("hairdryer", new Hotel.HotelBean.EBean.ROptionBean("фен", true, "false", null));
        r.put("mini-bar", new Hotel.HotelBean.EBean.ROptionBean("мини-бар", true, "pay", "платно"));
        r.put("conditioning", new Hotel.HotelBean.EBean.ROptionBean("кондиционер", true, "false", null));
        r.put("tv", new Hotel.HotelBean.EBean.ROptionBean("кабельное/спутниковое ТВ", true, "false", null));
        r.put("phone", new Hotel.HotelBean.EBean.ROptionBean("телефон", true, "false", null));
        r.put("network", new Hotel.HotelBean.EBean.ROptionBean("интернет wi-fi", true, "pay", "платно"));
        r.put("terrace", new Hotel.HotelBean.EBean.ROptionBean("балкон/терраса", true, "false", null));

        Map<String, Hotel.HotelBean.EBean.HOptionBean> h = new HashMap<>();
        h.put("restaurant", new Hotel.HotelBean.EBean.HOptionBean("yes", "есть", "", "ресторан"));
        h.put("cafe", new Hotel.HotelBean.EBean.HOptionBean("yes", "есть", "", "кафе / бар"));
        h.put("outdoor_pool", new Hotel.HotelBean.EBean.HOptionBean("yes", "есть", "", "открытый бассейн"));
        h.put("conference", new Hotel.HotelBean.EBean.HOptionBean("yes", "есть", "", "конференц-зал / банкетный зал"));
        h.put("business", new Hotel.HotelBean.EBean.HOptionBean("pay", "<font color=\"red\" title=\"платно\">$</font>", "платно", "бизнес-центр"));
        h.put("parking", new Hotel.HotelBean.EBean.HOptionBean("yes", "есть", "", "автостоянка"));
        h.put("rent_car", new Hotel.HotelBean.EBean.HOptionBean("yes", "есть", "", "прокат автомобилей"));
        h.put("safe", new Hotel.HotelBean.EBean.HOptionBean("yes", "есть", "", "сейф"));
        h.put("elevator", new Hotel.HotelBean.EBean.HOptionBean("yes", "есть", "", "лифт"));
        h.put("laundry", new Hotel.HotelBean.EBean.HOptionBean("yes", "есть", "", "прачечная"));
        h.put("salon", new Hotel.HotelBean.EBean.HOptionBean("yes", "есть", "", "парикмахерская / салон красоты"));
        h.put("doctor", new Hotel.HotelBean.EBean.HOptionBean("pay", "<font color=\"red\" title=\"платно\">$</font>", "платно", "врач"));
        h.put("pets", new Hotel.HotelBean.EBean.HOptionBean("pay", "<font color=\"red\" title=\"платно\">$</font>", "платно", "размещение с животными"));
        h.put("conversion", new Hotel.HotelBean.EBean.HOptionBean("yes", "есть", "", "обмен валют"));
        h.put("atm", new Hotel.HotelBean.EBean.HOptionBean("yes", "есть", "", "банкомат"));
        h.put("visa", new Hotel.HotelBean.EBean.HOptionBean("yes", "есть", "", "оплата платежными картами"));

        Map<String, Hotel.HotelBean.EBean.HOptionBean> c = new HashMap<>();
        c.put("childpool", new Hotel.HotelBean.EBean.HOptionBean("yes", "есть", "", "детский бассейн"));
        c.put("playground", new Hotel.HotelBean.EBean.HOptionBean("yes", "есть", "", "детская площадка"));
        c.put("nursery", new Hotel.HotelBean.EBean.HOptionBean("yes", "есть", "", "детский клуб"));
        c.put("childmenu", new Hotel.HotelBean.EBean.HOptionBean("yes", "есть", "", "детское меню в ресторане"));
        c.put("highchairs", new Hotel.HotelBean.EBean.HOptionBean("yes", "есть", "", "детские стульчики в ресторане"));
        c.put("crib", new Hotel.HotelBean.EBean.HOptionBean("free", "<strike style=\"color:green\" title=\"бесплатно\">$</strike>", "бесплатно", "детская кроватка"));
        c.put("nurse", new Hotel.HotelBean.EBean.HOptionBean("pay", "<font color=\"red\" title=\"платно\">$</font>", "платно", "няня"));

        Map<String, Hotel.HotelBean.EBean.HOptionBean> sMap = new HashMap<>();
        sMap.put("sauna", new Hotel.HotelBean.EBean.HOptionBean("free", "<strike style=\"color:green\" title=\"бесплатно\">$</strike>", "бесплатно", "сауна / баня / хамам"));
        sMap.put("spa", new Hotel.HotelBean.EBean.HOptionBean("yes", "есть", "", "Спа или велнес-центр"));
        sMap.put("billiards", new Hotel.HotelBean.EBean.HOptionBean("pay", "<font color=\"red\" title=\"платно\">$</font>", "платно", "бильярд"));
        sMap.put("table_tennis", new Hotel.HotelBean.EBean.HOptionBean("yes", "есть", "", "настольный теннис"));
        sMap.put("tennis_court", new Hotel.HotelBean.EBean.HOptionBean("yes", "есть", "", "теннисный корт"));
        sMap.put("volleyball", new Hotel.HotelBean.EBean.HOptionBean("free", "<strike style=\"color:green\" title=\"бесплатно\">$</strike>", "бесплатно", "волейбол"));
        sMap.put("bikes", new Hotel.HotelBean.EBean.HOptionBean("pay", "<font color=\"red\" title=\"платно\">$</font>", "платно", "прокат велосипедов"));
        sMap.put("fitness", new Hotel.HotelBean.EBean.HOptionBean("free", "<strike style=\"color:green\" title=\"бесплатно\">$</strike>", "бесплатно", "тренажерный зал"));
        sMap.put("aerobics", new Hotel.HotelBean.EBean.HOptionBean("free", "<strike style=\"color:green\" title=\"бесплатно\">$</strike>", "бесплатно", "аэробика"));
        sMap.put("aquapark", new Hotel.HotelBean.EBean.HOptionBean("yes", "есть", "", "аквапарк или горки"));
        sMap.put("water_sports", new Hotel.HotelBean.EBean.HOptionBean("yes", "есть", "", "водные развлечения"));
        sMap.put("discotheque", new Hotel.HotelBean.EBean.HOptionBean("pay", "<font color=\"red\" title=\"платно\">$</font>", "платно", "диско-клуб"));
        sMap.put("animation", new Hotel.HotelBean.EBean.HOptionBean("yes", "есть", "", "анимация"));

        Map<String, Hotel.HotelBean.EBean.HOptionBean> b = new HashMap<>();

        b.put("two_line_beach", new Hotel.HotelBean.EBean.HOptionBean("yes", "есть", "", "отель на 2-й пляжной линии"));
        b.put("own", new Hotel.HotelBean.EBean.HOptionBean("yes", "есть", "", "собственный пляж"));
        b.put("sandy_pebble", new Hotel.HotelBean.EBean.HOptionBean("yes", "есть", "", "песчано-галечный пляж"));
        b.put("chairs", new Hotel.HotelBean.EBean.HOptionBean("free", "<strike style=\"color:green\" title=\"бесплатно\">$</strike>", "бесплатно", "шезлонги"));
        b.put("umbrella", new Hotel.HotelBean.EBean.HOptionBean("free", "<strike style=\"color:green\" title=\"бесплатно\">$</strike>", "бесплатно", "зонтики"));
        b.put("towels", new Hotel.HotelBean.EBean.HOptionBean("yes", "есть", "", "пляжные полотенца"));

        Hotel.HotelBean.EBean eBean = new Hotel.HotelBean.EBean();
        eBean.setR(r)
                .setH(h)
                .setC(c)
                .setS(sMap)
                .setB(b);

        Map<String, Hotel.HotelBean.OBean.RBeanX.ServicesBean> stringServicesBeanMap = new HashMap<>();
        stringServicesBeanMap.put("shower",
                new Hotel.HotelBean.OBean.RBeanX.ServicesBean("ванна / душ", "yes", ""));
        stringServicesBeanMap.put("hairdryer",
                new Hotel.HotelBean.OBean.RBeanX.ServicesBean("фен", "yes", ""));
        stringServicesBeanMap.put("mini-bar",
                new Hotel.HotelBean.OBean.RBeanX.ServicesBean("мини-бар", "pay", "платно"));
        stringServicesBeanMap.put("conditioning",
                new Hotel.HotelBean.OBean.RBeanX.ServicesBean("кондиционер", "yes", ""));
        stringServicesBeanMap.put("tv",
                new Hotel.HotelBean.OBean.RBeanX.ServicesBean("кабельное/спутниковое ТВ", "yes", ""));
        stringServicesBeanMap.put("phone",
                new Hotel.HotelBean.OBean.RBeanX.ServicesBean("телефон", "yes", ""));
        stringServicesBeanMap.put("network",
                new Hotel.HotelBean.OBean.RBeanX.ServicesBean("интернет wi-fi", "pay", "платно"));
        stringServicesBeanMap.put("terrace",
                new Hotel.HotelBean.OBean.RBeanX.ServicesBean("балкон/терраса", "yes", ""));

        Hotel.HotelBean.OBean.RBeanX rBeanX = new Hotel.HotelBean.OBean.RBeanX();
        rBeanX.setId("356623")
                .setName("Family Room")
                .setServices(stringServicesBeanMap)
                .setDescription("")
                .setPlaces("6")
                .setImages(Collections.EMPTY_LIST);

        Map<String, Hotel.HotelBean.OBean.RBeanX.ServicesBean> stringServicesBeanMap1 = new HashMap<>();
        stringServicesBeanMap1.put("shower",
                new Hotel.HotelBean.OBean.RBeanX.ServicesBean("ванна / душ", "yes", ""));
        stringServicesBeanMap1.put("hairdryer",
                new Hotel.HotelBean.OBean.RBeanX.ServicesBean("фен", "yes", ""));
        stringServicesBeanMap1.put("mini-bar",
                new Hotel.HotelBean.OBean.RBeanX.ServicesBean("мини-бар", "pay", "платно"));
        stringServicesBeanMap1.put("conditioning",
                new Hotel.HotelBean.OBean.RBeanX.ServicesBean("кондиционер", "yes", ""));
        stringServicesBeanMap1.put("tv",
                new Hotel.HotelBean.OBean.RBeanX.ServicesBean("кабельное/спутниковое ТВ", "yes", ""));
        stringServicesBeanMap1.put("phone",
                new Hotel.HotelBean.OBean.RBeanX.ServicesBean("телефон", "yes", ""));
        stringServicesBeanMap1.put("network",
                new Hotel.HotelBean.OBean.RBeanX.ServicesBean("интернет wi-fi", "pay", "платно"));
        stringServicesBeanMap1.put("terrace",
                new Hotel.HotelBean.OBean.RBeanX.ServicesBean("балкон/терраса", "yes", ""));

        Hotel.HotelBean.OBean.RBeanX rBeanX1 = new Hotel.HotelBean.OBean.RBeanX();
        rBeanX1.setId("356621")
                .setName("Standard Pool View Room")
                .setServices(stringServicesBeanMap1)
                .setDescription("")
                .setPlaces("0")
                .setImages(Collections.EMPTY_LIST);

        Map<String, Hotel.HotelBean.OBean.RBeanX.ServicesBean> stringServicesBeanMap2 = new HashMap<>();
        stringServicesBeanMap2.put("shower",
                new Hotel.HotelBean.OBean.RBeanX.ServicesBean("ванна / душ", "yes", ""));
        stringServicesBeanMap2.put("hairdryer",
                new Hotel.HotelBean.OBean.RBeanX.ServicesBean("фен", "yes", ""));
        stringServicesBeanMap2.put("mini-bar",
                new Hotel.HotelBean.OBean.RBeanX.ServicesBean("мини-бар", "pay", "платно"));
        stringServicesBeanMap2.put("conditioning",
                new Hotel.HotelBean.OBean.RBeanX.ServicesBean("кондиционер", "yes", ""));
        stringServicesBeanMap2.put("tv",
                new Hotel.HotelBean.OBean.RBeanX.ServicesBean("кабельное/спутниковое ТВ", "yes", ""));
        stringServicesBeanMap2.put("phone",
                new Hotel.HotelBean.OBean.RBeanX.ServicesBean("телефон", "yes", ""));
        stringServicesBeanMap2.put("network",
                new Hotel.HotelBean.OBean.RBeanX.ServicesBean("интернет wi-fi", "pay", "платно"));
        stringServicesBeanMap2.put("terrace",
                new Hotel.HotelBean.OBean.RBeanX.ServicesBean("балкон/терраса", "yes", ""));

        List<Object> images = new ArrayList<>();
        images.add(new LinkedHashMap<>());

        Hotel.HotelBean.OBean.RBeanX rBeanX2 = new Hotel.HotelBean.OBean.RBeanX();
        rBeanX2.setId("35174")
                .setName("Standard Room")
                .setServices(stringServicesBeanMap2)
                .setDescription("")
                .setPlaces("5")
                .setImages(images);

        List<Hotel.HotelBean.OBean.RBeanX> rBeanXList = new ArrayList<>();
        rBeanXList.add(rBeanX);
        rBeanXList.add(rBeanX1);
        rBeanXList.add(rBeanX2);

        Map<String, String> bs = new HashMap<>();
        bs.put("two_line_beach", "yes");
        bs.put("own", "yes");
        bs.put("sandy_pebble", "yes");
        bs.put("chairs", "free");
        bs.put("umbrella", "free");
        bs.put("towels", "yes");

        Map<String, String> ss = new HashMap<>();
        ss.put("sauna", "free");
        ss.put("spa", "yes");
        ss.put("billiards", "pay");
        ss.put("table_tennis", "yes");
        ss.put("tennis_court", "yes");
        ss.put("volleyball", "free");
        ss.put("bikes", "pay");
        ss.put("fitness", "free");
        ss.put("aerobics", "free");
        ss.put("aquapark", "yes");
        ss.put("water_sports", "yes");
        ss.put("discotheque", "pay");
        ss.put("animation", "yes");

        Map<String, String> hs = new HashMap<>();
        hs.put("restaurant", "yes");
        hs.put("cafe", "yes");
        hs.put("outdoor_pool", "yes");
        hs.put("conference", "yes");
        hs.put("business", "pay");
        hs.put("parking", "yes");
        hs.put("rent_car", "yes");
        hs.put("safe", "yes");
        hs.put("wifi", "");
        hs.put("elevator", "yes");
        hs.put("laundry", "yes");
        hs.put("salon", "yes");
        hs.put("doctor", "pay");
        hs.put("pets", "pay");
        hs.put("transfer", "");
        hs.put("conversion", "yes");
        hs.put("atm", "yes");
        hs.put("visa", "yes");

        Map<String, String> cs = new HashMap<>();
        cs.put("childpool", "yes");
        cs.put("playground", "yes");
        cs.put("nursery", "yes");
        cs.put("childmenu", "yes");
        cs.put("highchairs", "yes");
        cs.put("crib", "free");
        cs.put("nurse", "pay");

        Hotel.HotelBean.OBean oBean = new Hotel.HotelBean.OBean();
        oBean.setR(rBeanXList)
                .setB("Пляж в 150 м, между пляжем и отелем есть дорога, есть подземный переход. Протяжённость – 80 м. Бар на пляже.")
                .setBs(bs)
                .setS("1 водная горка, часы работы 10:00-11:30/15:00-16:30.")
                .setSs(ss)
                .setHs(hs)
                .setC("Мини-клуб для детей в возрасте от 4 до 12 лет, часы работы: с 10:00-12:00/15:00-17:00. <br />\nАренда детских колясок (платно).")
                .setCs(cs)
                .setDs("Всего 110 номеров в двух пятиэтажных зданиях.")
                .setFh("Wi-Fi (платно). <br />\nЗавтрак 07:30-09:30, обед 12:30-14:00, чай/выпечка (у бассейна) 17:00-18:00, ужин 19:00-21:00. Шведский стол. <br />\nБар у бассейна, 10:00-23:00. <br />\nБар на пляже, 10:00-18:00 (предлагаются безалкогольные напитки). <br />\n1 открытый бассейн, площадь 126 кв.м, часы работы: 08:00-18:00.")
                .setDi("12 км от г. Алания. 110 км от аэропорта Анталии.")
                .setDc("Отель расположен рядом с посёлком Конаклы, через дорогу от пляжа. Построен в 1996 году, последняя реновация проведена в 2017 году. Отель состоит из двух пятиэтажных корпусов. Подойдёт для экономичного семейного и молодёжного отдыха.");

        List<String> f = new ArrayList<>();
        f.add("00/02/92/98/2929881.jpg");
        f.add("00/02/92/99/2929901.jpg");
        f.add("00/02/92/99/2929906.jpg");
        f.add("00/02/92/99/2929976.jpg");
        f.add("00/02/92/98/2929891.jpg");
        f.add("00/02/92/98/2929896.jpg");
        f.add("00/02/92/99/2929916.jpg");
        f.add("00/02/92/99/2929921.jpg");
        f.add("00/02/92/98/2929886.jpg");
        f.add("00/02/92/99/2929911.jpg");
        f.add("00/02/92/99/2929971.jpg");
        f.add("00/02/92/99/2929981.jpg");
        f.add("00/02/92/99/2929926.jpg");
        f.add("00/02/92/99/2929966.jpg");

        Map<String, Hotel.HotelBean.VsOptionBean> stringVsOptionBeanMap = new HashMap<>();
        stringVsOptionBeanMap.put("1", new Hotel.HotelBean.VsOptionBean("номера", 2.9, 52));
        stringVsOptionBeanMap.put("2", new Hotel.HotelBean.VsOptionBean("сервис", 2.6, 51));
        stringVsOptionBeanMap.put("3", new Hotel.HotelBean.VsOptionBean("чистота", 2.7, 52));
        stringVsOptionBeanMap.put("4", new Hotel.HotelBean.VsOptionBean("питание", 2.8, 52));
        stringVsOptionBeanMap.put("5", new Hotel.HotelBean.VsOptionBean("инфраструктура", 3.1, 52));

        List<Hotel.HotelBean.AgBean.OBeanX> oBeanXList = new ArrayList<>();
        oBeanXList.add(new Hotel.HotelBean.AgBean.OBeanX(8806, "Кривой Рог", "Ивана Авраменка, 3"));

        Hotel.HotelBean.AgBean agBean = new Hotel.HotelBean.AgBean();
        agBean.setN("Море Туров Кривой Рог на Вечернем")
                .setA("")
                .setO(oBeanXList);

        hotelBean.setArea("9000")
                .setPriceOperatorId("3331")
                .setKey("a74bea0e139e68c06de07834385080e5")
                .setI("20178")
                .setN("Sunside Beach Hotel 4*")
                .setNm("Sunside Beach Hotel")
                .setH("Sunside_Beach_Hotel")
                .setHru("Сансайд Бич Хотел,бывш. Blue Moon Beach")
                .setS(s)
                .setAd(ad)
                .setP(p)
                .setFm(fm)
                .setTp(tp)
                .setE(eBean)
                .setO(oBean)
                .setC(new Hotel.HotelBean.CBeanX("953", "alanja", "Алания", "Алании", "Аланию"))
                .setT(new Hotel.HotelBean.TBean("115", "turkey", "tr", "Турция", "Турции", "Турцию"))
                .setF(f)
                .setFc(14)
                .setR(2.7)
                .setRi(new Hotel.HotelBean.RiBean(17, 17, 16, 1, 8))
                .setTr("2.6755")
                .setVi("a74bea0e139e68c06de07834385080e5")
                .setV("84")
                .setVs(stringVsOptionBeanMap)
                .setWatermark("")
                .setAg(agBean);
    }

    @Test
    public void test() throws JsonProcessingException {
        JsonNode node = JsonUtils.getJsonFromResources("json/otpusk_hotel.json");
        Hotel test = objectMapper.treeToValue(node, Hotel.class);
        Assert.assertEquals(test.getHotel().getS(), hotel.getHotel().getS());
        Assert.assertEquals(test.getHotel().getAd(), hotel.getHotel().getAd());
        Assert.assertEquals(test.getHotel().getP(), hotel.getHotel().getP());
        Assert.assertEquals(test.getHotel().getFm(), hotel.getHotel().getFm());
        Assert.assertEquals(test.getHotel().getTp(), hotel.getHotel().getTp());
        Assert.assertEquals(test.getHotel().getE().getR(), hotel.getHotel().getE().getR());
        Assert.assertEquals(test.getHotel().getE().getH(), hotel.getHotel().getE().getH());
        Assert.assertEquals(test.getHotel().getE().getC(), hotel.getHotel().getE().getC());
        Assert.assertEquals(test.getHotel().getE().getS(), hotel.getHotel().getE().getS());
        Assert.assertEquals(test.getHotel().getE().getB(), hotel.getHotel().getE().getB());
        Assert.assertEquals(test.getHotel().getO().getR().get(0), hotel.getHotel().getO().getR().get(0));
        Assert.assertEquals(test.getHotel().getO().getR().get(1), hotel.getHotel().getO().getR().get(1));
        Assert.assertEquals(test.getHotel().getO().getR().get(2).getServices(), hotel.getHotel().getO().getR().get(2).getServices());
        Assert.assertEquals(test.getHotel().getO().getR().get(2).getImages(), hotel.getHotel().getO().getR().get(2).getImages());
        Assert.assertEquals(test.getHotel().getO().getR(), hotel.getHotel().getO().getR());
        Assert.assertEquals(test.getHotel().getO().getBs(), hotel.getHotel().getO().getBs());
        Assert.assertEquals(test.getHotel().getO().getSs(), hotel.getHotel().getO().getSs());
        Assert.assertEquals(test.getHotel().getO().getHs(), hotel.getHotel().getO().getHs());
        Assert.assertEquals(test.getHotel().getO().getCs(), hotel.getHotel().getO().getCs());
        Assert.assertEquals(test.getHotel().getO(), hotel.getHotel().getO());
        Assert.assertEquals(test.getHotel().getC(), hotel.getHotel().getC());
        Assert.assertEquals(test.getHotel().getT(), hotel.getHotel().getT());
        Assert.assertEquals(test.getHotel().getF(), hotel.getHotel().getF());
        Assert.assertEquals(test.getHotel().getRi(), hotel.getHotel().getRi());
        Assert.assertEquals(test.getHotel().getVs(), hotel.getHotel().getVs());
        Assert.assertEquals(test.getHotel().getAg(), hotel.getHotel().getAg());
        Assert.assertEquals(test.getHotel(), hotel.getHotel());
        Assert.assertEquals(test, hotel);
    }
}
