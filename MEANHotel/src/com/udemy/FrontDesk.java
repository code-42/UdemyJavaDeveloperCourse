package com.udemy;

public class FrontDesk {

    private String bell;

    public FrontDesk(String bell) {
        this.bell = bell;
    }

    private void ringBell(){
        System.out.println("Ding!");
    }

    public String getBell() {
        return bell;
    }
}
