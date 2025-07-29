package com.kodilla.inheritance.homework;

public class Methods {

    public static void main(String[] args) {
        OperatingSystem opSystem = new OperatingSystem("windows", 1985);
        opSystem.getReleaseYear();

        TurningOn turningOn = new TurningOn("macOs", 2001);
        turningOn.turnOn();

        TurningOff turningOff = new TurningOff("Linux", 1991);
        turningOff.turnOff();
    }
}
