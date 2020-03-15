package com.smitsworks.toursmodule.repository;

import com.smitsworks.toursmodule.model.otpusk.response.Dates;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DatesRepository extends MongoRepository<Dates, Integer> {
}
