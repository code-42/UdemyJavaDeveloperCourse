package com.udemy;

public class FrontDesk {

    private String bell;

    public FrontDesk() {
    }

    public void ringBell(){
        System.out.println("FrontDesk.ringBell() says: Ding!");
    }

    public void checkIn(){
        System.out.println("FrontDesk.checkIn() says: I am checking in.");
    }

    public void getRoom(){
        int randomNumber = (int) (Math.random() * 6) + 1;
        System.out.println("FrontDesk.getRoom() says: Your room is # " + randomNumber);
    }

    public String getBell() {
        return bell;
    }
}
