package com.smitsworks.toursmodule.repository;

import com.smitsworks.toursmodule.model.otpusk.request.HotelRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HotelRequestRepository extends MongoRepository<HotelRequest, Integer> {
}
