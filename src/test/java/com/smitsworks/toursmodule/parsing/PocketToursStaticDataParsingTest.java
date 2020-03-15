package com.smitsworks.toursmodule.parsing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.smitsworks.toursmodule.model.otpusk.response.PocketToursStaticData;
import com.smitsworks.toursmodule.utils.JsonUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class PocketToursStaticDataParsingTest {

    @Autowired
    @Qualifier("simple")
    private ObjectMapper objectMapper;

    private PocketToursStaticData data;

    /**
     * {
     * "imageHost": "http:newimg.otpusk.com",
     * "transport": {
     * "air": "авіа",
     * "bus": "автобус",
     * "train": "поїзд",
     * "ship": "морський",
     * "trainbus": "залізнично-автобусний тур",
     * "no": "без транспорту"
     * },
     * "stars": {
     * "one": "1*",
     * "two": "2*",
     * "three": "3*",
     * "four": "4*",
     * "five": "5*"
     * },
     * "food": {
     * "ob": "без харчування",
     * "bb": "сніданки",
     * "hb": "сніданок і вечеря",
     * "fb": "повний пансіон",
     * "al": "все включено",
     * "ai": "все включено",
     * "uai": "ультра все включено"
     * },
     * "cat": {
     * "beach": "пляжний",
     * "ski": "гірськолижний",
     * "city": "екскурсійний",
     * "treat": "лікувальний",
     * "eco": "екологічний"
     * },
     * "form": {
     * "hotel": "готель",
     * "inn": "гостиница",
     * "hostel": "хостел",
     * "pension": "пансіонат",
     * "sanatorium": "санаторій",
     * "recreation": "базавідпочинку",
     * "apartment": "апартаменти",
     * "cottage": "котедж",
     * "camp": "дитячийтабір"
     * },
     * "rates": {
     * "eur": "29.43",
     * "rub": "0.416",
     * "usd": "26.8"
     * }
     * }
     */
    @Before
    public void populate() {
        data = new PocketToursStaticData();
        data.setImageHost("http:newimg.otpusk.com");

        Map<String, String> transport = new HashMap<>();
        data.setTransport(transport);
        transport.put("air", "авіа");
        transport.put("bus", "автобус");
        transport.put("train", "поїзд");
        transport.put("ship", "морський");
        transport.put("trainbus", "залізнично-автобусний тур");
        transport.put("no", "без транспорту");

        Map<String, String> stars = new HashMap<>();
        data.setStars(stars);
        stars.put("one", "1*");
        stars.put("two", "2*");
        stars.put("three", "3*");
        stars.put("four", "4*");
        stars.put("five", "5*");

        Map<String, String> food = new HashMap<>();
        data.setFood(food);
        food.put("ob", "без харчування");
        food.put("bb", "сніданки");
        food.put("hb", "сніданок і вечеря");
        food.put("fb", "повний пансіон");
        food.put("al", "все включено");
        food.put("ai", "все включено");
        food.put("uai", "ультра все включено");

        Map<String, String> cat = new HashMap<>();
        data.setCat(cat);
        cat.put("beach", "пляжний");
        cat.put("ski", "гірськолижний");
        cat.put("city", "екскурсійний");
        cat.put("treat", "лікувальний");
        cat.put("eco", "екологічний");

        Map<String, String> form = new HashMap<>();
        data.setForm(form);
        form.put("hotel", "готель");
        form.put("inn", "гостиница");
        form.put("hostel", "хостел");
        form.put("pension", "пансіонат");
        form.put("sanatorium", "санаторій");
        form.put("recreation", "базавідпочинку");
        form.put("apartment", "апартаменти");
        form.put("cottage", "котедж");
        form.put("camp", "дитячийтабір");

        Map<String, String> rates = new HashMap<>();
        data.setRates(rates);
        rates.put("eur", "29.43");
        rates.put("rub", "0.416");
        rates.put("usd", "26.8");
    }

    @Test
    public void test() throws JsonProcessingException {
        JsonNode extracted = JsonUtils.getJsonFromResources("json/otpusk_pocket_tours_static_data.json");
        PocketToursStaticData test = objectMapper.treeToValue(extracted, PocketToursStaticData.class);
        Assert.assertEquals(test.getTransport(), data.getTransport());
        Assert.assertEquals(test.getStars(), data.getStars());
        Assert.assertEquals(test.getFood(), data.getFood());
        Assert.assertEquals(test.getCat(), data.getCat());
        Assert.assertEquals(test.getForm(), data.getForm());
        Assert.assertEquals(test.getRates(), data.getRates());
        Assert.assertEquals(test, data);
    }

}
