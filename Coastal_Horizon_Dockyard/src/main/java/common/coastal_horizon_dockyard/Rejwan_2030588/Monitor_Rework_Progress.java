package common.coastal_horizon_dockyard.Rejwan_2030588;

import common.coastal_horizon_dockyard.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Monitor_Rework_Progress {

    @FXML
    void JumpsToQualityControlInspectorOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "Rejwan_2030588/Quality Control Inspector.fxml");

    }

}
