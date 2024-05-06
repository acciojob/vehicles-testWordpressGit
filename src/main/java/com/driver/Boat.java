package com.driver;

public class Boat implements WaterVehicle {
    private String boatName;
    private int capacity;

    public Boat(String boatName, int capacity) {
        this.boatName = boatName;
        this.capacity = capacity;
    }

    // Parameterless constructor
    public Boat() {
        // You can initialize default values here if needed
    }

    @Override
    public String getVehicleName() {
        return boatName;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }
}