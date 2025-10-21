package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@Scope("prototype")  // ensures a new bean for each request
public class Clock {

    private LocalTime time;

    public Clock() {
        this.time = LocalTime.now();
        System.out.println("Creating new Clock bean at: " + time);
    }

    public LocalTime getTime() {
        return time;
    }
}
