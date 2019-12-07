package com.smitsworks.toursmodule.repository;

import com.smitsworks.toursmodule.model.otpusk.Hotel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HotelRepository extends MongoRepository<Hotel, Integer> {
}
