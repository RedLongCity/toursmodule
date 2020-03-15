package com.smitsworks.toursmodule.parsing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.smitsworks.toursmodule.model.otpusk.response.Operators;
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
public class OperatorsParsingTest {

    @Autowired
    @Qualifier("simple")
    private ObjectMapper objectMapper;

    private Operators.OperatorBean operatorBean;

    @Before
    public void populate() {
        operatorBean = new Operators.OperatorBean();
        operatorBean.setId("3019");
        operatorBean.setName("AdriaHit");
        operatorBean.setUrl("http://www.adriahit.com");

        Map<String, String> countries = new HashMap<>();
        operatorBean.setCountries(countries);

        countries.put("109", "Словения");
        countries.put("134", "Хорватия");
        countries.put("135", "Черногория");

        Map<String, String> currencies = new HashMap<>();
        operatorBean.setCurrencies(currencies);

        currencies.put("EUR", "27.86");
        currencies.put("USD", "25.44");
    }

    @Test
    public void test() throws JsonProcessingException {
        JsonNode node = JsonUtils.getJsonFromResources("json/otpusk_operators.json");
        Operators test = objectMapper.treeToValue(node, Operators.class);
        Assert.assertEquals(test.getOperators().get("3019"), operatorBean);
    }
}
