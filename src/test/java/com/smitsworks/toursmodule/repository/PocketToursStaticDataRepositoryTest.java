package com.smitsworks.toursmodule.repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.smitsworks.toursmodule.model.otpusk.response.PocketToursStaticData;
import com.smitsworks.toursmodule.utils.JsonUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class PocketToursStaticDataRepositoryTest {

    @Autowired
    private PocketToursStaticDataRepository repository;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
//    @Ignore
    public void test() throws JsonProcessingException {
        JsonNode node = JsonUtils.getJsonFromResources("json/otpusk_pocket_tours_static_data.json");
        PocketToursStaticData data = objectMapper.treeToValue(node, PocketToursStaticData.class);
        Assert.assertNotNull(repository.save(data));
        Assert.assertNotNull(repository.findById("_id"));
    }
}
