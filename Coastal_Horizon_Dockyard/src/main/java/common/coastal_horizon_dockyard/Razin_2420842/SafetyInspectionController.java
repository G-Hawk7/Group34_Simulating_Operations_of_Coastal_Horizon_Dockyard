package common.coastal_horizon_dockyard.Razin_2420842;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

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
    private TableColumn<safetyInspection , String> issuecol;
    @javafx.fxml.FXML
    private TableColumn<safetyInspection , String> issue3col;
    @javafx.fxml.FXML
    private TableColumn<safetyInspection , String> issue2col;
    @javafx.fxml.FXML
    private TableColumn<safetyInspection , String> datecol;
    @javafx.fxml.FXML
    private TableColumn<safetyInspection , String> checklistcol;
    @javafx.fxml.FXML
    private TableView<safetyInspection> inspectiontableview;

    @javafx.fxml.FXML
    public void initialize() {
        safetyChecklist.getItems().addAll("PPE Check","Fire Safety","Equipment Safety");

        datecol.setCellValueFactory(new PropertyValueFactory<>("Date"));
        checklistcol.setCellValueFactory(new PropertyValueFactory<>("list"));
        issuecol.setCellValueFactory(new PropertyValueFactory<>("issue1"));
        issue2col.setCellValueFactory(new PropertyValueFactory<>("issue2"));
        issue3col.setCellValueFactory(new PropertyValueFactory<>("issue3"));
    }
    ArrayList<safetyInspection> listofsefty  = new ArrayList<>();

    @javafx.fxml.FXML
    public void submitActionButton(ActionEvent actionEvent) {
        inspectiontableview.getItems().clear();
        inspectiontableview.getItems().addAll(listofsefty);
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void TabelviewActionButton(ActionEvent actionEvent) {
        String date = dateTextField.getText();
        String issue1 = issue1TextField.getText();
        String issue2 = issue2TextField.getText();
        String issue3 = issueTextField3.getText();
        String selectedChecklist = safetyChecklist.getValue();

        if (safetyChecklist.getSelectionModel().getSelectedItem() == null){
            outputLabel.setText("please select Checklist option.");
            return;
        }
        safetyInspection safety = new safetyInspection(date, issue1, issue2, selectedChecklist , issue3);
        listofsefty.add(safety);
        outputLabel.setText("Data Saved to List.");
    }
}