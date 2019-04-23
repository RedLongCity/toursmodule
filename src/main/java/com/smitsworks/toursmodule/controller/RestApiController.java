package com.smitsworks.toursmodule.controller;

import com.smitsworks.toursmodule.model.Tour;
import com.smitsworks.toursmodule.service.TourService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RestApiController {

    private static final Logger log = LogManager.getLogger();

    @Autowired
    private TourService tourService;

    /**
     * Only for test
     *
     * @return
     */
    @GetMapping("/tours")
    public ResponseEntity<List<Tour>> getAllTours() {
        log.info("Get getAllTours method was run");
        List<Tour> result;
        result = tourService.findAll();
        if (result != null)
            return new ResponseEntity<>(result, HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
