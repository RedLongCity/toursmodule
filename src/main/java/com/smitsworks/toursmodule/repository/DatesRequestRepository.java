package com.smitsworks.toursmodule.repository;

import com.smitsworks.toursmodule.model.otpusk.request.DatesRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DatesRequestRepository extends MongoRepository<DatesRequest, Integer> {
}
