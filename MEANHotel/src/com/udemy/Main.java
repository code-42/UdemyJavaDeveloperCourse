package com.udemy;


public class Main {

    public static void main(String[] args) {

        Hotel MEANHotel = new Hotel("MEAN Hotel", 15, true);
        MEANHotel.RentRoom(4);
        MEANHotel.RentRoom(3);
        MEANHotel.RentRoom(2);
        MEANHotel.RentRoom(1);
        MEANHotel.RentRoom(1);
        MEANHotel.RentRoom(1);

    }
}
