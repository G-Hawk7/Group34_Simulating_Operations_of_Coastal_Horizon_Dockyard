package common.coastal_horizon_dockyard.Rejwan_2030588;

import common.coastal_horizon_dockyard.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;

public class Verify_Welding_Quality {

    @FXML
    private ToggleGroup fail;

    @FXML
    private ToggleGroup pass;

    @FXML
    void JumpsToQualityControlInspectorOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "Rejwan_2030588/Quality Control Inspector.fxml");

    }

}
