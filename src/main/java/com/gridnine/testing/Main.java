package com.gridnine.testing;

import com.gridnine.testing.searchModule.ArriveBeforeDeparture;
import com.gridnine.testing.searchModule.DepartureBeforeNow;
import com.gridnine.testing.searchModule.WaitingMoreThanTwoHours;
import com.gridnine.testing.testClasses.FlightBuilder;

public class Main {
    public static void main(String[] args) {
        System.out.println(FlightBuilder.createFlights());
        System.out.println();

        System.out.println(new ArriveBeforeDeparture().getFilteredFlights(FlightBuilder.createFlights()));
        System.out.println();
        System.out.println(new DepartureBeforeNow().getFilteredFlights(FlightBuilder.createFlights()));
        System.out.println();
        System.out.println(new WaitingMoreThanTwoHours().getFilteredFlights(FlightBuilder.createFlights()));

    }
}
