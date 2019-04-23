package com.smitsworks.toursmodule.repository;

import com.smitsworks.toursmodule.model.TourRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDate;
import java.util.List;

public interface TourRequestRepository extends MongoRepository<TourRequest, String> {

    List<TourRequest> findAllByCountryAndCityAndHotelRatingAndAdultAmountAndNightFromAndNightTillAndDateFromAndDateTill(
            Integer country,
            Integer city,
            String hotelRating,
            Integer adultAmount,
            Integer nightFrom,
            Integer nightTill,
            LocalDate dateFrom,
            LocalDate dateTill);
}
