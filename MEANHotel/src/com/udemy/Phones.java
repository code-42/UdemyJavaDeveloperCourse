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
        return ("Calling main phone");
    }

    public String callReservations(){
        return ("Calling for reservations");
    }

    public String callRoomService(){
        return ("Calling room service");
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
