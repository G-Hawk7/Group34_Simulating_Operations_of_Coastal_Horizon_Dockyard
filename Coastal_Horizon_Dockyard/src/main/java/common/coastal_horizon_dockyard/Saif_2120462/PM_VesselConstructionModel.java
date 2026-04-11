package common.coastal_horizon_dockyard.Saif_2120462;

public class PM_VesselConstructionModel {

    private int vesselIdColumn;
    private String shipNameColumn;
    private String timelineColumn;
    private String statusColumn;

    public PM_VesselConstructionModel(int vesselIdColumn, String shipNameColumn, String timelineColumn) {
        this.vesselIdColumn = vesselIdColumn;
        this.shipNameColumn = shipNameColumn;
        this.timelineColumn = timelineColumn;
        this.statusColumn = "";
    }


    public int getVesselIdColumn() {
        return vesselIdColumn;
    }

    public void setVesselIdColumn(int vesselIdColumn) {
        this.vesselIdColumn = vesselIdColumn;
    }

    public String getShipNameColumn() {
        return shipNameColumn;
    }

    public void setShipNameColumn(String shipNameColumn) {
        this.shipNameColumn = shipNameColumn;
    }

    public String getTimelineColumn() {
        return timelineColumn;
    }

    public void setTimelineColumn(String timelineColumn) {
        this.timelineColumn = timelineColumn;
    }

    public String getStatusColumn() {
        return statusColumn;
    }

    public void setStatusColumn(String statusColumn) {
        this.statusColumn = statusColumn;
    }

    @Override
    public String toString() {
        return "PM_VesselConstructionModel{" +
                "vesselIdColumn=" + vesselIdColumn +
                ", shipNameColumn='" + shipNameColumn + '\'' +
                ", timelineColumn='" + timelineColumn + '\'' +
                ", statusColumn='" + statusColumn + '\'' +
                '}';
    }
}
