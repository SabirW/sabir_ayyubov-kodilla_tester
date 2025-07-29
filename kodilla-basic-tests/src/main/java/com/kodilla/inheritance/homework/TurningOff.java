package com.kodilla.inheritance.homework;

public class TurningOff extends OperatingSystem {
    public TurningOff(String operatingSystem, int releaseYear) {
        super(operatingSystem, releaseYear);
    }

    @Override
    public void turnOff(){
        System.out.println("Operating System is fully turned off");
    }

    @Override
    public void turnOn(){
        System.out.println("Operating System is fully turned on");
    }
}
