package com.smitsworks.toursmodule.convertor.tourlistrequest;

import com.smitsworks.toursmodule.model.TourRequest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class TourListRequestConvertorTest {

    private TourRequest testTourRequest;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yy");

    @Before
    public void setUp() throws Exception {
        testTourRequest = new TourRequest()
                .setType(1)
                .setCountry(338)
                .setAdultAmount(2)
                .setChildAmount(0)
                .setHotelRating("4:78")
                .setNightFrom(6)
                .setNightTill(8)
                .setDateFrom(LocalDate.parse("26.01.16", formatter))
                .setDateTill(LocalDate.parse("03.02.16", formatter))
                .setPage(1)
                .setHotelInfo(1);

    }

    @Test
    public void getRequestConvertedToPath() throws MalformedURLException {
        String testData = "type=1" +
                "&country=338" +
                "&adult_amount=2" +
                "&child_amount=0" +
                "&hotel_rating=4:78" +
                "&night_from=6" +
                "&night_till=8" +
                "&date_from=26.01.16" +
                "&date_till=03.02.17" +
                "&page=1" +
                "&hotel_info=1";
        Optional<URI> optional = new TourListRequestConvertor().getRequestConvertedToPath(testTourRequest);
        Assert.assertTrue(optional.isPresent());
        Assert.assertEquals(optional.get().toURL().toString(), testData);
    }
}