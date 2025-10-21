package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");

        ShippingCenter shippingCenter = context.getBean(ShippingCenter.class);
        String result = shippingCenter.sendPackage("Hill Street 11, New York", 18.2);
        System.out.println(result);
    }
}
