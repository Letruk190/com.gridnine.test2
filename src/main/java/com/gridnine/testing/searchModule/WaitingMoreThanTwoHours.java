package com.gridnine.testing.searchModule;

import com.gridnine.testing.testClasses.Flight;

import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;

public class WaitingMoreThanTwoHours implements FlightFilter {
    @Override
    public List<Flight> getFilteredFlights(List<Flight> notFiltered) {
        List<Flight> filtered = notFiltered.stream()
                .filter(f -> {
                    long time = 0;
                    for (int i = 0; i < f.getSegments().size() - 1; i++) {
                        time = f.getSegments().get(i).getArrivalDate().until(f.getSegments().get(i + 1).getDepartureDate(), ChronoUnit.HOURS);

                    }
                    return time <= 2;
                }).collect(Collectors.toList());
        return filtered;
    }
}
