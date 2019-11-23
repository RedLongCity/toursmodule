package com.smitsworks.toursmodule.repository;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.smitsworks.toursmodule.model.otpusk.Cities;
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
public class CitiesRepositoryTest {

    @Autowired
    @Qualifier("simple")
    private ObjectMapper objectMapper;

    @Autowired
    private CitiesRepository repository;

    @Test
    public void test() throws JsonProcessingException {
        JsonNode node = JsonUtils.getJsonFromResources("json/opusk_cities.json");
        Cities test = objectMapper.treeToValue(node, Cities.class);
        Assert.assertNotNull(repository.save(test));
        Assert.assertNotNull(repository.findById("_id"));
    }
}
