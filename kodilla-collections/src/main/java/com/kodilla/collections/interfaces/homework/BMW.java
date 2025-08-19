package com.kodilla.collections.interfaces.homework;

import java.util.Objects;
import java.util.Random;

public class BMW implements Car{
    private int speed;

    public BMW(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int increaseSpeed() {
        return speed + getRandomIncreaseSpeed();
    }

    @Override
    public int decreaseSpeed() {
        return speed - 20;
    }

    public int getRandomIncreaseSpeed() {
        Random random = new Random();
        return random.nextInt(100);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BMW bmw = (BMW) o;
        return speed == bmw.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(speed);
    }
}
