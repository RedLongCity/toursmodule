package com.smitsworks.toursmodule.convertor.tourlistrequest;

import com.smitsworks.toursmodule.convertor.RequestConvertor;
import com.smitsworks.toursmodule.convertor.RequestPathBuilder;
import com.smitsworks.toursmodule.model.TourRequest;
import com.smitsworks.toursmodule.utils.ControllerUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.URI;
import java.util.Optional;

public class TourListRequestConverter extends RequestPathBuilder implements RequestConvertor<TourRequest> {

    private static final Logger logger = LogManager.getLogger(ControllerUtils.class);

    @Override
    public Optional<URI> getRequestConvertedToPath(TourRequest tourRequest) {
        this.addParam("type", tourRequest.getType())
                .addParam("kind", tourRequest.getKind())
                .addParam("country", tourRequest.getCountry())
                .addParam("from_city", tourRequest.getCity())
                .addParam("region", tourRequest.getRegion())
                .addParam("hotel", tourRequest.getHotel())
                .addParam("hotel_rating", tourRequest.getHotelRating())
                .addParam("adult_amount", tourRequest.getAdultAmount())
                .addParam("child_amount", tourRequest.getChildAmount())
                .addParam("child_age", tourRequest.getChildAge())
                .addParam("night_from", tourRequest.getNightFrom())
                .addParam("night_till", tourRequest.getNightTill())
                .addParam("date_from", tourRequest.getDateFrom())
                .addParam("date_till", tourRequest.getDateTill())
                .addParam("meal_type", tourRequest.getMealType())
                .addParam("price_from", tourRequest.getPriceFrom())
                .addParam("price_till", tourRequest.getPriceTill())
                .addParam("currency", tourRequest.getCurrency())
                .addParam("only_standard_price", tourRequest.getOnlyStandartPrice())
                .addParam("page", tourRequest.getPage())
                .addParam("items_per_page", tourRequest.getItemsPerPage())
                .addParam("hotel_info", tourRequest.getHotelInfo());
        try {
            return Optional.of(this.build());
        } catch (Exception ex) {
            logger.error("TourListRequestConvertor.getRequestConvertedToPath", ex);
        }
        return Optional.empty();
    }
}
