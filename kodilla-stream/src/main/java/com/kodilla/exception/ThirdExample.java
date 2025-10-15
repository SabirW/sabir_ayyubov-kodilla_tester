package com.kodilla.exception;

public class ThirdExample {
    public static void main(String[] args) {
        AirportRepository airportRepository = new AirportRepository();
        boolean isViennaInUse = false;
        try {
            isViennaInUse = airportRepository.isAirportInUse("Vienna");
            System.out.println("Airport "+isViennaInUse);
        } catch (AirportNotFoundException e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("Thank you for using this airport");
        }
    }
}
