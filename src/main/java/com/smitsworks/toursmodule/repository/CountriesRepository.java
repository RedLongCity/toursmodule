package com.smitsworks.toursmodule.repository;

import com.smitsworks.toursmodule.model.otpusk.Countries;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CountriesRepository extends MongoRepository<Countries, String> {
}
