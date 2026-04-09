package common.coastal_horizon_dockyard.Apurbo_2110400;

import java.time.LocalDate;

public class ME_MaintenanceModel {

    private String ship, maintenanceType, scheduledForMaintenance, priority;
    private LocalDate maintenanceDate;

    public ME_MaintenanceModel() {
    }

    public ME_MaintenanceModel(String ship, String maintenanceType, String scheduledForMaintenance, String priority, LocalDate maintenanceDate) {
        this.ship = ship;
        this.maintenanceType = maintenanceType;
        this.scheduledForMaintenance = scheduledForMaintenance;
        this.priority = priority;
        this.maintenanceDate = maintenanceDate;
    }


    public String getShip() {
        return ship;
    }

    public void setShip(String ship) {
        this.ship = ship;
    }

    public String getMaintenanceType() {
        return maintenanceType;
    }

    public void setMaintenanceType(String maintenanceType) {
        this.maintenanceType = maintenanceType;
    }

    public String getScheduledForMaintenance() {
        return scheduledForMaintenance;
    }

    public void setScheduledForMaintenance(String scheduledForMaintenance) {
        this.scheduledForMaintenance = scheduledForMaintenance;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public LocalDate getMaintenanceDate() {
        return maintenanceDate;
    }

    public void setMaintenanceDate(LocalDate maintenanceDate) {
        this.maintenanceDate = maintenanceDate;
    }


    @Override
    public String toString() {
        return "ME_MaintenanceModel{" +
                "ship='" + ship + '\'' +
                ", maintenanceType='" + maintenanceType + '\'' +
                ", scheduledForMaintenance='" + scheduledForMaintenance + '\'' +
                ", priority='" + priority + '\'' +
                ", maintenanceDate=" + maintenanceDate +
                '}';
    }
}
