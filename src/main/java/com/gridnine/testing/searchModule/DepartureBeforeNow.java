package com.gridnine.testing.searchModule;

import com.gridnine.testing.testClasses.Flight;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class DepartureBeforeNow implements FlightFilter {
    @Override
    public List<Flight> getFilteredFlights(List<Flight> notFiltered) {
        List<Flight> filtered = notFiltered.stream().
                filter(f -> {
                    long time = 0;
                    for (int i = 0; i < f.getSegments().size() - 1; i++) {
                        if (f.getSegments().get(i).getArrivalDate().isAfter(f.getSegments().get(i+1).getDepartureDate())) {
                            time = 0;
                        } else {
                            time = 1;
                        }
                    }
                    return time > 0;
                }).collect(Collectors.toList());
        return filtered;
    }
}
