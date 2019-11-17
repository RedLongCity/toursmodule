package com.smitsworks.toursmodule.repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.smitsworks.toursmodule.model.otpusk.PocketToursResponse;
import com.smitsworks.toursmodule.utils.JsonUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class PocketToursResponseRepositoryTest {

    @Autowired
    private PocketToursResponseRepository repository;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void test() throws JsonProcessingException {
        JsonNode node = JsonUtils.getJsonFromResources("json/otpusk_pocket_tours_response.json");
        PocketToursResponse response = objectMapper.treeToValue(node, PocketToursResponse.class);
        Assert.assertNotNull(repository.save(response));
        Assert.assertNotNull(repository.findAll());
    }
}
