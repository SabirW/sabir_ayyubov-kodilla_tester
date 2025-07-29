package com.kodilla.inheritance.homework;

public class TurningOn extends  OperatingSystem {
    public TurningOn(String operatingSystem, int releaseYear) {
        super(operatingSystem, releaseYear);
    }

    @Override
    public void turnOn(){
        System.out.println("Operating System is turned on");
    }

    @Override
    public void turnOff(){
        System.out.println("Operating System is turned off");
    }
}
