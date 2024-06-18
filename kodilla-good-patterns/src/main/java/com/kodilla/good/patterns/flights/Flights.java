package com.kodilla.good.patterns.flights;

import java.util.*;

public class Flights {

    public HashSet<Flight> flightsList() {
        HashSet<Flight> flights = new HashSet<>();
        flights.add(new Flight("London", "Paris"));
        flights.add(new Flight("New York", "London"));
        flights.add(new Flight("New York", "Berlin"));
        flights.add(new Flight("Berlin", "Madrid"));
        flights.add(new Flight("Madrid", "Paris"));
        flights.add(new Flight("New York", "Paris"));
        flights.add(new Flight("New York", "Warsaw"));
        flights.add(new Flight("Warsaw", "Paris"));
        flights.add(new Flight("New York", "Paris"));
        flights.add(new Flight("New York", "Warsaw"));
        flights.add(new Flight("New York", "Paris"));
        return flights;
    }

}
