package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {
    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> result = new ArrayList<>();
        for (Flight flight : FlightRepository.findFlightsTable()) {
            if (flight.getDeparture().equals(departure)) {
                result.add(flight);
            }
        }
        return result;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> result = new ArrayList<>();
        for (Flight flight : FlightRepository.findFlightsTable()) {
            if (flight.getArrival().equals(arrival)) {
                result.add(flight);
            }
        }
        return result;
    }

//    public static void main(String[] args) {
//        FlightFinder finder = new FlightFinder();
//        List<Flight> flightsToBCN = finder.findFlightsTo("BCN");
//
//        for (Flight flight : flightsToBCN) {
//            System.out.println(flight.getFlightNumber() + " " + flight.getDeparture() + "->" + flight.getArrival());
//        }
//    }
}
