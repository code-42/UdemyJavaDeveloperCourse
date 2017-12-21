package com.udemy;

public class Lobby {

    private CoffeeMachine theCoffeeMachine;

    public Lobby(CoffeeMachine theCoffeeMachine) {
        this.theCoffeeMachine = theCoffeeMachine;
    }

    public CoffeeMachine getTheCoffeeMachine() {
        return theCoffeeMachine;
    }
}
