package com.smitsworks.toursmodule.repository;

import com.smitsworks.toursmodule.model.otpusk.request.CitiesRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CitiesRequestRepositoryTest {

    @Autowired
    private CitiesRequestRepository repository;

    @Test
    public void findTest() {
        CitiesRequest request = CitiesRequest.builder()
                .expired(LocalDateTime.now())
                .countryId(1)
                .withPrice(true)
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