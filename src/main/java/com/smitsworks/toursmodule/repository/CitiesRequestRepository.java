package com.smitsworks.toursmodule.repository;

import com.smitsworks.toursmodule.model.otpusk.request.CitiesRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CitiesRequestRepository extends MongoRepository<CitiesRequest, Integer> {
}
