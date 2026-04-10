package common.coastal_horizon_dockyard.Apurbo_2110400;

import java.time.LocalDate;

public class LO_OperationsModel {

    private String shipName, activeDockingJobs, cargoUsed, overview;
    private LocalDate arrivalDockingDate;

    public LO_OperationsModel() {
    }

    public LO_OperationsModel(String shipName, String activeDockingJobs, String cargoUsed, String overview, LocalDate arrivalDockingDate) {
        this.shipName = shipName;
        this.activeDockingJobs = activeDockingJobs;
        this.cargoUsed = cargoUsed;
        this.overview = overview;
        this.arrivalDockingDate = arrivalDockingDate;
    }


    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getActiveDockingJobs() {
        return activeDockingJobs;
    }

    public void setActiveDockingJobs(String activeDockingJobs) {
        this.activeDockingJobs = activeDockingJobs;
    }

    public String getCargoUsed() {
        return cargoUsed;
    }

    public void setCargoUsed(String cargoUsed) {
        this.cargoUsed = cargoUsed;
    }

    public LocalDate getArrivalDockingDate() {
        return arrivalDockingDate;
    }

    public void setArrivalDockingDate(LocalDate arrivalDockingDate) {
        this.arrivalDockingDate = arrivalDockingDate;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }


    @Override
    public String toString() {
        return "LO_OperationsModel{" +
                "shipName='" + shipName + '\'' +
                ", activeDockingJobs='" + activeDockingJobs + '\'' +
                ", cargoUsed='" + cargoUsed + '\'' +
                ", overview='" + overview + '\'' +
                ", arrivalDockingDate=" + arrivalDockingDate +
                '}';
    }
}
