package com.smitsworks.toursmodule.repository;

import com.smitsworks.toursmodule.model.otpusk.response.Cities;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CitiesRepository extends MongoRepository<Cities, String> {
}
