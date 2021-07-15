package Entities;

public class FlightSeating {

    private String flightId;
    private Integer seating[][] ;
    private Integer currAvailability;

    public FlightSeating(String flightId, Integer[][] seating, Integer currAvailability) {
        this.flightId = flightId;
        this.seating = seating;
        this.currAvailability = currAvailability;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public Integer[][] getSeating() {
        return seating;
    }

    public void setSeating(Integer[][] seating) {
        this.seating = seating;
    }

    public Integer getCurrAvailability() {
        return currAvailability;
    }

    public void setCurrAvailability(Integer currAvailability) {
        this.currAvailability = currAvailability;
    }
}
