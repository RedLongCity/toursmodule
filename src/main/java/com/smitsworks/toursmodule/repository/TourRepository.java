package com.smitsworks.toursmodule.repository;

import com.smitsworks.toursmodule.model.Tour;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TourRepository extends MongoRepository<Tour, String> {
}
