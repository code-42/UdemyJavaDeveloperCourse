package com.udemy;


public class Hotel {

    private Name theName;
    private Location theLocation;
    private Phones thePhones;

    public Hotel(Name theName, Location theLocation, Phones thePhones) {
        this.theName = theName;
        this.theLocation = theLocation;
        this.thePhones = thePhones;
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
}

