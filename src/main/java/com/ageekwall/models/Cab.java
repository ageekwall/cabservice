package com.ageekwall.models;

import lombok.Data;

@Data
public class Cab {
    private String cabDriver;
    private int cabId;
    private int x;
    private int y;
    private boolean available;
}
