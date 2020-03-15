package com.smitsworks.toursmodule.repository;

import com.smitsworks.toursmodule.model.otpusk.response.Hotel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HotelRepository extends MongoRepository<Hotel, Integer> {
}
