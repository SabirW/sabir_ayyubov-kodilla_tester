package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTestSuite {

    private Display display;
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        display = new Display();
        calculator = new Calculator(display);
    }

    @Test
    void testAdd() {
        assertEquals(8.0, calculator.add(5, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(6.0, calculator.subtract(10, 4));
    }

    @Test
    void testMultiply() {
        assertEquals(14.0, calculator.multiply(7, 2));
    }

    @Test
    void testDivide() {
        assertEquals(4.0, calculator.divide(8, 2));
        assertTrue(Double.isNaN(calculator.divide(8, 0)));
    }
}
