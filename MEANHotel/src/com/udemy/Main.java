package com.udemy;


public class Main {

    public static void main(String[] args) {

        // Lecture 44 & 45 Composition - reusing code instead of inheritance to achieve polymorphism
        DoComposition();

        // Lecture 46 & 47 Encapsulation - protecting data and methods from improper access
        // Encapsulation is evident in the preceeding section
        // The fields and mentods are protected by the use of Constructor and Accessors

        // Lecture 48 Polymorphism - implementation of methods based on the object calling it
        // DoPolymorphism();
    }


    public static void DoComposition () {

        // Lecture 44 & 45 Composition - reusing code instead of inheritance to achieve polymorphism

        Name name = new Name("Motel 6");
        Location location = new Location("20 Jefferson Blvd", "Warwick", "RI");
        Phones phones = new Phones("401-123-4567", "401-123-1234", "401-123-5678");
        Lobby lobby = new Lobby();
        CoffeeMachine coffee = new CoffeeMachine();
        FrontDesk frontDesk = new FrontDesk();

        Hotel theHotel = new Hotel(name, location, phones, coffee, frontDesk);

        System.out.println();
        theHotel.getTheFrontDesk().ringBell();

        System.out.println();
        theHotel.getTheName().sayWelcome(theHotel.getTheName().getName());


        theHotel.getThePhones().callRoomService();
        System.out.println(theHotel.getThePhones().callRoomService());

        theHotel.getTheCoffeeMachine().makeCoffee(1,2);

        System.out.println(theHotel.getTheName().getName());
        System.out.println(theHotel.getTheLocation().getStreet() + "\n" +
                theHotel.getTheLocation().getCity() + ", " +
                theHotel.getTheLocation().getState());
        System.out.println();
//        System.out.println(theHotel.getThePhones().getMainPhone());
//        System.out.println(theHotel.getThePhones().callMainPhone());
//        System.out.println();
        System.out.println(theHotel.getThePhones().getReservations());
        System.out.println(theHotel.getThePhones().callReservations());
        System.out.println();
        System.out.println(theHotel.getThePhones().getRoomService());
        System.out.println(theHotel.getThePhones().callRoomService());
        System.out.println();

//        System.out.println(theHotel.getTheLobby().getTheFrontDesk().ringBell());
//        System.out.println(theHotel.getTheLobby().getTheFrontDesk().checkIn());

    }


    public static void DoPolymorphism() {

        System.out.println("\nThis is Section 8 Lecture 48 - Polymorphism\n");
        // Lecture 48 Polymorphism - implementation of methods based on the object calling it
        Hotels hotels = randomHotels();
        System.out.println("Hotel: " +
                hotels.getName() + "\n" +
                "Stars: " + hotels.stars() + "\n");  // this is Polymorphism

    }


    public static Hotels randomHotels () {
        int randomNumber = (int) (Math.random() * 9) + 1;
        // System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new HotelProvidence();
            case 2:
                return new OmniProvidenceHotel();
            case 3:
                return new RenaissanceProvidenceDowntownHotel();
            case 4:
                return new ProvidenceMariottDowntown();
            case 5:
                return new TheDeanHotel();
            case 6:
                return new HiltonProvidence();
            case 7:
                return new ProvidenceBiltmore();
            case 8:
                return new HamptonInnSuitesProvidenceDowntown();
            case 9:
                return new HiltonGardenInnProvidence();
            case 10:
                return new CourtyardProvidenceDowntown();
        }
        return null;
    }
}
