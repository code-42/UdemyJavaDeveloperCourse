package com.udemy;


public class Main {

    public static void main(String[] args) {

        // Lecture 44 & 45 Composition - reusing code instead of inheritance to achieve polymorphism
        Name name = new Name("Motel 6");
        Location location = new Location("20 Jefferson Blvd", "Warwick", "RI");
        Phones phones = new Phones("401-123-4567", "401-123-1234", "401-123-5678");

        Hotel aHotel = new Hotel(name, location, phones);
        System.out.println();
        System.out.println(aHotel.getTheName().getName());
        System.out.println(aHotel.getTheLocation().getStreet() + "\n" +
                           aHotel.getTheLocation().getCity() + ", " +
                           aHotel.getTheLocation().getState());
        System.out.println();
        System.out.println(aHotel.getThePhones().getMainPhone());
        System.out.println(aHotel.getThePhones().callMainPhone());
        System.out.println();
        System.out.println(aHotel.getThePhones().getReservations());
        System.out.println(aHotel.getThePhones().callReservations());
        System.out.println();
        System.out.println(aHotel.getThePhones().getRoomService());
        System.out.println(aHotel.getThePhones().callRoomService());

        // Lecture 46 & 47 Encapsulation - protecting data and methods from improper access
        // Encapsulation is evident in the preceeding section
        // The fields and mentods are protected by the use of Constructor and Accessors

        // Lecture 48 Polymorphism - implementation of methods based on the object calling it

    }

}
