package com.smitsworks.toursmodule.parsing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.smitsworks.toursmodule.model.otpusk.Hotels;
import com.smitsworks.toursmodule.utils.JsonUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class HotelsParsingTest {

    @Autowired
    @Qualifier("simple")
    private ObjectMapper objectMapper;

    private Hotels.HotelsBean hotelsBean;

    @Before
    public void populate() {
        hotelsBean = new Hotels.HotelsBean();
        hotelsBean.setId(39631);
        hotelsBean.setName("Cleopatra Luxury Resort Makadi Bay");
        hotelsBean.setCode("Cleopatra_Luxury_Resort_Makadi_Bay");
        hotelsBean.setStars("5");
        hotelsBean.setCityId(1262);
        hotelsBean.setCountryId(43);
        hotelsBean.setLastUpdate("2019-10-16 12:09:18");
        hotelsBean.setMinPrice("1177.00");
        hotelsBean.setCurrency("usd");
        hotelsBean.setRating(0);
        hotelsBean.setServices("lage_area");
    }

    @Test
    public void test() throws JsonProcessingException {
        JsonNode node = JsonUtils.getJsonFromResources("json/otpusk_hotels.json");
        Hotels test = objectMapper.treeToValue(node, Hotels.class);
        Assert.assertEquals(test.getHotels().get(0), hotelsBean);
    }
}
