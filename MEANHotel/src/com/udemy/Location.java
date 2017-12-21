package com.udemy;

public class Location {

    // Fields
    private String street;
    private String city;
    private String state;
    private String phone;

    // Constructor
    public Location(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }

    // Accessors
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

}
