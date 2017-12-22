package com.udemy;

public class Name {

    private String name;

    public Name(String name) {
        this.name = name;
    }

    public void sayWelcome(String name){
        System.out.println("Name.sayWelcome() says: \n" +
                "Welcome to the " + name + "\n");
    }

    public String getName() {
        return name;
    }
}
