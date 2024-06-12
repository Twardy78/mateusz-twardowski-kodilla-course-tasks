package com.kodilla.exception.test;

import java.util.*;

public class FlightSearch {

    public void findFlight(Flight flight) throws RouteNotFoundException{
        boolean routeFound = false;

        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Paris", true);
        flights.put("San Francisco", true);
        flights.put("Brussels", false);
        flights.put("Berlin", true);
        flights.put("London", false);
        flights.put("New York", true);



        for (Map.Entry<String, Boolean> entry : flights.entrySet()) {
            if (entry.getKey().equals(flight.getArrivalAirport())) {
                System.out.println(entry.getKey() + " " + entry.getValue());
                routeFound = true;
                break;
            }
        }

        if (!routeFound)
            throw new RouteNotFoundException("Route not found");
    }
}

