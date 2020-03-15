package com.smitsworks.toursmodule.parsing;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import com.smitsworks.toursmodule.model.otpusk.response.Countries;
import com.smitsworks.toursmodule.utils.JsonUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CountriesParsingTest {

    @Autowired
    @Qualifier("simple")
    private ObjectMapper objectMapper;

    private Countries countries;

    @Before
    public void populate() {
        countries = Countries.builder()
                .id("_id")
                .countries(Lists.newArrayList(
                        Countries.CountriesBean.builder()
                                .id(8)
                                .name("Австрия")
                                .nameVn("Австрию")
                                .namePr("Австрии")
                                .iso("at")
                                .iata("AUS")
                                .code("austria")
                                .visa("")
                                .transport("air")
                                .defaultX("eur")
                                .lat(47.7984)
                                .lng(13.3594)
                                .zoom(6)
                                .bold(true)
                                .uah(22492)
                                .price(745)
                                .currency("eur")
                                .build()
                ))
                .build();
    }

    @Test
    public void test() throws JsonProcessingException {
        JsonNode node = JsonUtils.getJsonFromResources("json/otpusk_countries.json");
        Countries test = objectMapper.treeToValue(node, Countries.class);
        assertEquals(test, countries);
    }

}