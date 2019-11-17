package com.smitsworks.toursmodule.parsing;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.smitsworks.toursmodule.model.otpusk.Countries;
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
public class CountriesParsingTest {

    @Autowired
    @Qualifier("simple")
    private ObjectMapper objectMapper;

    private Countries.CountriesBean countriesBean;

    @Before
    public void populate() {
        countriesBean = new Countries.CountriesBean();
        countriesBean.setId(7);
        countriesBean.setName("Австралия");
        countriesBean.setNameVn("Австралию");
        countriesBean.setNamePr("Австралии");
        countriesBean.setIso("au");
        countriesBean.setIata("AUL");
        countriesBean.setCode("Australia");
        countriesBean.setVisa("");
        countriesBean.setTransport("air");
        countriesBean.setDefaultX("usd");
        countriesBean.setLat(-28.8447);
        countriesBean.setLng(135.08791);
        countriesBean.setZoom(4);
        countriesBean.setBold(false);
    }

    @Test
    public void test() throws JsonProcessingException {
        JsonNode node = JsonUtils.getJsonFromResources("json/otpusk_countries.json");
        Countries test = objectMapper.treeToValue(node, Countries.class);
        Assert.assertEquals(test.getCountries().get(0), countriesBean);
    }

}