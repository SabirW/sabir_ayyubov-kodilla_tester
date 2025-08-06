package com.kodilla.collections.interfaces.homework;

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
        return speed + 40;
    }

    @Override
    public int decreaseSpeed() {
        return speed - 20;
    }
}
