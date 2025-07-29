package com.kodilla.abstracts.homework;

public class Hexagon extends Shape {

    public Hexagon() {
        super(6);
    }

    @Override
    public void calculateArea() {
        double area = (3 * Math.sqrt(3) / 2) * sideLength * sideLength;
        System.out.println("Area of Hexagon is: " + area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 6 * sideLength;
        System.out.println("Perimeter of Hexagon is: " + perimeter);
    }
}
