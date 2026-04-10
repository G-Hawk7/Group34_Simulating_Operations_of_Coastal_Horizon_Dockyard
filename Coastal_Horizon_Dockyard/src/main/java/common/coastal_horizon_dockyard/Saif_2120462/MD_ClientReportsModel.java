package common.coastal_horizon_dockyard.Saif_2120462;

public class MD_ClientReportsModel {

    private int disputeIDColumn;
    private String clientNameColumn;
    private String projectNameColumn;
    private String statusColumn;

    private String projectLogsTextArea;

    public MD_ClientReportsModel(int disputeIDColumn, String clientNameColumn, String projectNameColumn, String statusColumn, String projectLogsTextArea) {
        this.disputeIDColumn = disputeIDColumn;
        this.clientNameColumn = clientNameColumn;
        this.projectNameColumn = projectNameColumn;
        this.statusColumn = statusColumn;
        this.projectLogsTextArea = projectLogsTextArea;
    }

    public int getDisputeIDColumn() {
        return disputeIDColumn;
    }

    public void setDisputeIDColumn(int disputeIDColumn) {
        this.disputeIDColumn = disputeIDColumn;
    }

    public String getClientNameColumn() {
        return clientNameColumn;
    }

    public void setClientNameColumn(String clientNameColumn) {
        this.clientNameColumn = clientNameColumn;
    }

    public String getProjectNameColumn() {
        return projectNameColumn;
    }

    public void setProjectNameColumn(String projectNameColumn) {
        this.projectNameColumn = projectNameColumn;
    }

    public String getStatusColumn() {
        return statusColumn;
    }

    public void setStatusColumn(String statusColumn) {
        this.statusColumn = statusColumn;
    }

    public String getProjectLogsTextArea() {
        return projectLogsTextArea;
    }

    public void setProjectLogsTextArea(String projectLogsTextArea) {
        this.projectLogsTextArea = projectLogsTextArea;
    }

    @Override
    public String toString() {
        return "MD_ClientReportsModel{" +
                "disputeIDColumn=" + disputeIDColumn +
                ", clientNameColumn='" + clientNameColumn + '\'' +
                ", projectNameColumn='" + projectNameColumn + '\'' +
                ", statusColumn='" + statusColumn + '\'' +
                ", projectLogsTextArea='" + projectLogsTextArea + '\'' +
                '}';
    }
}
