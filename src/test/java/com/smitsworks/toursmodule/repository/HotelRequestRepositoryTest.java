package com.smitsworks.toursmodule.repository;

import com.smitsworks.toursmodule.model.otpusk.request.HotelRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class HotelRequestRepositoryTest {

    @Autowired
    private HotelRequestRepository repository;

    @Test
    public void findTest() {
        HotelRequest request = HotelRequest.builder()
                .expired(LocalDateTime.now())
                .hotelId(1)
                .build();

        Integer id = request.hashCode();
        request.setId(id);
        assertNotNull(repository.save(request));
        assertTrue(repository.findById(id).isPresent());

        request.setHotelId(2);
        id = request.hashCode();
        assertFalse(repository.findById(id).isPresent());
    }

}