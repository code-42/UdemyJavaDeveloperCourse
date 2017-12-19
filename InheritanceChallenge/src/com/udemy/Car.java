package com.udemy;

public class Car extends Vehicle {

    private String make;
    private String style;
    private int passengers;

    // public Vehicle(String type, int year, int wheels) {
    public Car(String type, int year, int wheels, String make, String style, int passengers) {
        super("car", 2017, 4);
        this.make = make;
        this.style = style;
        this.passengers = passengers;
    }

}
