package com.smitsworks.toursmodule.repository;

import com.smitsworks.toursmodule.model.otpusk.Operators;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OperatorsRepository extends MongoRepository<Operators, Integer> {
}
