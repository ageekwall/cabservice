package com.ageekwall.database;

import com.ageekwall.models.Cab;
import com.ageekwall.models.Rider;
import com.ageekwall.models.Trip;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TripManager {

    //local database of available cabs, it has to be made atomic
    Map<Integer, List<Trip>> rides = new HashMap<>();
    Map<Integer, Trip> currentRides = new HashMap<>();
    public void newTrip(Trip trip) {
        currentRides.put(trip.getRiderId(), trip);
    }

    public void endTrip(Trip trip) {
        int riderId = trip.getRiderId();
        List<Trip> trips = rides.getOrDefault(riderId, new ArrayList<>());
        trips.add(trip);
    }

    public List<Trip> getRides(Rider rider) {
        return rides.get(rider.getRiderId());
    }



}
