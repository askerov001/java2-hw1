package com.company;

public class Fuel {
    private String fuelName;
    private int fuelConsumption;

    public Fuel() {
    }

    public Fuel(String fuelName, int fuelConsumption) {
        this.fuelName = fuelName;
        this.fuelConsumption = fuelConsumption;
    }

    public String getFuelName() {
        return fuelName;
    }

    public float getFuelConsumption() {
        return fuelConsumption;
    }
}
