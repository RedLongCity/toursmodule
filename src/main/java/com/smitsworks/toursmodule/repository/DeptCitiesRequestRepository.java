package com.smitsworks.toursmodule.repository;

import com.smitsworks.toursmodule.model.otpusk.request.DeptCitiesRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DeptCitiesRequestRepository extends MongoRepository<DeptCitiesRequest, Integer> {
}
