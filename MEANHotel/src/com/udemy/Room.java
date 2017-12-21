package com.udemy;

public class Room {

    private String roomNumber;

    public Room() {
    }

    public static String getRoomNumber() {

        int randomNumber = (int) (Math.random() * 9) + 1;
            System.out.println("Room: " +
                    Room.getRoomNumber() + "\n");  // this is Polymorphism
        return Room.getRoomNumber();
    }

//
//    public static Room randomRooms () {
//        int randomNumber = (int) (Math.random() * 9) + 1;
//         System.out.println("Random number generated was: " + randomNumber);
//
//        return null;
//    }

}
