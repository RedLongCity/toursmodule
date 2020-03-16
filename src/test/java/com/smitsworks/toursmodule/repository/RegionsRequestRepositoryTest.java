package com.smitsworks.toursmodule.repository;

import com.smitsworks.toursmodule.model.otpusk.request.RegionsRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDateTime;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class RegionsRequestRepositoryTest {

    @Autowired
    private RegionsRequestRepository repository;

    @Test
    public void findTest() {
        RegionsRequest request = RegionsRequest.builder()
                .expired(LocalDateTime.now())
                .build();

        Integer id = request.hashCode();
        request.setId(id);

        assertNotNull(repository.save(request));
        assertTrue(repository.findById(id).isPresent());
    }

}