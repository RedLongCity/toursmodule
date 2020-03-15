package com.smitsworks.toursmodule.parsing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.smitsworks.toursmodule.model.otpusk.response.Regions;
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
public class RegionsParsingTest {

    @Autowired
    @Qualifier("simple")
    private ObjectMapper objectMapper;

    private Regions.RegionsBean regionsBean;

    @Before
    public void populate() {
        regionsBean = new Regions.RegionsBean();
        regionsBean.setId("1922");
        regionsBean.setName("Александрия");
        regionsBean.setDeptCities("1874,1544,1875");
        regionsBean.setRel("Александрии");
        regionsBean.setIPselected(false);
    }

    @Test
    public void test() throws JsonProcessingException {
        JsonNode node = JsonUtils.getJsonFromResources("json/otpusk_regions.json");
        Regions regions = objectMapper.treeToValue(node, Regions.class);
        Assert.assertEquals(regions.getRegions().get(0), regionsBean);
    }
}
