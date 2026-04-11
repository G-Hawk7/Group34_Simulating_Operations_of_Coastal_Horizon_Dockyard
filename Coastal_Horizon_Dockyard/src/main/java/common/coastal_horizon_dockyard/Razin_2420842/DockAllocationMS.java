package common.coastal_horizon_dockyard.Razin_2420842;

public class DockAllocationMS {
    private String shipID;
    private String size;
    private String arrivalDate;
    private String dock;

    public DockAllocationMS(String shipID, String size, String arrivalDate, String dock) {
        this.shipID = shipID;
        this.size = size;
        this.arrivalDate = arrivalDate;
        this.dock = dock;
    }

    public String getShipID() {
        return shipID;
    }

    public void setShipID(String shipID) {
        this.shipID = shipID;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getDock() {
        return dock;
    }

    public void setDock(String dock) {
        this.dock = dock;
    }

    @Override
    public String toString() {
        return "DockAllocationMS{" +
                "shipID='" + shipID + '\'' +
                ", size='" + size + '\'' +
                ", arrivalDate='" + arrivalDate + '\'' +
                ", dock='" + dock + '\'' +
                '}';
    }
}
