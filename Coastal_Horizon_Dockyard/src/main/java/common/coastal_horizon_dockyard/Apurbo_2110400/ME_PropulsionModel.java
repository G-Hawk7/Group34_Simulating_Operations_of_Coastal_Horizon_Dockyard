package common.coastal_horizon_dockyard.Apurbo_2110400;

import java.time.LocalDate;

public class ME_PropulsionModel {

    private String ship, engine, conditionStatus, remarks;
    private LocalDate inspectionDate;


    public ME_PropulsionModel() {
    }


    public ME_PropulsionModel(String ship, String engine, String conditionStatus, String remarks, LocalDate inspectionDate) {
        this.ship = ship;
        this.engine = engine;
        this.conditionStatus = conditionStatus;
        this.remarks = remarks;
        this.inspectionDate = inspectionDate;
    }


    public String getShip() {
        return ship;
    }

    public void setShip(String ship) {
        this.ship = ship;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getConditionStatus() {
        return conditionStatus;
    }

    public void setConditionStatus(String conditionStatus) {
        this.conditionStatus = conditionStatus;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public LocalDate getInspectionDate() {
        return inspectionDate;
    }

    public void setInspectionDate(LocalDate inspectionDate) {
        this.inspectionDate = inspectionDate;
    }


    @Override
    public String toString() {
        return "MarineEngineerPropulsionInspectionModel{" +
                "ship='" + ship + '\'' +
                ", engine='" + engine + '\'' +
                ", conditionStatus='" + conditionStatus + '\'' +
                ", remarks='" + remarks + '\'' +
                ", inspectionDate=" + inspectionDate +
                '}';
    }
}
