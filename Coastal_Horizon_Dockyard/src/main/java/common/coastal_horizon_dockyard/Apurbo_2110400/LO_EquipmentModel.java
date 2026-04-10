package common.coastal_horizon_dockyard.Apurbo_2110400;

import java.time.LocalDate;

public class LO_EquipmentModel {
    private String equipmentName, quantity, conditionStatus, locations;
    private LocalDate acquisitionDate;

    public LO_EquipmentModel() {
    }

    public LO_EquipmentModel(String equipmentName, String quantity, String conditionStatus, String locations, LocalDate acquisitionDate) {
        this.equipmentName = equipmentName;
        this.quantity = quantity;
        this.conditionStatus = conditionStatus;
        this.locations = locations;
        this.acquisitionDate = acquisitionDate;
    }


    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getConditionStatus() {
        return conditionStatus;
    }

    public void setConditionStatus(String conditionStatus) {
        this.conditionStatus = conditionStatus;
    }

    public String getLocations() {
        return locations;
    }

    public void setLocations(String locations) {
        this.locations = locations;
    }

    public LocalDate getAcquisitionDate() {
        return acquisitionDate;
    }

    public void setAcquisitionDate(LocalDate acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
    }


    @Override
    public String toString() {
        return "LO_EquipmentModel{" +
                "equipmentName='" + equipmentName + '\'' +
                ", quantity='" + quantity + '\'' +
                ", conditionStatus='" + conditionStatus + '\'' +
                ", locations='" + locations + '\'' +
                ", acquisitionDate=" + acquisitionDate +
                '}';
    }
}
