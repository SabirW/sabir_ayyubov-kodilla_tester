package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.BMW;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
        Car[] cars =new Car[15];
        for (int i=0;i<15;i++) {
            cars[i] = drawCar();
        }
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }

    public static Car drawCar() {
        Random random = new Random();
        int randomCar = random.nextInt(3);
        int randomSpeed = getRandomSpeed();
        if (randomCar == 0) {
            return new BMW(randomSpeed);
        } if (randomCar == 1) {
            return new Opel(randomSpeed);
        }  else {
            return new Ford(randomSpeed);
        }
    }

    private static int getRandomSpeed() {
        Random random = new Random();
        return random.nextInt(100);
    }
}
