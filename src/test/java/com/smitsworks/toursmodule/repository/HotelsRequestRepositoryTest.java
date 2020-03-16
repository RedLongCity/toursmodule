package com.smitsworks.toursmodule.repository;

import com.google.common.collect.Lists;
import com.smitsworks.toursmodule.model.otpusk.request.HotelsRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDateTime;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class HotelsRequestRepositoryTest {

    @Autowired
    private HotelsRequestRepository repository;

    @Test
    public void findTest() {
        HotelsRequest request = HotelsRequest.builder()
                .expired(LocalDateTime.now())
                .cityIds(Lists.newArrayList(1, 2, 3))
                .withPrice(true)
                .countryId(1)
                .build();

        Integer id = request.hashCode();
        request.setId(id);
        assertNotNull(repository.save(request));
        assertTrue(repository.findById(id).isPresent());

        request.setWithPrice(false);
        id = request.hashCode();
        assertFalse(repository.findById(id).isPresent());
    }

}