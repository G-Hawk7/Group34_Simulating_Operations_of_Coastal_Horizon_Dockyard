package common.coastal_horizon_dockyard.Razin_2420842;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
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
    private Label outputLabel;

    @javafx.fxml.FXML
    public void initialize() {
        safetyChecklist.getItems().addAll("PPE Check","Fire Safety","Equipment Safety");
    }

    @javafx.fxml.FXML
    public void submitActionButton(ActionEvent actionEvent) {
        String date = dateTextField.getText();
        String issue1 = issue1TextField.getText();
        String issue2 = issue1TextField.getText();
        String issue3 = issue1TextField.getText();
        common.coastal_horizon_dockyard.Razin_2420842.safetyInspection newSafetyInspection = new safetyInspection(date ,issue1,issue2,issue3,checklist);
        if (safetyChecklist.getSelectionModel().getSelectedItem() == null){
            outputLabel.setText("please select Checklist option. ");
            return;
        }
        String sefty = safetyChecklist.getValue();


    }
}