package common.coastal_horizon_dockyard.Razin_2420842;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.util.ArrayList;

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
    private TableColumn issuecol;
    @javafx.fxml.FXML
    private TableColumn issue3col;
    @javafx.fxml.FXML
    private TableColumn issue2col;
    @javafx.fxml.FXML
    private TableColumn datecol;
    @javafx.fxml.FXML
    private TableColumn checklistcol;
    @javafx.fxml.FXML
    private TableView inspectiontableview;

    @javafx.fxml.FXML
    public void initialize() {
        safetyChecklist.getItems().addAll("PPE Check","Fire Safety","Equipment Safety");
    }
    ArrayList<safetyInspection> listofsefty  = new ArrayList<>();

    @javafx.fxml.FXML
    public void submitActionButton(ActionEvent actionEvent) {
        String date = dateTextField.getText();
        String issue1 = issue1TextField.getText();
        String issue2 = issue2TextField.getText();
        String issue3 = issueTextField3.getText();
        String selectedChecklist = safetyChecklist.getValue();
        if (safetyChecklist.getSelectionModel().getSelectedItem() == null){
            outputLabel.setText("please select Checklist option. ");
            return;
        }
        common.coastal_horizon_dockyard.Razin_2420842.safetyInspection safety = new safetyInspection(date, issue1, issue2, issue3, selectedChecklist);
        listofsefty.add(safety);




    }
}