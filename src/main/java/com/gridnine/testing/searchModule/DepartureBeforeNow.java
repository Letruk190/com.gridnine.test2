package com.gridnine.testing.searchModule;

import com.gridnine.testing.testClasses.Flight;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class DepartureBeforeNow implements FlightFilter {
    @Override
    public List<Flight> getFilteredFlights(List<Flight> notFiltered) {
        List<Flight> filtered = notFiltered.stream()
                .filter(f->f.getSegments().get(0).getDepartureDate().isBefore(LocalDateTime.now()))
                .collect(Collectors.toList());
        return filtered;
    }
}

