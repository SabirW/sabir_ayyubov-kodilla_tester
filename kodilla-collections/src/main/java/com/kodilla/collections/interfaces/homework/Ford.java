package com.kodilla.collections.interfaces.homework;

import java.util.Random;

public class Ford implements Car {
    private int speed;

    public Ford(int speed) {
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
        return speed - 15;
    }

    public int getRandomIncreaseSpeed() {
        Random random = new Random();
        return random.nextInt(100);
    }
}
