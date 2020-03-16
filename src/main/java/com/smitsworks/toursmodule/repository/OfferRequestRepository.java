package com.smitsworks.toursmodule.repository;

import com.smitsworks.toursmodule.model.otpusk.request.OfferRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OfferRequestRepository extends MongoRepository<OfferRequest, Integer> {
}
