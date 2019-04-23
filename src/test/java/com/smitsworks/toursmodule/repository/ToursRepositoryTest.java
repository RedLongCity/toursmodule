package com.smitsworks.toursmodule.repository;

import com.smitsworks.toursmodule.model.Tour;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ToursRepositoryTest {

    @Autowired
    private TourRepository tourRepository;

    @Test
    public void saveTest() {
        String testId = "test_key";
        Tour tour = new Tour();
        tour.setKey(testId);
        tourRepository.save(tour);
        Assert.assertTrue(tourRepository.findById(testId) != null);
        tourRepository.delete(tour);
        Assert.assertFalse(tourRepository.findById(testId).isPresent());
    }
}
