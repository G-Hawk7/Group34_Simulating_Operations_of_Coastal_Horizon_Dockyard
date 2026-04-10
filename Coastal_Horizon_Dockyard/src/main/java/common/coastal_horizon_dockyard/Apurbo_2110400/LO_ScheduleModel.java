package common.coastal_horizon_dockyard.Apurbo_2110400;

import java.time.LocalDate;

public class LO_ScheduleModel {

    private String ship, dockNumber, pierNumber;
    private LocalDate arrivalDate, departureDate;

    public LO_ScheduleModel() {
    }

    public LO_ScheduleModel(String ship, String dockNumber, String pierNumber, LocalDate arrivalDate, LocalDate departureDate) {
        this.ship = ship;
        this.dockNumber = dockNumber;
        this.pierNumber = pierNumber;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
    }


    public String getShip() {
        return ship;
    }

    public void setShip(String ship) {
        this.ship = ship;
    }

    public String getDockNumber() {
        return dockNumber;
    }

    public void setDockNumber(String dockNumber) {
        this.dockNumber = dockNumber;
    }

    public String getPierNumber() {
        return pierNumber;
    }

    public void setPierNumber(String pierNumber) {
        this.pierNumber = pierNumber;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }


    @Override
    public String toString() {
        return "LO_ScheduleModel{" +
                "ship='" + ship + '\'' +
                ", dockNumber='" + dockNumber + '\'' +
                ", pierNumber='" + pierNumber + '\'' +
                ", arrivalDate=" + arrivalDate +
                ", departureDate=" + departureDate +
                '}';
    }
}
