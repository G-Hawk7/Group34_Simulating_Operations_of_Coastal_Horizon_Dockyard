package common.coastal_horizon_dockyard.Rejwan_2030588;

import common.coastal_horizon_dockyard.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Inventory_and_Store_Keeper {

    @FXML
    void JumpsToAuditInventoryOnClick(ActionEvent event) {
        SceneSwitcher.switchTo(event, "Rejwan_2030588/Audit Inventory.fxml");

    }

    @FXML
    void JumpsToGenerateInventoryReportsOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "Rejwan_2030588/Generate Inventory Reports.fxml");

    }

    @FXML
    void JumpsToIssueMaterialsOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "Rejwan_2030588/Issue Materials.fxml");



    }

    @FXML
    void JumpsToLoginOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "Login.fxml");

    }

    @FXML
    void JumpsToMaintainStoreLedgerOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "Rejwan_2030588/Maintain Store Ledger.fxml");

    }

    @FXML
    void JumpsToManageInventoryOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "Rejwan_2030588/Manage Inventory.fxml");

    }

    @FXML
    void JumpsToMonitroLowStockOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "Rejwan_2030588/Monitor Low Stock.fxml");

    }

    @FXML
    void JumpsToReceiveSuppliesOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "Rejwan_2030588/Receive Supplies.fxml");

    }

    @FXML
    void JumpsToTrackToolDistributionOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "Rejwan_2030588/Track Tool Distribution.fxml");

    }

}
