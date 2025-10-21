package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Month;

@Configuration
public class CarConfiguration {

    @Bean
    public Car chooseCar() {
        Month currentMonth = java.time.LocalDate.now().getMonth();

        switch (currentMonth) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                return new SUV();
            case JUNE:
            case JULY:
            case AUGUST:
                return new Cabrio();
            default:
                return new Sedan();
        }
    }
}
