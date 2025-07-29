package com.kodilla.abstracts.homework;

public class Square extends Shape {

    public Square() {
        super(4);
    }

    @Override
    public void calculateArea() {
        int area = sideLength * sideLength;
        System.out.println("Area of Square is: " + area);
    }

    @Override
    public void calculatePerimeter() {
        int perimeter = 4 * sideLength;
        System.out.println("Perimeter of Square is: " + perimeter);
    }
}
