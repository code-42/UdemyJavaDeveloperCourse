package com.udemy;

public class Vehicle {

    private String type;
    private String make;
    private int year;
    private int wheels;

    public Vehicle() {
        this("car", "Honda", 2017, 4);
    }

    public Vehicle(String type, String make, int year, int wheels) {
        this.type = type;
        this.make = make;
        this.year = year;
        this.wheels = wheels;
    }

    public void Steering(){
        System.out.println("I'm steering");
    }

    public void Shifting(){
        System.out.println("I'm shifting");
    }

    public int Moving(int speed){
        return speed;

    }
}
