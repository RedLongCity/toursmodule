package com.smitsworks.toursmodule.repository;

import com.smitsworks.toursmodule.model.otpusk.response.Regions;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RegionsRepository extends MongoRepository<Regions, String> {
}
