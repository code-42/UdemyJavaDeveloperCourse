package com.udemy;

public class Camaro extends Car {

    private String model;

    public Camaro(String model) {
        this("Honda", "Sport", 2);
        this.model = model;
    }

    public Camaro(String make, String style, int passengers) {
        super(make, style, passengers);
        this.model = model;
    }

    public String getModel() {
        return model;
    }


}
