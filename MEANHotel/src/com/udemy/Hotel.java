package com.udemy;


public class Hotel {

    private Name theName;
    private Location theLocation;
    private Phones thePhones;
//    private Lobby theLobby;
    private CoffeeMachine theCoffeeMachine;

    public Hotel(Name theName, Location theLocation, Phones thePhones, CoffeeMachine theCoffeeMachine){ //, Lobby theLobby, CoffeeMachine theCoffeeMachine) {
        this.theName = theName;
        this.theLocation = theLocation;
        this.thePhones = thePhones;
//        this.theLobby = theLobby;
        this.theCoffeeMachine = theCoffeeMachine;
    }

    public Name getTheName() {
        return theName;
    }

    public Location getTheLocation() {
        return theLocation;
    }

    public Phones getThePhones() {
        return thePhones;
    }

//    public Lobby getTheLobby() {
//        return theLobby;
//    }
//
    public CoffeeMachine getTheCoffeeMachine() {
        return theCoffeeMachine;
    }
}

