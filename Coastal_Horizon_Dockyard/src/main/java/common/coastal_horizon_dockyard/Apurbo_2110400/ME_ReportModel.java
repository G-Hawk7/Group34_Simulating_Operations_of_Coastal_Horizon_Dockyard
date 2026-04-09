package common.coastal_horizon_dockyard.Apurbo_2110400;

import java.time.LocalDate;

public class ME_ReportModel {

    private String engineerName, reportType, reportStatus, reportSummary;
    private LocalDate reportDate;

    public ME_ReportModel() {
    }

    public ME_ReportModel(String engineerName, String reportType, String reportStatus, String reportSummary, LocalDate reportDate) {
        this.engineerName = engineerName;
        this.reportType = reportType;
        this.reportStatus = reportStatus;
        this.reportSummary = reportSummary;
        this.reportDate = reportDate;
    }


    public String getEngineerName() {
        return engineerName;
    }

    public void setEngineerName(String engineerName) {
        this.engineerName = engineerName;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(String reportStatus) {
        this.reportStatus = reportStatus;
    }

    public String getReportSummary() {
        return reportSummary;
    }

    public void setReportSummary(String reportSummary) {
        this.reportSummary = reportSummary;
    }

    public LocalDate getReportDate() {
        return reportDate;
    }

    public void setReportDate(LocalDate reportDate) {
        this.reportDate = reportDate;
    }


    @Override
    public String toString() {
        return "ME_ReportModel{" +
                "engineerName='" + engineerName + '\'' +
                ", reportType='" + reportType + '\'' +
                ", reportStatus='" + reportStatus + '\'' +
                ", reportSummary='" + reportSummary + '\'' +
                ", reportDate=" + reportDate +
                '}';
    }
}
