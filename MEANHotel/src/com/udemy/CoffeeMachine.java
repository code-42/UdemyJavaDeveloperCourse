package com.udemy;

public class CoffeeMachine {

    private String location;

    public CoffeeMachine() {
    }

    public void makeCoffee(int milk, int sugar){
        int amount = milk + sugar;
        System.out.println("\nCoffeeMachine.makeCoffee() says: \n" +
                            "Coffee is $2 + extra $" + amount + " for " +
                            milk + " milk and " + sugar + " sugar.\n");
    }

    public String getLocation() {
        return location;
    }
}
