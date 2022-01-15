package com.gridnine.testing.searchModule;

import com.gridnine.testing.testClasses.Flight;

import java.util.List;

public interface FlightFilter {
    List<Flight> getFilteredFlights(List<Flight> notFiltered);
}
