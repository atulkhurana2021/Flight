package Utils;

import Entities.Flight;

import java.util.List;

public interface AirlineOperations {

        public Flight getCheapestFlight(String originAirport,String destinationAirport);
}
