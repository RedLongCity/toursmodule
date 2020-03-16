package com.smitsworks.toursmodule.repository;

import com.smitsworks.toursmodule.model.otpusk.request.CountriesRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CountriesRequestRepositoryTest {

    @Autowired
    private CountriesRequestRepository repository;

    @Test
    public void findTest() {
        CountriesRequest request = CountriesRequest.builder()
                .expired(LocalDateTime.now())
                .withPrice(false)
                .build();
        Integer id = request.hashCode();
        request.setId(id);
        assertNotNull(repository.save(request));
        assertTrue(repository.findById(id).isPresent());

        request.setWithPrice(true);
        id = request.hashCode();
        assertFalse(repository.findById(id).isPresent());
    }
}