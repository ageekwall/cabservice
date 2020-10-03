package com.ageekwall.service;

import com.ageekwall.models.Cab;
import com.ageekwall.models.Rider;

//Todo: Not required
public class RequestHandler {

    static int cabId = 1;
    static int riderId = 1;
    public static Cab createCab(String cabName, int x, int y) {
        Cab cab = new Cab();
        cab.setAvailable(true);
        cab.setX(x);
        cab.setY(y);
        cab.setCabDriver(cabName);
        cab.setCabId(cabId);
        cabId++;
        return cab;
    }

    public static Rider createRider(String riderName) {
        Rider rider = new Rider();
        rider.setName(riderName);
        rider.setRiderId(riderId);
        riderId++;
        return rider;
    }


}
