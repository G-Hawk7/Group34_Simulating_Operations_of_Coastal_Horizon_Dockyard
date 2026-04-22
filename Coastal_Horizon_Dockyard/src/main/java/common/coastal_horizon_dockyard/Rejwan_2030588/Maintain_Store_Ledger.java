package common.coastal_horizon_dockyard.Rejwan_2030588;

import common.coastal_horizon_dockyard.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class Maintain_Store_Ledger {

    @FXML
    private ComboBox<String> EquipmenttyperComboBox;
    @FXML
    private TextField TransactionTextField;

    @FXML
    void JumpToInventoryAndStoreKeeperOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "Rejwan_2030588/Inventory And Store keeper.fxml");

    }

}
