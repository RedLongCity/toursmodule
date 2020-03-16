package com.smitsworks.toursmodule.repository;

import com.smitsworks.toursmodule.model.otpusk.request.OperatorsRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OperatorsRequestRepository extends MongoRepository<OperatorsRequest, Integer> {
}
