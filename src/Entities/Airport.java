package Entities;

public class Airport {

    private String airport;
    private String airportId;


    public Airport(String airport) {
        this.airport = airport;
        this.airportId = airport;
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public String getAirportId() {
        return airportId;
    }

    public void setAirportId(String airportId) {
        this.airportId = airportId;
    }
}
