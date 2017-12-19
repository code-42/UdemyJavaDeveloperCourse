package com.udemy;

public class Camaro extends Car {

    private String subModel;
    private int gears;

    public Camaro(String type, int year, int wheels, String make, String style, int passengers) {
        super(type, year, wheels, make, style, passengers);
        this.subModel = subModel;
        this.gears = gears;
    }

    public String getSubModel() {
        return subModel;
    }

    public void setSubModel(String subModel) {
        this.subModel = subModel;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    @Override
    public int moving(int speed) {
        System.out.println("Camaro.moving() called");
        peelingOut();
        return super.moving(speed);
    }

    private void peelingOut(){
        System.out.println("Camaro peeling out");
    }
}
