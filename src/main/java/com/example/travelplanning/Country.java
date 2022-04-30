package com.example.travelplanning;

import java.util.HashMap;
import java.util.Map;

public class Country {

    public String name;
    public Climate climate;
    /**
     * Key is an activity and the value is the estimated cost per day.
     */
    public Map<Activity, Integer> costsPerActivity;
    /**
     * Average hotel cost per day.
     */
    public int hotelCost;

    public Country() {
        this.name = "Name";
        this.climate = Climate.Mild;
        this.costsPerActivity = new HashMap<>();
        this.hotelCost = 0;
    }
}
