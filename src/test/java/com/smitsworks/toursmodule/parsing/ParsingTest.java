package com.smitsworks.toursmodule.parsing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.smitsworks.toursmodule.model.Filters;
import com.smitsworks.toursmodule.model.ToursListResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ParsingTest {

    private static final Logger log = LogManager.getLogger();

    private Filters testFilters;
    private ToursListResponse testToursListResponse;

    @Before
    public void populate() {
        testFilters = new Filters();

        Filters.TypesBean typesBean = new Filters.TypesBean();
        typesBean.setName("Проезд включен");
        typesBean.setId("1");

        Filters.CurrenciesBean currenciesBean = new Filters.CurrenciesBean();
        currenciesBean.setId("1");
        currenciesBean.setName("USD");

        Filters.CountriesBean countriesBean = new Filters.CountriesBean();
        countriesBean.setId("318");
        countriesBean.setName("Турция");
        countriesBean.setIso("tur");
        countriesBean.setType_id("1");
        countriesBean.setGroup_id("1");
        countriesBean.setTransport_type_id("1");

        Filters.CountryGroupsBean countryGroupsBean = new Filters.CountryGroupsBean();
        countryGroupsBean.setId("1");
        countryGroupsBean.setName("Самые популярные");

        Filters.RegionsBean regionsBean = new Filters.RegionsBean();
        regionsBean.setId("8688");
        regionsBean.setName("Абано Терме");
        regionsBean.setType_id("1,2");
        regionsBean.setCountry_id("76");
        regionsBean.setParent_id("0");

        Filters.HotelRatingsBean hotelRatingsBean = new Filters.HotelRatingsBean();
        hotelRatingsBean.setId("7");
        hotelRatingsBean.setName("2");

        Filters.TransportTypesBean transportTypesBean = new Filters.TransportTypesBean();
        transportTypesBean.setId("0");
        transportTypesBean.setName("Все виды");

        List<Filters.TypesBean> typesBeans = new ArrayList<>();
        typesBeans.add(typesBean);

        List<Filters.CurrenciesBean> currenciesBeans = new ArrayList<>();
        currenciesBeans.add(currenciesBean);

        List<Filters.CountriesBean> countriesBeans = new ArrayList<>();
        countriesBeans.add(countriesBean);

        List<Filters.CountryGroupsBean> countryGroupsBeans = new ArrayList<>();
        countryGroupsBeans.add(countryGroupsBean);

        List<Filters.RegionsBean> regionsBeans = new ArrayList<>();
        regionsBeans.add(regionsBean);

        List<Filters.HotelRatingsBean> hotelRatingsBeans = new ArrayList<>();
        hotelRatingsBeans.add(hotelRatingsBean);

        List<Filters.TransportTypesBean> transportTypesBeans = new ArrayList<>();
        transportTypesBeans.add(transportTypesBean);

        testFilters.setTypes(typesBeans);
        testFilters.setCurrencies(currenciesBeans);
        testFilters.setCountries(countriesBeans);
        testFilters.setCountry_groups(countryGroupsBeans);
        testFilters.setRegions(regionsBeans);
        testFilters.setHotel_ratings(hotelRatingsBeans);
        testFilters.setTransport_types(transportTypesBeans);

        testToursListResponse = new ToursListResponse();
        testToursListResponse.setPage(1);
        testToursListResponse.setItems_per_page(100);
        ToursListResponse.OffersBean offersBean = new ToursListResponse.OffersBean();
        offersBean.setKey("01-03-1e3fb3891a40c9025d145e58014b80d4");
        offersBean.setType(1);
        offersBean.setCountry("Египет");
        offersBean.setRegion_id(5996);
        offersBean.setRegion("Шарм Эль Шейх");
        offersBean.setHotel_id(68);
        offersBean.setHotel("Luna Sharm");
        offersBean.setHotel_rating("4");
        offersBean.setMeal_type("BB");
        offersBean.setMeal_type_full("Завтрак");
        offersBean.setAdult_amount(2);
        offersBean.setChild_amount(0);
        offersBean.setAccomodation("DBL");
        offersBean.setRoom_type("Standart");
        offersBean.setDuration(6);
        offersBean.setDate_from("2017-01-26");
        offersBean.setIs_combined(0);
        offersBean.setCurrency_id(1);

        ToursListResponse.OffersBean.PricesBean pricesBean = new ToursListResponse.OffersBean.PricesBean();
        pricesBean.setPriceUS(483);
        pricesBean.setPriceUA(12509);
        pricesBean.setPriceEU(434);

        offersBean.setPrices(pricesBean);
        offersBean.setFrom_city("Киев");
        offersBean.setTransport_type("flight");
        offersBean.setOperator_id(7);
        offersBean.setOperator("Tez Tour");

        ToursListResponse.OffersBean.HotelImagesBean hotelImagesBean = new ToursListResponse.OffersBean.HotelImagesBean();
        hotelImagesBean.setFull("http://ittour.com.ua/images/hotel_image/2/1/6/6/6/file_name/21666.jpg");
        hotelImagesBean.setThumb("http://ittour.com.ua/images/hotel_image_thumb/2/1/6/6/6/file_name/21666.jpg");
        hotelImagesBean.setIs_main(0);

        List<ToursListResponse.OffersBean.HotelImagesBean> hotelImagesBeanList = new ArrayList<>(1);
        hotelImagesBeanList.add(hotelImagesBean);
        offersBean.setHotel_images(hotelImagesBeanList);

        offersBean.setHotel_review_rate("2.3");
        offersBean.setHotel_review_count(12);

        ToursListResponse.OffersBean.HotelFacilitiesBean hotelFacilitiesBean = new ToursListResponse.OffersBean.HotelFacilitiesBean();
        hotelFacilitiesBean.setId("1");
        hotelFacilitiesBean.setName("Wi-fi");
        hotelFacilitiesBean.setCategory_id("1");
        hotelFacilitiesBean.setCategory("Интернет");
        hotelFacilitiesBean.setIs_main(0);
        hotelFacilitiesBean.setIs_paid(0);

        List<ToursListResponse.OffersBean.HotelFacilitiesBean> hotelFacilitiesBeans = new ArrayList<>(1);
        hotelFacilitiesBeans.add(hotelFacilitiesBean);
        offersBean.setHotel_facilities(hotelFacilitiesBeans);

        List<ToursListResponse.OffersBean> offersBeanList = new ArrayList<>(1);
        offersBeanList.add(offersBean);
        testToursListResponse.setOffers(offersBeanList);

        testToursListResponse.setHas_more_pages(true);
    }

    /**
     * {
     *   "types": [
     *     {
     *       "id": "1",
     *       "name": "\u041f\u0440\u043e\u0435\u0437\u0434 \u0432\u043a\u043b\u044e\u0447\u0435\u043d"
     *     }
     *   ],
     *   "currencies": [
     *     {
     *       "id": "1",
     *       "name": "USD"
     *     }
     *   ],
     *   "countries": [
     *     {
     *       "id": "318",
     *       "name": "Турция",
     *       "iso": "tur",
     *       "type_id": "1",
     *       "group_id": "1",
     *       "transport_type_id": "1"
     *     }
     *   ],
     *   "country_groups": [
     *     {
     *       "id": "1",
     *       "name": "\u0421\u0430\u043c\u044b\u0435 \u043f\u043e\u043f\u0443\u043b\u044f\u0440\u043d\u044b\u0435"
     *     }
     *   ],
     *   "regions": [
     *     {
     *       "id": "8688",
     *       "name": "\u0410\u0431\u0430\u043d\u043e \u0422\u0435\u0440\u043c\u0435",
     *       "type_id": "1,2",
     *       "country_id": "76",
     *       "parent_id": "0"
     *     }
     *   ],
     *   "hotel_ratings": [
     *     {
     *       "id": "7",
     *       "name": "2"
     *     }
     *   ],
     *   "transport_types": [
     *     {
     *       "id": "0",
     *       "name": "\u0412\u0441\u0435 \u0432\u0438\u0434\u044b"
     *     }
     *   ]
     * }
     * @throws JsonProcessingException
     */
    @Test
    public void testFiltersParsing() throws JsonProcessingException {
        JsonNode extracted = getJsonFromFile("json/filters.json");
        ObjectMapper objectMapper = new ObjectMapper();
        Filters filters = objectMapper.treeToValue(extracted, Filters.class);
        Assert.assertEquals(filters.getCountries(), testFilters.getCountries());
        Assert.assertEquals(filters.getCurrencies(), testFilters.getCurrencies());
        Assert.assertEquals(filters.getTypes(), testFilters.getTypes());
        Assert.assertEquals(filters.getCountry_groups(), testFilters.getCountry_groups());
        Assert.assertEquals(filters.getRegions(), testFilters.getRegions());
        Assert.assertEquals(filters.getHotel_ratings(), testFilters.getHotel_ratings());
        Assert.assertEquals(filters.getTransport_types(), testFilters.getTransport_types());
        Assert.assertEquals(filters, testFilters);
    }

    /**
     * {
     *   "page": 1,
     *   "items_per_page": 100,
     *   "offers": [
     *     {
     *       "key": "01-03-1e3fb3891a40c9025d145e58014b80d4",
     *       "type": 1,
     *       "country": "\u0415\u0433\u0438\u043f\u0435\u0442",
     *       "region_id": 5996,
     *       "region": "\u0428\u0430\u0440\u043c \u042d\u043b\u044c \u0428\u0435\u0439\u0445",
     *       "hotel_id": 68,
     *       "hotel": "Luna Sharm",
     *       "hotel_rating": "4",
     *       "meal_type": "BB",
     *       "meal_type_full": "\u0417\u0430\u0432\u0442\u0440\u0430\u043a",
     *       "adult_amount": 2,
     *       "child_amount": 0,
     *       "accomodation": "DBL",
     *       "room_type": "Standart",
     *       "duration": 6,
     *       "date_from": "2017-01-26",
     *       "is_combined": 0,
     *       "currency_id": 1,
     *       "prices": {
     *         "1": 483,
     *         "2": 12509,
     *         "10": 434
     *       },
     *       "from_city": "\u041a\u0438\u0435\u0432",
     *       "transport_type": "flight",
     *       "operator_id": 7,
     *       "operator": "Tez Tour",
     *       "hotel_images": [
     *         {
     *           "full": "http://ittour.com.ua/images/hotel_image/2/1/6/6/6/file_name/21666.jpg",
     *           "thumb": "http://ittour.com.ua/images/hotel_image_thumb/2/1/6/6/6/file_name/21666.jpg",
     *           "is_main": 0
     *         }
     *       ],
     *       "hotel_review_rate": "2.3",
     *       "hotel_review_count": 12,
     *       "hotel_facilities": [
     *         {
     *           "id": "1",
     *           "name": "Wi-fi",
     *           "category_id": "1",
     *           "category": "Интернет",
     *           "is_main": 0,
     *           "is_paid": 0
     *         }
     *       ]
     *     }
     *   ],
     *   "has_more_pages": true
     * }
     * @throws JsonProcessingException
     */
    @Test
    public void testToursListResponseParsing() throws JsonProcessingException {
        JsonNode extracted = getJsonFromFile("json/tours_response.json");
        ObjectMapper objectMapper = new ObjectMapper();
        ToursListResponse toursListResponse = objectMapper.treeToValue(extracted, ToursListResponse.class);
        Assert.assertEquals(toursListResponse, testToursListResponse);
        System.out.println(toursListResponse);
    }

    public JsonNode getJsonFromFile(String path) {
        JsonNode result = null;
        File file = new File(getClass().getClassLoader().getResource(path).getFile());
        ObjectMapper mapper = new ObjectMapper();
        try {
            result = mapper.readTree(file);
        } catch (IOException ex) {
            log.error(ex);
        }
        return result;
    }
}
