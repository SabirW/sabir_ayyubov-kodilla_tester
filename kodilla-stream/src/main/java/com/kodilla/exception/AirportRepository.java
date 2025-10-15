package com.kodilla.exception;

import java.util.HashMap;
import java.util.Map;

public class AirportRepository {
    private Map<String, Boolean> getListOfAirports() {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Miami", Boolean.TRUE);
        airports.put("Malta", Boolean.TRUE);
        airports.put("LasPalmas", Boolean.FALSE);
        airports.put("Warsaw", Boolean.TRUE);
        return airports;
    }

    public boolean isAirportInUse(String airport) throws AirportNotFoundException {
        if (getListOfAirports().containsKey(airport))
            return getListOfAirports().get(airport);
        throw new AirportNotFoundException();
    }
}
