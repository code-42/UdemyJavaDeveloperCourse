package com.udemy;


public class Main {

    public static void main(String[] args) {

        // Lecture 44 & 45 Composition - reusing code instead of inheritance to achieve polymorphism
        Name name = new Name("Hotel Providence");
        Location location = new Location("139 Mathewson Street", "Providence", "RI");

        Hotel HotelProvidence = new Hotel(name, location);
        HotelProvidence.getTheName();
        HotelProvidence.getTheLocation();

        // Lecture 46 & 47 Encapsulation - protecting data and methods from improper access


        // Lecture 48 Polymorphism - implementation of methods based on the object calling it
        for (int i = 1; i < 10; i++) {
            Hotels hotels = randomHotels();
            System.out.println("Hotel #" + i +
                    " : " + hotels.getName() + "\n" +
                    "Stars: " + hotels.stars() + "\n");  // this is Polymorphism
        }
    }

    public static Hotels randomHotels() {
        int randomNumber = (int) (Math.random() * 9) +1;
        System.out.println("Random number generated was: " + randomNumber);
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
