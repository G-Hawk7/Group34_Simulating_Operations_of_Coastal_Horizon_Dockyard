package common.coastal_horizon_dockyard.Razin_2420842;

public class EquipmentManagement_MS {
    private String projectID;
    private String equipmentName;

    public EquipmentManagement_MS(String projectID, String equipmentName) {
        this.projectID = projectID;
        this.equipmentName = equipmentName;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

}
