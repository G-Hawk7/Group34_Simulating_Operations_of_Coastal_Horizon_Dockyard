package common.coastal_horizon_dockyard.Saif_2120462;

public class MD_SafetyComplianceModel {

    private int incidentLogIDColumn;
    private String safetyReportsColumn;
    private String reportValidationColumn;
    private String summaryColumn;

    public MD_SafetyComplianceModel(int incidentLogIDColumn, String safetyReportsColumn, String reportValidationColumn, String summaryColumn) {
        this.incidentLogIDColumn = incidentLogIDColumn;
        this.safetyReportsColumn = safetyReportsColumn;
        this.reportValidationColumn = "";
        this.summaryColumn = "";
    }

    public int getIncidentLogIDColumn() {
        return incidentLogIDColumn;
    }

    public void setIncidentLogIDColumn(int incidentLogIDColumn) {
        this.incidentLogIDColumn = incidentLogIDColumn;
    }

    public String getSafetyReportsColumn() {
        return safetyReportsColumn;
    }

    public void setSafetyReportsColumn(String safetyReportsColumn) {
        this.safetyReportsColumn = safetyReportsColumn;
    }

    public String getReportValidationColumn() {
        return reportValidationColumn;
    }

    public void setReportValidationColumn(String reportValidationColumn) {
        this.reportValidationColumn = reportValidationColumn;
    }

    public String getSummaryColumn() {
        return summaryColumn;
    }

    public void setSummaryColumn(String summaryColumn) {
        this.summaryColumn = summaryColumn;
    }

    @Override
    public String toString() {
        return "MD_SafetyComplianceModel{" +
                "incidentLogIDColumn=" + incidentLogIDColumn +
                ", safetyReportsColumn='" + safetyReportsColumn + '\'' +
                ", reportValidationColumn='" + reportValidationColumn + '\'' +
                ", summaryColumn='" + summaryColumn + '\'' +
                '}';
    }
}
