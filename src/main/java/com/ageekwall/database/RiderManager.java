package com.ageekwall.database;

import com.ageekwall.models.Rider;
import com.ageekwall.models.Trip;

import java.util.ArrayList;
import java.util.List;

public class RiderManager {
    List<Rider> riders = new ArrayList<>();
    public void createRider(Rider rider) {
        riders.add(rider);
    }


}
