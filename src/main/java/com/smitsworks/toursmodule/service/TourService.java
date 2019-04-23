package com.smitsworks.toursmodule.service;

import com.smitsworks.toursmodule.model.Tour;
import com.smitsworks.toursmodule.repository.TourRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourService {

    private static final Logger log = LogManager.getLogger();

    @Autowired
    private TourRepository repository;

    public List<Tour> findAll() {
        return repository.findAll();
    }

}
