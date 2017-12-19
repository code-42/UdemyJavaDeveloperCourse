package com.udemy;

public class Vehicle {

    private String type;
    private int year;
    private int wheels;

    public Vehicle(String type, int year, int wheels) {
        this.type = type;
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
        System.out.println("I'm moving.  Wheee!");
        return speed;
    }

    public int Accelerating(int acceleration){
        System.out.println("I'm accelerating");
        return acceleration;
    }

    public boolean Stop(){
        System.out.println("STOP!");
        return true;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}
