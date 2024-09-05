package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> findFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("AA2730", "WAW", "BCN"));
        flights.add(new Flight("BA1594", "WRO", "CHQ"));
        flights.add(new Flight("B62498", "JFK", "LAX"));
        flights.add(new Flight("BA1637", "WAW", "RHO"));
        flights.add(new Flight("AA7653", "WRO", "BCN"));

        return flights;
    }
}
