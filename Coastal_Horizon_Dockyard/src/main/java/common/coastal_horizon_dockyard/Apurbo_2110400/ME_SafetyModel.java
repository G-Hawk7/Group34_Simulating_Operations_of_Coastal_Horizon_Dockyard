package common.coastal_horizon_dockyard.Apurbo_2110400;

public class ME_SafetyModel {

    private String regulationStandard, regulationVersion, safetyStatus, protectiveEquipment, riskAssessment;

    public ME_SafetyModel() {
    }

    public ME_SafetyModel(String regulationStandard, String regulationVersion, String safetyStatus, String protectiveEquipment, String riskAssessment) {
        this.regulationStandard = regulationStandard;
        this.regulationVersion = regulationVersion;
        this.safetyStatus = safetyStatus;
        this.protectiveEquipment = protectiveEquipment;
        this.riskAssessment = riskAssessment;
    }


    public String getRegulationStandard() {
        return regulationStandard;
    }

    public void setRegulationStandard(String regulationStandard) {
        this.regulationStandard = regulationStandard;
    }

    public String getRegulationVersion() {
        return regulationVersion;
    }

    public void setRegulationVersion(String regulationVersion) {
        this.regulationVersion = regulationVersion;
    }

    public String getSafetyStatus() {
        return safetyStatus;
    }

    public void setSafetyStatus(String safetyStatus) {
        this.safetyStatus = safetyStatus;
    }

    public String getProtectiveEquipment() {
        return protectiveEquipment;
    }

    public void setProtectiveEquipment(String protectiveEquipment) {
        this.protectiveEquipment = protectiveEquipment;
    }

    public String getRiskAssessment() {
        return riskAssessment;
    }

    public void setRiskAssessment(String riskAssessment) {
        this.riskAssessment = riskAssessment;
    }


    @Override
    public String toString() {
        return "ME_SafetyModel{" +
                "regulationStandard='" + regulationStandard + '\'' +
                ", regulationVersion='" + regulationVersion + '\'' +
                ", safetyStatus='" + safetyStatus + '\'' +
                ", protectiveEquipment='" + protectiveEquipment + '\'' +
                ", riskAssessment='" + riskAssessment + '\'' +
                '}';
    }
}
