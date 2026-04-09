package common.coastal_horizon_dockyard.Apurbo_2110400;

public class ME_FuelModel {

    private String fuelUsed, distanceCovered, cost, efficiencyClass;

    public ME_FuelModel() {
    }

    public ME_FuelModel(String fuelUsed, String distanceCovered, String cost, String efficiencyClass) {
        this.fuelUsed = fuelUsed;
        this.distanceCovered = distanceCovered;
        this.cost = cost;
        this.efficiencyClass = efficiencyClass;
    }


    public String getFuelUsed() {
        return fuelUsed;
    }

    public void setFuelUsed(String fuelUsed) {
        this.fuelUsed = fuelUsed;
    }

    public String getDistanceCovered() {
        return distanceCovered;
    }

    public void setDistanceCovered(String distanceCovered) {
        this.distanceCovered = distanceCovered;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getEfficiencyClass() {
        return efficiencyClass;
    }

    public void setEfficiencyClass(String efficiencyClass) {
        this.efficiencyClass = efficiencyClass;
    }


    @Override
    public String toString() {
        return "ME_FuelModel{" +
                "fuelUsed='" + fuelUsed + '\'' +
                ", distanceCovered='" + distanceCovered + '\'' +
                ", cost='" + cost + '\'' +
                ", efficiencyClass='" + efficiencyClass + '\'' +
                '}';
    }
}
