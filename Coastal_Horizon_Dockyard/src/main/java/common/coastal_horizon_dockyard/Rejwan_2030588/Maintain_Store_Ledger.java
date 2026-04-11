package common.coastal_horizon_dockyard.Rejwan_2030588;

import common.coastal_horizon_dockyard.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Maintain_Store_Ledger {

    @FXML
    void JumpToInventoryAndStoreKeeperOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "Rejwan_2030588/Inventory And Store keeper.fxml");

    }

}
