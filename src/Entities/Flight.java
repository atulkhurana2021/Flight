package Entities;

import java.util.Date;

public class Flight {

    private String flightId;
    private String originId;
    private String destinationId;
    private Date startDate;
    private Long flightDuration;
    private Status flightStatus;
    private Double price;

    public Flight(String originId, String destinationId, Date startDate, Long flightDuration, Status flightStatus, Double price) {
        this.flightId = originId + destinationId;
        this.originId = originId;
        this.destinationId = destinationId;
        this.startDate = startDate;
        this.flightDuration = flightDuration;
        this.flightStatus = flightStatus;
        this.price = price;
    }

    public String getOriginId() {
        return originId;
    }

    public void setOriginId(String originId) {
        this.originId = originId;
    }

    public String getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Long getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(Long flightDuration) {
        this.flightDuration = flightDuration;
    }

    public Status getFlightStatus() {
        return flightStatus;
    }

    public void setFlightStatus(Status flightStatus) {
        this.flightStatus = flightStatus;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightId='" + flightId + '\'' +
                ", originId='" + originId + '\'' +
                ", destinationId='" + destinationId + '\'' +
                ", startDate=" + startDate +
                ", flightDuration=" + flightDuration +
                ", flightStatus=" + flightStatus +
                ", price=" + price +
                '}';
    }
}
