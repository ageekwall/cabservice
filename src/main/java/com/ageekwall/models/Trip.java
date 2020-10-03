package com.ageekwall.models;

import lombok.Data;

@Data
public class Trip {
    private int cabId;
    private int riderId;
    private TripStatus tripStatus;
    private int startLocation;
    private int endLocation;
}
