package com.smitsworks.toursmodule.parsing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.smitsworks.toursmodule.model.otpusk.Cities;
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
public class CitiesParsingTest {

    @Autowired
    @Qualifier("simple")
    private ObjectMapper objectMapper;

    private Cities.CitiesBean citiesBean;

    @Before
    public void populate() {
        citiesBean = new Cities.CitiesBean();
        citiesBean.setId(1038);
        citiesBean.setName("Дахаб");
        citiesBean.setNameVn("Дахаб");
        citiesBean.setCode("dahab");
        citiesBean.setLat(28.4989);
        citiesBean.setLng(34.5083);
        citiesBean.setZoom(14);
        citiesBean.setBold(false);
        citiesBean.setUah(19139);
        citiesBean.setPrice(753.52);
        citiesBean.setCurrency("usd");
        citiesBean.setTransport("air");
    }

    @Test
    public void test() throws JsonProcessingException {
        JsonNode node = JsonUtils.getJsonFromResources("json/opusk_cities.json");
        Cities test = objectMapper.treeToValue(node, Cities.class);
        Assert.assertEquals(test.getCities().get(0), citiesBean);
    }
}
