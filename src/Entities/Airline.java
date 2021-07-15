package Entities;


import java.util.List;

public class Airline {

    private String AirlineId;
    private String AirlineName;
    private List<Flight> flights;

    public Airline(String airlineName, List<Flight> flights) {
        AirlineId = airlineName;
        AirlineName = airlineName;
        this.flights = flights;
    }

    public String getAirlineId() {
        return AirlineId;
    }

    public void setAirlineId(String airlineId) {
        AirlineId = airlineId;
    }

    public String getAirlineName() {
        return AirlineName;
    }

    public void setAirlineName(String airlineName) {
        AirlineName = airlineName;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }
}
