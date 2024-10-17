package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@Scope("prototype")
public class Clock {
    private LocalTime now;

    public Clock() {
        this.now = LocalTime.now();
        System.out.println("Time: " + now);
    }

    public LocalTime getTime() {
        return now;
    }
}
