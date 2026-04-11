package common.coastal_horizon_dockyard.Razin_2420842;

import common.coastal_horizon_dockyard.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;

public class ConflictResolutionController
{
    @javafx.fxml.FXML
    private ComboBox<String> newdockCombobox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void UpdateButtonAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void resolvebutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void NpageBut(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"Razin_2420842/DockReport.fxml");
    }
}