package com.udemy;

/*
 * criteria
 * name
 * total number of rooms
 * pool
 * rent a room()
 * total rooms rented
 * */

public class Hotel {

    private String name;
    private int totalNumberOfRooms;
    private boolean hasPool;
    private int totalRoomsRented;
    private int roomsAvailable;

    public Hotel(String name, int totalNumberOfRooms, boolean hasPool) {
        this.name = name;
        this.totalNumberOfRooms = totalNumberOfRooms;
        this.hasPool = hasPool;
    }

    public void RentRoom(int howMany){
        if(this.totalRoomsRented >= this.totalNumberOfRooms){
            System.out.println("Sorry, No Vacancy");
        }

        if(this.totalRoomsRented < this.totalNumberOfRooms){
//            System.out.println(howMany);

            roomsAvailable = ((this.totalNumberOfRooms - this.totalRoomsRented) - howMany);
            System.out.println(roomsAvailable);

        }


    }
}
