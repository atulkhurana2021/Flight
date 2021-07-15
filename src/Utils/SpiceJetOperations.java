package Utils;

import Entities.Flight;
import Entities.Status;

import java.util.Date;
import java.util.List;

public class SpiceJetOperations implements AirlineOperations{
    @Override
    public Flight getCheapestFlight(String originAirport, String destinationAirport) {
        return new Flight("ABC","DEF",new Date(),60l, Status.ONTIME,100.0); //queries database to get chepaest

    }
}
