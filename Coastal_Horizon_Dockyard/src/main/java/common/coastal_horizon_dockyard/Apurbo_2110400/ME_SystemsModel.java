package common.coastal_horizon_dockyard.Apurbo_2110400;

import java.time.LocalDate;

public class ME_SystemsModel {

    private String systemSelect, performanceStatus, approvedByEngineer, overallResult;
    private LocalDate testingDate;


    public ME_SystemsModel() {
    }

    public ME_SystemsModel(String systemSelect, String performanceStatus, String approvedByEngineer, String overallResult, LocalDate testingDate) {
        this.systemSelect = systemSelect;
        this.performanceStatus = performanceStatus;
        this.approvedByEngineer = approvedByEngineer;
        this.overallResult = overallResult;
        this.testingDate = testingDate;
    }


    public String getSystemSelect() {
        return systemSelect;
    }

    public void setSystemSelect(String systemSelect) {
        this.systemSelect = systemSelect;
    }

    public String getPerformanceStatus() {
        return performanceStatus;
    }

    public void setPerformanceStatus(String performanceStatus) {
        this.performanceStatus = performanceStatus;
    }

    public String getApprovedByEngineer() {
        return approvedByEngineer;
    }

    public void setApprovedByEngineer(String approvedByEngineer) {
        this.approvedByEngineer = approvedByEngineer;
    }

    public String getOverallResult() {
        return overallResult;
    }

    public void setOverallResult(String overallResult) {
        this.overallResult = overallResult;
    }

    public LocalDate getTestingDate() {
        return testingDate;
    }

    public void setTestingDate(LocalDate testingDate) {
        this.testingDate = testingDate;
    }


    @Override
    public String toString() {
        return "ME_SystemsModel{" +
                "systemSelect='" + systemSelect + '\'' +
                ", performanceStatus='" + performanceStatus + '\'' +
                ", approvedByEngineer='" + approvedByEngineer + '\'' +
                ", overallResult='" + overallResult + '\'' +
                ", testingDate=" + testingDate +
                '}';
    }
}
