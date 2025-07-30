package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    private static final double DELTA = 0.0001;

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtractPositiveNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(5, 8);
        assertEquals(-3, result);
    }

    @Test
    public void testSquareOfPositiveNumber() {
        Calculator calculator = new Calculator();
        double result = calculator.square(5);
        assertEquals(25.0, result, DELTA);
    }

    @Test
    public void testSquareOfZero() {
        Calculator calculator = new Calculator();
        double result = calculator.square(0);
        assertEquals(0.0, result, DELTA);
    }

    @Test
    public void testSquareOfNegativeNumber() {
        Calculator calculator = new Calculator();
        double result = calculator.square(-4);
        assertEquals(16.0, result, DELTA);
    }
}
