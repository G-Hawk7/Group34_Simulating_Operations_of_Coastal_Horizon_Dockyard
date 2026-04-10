package common.coastal_horizon_dockyard.Apurbo_2110400;

import java.time.LocalDate;

public class LO_InventoryModel {

    private String itemName, quantity, storageCategory, inventoryType, usageRate;
    LocalDate restockingDate;

    public LO_InventoryModel() {
    }

    public LO_InventoryModel(String itemName, String quantity, String storageCategory, String inventoryType, String usageRate, LocalDate restockingDate) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.storageCategory = storageCategory;
        this.inventoryType = inventoryType;
        this.usageRate = usageRate;
        this.restockingDate = restockingDate;
    }


    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getStorageCategory() {
        return storageCategory;
    }

    public void setStorageCategory(String storageCategory) {
        this.storageCategory = storageCategory;
    }

    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public String getUsageRate() {
        return usageRate;
    }

    public void setUsageRate(String usageRate) {
        this.usageRate = usageRate;
    }

    public LocalDate getRestockingDate() {
        return restockingDate;
    }

    public void setRestockingDate(LocalDate restockingDate) {
        this.restockingDate = restockingDate;
    }


    @Override
    public String toString() {
        return "LO_InventoryModel{" +
                "itemName='" + itemName + '\'' +
                ", quantity='" + quantity + '\'' +
                ", storageCategory='" + storageCategory + '\'' +
                ", inventoryType='" + inventoryType + '\'' +
                ", usageRate='" + usageRate + '\'' +
                ", restockingDate=" + restockingDate +
                '}';
    }
}
