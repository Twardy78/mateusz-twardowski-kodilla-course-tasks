package com.kodilla.good.patterns.flights;

import java.util.*;
import java.util.stream.Collectors;

public class ConnectionSearchProcess {

    public void searchFlightByDeparture(String departure) {
        Flights flightsList = new Flights();

        flightsList.flightsList().stream()
                .filter(flight ->flight.getDeparture().equals(departure))
                .forEach(System.out::println);
    }

    public void searchFlightByArrival(String arrival) {
        Flights flightsList = new Flights();

        flightsList.flightsList().stream()
                .filter(flight ->flight.getArrival().equals(arrival))
                .forEach(System.out::println);
    }
    public void searchConnectingFlights(String departure, String arrival) {
        Flights flightsList = new Flights();

        List<Flight> deparutreList = flightsList.flightsList().stream()
                .filter(flight ->flight.getDeparture().equals(departure))
                .collect(Collectors.toList());

        List<Flight> arrivalList = flightsList.flightsList().stream()
                .filter(flight -> flight.getArrival().equals(arrival))
                .collect(Collectors.toList());

        int n = 1;
        for (Flight departureConnection : deparutreList) {
            for (Flight arrivalConnection : arrivalList) {
                if(departureConnection.getArrival().equals(arrivalConnection.getDeparture())){
                    System.out.println("Connection#" + n);
                    System.out.println(departureConnection + "\n" + arrivalConnection);
                    n++;
                }
            }
        }
    }
}
