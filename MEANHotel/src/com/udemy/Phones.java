package com.udemy;

public class Phones {

    private String mainPhone;
    private String reservations;
    private String roomService;

    public Phones(String mainPhone, String reservations, String roomService) {
        this.mainPhone = mainPhone;
        this.reservations = reservations;
        this.roomService = roomService;
    }

    public String callMainPhone(){
        return ("This is the main phone. Sorry no one is available to help you.");
    }

    public String callReservations(){
        return ("Reservations, may I help you?");
    }

    public String callRoomService(){
        return ("Calling Room Service.... Hola?" +
        "\ncoffee machine in the lobby");
    }

    public String getMainPhone() {
        return mainPhone;
    }

    public String getReservations() {
        return reservations;
    }

    public String getRoomService() {
        return roomService;
    }
}
