package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Opel opel = new Opel(30);
        doRace(opel);

        BMW bmw = new BMW(60);
        doRace(bmw);

        Ford ford = new Ford(50);
        doRace(ford);
    }

    private static void doRace(Car car){
        System.out.println(car.getSpeed());
        System.out.println(car.increaseSpeed());
        System.out.println(car.decreaseSpeed());
    }
}
