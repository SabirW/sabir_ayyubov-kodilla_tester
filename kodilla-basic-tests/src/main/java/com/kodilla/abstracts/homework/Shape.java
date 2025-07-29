package com.kodilla.abstracts.homework;

public abstract class Shape {

    public int sideLength;

    public Shape(int sideLength) {
        this.sideLength = sideLength;
    }

    public abstract void calculateArea();

    public abstract void calculatePerimeter();
}
