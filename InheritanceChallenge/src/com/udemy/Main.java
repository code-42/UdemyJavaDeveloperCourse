package com.udemy;

public class Main {

    public static void main(String[] args) {

        Vehicle truck = new Vehicle("car", 2017, 4);

        // public Car(String make, String style, int passengers) {
        Car myCar = new Car("Ford", "Sedan", 5);
        int moving = myCar.Moving(22);
        System.out.println(myCar.Moving(5));

        Camaro myCamaro = new Camaro("Shelby");
        System.out.println(myCamaro.getModel());

    }
}
