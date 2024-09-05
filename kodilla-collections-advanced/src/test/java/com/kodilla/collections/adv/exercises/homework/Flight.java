package com.kodilla.collections.adv.exercises.homework;

import java.util.Objects;

public class Flight {
    private String flightNumber;
    private String departure;
    private String arrival;

    public Flight(String flightNumber, String departure, String arrival) {
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(flightNumber, flight.flightNumber) && Objects.equals(departure, flight.departure) && Objects.equals(arrival, flight.arrival);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightNumber, departure, arrival);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                '}';
    }
}
