package com.kodilla.good.patterns.flights;

public class Application {

    public static void main(String[] args) {
        ConnectionSearchProcess connectionSearchProcess = new ConnectionSearchProcess();
        String departureCity = "New York";
        String arrivalCity = "Paris";

        System.out.println("Available connection from : " + departureCity);
        connectionSearchProcess.searchFlightByDeparture(departureCity);
        System.out.println();
        System.out.println("Available connection to : " + arrivalCity);
        connectionSearchProcess.searchFlightByArrival(arrivalCity);
        System.out.println();
        System.out.println("Available connecting flights from " + departureCity + " to " + arrivalCity + " are below");
        connectionSearchProcess.searchConnectingFlights(departureCity, arrivalCity);
    }
}
