package common.coastal_horizon_dockyard.Razin_2420842;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class SafetyInspectionController
{
    @javafx.fxml.FXML
    private TextField issue2TextField;
    @javafx.fxml.FXML
    private TextField dateTextField;
    @javafx.fxml.FXML
    private TextField issueTextField3;
    @javafx.fxml.FXML
    private TextField issue1TextField;
    @javafx.fxml.FXML
    private ComboBox<String> safetyChecklist;

    @javafx.fxml.FXML
    public void initialize() {
        safetyChecklist.getItems().addAll("PPE Check","Fire Safety","Equipment Safety");
    }

    @javafx.fxml.FXML
    public void safeteyCombobox(ActionEvent actionEvent) {
    }
}