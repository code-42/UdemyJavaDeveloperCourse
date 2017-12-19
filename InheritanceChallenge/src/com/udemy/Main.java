package com.udemy;

public class Main {

    public static void main(String[] args) {

        Vehicle truck = new Vehicle("car", 2017, 4);

        // public Car(String make, String style, int passengers) {
        Car myCar = new Car("car", 2017, 4,"Ford", "Sedan", 5);
        int moving = myCar.moving(22);
        System.out.println(myCar.moving(5));

        Camaro myCamaro = new Camaro("car", 2017, 4,"Ford", "Sport", 2);
        System.out.println(myCamaro.getSubModel());
        myCamaro.moving(55);
        myCamaro.accelerating(4);

    }
}
