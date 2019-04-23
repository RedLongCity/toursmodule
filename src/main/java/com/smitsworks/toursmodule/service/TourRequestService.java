package com.smitsworks.toursmodule.service;

import com.smitsworks.toursmodule.model.TourRequest;
import com.smitsworks.toursmodule.repository.TourRequestRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TourRequestService {

    private static final Logger log = LogManager.getLogger();

    @Autowired
    private TourRequestRepository tourRequestRepository;

    public List<TourRequest> findByMainFields(
            Integer country,
            Integer city,
            String hotelRating,
            Integer adultAmount,
            Integer nightFrom,
            Integer nightTill,
            LocalDate dateFrom,
            LocalDate dateTill) {
        return tourRequestRepository.findAllByCountryAndCityAndHotelRatingAndAdultAmountAndNightFromAndNightTillAndDateFromAndDateTill(
                country,
                city,
                hotelRating,
                adultAmount,
                nightFrom,
                nightTill,
                dateFrom,
                dateTill);
    }

}
