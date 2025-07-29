package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private String operatingSystem;
    private int releaseYear;

    public  OperatingSystem(String operatingSystem, int releaseYear) {
        this.operatingSystem = operatingSystem;
        this.releaseYear = releaseYear;
    }

    public void turnOn(){
        System.out.println("Operating System was turned on");
    }

    public void turnOff(){
        System.out.println("Operating System was turned off");
    }

    public void getReleaseYear() {
        System.out.println("release year is: " + releaseYear);
    }
}
