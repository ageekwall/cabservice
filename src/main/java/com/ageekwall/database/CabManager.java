package com.ageekwall.database;

import com.ageekwall.models.Cab;
import com.ageekwall.models.Rider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CabManager {
    Map<Integer, Cab> cabs = new HashMap<>();

    public void createCab(Cab cab) {
        cabs.put(cab.getCabId(), cab);
    }

    public void updateCabLocation(int cabId, int x, int y) {
        cabs.get(cabId).setX(x);
        cabs.get(cabId).setY(y);
    }
    public void switchAvailability(int cabId, String flag) {
        switch (flag) {
            case "ON":
                cabs.get(cabId).setAvailable(true);
                break;
            case "OFF":
                cabs.get(cabId).setAvailable(false);
        }
    }

}
