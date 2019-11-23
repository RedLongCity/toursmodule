package com.smitsworks.toursmodule.repository;

import com.smitsworks.toursmodule.model.otpusk.DeptCities;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DeptCitiesRepository extends MongoRepository<DeptCities, Integer> {
}
