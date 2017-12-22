package com.udemy;

public class Phones {

    private String mainPhone;
    private String reservations;
    private String roomService;
    private Name name;

    public Phones(String mainPhone, String reservations, String roomService, Name name) {
        this.mainPhone = mainPhone;
        this.reservations = reservations;
        this.roomService = roomService;
        this.name = name;
    }

    public String callMainPhone(){
        return ("This is the main phone. Sorry no one is available to help you.");
    }

    public String callReservations(){

        return ("\nPhones.callReservations() says: \n" +
                "Reservations, may I help you?");
    }

    public String callRoomService(){
        return ("\nPhones.callRoomService() says: \nCalling Room Service.... " +
                "\nThis is " + name.getName() +
                "\ncoffee machine is in the lobby");
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
