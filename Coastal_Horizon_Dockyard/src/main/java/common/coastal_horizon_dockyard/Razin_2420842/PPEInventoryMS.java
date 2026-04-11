package common.coastal_horizon_dockyard.Razin_2420842;

public class PPEInventoryMS {
    private String iteam;
    private String quantity;
    private String Available;

    public PPEInventoryMS(String iteam, String quantity, String available) {
        this.iteam = iteam;
        this.quantity = quantity;
        Available = available;
    }

    public String getIteam() {
        return iteam;
    }

    public void setIteam(String iteam) {
        this.iteam = iteam;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getAvailable() {
        return Available;
    }

    public void setAvailable(String available) {
        Available = available;
    }
}
