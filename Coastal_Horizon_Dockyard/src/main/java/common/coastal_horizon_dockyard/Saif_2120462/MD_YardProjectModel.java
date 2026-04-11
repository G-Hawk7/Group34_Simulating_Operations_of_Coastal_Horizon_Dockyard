package common.coastal_horizon_dockyard.Saif_2120462;

public class MD_YardProjectModel {

    private int expansionIDColumn;
    private String areaNameColumn;
    private double estimatedCOstColumn;
    private String statusColumn;

    private String planTextArea;

    public MD_YardProjectModel(int expansionIDColumn, String areaNameColumn, double estimatedCOstColumn, String statusColumn, String planTextArea) {
        this.expansionIDColumn = expansionIDColumn;
        this.areaNameColumn = areaNameColumn;
        this.estimatedCOstColumn = estimatedCOstColumn;
        this.statusColumn = statusColumn;
        this.planTextArea = planTextArea;
    }

    public int getExpansionIDColumn() {
        return expansionIDColumn;
    }

    public void setExpansionIDColumn(int expansionIDColumn) {
        this.expansionIDColumn = expansionIDColumn;
    }

    public String getAreaNameColumn() {
        return areaNameColumn;
    }

    public void setAreaNameColumn(String areaNameColumn) {
        this.areaNameColumn = areaNameColumn;
    }

    public double getEstimatedCOstColumn() {
        return estimatedCOstColumn;
    }

    public void setEstimatedCOstColumn(double estimatedCOstColumn) {
        this.estimatedCOstColumn = estimatedCOstColumn;
    }

    public String getStatusColumn() {
        return statusColumn;
    }

    public void setStatusColumn(String statusColumn) {
        this.statusColumn = statusColumn;
    }

    public String getPlanTextArea() {
        return planTextArea;
    }

    public void setPlanTextArea(String planTextArea) {
        this.planTextArea = planTextArea;
    }

    @Override
    public String toString() {
        return "MD_YardProjectModel{" +
                "expansionIDColumn=" + expansionIDColumn +
                ", areaNameColumn='" + areaNameColumn + '\'' +
                ", estimatedCOstColumn=" + estimatedCOstColumn +
                ", statusColumn='" + statusColumn + '\'' +
                ", planTextArea='" + planTextArea + '\'' +
                '}';
    }
}
