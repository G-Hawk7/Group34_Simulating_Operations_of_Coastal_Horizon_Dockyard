package common.coastal_horizon_dockyard.Rejwan_2030588;

import common.coastal_horizon_dockyard.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Track_Tool_Distribution {

    @FXML
    void JumpToInventoryAndStoreKeeperOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "Rejwan_2030588/Inventory and Store keeper.fxml");

    }

}
