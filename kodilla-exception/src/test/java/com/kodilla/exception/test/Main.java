package com.kodilla.exception.test;

public class Main {

    public static void main(String[] args)  {

        FlightSearch flightSearch = new FlightSearch();
        Flight flight = new Flight("Poland", "Praga");

        try {
            flightSearch.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("!!Attention Please!! \n" + e.getMessage());
        }finally {
        System.out.println("Route searching process has been Done!!");
    }
}

}
