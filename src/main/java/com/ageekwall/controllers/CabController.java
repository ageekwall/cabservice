package com.ageekwall.controllers;

import com.ageekwall.models.Rider;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CabController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ResponseEntity hello() {
        List<String> trips = new ArrayList<>();
        trips.add("LA");
        trips.add("SF");
        return ResponseEntity.ok(trips);
    }
}
