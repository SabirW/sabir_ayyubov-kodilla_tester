package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("The sum method works correctly for numbers " + a + " and " + b);
        } else {
            System.out.println("The sum method does not work correctly for numbers" + a + " and " + b);
        }

        int subResult = calculator.subtract(a, b);
        boolean correctResult = ResultChecker.assertEquals(-3, subResult);
        if (correctResult) {
            System.out.println("The subtraction method works correctly for " + a + " and " + b);
        } else {
            System.out.println("The subtraction method does not work correctly for " + a + " and " + b);
        }

        int squareResult = calculator.square(a);
        boolean correctSquareResult = ResultChecker.assertEquals(25, squareResult);
        if (correctSquareResult) {
            System.out.println("The square method works correctly for " + a);
        }  else {
            System.out.println("The square method does not work correctly for " + a);
        }
    }
}
