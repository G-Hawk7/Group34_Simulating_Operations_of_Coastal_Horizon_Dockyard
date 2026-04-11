package common.coastal_horizon_dockyard.Rejwan_2030588;

import common.coastal_horizon_dockyard.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Receive_Supplies {

    @FXML
    void JumpToInventoryAndStoreKeeperOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "Rejwan_2030588/Inventory And Store keeper.fxml");;

    }

}
