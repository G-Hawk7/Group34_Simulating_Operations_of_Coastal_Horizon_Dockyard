package common.coastal_horizon_dockyard.Apurbo_2110400;

public class LO_PurchaseModel {

    String itemsRequired, quantity, supplier, cost, orderProgress;

    public LO_PurchaseModel() {
    }

    public LO_PurchaseModel(String itemsRequired, String quantity, String supplier, String cost, String orderProgress) {
        this.itemsRequired = itemsRequired;
        this.quantity = quantity;
        this.supplier = supplier;
        this.cost = cost;
        this.orderProgress = orderProgress;
    }

    public String getItemsRequired() {
        return itemsRequired;
    }

    public void setItemsRequired(String itemsRequired) {
        this.itemsRequired = itemsRequired;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getOrderProgress() {
        return orderProgress;
    }

    public void setOrderProgress(String orderProgress) {
        this.orderProgress = orderProgress;
    }


    @Override
    public String toString() {
        return "LO_PurchaseModel{" +
                "itemsRequired='" + itemsRequired + '\'' +
                ", quantity='" + quantity + '\'' +
                ", supplier='" + supplier + '\'' +
                ", cost='" + cost + '\'' +
                ", orderProgress='" + orderProgress + '\'' +
                '}';
    }
}
