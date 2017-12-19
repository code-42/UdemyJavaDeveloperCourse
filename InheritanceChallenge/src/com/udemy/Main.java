package com.udemy;

public class Main {

    public static void main(String[] args) {

        Vehicle truck = new Vehicle();

        Car myCar = new Car();
        myCar.Moving(22);
        System.out.println(myCar.Moving(5));

        Camaro myCamaro = new Camaro("Shelby");
        System.out.println(myCamaro.getModel());

    }
}
