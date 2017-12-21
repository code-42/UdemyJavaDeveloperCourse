package com.udemy;

public class Name {

    private String name;

    public Name(String name) {
        this.name = name;
    }

    public void sayWelcome(String name){
        System.out.println("Welcome to the " + name + "\n");
    }

    public String getName() {
        return name;
    }
}
