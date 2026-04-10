package common.coastal_horizon_dockyard.Apurbo_2110400;

import java.time.LocalDate;

public class LO_ShipmentModel {

    private String shipmentID, shipmentStatus, deliveryProgress, shipmentHistory;
    private LocalDate deliveryDate;

    public LO_ShipmentModel() {
    }

    public LO_ShipmentModel(String shipmentID, String shipmentStatus, String deliveryProgress, String shipmentHistory, LocalDate deliveryDate) {
        this.shipmentID = shipmentID;
        this.shipmentStatus = shipmentStatus;
        this.deliveryProgress = deliveryProgress;
        this.shipmentHistory = shipmentHistory;
        this.deliveryDate = deliveryDate;
    }


    public String getShipmentID() {
        return shipmentID;
    }

    public void setShipmentID(String shipmentID) {
        this.shipmentID = shipmentID;
    }

    public String getShipmentStatus() {
        return shipmentStatus;
    }

    public void setShipmentStatus(String shipmentStatus) {
        this.shipmentStatus = shipmentStatus;
    }

    public String getDeliveryProgress() {
        return deliveryProgress;
    }

    public void setDeliveryProgress(String deliveryProgress) {
        this.deliveryProgress = deliveryProgress;
    }

    public String getShipmentHistory() {
        return shipmentHistory;
    }

    public void setShipmentHistory(String shipmentHistory) {
        this.shipmentHistory = shipmentHistory;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }


    @Override
    public String toString() {
        return "LO_ShipmentModel{" +
                "shipmentID='" + shipmentID + '\'' +
                ", shipmentStatus='" + shipmentStatus + '\'' +
                ", deliveryProgress='" + deliveryProgress + '\'' +
                ", shipmentHistory='" + shipmentHistory + '\'' +
                ", deliveryDate=" + deliveryDate +
                '}';
    }
}
