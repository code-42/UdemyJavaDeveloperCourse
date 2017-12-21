package com.udemy;

public class CoffeeMachine {

    private String location;

    public CoffeeMachine() {
    }

    public void makeCoffee(int milk, int sugar){
        int amount = milk + sugar;
        System.out.println("coffee is $5.  extra $" + amount + " for " +
                            milk + " milk and " + sugar + " sugar.\n");
    }

    public String getLocation() {
        return location;
    }
}
