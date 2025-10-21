package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class ShippingCenterTest {

    @Test
    void shouldReturnSuccessMessage() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");

        ShippingCenter shippingCenter = context.getBean(ShippingCenter.class);
        String result = shippingCenter.sendPackage("Hill Street 11, New York", 18.2);

        assertEquals("Package delivered to: Hill Street 11, New York", result);
    }

    @Test
    void shouldReturnFailMessageWhenTooHeavy() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");

        ShippingCenter shippingCenter = context.getBean(ShippingCenter.class);
        String result = shippingCenter.sendPackage("Hill Street 11, New York", 35.0);

        assertEquals("Package not delivered to: Hill Street 11, New York", result);
    }
}
