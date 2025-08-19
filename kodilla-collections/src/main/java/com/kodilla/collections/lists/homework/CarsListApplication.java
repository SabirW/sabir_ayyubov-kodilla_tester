package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.BMW;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.collections.arrays.homework.CarUtils.describeCar;
import static com.kodilla.collections.arrays.homework.CarUtils.getCarName;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Ford ford = new Ford(200);
        cars.add(ford);
        cars.add(new BMW(200));
        cars.add(new Opel(300));
        cars.add(new Ford(100));


        cars.remove(1);
        cars.remove(ford);

        System.out.println(cars.size());

        for(Car car : cars){
            describeCar(car);
        }
    }
}
