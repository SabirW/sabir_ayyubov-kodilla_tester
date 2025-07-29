package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {
        Hexagon hexagon = new Hexagon();
        hexagon.calculateArea();
        hexagon.calculatePerimeter();

        Square square = new Square();
        square.calculateArea();
        square.calculatePerimeter();

        Triangle triangle = new Triangle();
        triangle.calculateArea();
        triangle.calculatePerimeter();
    }
}
