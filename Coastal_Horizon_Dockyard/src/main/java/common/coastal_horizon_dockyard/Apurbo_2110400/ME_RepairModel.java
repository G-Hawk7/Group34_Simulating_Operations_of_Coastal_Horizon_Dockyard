package common.coastal_horizon_dockyard.Apurbo_2110400;

import java.time.LocalDate;

public class ME_RepairModel {

    private String jobID, status, engineer, workSummary;
    private LocalDate deadline;

    public ME_RepairModel() {
    }

    public ME_RepairModel(String jobID, String status, String engineer, String workSummary, LocalDate deadline) {
        this.jobID = jobID;
        this.status = status;
        this.engineer = engineer;
        this.workSummary = workSummary;
        this.deadline = deadline;
    }


    public String getJobID() {
        return jobID;
    }

    public void setJobID(String jobID) {
        this.jobID = jobID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEngineer() {
        return engineer;
    }

    public void setEngineer(String engineer) {
        this.engineer = engineer;
    }

    public String getWorkSummary() {
        return workSummary;
    }

    public void setWorkSummary(String workSummary) {
        this.workSummary = workSummary;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }


    @Override
    public String toString() {
        return "ME_RepairModel{" +
                "jobID='" + jobID + '\'' +
                ", status='" + status + '\'' +
                ", engineer='" + engineer + '\'' +
                ", workSummary='" + workSummary + '\'' +
                ", deadline=" + deadline +
                '}';
    }
}
