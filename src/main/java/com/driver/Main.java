package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("BMW", false);
        mercedes.move(0, 0);
        mercedes.accelerate(0);
        mercedes.accelerate(50);

    }
}