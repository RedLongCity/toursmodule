package com.smitsworks.toursmodule.repository;

import com.smitsworks.toursmodule.model.otpusk.request.SearchRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SearchRequestRepository extends MongoRepository<SearchRequest, Integer> {
}
