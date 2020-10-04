package com.ageekwall.database;

import com.ageekwall.models.Rider;
import com.ageekwall.models.Trip;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RiderManager {
    Map<Integer, Rider> riders = new HashMap<>();
    public void createRider(Rider rider) {
        riders.put(rider.getRiderId(), rider);
    }

    public Rider getRider(int riderId) {
        return riders.get(riderId);
    }


}
