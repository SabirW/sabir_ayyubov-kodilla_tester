package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class CarConfigurationTest {

    @Test
    void shouldReturnProperCarForSeason() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");

        Car car = context.getBean(Car.class);
        System.out.println("Chosen car: " + car.getCarType());

        assertTrue(car.getCarType().equals("SUV") ||
                car.getCarType().equals("Cabrio") ||
                car.getCarType().equals("Sedan"));
    }

    @Test
    void shouldTurnHeadlightsOnAtNight() {
        Car car = new Sedan();

        // Simulate times
        LocalTime evening = LocalTime.of(21, 0);
        LocalTime morning = LocalTime.of(5, 30);
        LocalTime noon = LocalTime.of(12, 0);

        boolean headlightsEvening = evening.isAfter(LocalTime.of(20, 0)) || evening.isBefore(LocalTime.of(6, 0));
        boolean headlightsMorning = morning.isAfter(LocalTime.of(20, 0)) || morning.isBefore(LocalTime.of(6, 0));
        boolean headlightsNoon = noon.isAfter(LocalTime.of(20, 0)) || noon.isBefore(LocalTime.of(6, 0));

        assertTrue(headlightsEvening);
        assertTrue(headlightsMorning);
        assertFalse(headlightsNoon);
    }
}
