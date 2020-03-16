package com.smitsworks.toursmodule.repository;

import com.smitsworks.toursmodule.model.otpusk.request.RegionsRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RegionsRequestRepository extends MongoRepository<RegionsRequest, Integer> {
}
