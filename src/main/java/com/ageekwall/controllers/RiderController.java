package com.ageekwall.controllers;

import com.ageekwall.database.RiderManager;
import com.ageekwall.database.TripManager;
import com.ageekwall.models.Cab;
import com.ageekwall.models.Rider;
import com.ageekwall.models.Trip;
import com.ageekwall.service.RequestHandler;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class RiderController {

    private RiderManager riderManager;
    private TripManager tripManager;

    public RiderController(RiderManager riderManager, TripManager tripManager) {
        this.riderManager = riderManager;
        this.tripManager = tripManager;
    }
    @RequestMapping(value = "rider/register", method = RequestMethod.POST)
    public ResponseEntity newRider(final String riderName ) {
        Rider rider = RequestHandler.createRider(riderName);
        riderManager.createRider(rider);
        return ResponseEntity.ok("");
    }

    @RequestMapping(value = "rider/book", method = RequestMethod.POST)
    public ResponseEntity book(final int riderId, final int srcx, final int srcy, final int destx, final int desty) {
        Rider rider = riderManager.getRider(riderId);
        tripManager.newTrip(rider, srcx, srcy, destx, desty);
        return ResponseEntity.ok("");
    }

    @RequestMapping(value = "rider/history", method = RequestMethod.POST)
    public ResponseEntity getHistory(final int riderId) {
        List<Trip> rides = tripManager.getRides(riderId);
        return ResponseEntity.ok(rides);
    }
}
