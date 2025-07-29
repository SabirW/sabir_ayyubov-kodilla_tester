package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    public Triangle() {
        super(3);
    }

    @Override
    public void calculateArea() {
        double area = (Math.sqrt(3) / 4) * sideLength * sideLength;
        System.out.println("Area of Triangle is: " + area);
    }

    @Override
    public void calculatePerimeter() {
        int perimeter = 3 * sideLength;
        System.out.println("Perimeter of Triangle is: " + perimeter);
    }
}
