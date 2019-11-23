package com.smitsworks.toursmodule.parsing;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.smitsworks.toursmodule.model.otpusk.DeptCities;
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
public class DeptCitiesParsingTest {

    @Autowired
    @Qualifier("simple")
    private ObjectMapper objectMapper;

    private DeptCities.DeptCitiesBean deptCitiesBean;

    @Before
    public void populate() {
        deptCitiesBean = new DeptCities.DeptCitiesBean();
        deptCitiesBean.setId("1925");
        deptCitiesBean.setName("Белая Церковь");
        deptCitiesBean.setRel("Белой Церкви");
    }

    @Test
    public void test() throws JsonProcessingException {
        JsonNode node = JsonUtils.getJsonFromResources("json/otpusk_dept_cities.json");
        DeptCities test = objectMapper.treeToValue(node, DeptCities.class);
        Assert.assertEquals(test.getDeptCities().get(0), deptCitiesBean);
    }
}
