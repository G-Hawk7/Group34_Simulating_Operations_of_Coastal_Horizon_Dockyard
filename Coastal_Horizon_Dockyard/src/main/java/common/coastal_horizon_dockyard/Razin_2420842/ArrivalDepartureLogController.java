package common.coastal_horizon_dockyard.Razin_2420842;

import common.coastal_horizon_dockyard.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class ArrivalDepartureLogController
{
    @javafx.fxml.FXML
    private TextField DateTextfield;
    @javafx.fxml.FXML
    private ComboBox<String> arrivalvombobox;
    @javafx.fxml.FXML
    private TextField ShipIDTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void SaveButton(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void NextButtonaction(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"Razin_2420842/.fxml");
    }
}