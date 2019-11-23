package com.smitsworks.toursmodule.repository;

import com.smitsworks.toursmodule.model.otpusk.Hotels;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HotelsRepository extends MongoRepository<Hotels, Integer> {
}
