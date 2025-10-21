package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator calculator = context.getBean(Calculator.class);

        calculator.add(5, 3);
        calculator.subtract(10, 4);
        calculator.multiply(7, 2);
        calculator.divide(8, 0);  // should print error
        calculator.divide(8, 2);
    }
}
