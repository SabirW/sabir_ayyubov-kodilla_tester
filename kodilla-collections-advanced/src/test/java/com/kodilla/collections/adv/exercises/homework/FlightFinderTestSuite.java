package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {

    @Test
    public void testFindFlightsFrom() {
        List<Flight> flights = FlightRepository.getFlightsTable();
        FlightFinder flightFinder = new FlightFinder(flights);

        List<Flight> result = flightFinder.findFlightsFrom("Warsaw");
        assertEquals(2, result.size());
        assertEquals("Warsaw", result.get(0).getDeparture());
        assertEquals("Warsaw", result.get(1).getDeparture());
    }

    @Test
    public void testFindFlightsTo() {
        List<Flight> flights = FlightRepository.getFlightsTable();
        FlightFinder flightFinder = new FlightFinder(flights);

        List<Flight> result = flightFinder.findFlightsTo("New York");
        assertEquals(2, result.size());
        assertEquals("New York", result.get(0).getArrival());
        assertEquals("New York", result.get(1).getArrival());
    }

    @Test
    public void testFindFlightsFromNoResults() {
        List<Flight> flights = FlightRepository.getFlightsTable();
        FlightFinder flightFinder = new FlightFinder(flights);

        List<Flight> result = flightFinder.findFlightsFrom("Tokyo");
        assertEquals(0, result.size());
    }

    @Test
    public void testFindFlightsToNoResults() {
        List<Flight> flights = FlightRepository.getFlightsTable();
        FlightFinder flightFinder = new FlightFinder(flights);

        List<Flight> result = flightFinder.findFlightsTo("Tokyo");
        assertEquals(0, result.size());
    }
}