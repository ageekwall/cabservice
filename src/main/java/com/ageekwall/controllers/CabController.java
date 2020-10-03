package com.ageekwall.controllers;

import com.ageekwall.database.CabManager;
import com.ageekwall.database.RiderManager;
import com.ageekwall.database.TripManager;
import com.ageekwall.models.Cab;
import com.ageekwall.models.Rider;
import com.ageekwall.service.RequestHandler;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CabController {

    CabManager cabManager;
    TripManager tripManager;

    public CabController(CabManager cabManager, TripManager tripManager) {
        this.cabManager = cabManager;
        this.tripManager = tripManager;
    }

    @RequestMapping(value = "cab/register", method = RequestMethod.POST)
    public ResponseEntity newCab(final String cabDriver, final int x, final int y ) {
        Cab cab = RequestHandler.createCab(cabDriver, x, y);
        cabManager.createCab(cab);
        return ResponseEntity.ok("");
    }

    @RequestMapping(value = "cab/update/location", method = RequestMethod.POST)
    public ResponseEntity updateCabLocation(final int cabId, final int x, final int y) {
        cabManager.updateCabLocation(cabId,x, y);
        return ResponseEntity.ok("");
    }

    @RequestMapping(value = "cab/update/availablity", method = RequestMethod.POST)
    public ResponseEntity updateCabAvailability(final int cabId, final String flag) {
        cabManager.switchAvailability(cabId, flag);
    }

    @RequestMapping(value = "cab/endtrip", method = RequestMethod.POST)
    public ResponseEntity endTrip(final int cabId) {

        tripManager.endTrip(cabId);
    }


}
