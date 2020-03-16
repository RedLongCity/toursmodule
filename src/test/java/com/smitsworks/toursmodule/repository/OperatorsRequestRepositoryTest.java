package com.smitsworks.toursmodule.repository;

import com.smitsworks.toursmodule.model.otpusk.request.OperatorsRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class OperatorsRequestRepositoryTest {

    @Autowired
    private OperatorsRequestRepository repository;

    @Test
    public void findTest() {
        OperatorsRequest request = OperatorsRequest.builder()
                .expired(LocalDateTime.now())
                .countryId(1)
                .regionId(2)
                .build();

        Integer id = request.hashCode();
        request.setId(id);
        assertNotNull(repository.save(request));
        assertTrue(repository.findById(id).isPresent());

        request.setCountryId(2);
        id = request.hashCode();
        assertFalse(repository.findById(id).isPresent());
    }

}