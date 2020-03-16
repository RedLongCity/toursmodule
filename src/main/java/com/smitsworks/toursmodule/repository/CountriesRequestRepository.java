package com.smitsworks.toursmodule.repository;

import com.smitsworks.toursmodule.model.otpusk.request.CountriesRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CountriesRequestRepository extends MongoRepository<CountriesRequest, Integer> {
}
