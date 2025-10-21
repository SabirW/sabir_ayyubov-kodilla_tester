package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

public class ClockTest {

    @Test
    public void shouldCreateDifferentClocks() throws InterruptedException {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_scopes.homework");

        Clock firstClock = context.getBean(Clock.class);
        Thread.sleep(1000); // wait 1 second to ensure time difference
        Clock secondClock = context.getBean(Clock.class);
        Thread.sleep(1000);
        Clock thirdClock = context.getBean(Clock.class);

        LocalTime time1 = firstClock.getTime();
        LocalTime time2 = secondClock.getTime();
        LocalTime time3 = thirdClock.getTime();

        System.out.println("First:  " + time1);
        System.out.println("Second: " + time2);
        System.out.println("Third:  " + time3);

        Assertions.assertNotEquals(time1, time2);
        Assertions.assertNotEquals(time2, time3);
        Assertions.assertNotEquals(time1, time3);
    }
}
