package common.coastal_horizon_dockyard.Saif_2120462;

public class MD_DeptHeadManagementModel {

    private int deptHeadIDColumn;
    private String deptHeadNameColumn;
    private String emailColumn;
    private String qualificationColumn;
    private String appointmentStatusColumn;

    public MD_DeptHeadManagementModel(int deptHeadIDColumn, String deptHeadNameColumn, String emailColumn, String qualificationColumn, String appointmentStatusColumn) {
        this.deptHeadIDColumn = deptHeadIDColumn;
        this.deptHeadNameColumn = deptHeadNameColumn;
        this.emailColumn = emailColumn;
        this.qualificationColumn = qualificationColumn;
        this.appointmentStatusColumn = "Pending";
    }

    public int getDeptHeadIDColumn() {
        return deptHeadIDColumn;
    }

    public void setDeptHeadIDColumn(int deptHeadIDColumn) {
        this.deptHeadIDColumn = deptHeadIDColumn;
    }

    public String getDeptHeadNameColumn() {
        return deptHeadNameColumn;
    }

    public void setDeptHeadNameColumn(String deptHeadNameColumn) {
        this.deptHeadNameColumn = deptHeadNameColumn;
    }

    public String getEmailColumn() {
        return emailColumn;
    }

    public void setEmailColumn(String emailColumn) {
        this.emailColumn = emailColumn;
    }

    public String getQualificationColumn() {
        return qualificationColumn;
    }

    public void setQualificationColumn(String qualificationColumn) {
        this.qualificationColumn = qualificationColumn;
    }

    public String getAppointmentStatusColumn() {
        return appointmentStatusColumn;
    }

    public void setAppointmentStatusColumn(String appointmentStatusColumn) {
        this.appointmentStatusColumn = appointmentStatusColumn;
    }

    @Override
    public String toString() {
        return "MD_DeptHeadManagementModel{" +
                "deptHeadIDColumn=" + deptHeadIDColumn +
                ", deptHeadNameColumn='" + deptHeadNameColumn + '\'' +
                ", emailColumn='" + emailColumn + '\'' +
                ", qualificationColumn='" + qualificationColumn + '\'' +
                ", appointmentStatusColumn='" + appointmentStatusColumn + '\'' +
                '}';
    }
}
