package com.smitsworks.toursmodule.repository;

import com.smitsworks.toursmodule.model.otpusk.request.SearchRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SearchRequestRepositoryTest {

    @Autowired
    private SearchRequestRepository repository;

    @Test
    public void findTest() {
        SearchRequest request = SearchRequest.builder()
                .expired(LocalDateTime.now())
                .availableFlight("true")
                .checkIn(LocalDate.now())
                .checkTo(LocalDate.now())
                .currency("UAH")
                .build();

        Integer id = request.hashCode();
        request.setId(request.hashCode());
        assertNotNull(repository.save(request));
        assertTrue(repository.findById(id).isPresent());

        request.setAvailableFlight("false");
        id = request.hashCode();
        assertFalse(repository.findById(id).isPresent());

    }

}