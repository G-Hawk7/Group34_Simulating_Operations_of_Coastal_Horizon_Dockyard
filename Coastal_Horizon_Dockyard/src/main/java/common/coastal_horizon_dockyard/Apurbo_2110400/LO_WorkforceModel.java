package common.coastal_horizon_dockyard.Apurbo_2110400;

public class LO_WorkforceModel {

    private String workerID, workerName, workerCategory, workShift, workerDetails;

    public LO_WorkforceModel() {
    }

    public LO_WorkforceModel(String workerID, String workerName, String workerCategory, String workShift, String workerDetails) {
        this.workerID = workerID;
        this.workerName = workerName;
        this.workerCategory = workerCategory;
        this.workShift = workShift;
        this.workerDetails = workerDetails;
    }


    public String getWorkerID() {
        return workerID;
    }

    public void setWorkerID(String workerID) {
        this.workerID = workerID;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getWorkerCategory() {
        return workerCategory;
    }

    public void setWorkerCategory(String workerCategory) {
        this.workerCategory = workerCategory;
    }

    public String getWorkShift() {
        return workShift;
    }

    public void setWorkShift(String workShift) {
        this.workShift = workShift;
    }

    public String getWorkerDetails() {
        return workerDetails;
    }

    public void setWorkerDetails(String workerDetails) {
        this.workerDetails = workerDetails;
    }


    @Override
    public String toString() {
        return "LO_WorkforceModel{" +
                "workerID='" + workerID + '\'' +
                ", workerName='" + workerName + '\'' +
                ", workerCategory='" + workerCategory + '\'' +
                ", workShift='" + workShift + '\'' +
                ", workerDetails='" + workerDetails + '\'' +
                '}';
    }
}
