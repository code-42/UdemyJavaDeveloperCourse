package com.udemy;

public class CoffeeMachine {

    private String location;

    public CoffeeMachine() {
    }

    public void makeCoffee(int milk, int sugar){
        System.out.println("Here's your coffee " +
                            "with " + milk + " milk and " + sugar + " sugar.\n");
    }

    public String getLocation() {
        return location;
    }
}
