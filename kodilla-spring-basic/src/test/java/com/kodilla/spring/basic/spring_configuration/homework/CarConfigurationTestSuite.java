package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CarConfigurationTestSuite {

    private CarConfiguration carConfiguration;

    @BeforeEach
    void setUp() {
        carConfiguration = new CarConfiguration();
    }

    @Test
    public void shouldReturnSUVInWinter() {
        Car car = carConfiguration.carBySeason(LocalDate.of(2023, Month.DECEMBER, 1), LocalTime.of(14, 0));
        assertTrue(car instanceof SUV);
        assertFalse(car.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldReturnCabrioInSummer() {
        Car car = carConfiguration.carBySeason(LocalDate.of(2023, Month.JULY, 1), LocalTime.of(14, 0));
        assertTrue(car instanceof Cabrio);
        assertFalse(car.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldReturnSedanInSpringOrAutumn() {
        Car car = carConfiguration.carBySeason(LocalDate.of(2023, Month.APRIL, 1), LocalTime.of(14, 0));
        assertTrue(car instanceof Sedan);
        assertFalse(car.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldTurnOnHeadlightsInTheEvening() {
        Car car = carConfiguration.carBySeason(LocalDate.of(2023, Month.AUGUST, 1), LocalTime.of(21, 0));
        assertTrue(car.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldTurnOffHeadlightsDuringTheDay() {
        Car car = carConfiguration.carBySeason(LocalDate.of(2023, Month.MAY, 1), LocalTime.of(14, 0));
        assertFalse(car.hasHeadlightsTurnedOn());
    }
}
