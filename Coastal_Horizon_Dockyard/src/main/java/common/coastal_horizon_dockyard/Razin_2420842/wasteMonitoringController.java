package common.coastal_horizon_dockyard.Razin_2420842;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class wasteMonitoringController
{
    @javafx.fxml.FXML
    private ComboBox<String> wastetypeCombobox;
    @javafx.fxml.FXML
    private ComboBox<String> disposalMethodCombobox;
    @javafx.fxml.FXML
    private Label outputLabel;
    @javafx.fxml.FXML
    private TextField quantityTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void calculateButton(ActionEvent actionEvent) {
    }
}