package com.smitsworks.toursmodule.repository;

import com.smitsworks.toursmodule.model.otpusk.response.PocketToursResponse;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PocketToursResponseRepository extends MongoRepository<PocketToursResponse, Integer> {
}
