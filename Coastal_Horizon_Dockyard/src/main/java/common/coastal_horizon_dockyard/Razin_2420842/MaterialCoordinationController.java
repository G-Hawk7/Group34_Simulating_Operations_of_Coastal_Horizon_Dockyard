package common.coastal_horizon_dockyard.Razin_2420842;

import common.coastal_horizon_dockyard.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class MaterialCoordinationController
{
    @javafx.fxml.FXML
    private Label outputLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void ApproveButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void NButton(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"Razin_2420842/ArrivalDepartureLog.fxml");

    }
}