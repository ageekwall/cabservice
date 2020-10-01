package com.ageekwall.models;

import lombok.Data;

@Data
public class Trip {
    private String cabId;
    private String riderId;
    private TripStatus tripStatus;
    private String startLocation;
    private String endLocation;
}
