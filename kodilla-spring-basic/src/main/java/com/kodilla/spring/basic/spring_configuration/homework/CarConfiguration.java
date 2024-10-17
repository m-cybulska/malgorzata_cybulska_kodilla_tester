package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

@Configuration
public class CarConfiguration {

    @Bean
    public Car carBySeason() {
        return carBySeason(LocalDate.now(), LocalTime.now());
    }

    public Car carBySeason(LocalDate date, LocalTime time) {
        Month currentMonth = date.getMonth();
        Car car;

        if (currentMonth == Month.DECEMBER || currentMonth == Month.JANUARY || currentMonth == Month.FEBRUARY) {
            car = new SUV();
        } else if (currentMonth == Month.JUNE || currentMonth == Month.JULY || currentMonth == Month.AUGUST) {
            car = new Cabrio();
        } else {
            car = new Sedan();
        }

        boolean headlightsOn = shouldTurnOnHeadlights(time);
        car.setHeadlightsOn(headlightsOn);

        return car;
    }

    private boolean shouldTurnOnHeadlights(LocalTime now) {
        return now.isAfter(LocalTime.of(20, 0)) || now.isBefore(LocalTime.of(6, 0));
    }
}