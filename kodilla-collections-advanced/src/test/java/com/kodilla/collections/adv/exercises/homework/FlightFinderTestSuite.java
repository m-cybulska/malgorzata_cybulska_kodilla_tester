package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightFinderTestSuite {

    @Test
    public void shouldFindFlightsFrom() {

        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result = flightFinder.findFlightsFrom("WRO");

        List<Flight> expectedResult = new ArrayList<>();
        expectedResult.add(new Flight("BA1594", "WRO", "CHQ"));
        expectedResult.add(new Flight("AA7653", "WRO", "BCN"));

        assertEquals(expectedResult, result);
    }

    @Test
    public void shouldFindFlightsTo() {

        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result = flightFinder.findFlightsTo("BCN");

        List<Flight> expectedResult = new ArrayList<>();
        expectedResult.add(new Flight("AA2730", "WAW", "BCN"));
        expectedResult.add(new Flight("AA7653", "WRO", "BCN"));


        assertEquals(expectedResult, result);
    }
}
