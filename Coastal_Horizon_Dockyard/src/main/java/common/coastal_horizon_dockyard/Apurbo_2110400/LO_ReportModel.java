package common.coastal_horizon_dockyard.Apurbo_2110400;

import java.time.LocalDate;

public class LO_ReportModel {

    private String logisticsOfficerName, reportType, reportStatus, reportSummary;
    private LocalDate reportDate;

    public LO_ReportModel() {
    }

    public LO_ReportModel(String logisticsOfficerName, String reportType, String reportStatus, String reportSummary, LocalDate reportDate) {
        this.logisticsOfficerName = logisticsOfficerName;
        this.reportType = reportType;
        this.reportStatus = reportStatus;
        this.reportSummary = reportSummary;
        this.reportDate = reportDate;
    }


    public String getLogisticsOfficerName() {
        return logisticsOfficerName;
    }

    public void setLogisticsOfficerName(String logisticsOfficerName) {
        this.logisticsOfficerName = logisticsOfficerName;
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
        return "LO_ReportModel{" +
                "logisticsOfficerName='" + logisticsOfficerName + '\'' +
                ", reportType='" + reportType + '\'' +
                ", reportStatus='" + reportStatus + '\'' +
                ", reportSummary='" + reportSummary + '\'' +
                ", reportDate=" + reportDate +
                '}';
    }
}

