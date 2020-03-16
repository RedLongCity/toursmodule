package com.smitsworks.toursmodule.repository;

import com.smitsworks.toursmodule.model.otpusk.request.HotelsRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HotelsRequestRepository extends MongoRepository<HotelsRequest, Integer> {
}
