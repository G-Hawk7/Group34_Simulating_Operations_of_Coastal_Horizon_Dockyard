package common.coastal_horizon_dockyard.Razin_2420842;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class SafetyInspectoinController
{
    @javafx.fxml.FXML
    private TextField InspectionDateTextFiield;
    @javafx.fxml.FXML
    private ComboBox<String> checklistItems;

    @javafx.fxml.FXML
    public void initialize() {
        checklistItems.getItems().addAll("Fire","PPE");
    }

    @javafx.fxml.FXML
    public void SubmitButton(ActionEvent actionEvent) {
    }
}