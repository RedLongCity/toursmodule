package com.smitsworks.toursmodule.parsing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.smitsworks.toursmodule.model.Filters;
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
