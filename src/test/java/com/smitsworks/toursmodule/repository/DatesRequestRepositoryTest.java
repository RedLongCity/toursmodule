package com.smitsworks.toursmodule.repository;

import com.smitsworks.toursmodule.model.otpusk.request.DatesRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class DatesRequestRepositoryTest {

    @Autowired
    private DatesRequestRepository repository;

    @Test
    public void findTest() {
        DatesRequest request = DatesRequest.builder()
                .regionId(1)
                .expired(LocalDateTime.now())
                .to(2)
                .build();

        Integer id = request.hashCode();
        request.setId(id);
        assertNotNull(repository.save(request));
        assertTrue(repository.findById(id).isPresent());

        request.setRegionId(10);
        id = request.hashCode();
        assertFalse(repository.findById(id).isPresent());
    }

}