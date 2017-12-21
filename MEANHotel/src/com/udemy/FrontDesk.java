package com.udemy;

public class FrontDesk {

    private String bell;

    public FrontDesk() {
    }

    public void ringBell(){
        System.out.println("Ding!");
    }

    public String checkIn(){
        System.out.println("I am checking in.");
        return "I am checking in.";
    }

    public void getRoom(){
        System.out.println("Your room is ready");
    }

    public String getBell() {
        return bell;
    }
}
