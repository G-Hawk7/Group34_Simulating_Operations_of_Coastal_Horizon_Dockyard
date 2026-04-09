package common.coastal_horizon_dockyard.Apurbo_2110400;

public class ME_DiagnosisModel {

    private String engineID, errorCode, faultStatus, faultDetails;


    public ME_DiagnosisModel() {
    }

    public ME_DiagnosisModel(String engineID, String errorCode, String faultStatus, String faultDetails) {
        this.engineID = engineID;
        this.errorCode = errorCode;
        this.faultStatus = faultStatus;
        this.faultDetails = faultDetails;
    }


    public String getEngineID() {
        return engineID;
    }

    public void setEngineID(String engineID) {
        this.engineID = engineID;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getFaultStatus() {
        return faultStatus;
    }

    public void setFaultStatus(String faultStatus) {
        this.faultStatus = faultStatus;
    }

    public String getFaultDetails() {
        return faultDetails;
    }

    public void setFaultDetails(String faultDetails) {
        this.faultDetails = faultDetails;
    }


    @Override
    public String toString() {
        return "ME_DiagnosisModel{" +
                "engineID='" + engineID + '\'' +
                ", errorCode='" + errorCode + '\'' +
                ", faultStatus='" + faultStatus + '\'' +
                ", faultDetails='" + faultDetails + '\'' +
                '}';
    }
}
