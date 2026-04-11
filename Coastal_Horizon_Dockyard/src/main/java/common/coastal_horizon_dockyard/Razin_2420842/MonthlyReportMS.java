package common.coastal_horizon_dockyard.Razin_2420842;

public class MonthlyReportMS {
    private String month;
    private String reportDetails;

    public MonthlyReportMS(String month, String reportDetails) {
        this.month = month;
        this.reportDetails = reportDetails;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getReportDetails() {
        return reportDetails;
    }

    public void setReportDetails(String reportDetails) {
        this.reportDetails = reportDetails;
    }

    @Override
    public String toString() {
        return "MonthlyReportMS{" +
                "month='" + month + '\'' +
                ", reportDetails='" + reportDetails + '\'' +
                '}';
    }
}
