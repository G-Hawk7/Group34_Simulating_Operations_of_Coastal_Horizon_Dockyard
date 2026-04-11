package common.coastal_horizon_dockyard.Razin_2420842;

import common.coastal_horizon_dockyard.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class DockReportController
{
    @javafx.fxml.FXML
    private TextField dateTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void exportBUtton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generateButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void NexButton(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"Razin_2420842/DockyardOperationsCoordinator.fxml");
    }
}