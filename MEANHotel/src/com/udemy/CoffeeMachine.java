package com.udemy;

public class CoffeeMachine {

    private String location;

    public CoffeeMachine(String location) {
        this.location = location;
    }

    public void makeCoffee(int milk, int sugar){
        System.out.println("Here's your coffee " +
                            "with " + milk + " milk and " + sugar + " sugar.");
    }

    public String getLocation() {
        return location;
    }
}
