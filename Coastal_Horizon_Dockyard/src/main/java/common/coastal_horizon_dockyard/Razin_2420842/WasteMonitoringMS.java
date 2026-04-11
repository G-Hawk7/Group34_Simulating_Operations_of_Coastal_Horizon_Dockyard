package common.coastal_horizon_dockyard.Razin_2420842;

public class WasteMonitoringMS {
    private String quantity;
    private String wasteType;
    private String disposalMethod;

    public WasteMonitoringMS(String quantity, String wasteType, String disposalMethod) {
        this.quantity = quantity;
        this.wasteType = wasteType;
        this.disposalMethod = disposalMethod;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getWasteType() {
        return wasteType;
    }

    public void setWasteType(String wasteType) {
        this.wasteType = wasteType;
    }

    public String getDisposalMethod() {
        return disposalMethod;
    }

    public void setDisposalMethod(String disposalMethod) {
        this.disposalMethod = disposalMethod;
    }

    @Override
    public String toString() {
        return "WasteMonitoringMS{" +
                "quantity='" + quantity + '\'' +
                ", wasteType='" + wasteType + '\'' +
                ", disposalMethod='" + disposalMethod + '\'' +
                '}';
    }
}
