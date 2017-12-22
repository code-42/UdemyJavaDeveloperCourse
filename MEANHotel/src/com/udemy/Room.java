package com.udemy;

public class Room {

    private String roomNumber;

    public Room() {
    }

    public static int getRoomNumber() {

        // Generate random room number
        int randomNumber = (int) (Math.random() * 6) + 1;
        return randomNumber;
    }
}
