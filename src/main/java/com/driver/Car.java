package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        //Hint: Car extends Vehicle
        super(name);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.type = type;
        this.seats = seats;
        this.currentGear=1;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public boolean isManual() {
        return isManual;
    }

    public int getDoors() {
        return doors;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public int getGears() {
        return gears;
    }

    public int getSeats() {
        return seats;
    }

    public int getWheels() {
        return wheels;
    }

    public String getType() {
        return type;
    }

    @Override
    public int getCurrentDirection() {
        return super.getCurrentDirection();
    }

    @Override
    public int getCurrentSpeed() {
        return super.getCurrentSpeed();
    }

    public void changeGear(int newGear){
        this.currentGear = newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
        super.move(newSpeed,newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}