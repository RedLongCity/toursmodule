package com.smitsworks.toursmodule.repository;

import com.smitsworks.toursmodule.model.otpusk.response.ServicesDescriptions;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ServicesDescriptionRepository extends MongoRepository<ServicesDescriptions, String> {
}
