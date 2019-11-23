package com.smitsworks.toursmodule.repository;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.smitsworks.toursmodule.model.otpusk.DeptCities;
import com.smitsworks.toursmodule.utils.JsonUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class DeptCitiesRepositoryTest {

    @Autowired
    @Qualifier("simple")
    private ObjectMapper objectMapper;

    @Autowired
    private DeptCitiesRepository repository;

    @Test
    public void test() throws JsonProcessingException {
        JsonNode node = JsonUtils.getJsonFromResources("json/otpusk_dept_cities.json");
        DeptCities test = objectMapper.treeToValue(node, DeptCities.class);
        Assert.assertNotNull(repository.save(test));
        Assert.assertTrue(repository.findAll().contains(test));
    }
}
