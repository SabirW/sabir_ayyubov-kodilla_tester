package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.BMW;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;

public class CarUtils {

    public static void describeCar(Car car) {
        System.out.println("=================================");
        System.out.println("Car kind: " + getCarName(car));
        System.out.println("Car speed: " + car.getSpeed());
        System.out.println("Car's increased speed: " + car.increaseSpeed());
    }

    public static String getCarName(Car car) {
        if (car instanceof BMW) {
            return "BMW";
        }
        if (car instanceof Ford) {
            return "Ford";
        }
        else return "Opel";
    }
}
