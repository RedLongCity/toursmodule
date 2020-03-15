package com.smitsworks.toursmodule.repository;

import com.smitsworks.toursmodule.model.otpusk.response.PocketToursStaticData;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PocketToursStaticDataRepository extends MongoRepository<PocketToursStaticData, String> {
}
