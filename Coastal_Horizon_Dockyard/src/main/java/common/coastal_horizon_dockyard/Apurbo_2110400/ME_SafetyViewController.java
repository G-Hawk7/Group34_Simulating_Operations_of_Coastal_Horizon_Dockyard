package common.coastal_horizon_dockyard.Apurbo_2110400;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ME_SafetyViewController
{
    @javafx.fxml.FXML
    private TableColumn<ME_SafetyModel,String> safetyRegulationStandardTableColumn;
    @javafx.fxml.FXML
    private RadioButton safetyStatusFailedRadioButton;
    @javafx.fxml.FXML
    private TextField safetyProtectiveEquipmentRequiredTextField;
    @javafx.fxml.FXML
    private TableView<ME_SafetyModel> safetyTableView;
    @javafx.fxml.FXML
    private TableColumn<ME_SafetyModel, String> safetyRegulationVersionTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ME_SafetyModel, String> safetyStatusTableColumn;
    @javafx.fxml.FXML
    private RadioButton safetyStatusPassedRadioButton;
    @javafx.fxml.FXML
    private AnchorPane safetyMainPane;
    @javafx.fxml.FXML
    private TableColumn<ME_SafetyModel, String> safetyProtectiveEquipmentRequiredTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> safetyRegulationStandardComboBox;
    @javafx.fxml.FXML
    private TableColumn<ME_SafetyModel, String> safetyRiskAssessmentTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> safetyRiskAssessmentComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> safetyRegulationVersionComboBox;


    public static List<ME_SafetyModel> dataList = new ArrayList<>();

    ToggleGroup tg;


    @javafx.fxml.FXML
    public void initialize() {

        tg = new ToggleGroup();
        safetyStatusPassedRadioButton.setToggleGroup(tg);
        safetyStatusFailedRadioButton.setToggleGroup(tg);

        safetyRegulationStandardComboBox.getItems().addAll("International Maritime", "Occupational Health & Safety", "Environmental", "Classification Society");
        safetyRegulationVersionComboBox.getItems().addAll("SOLAS Convention", "MARPOL Convention", "ISM Code", "ISPS Code");
        safetyRiskAssessmentComboBox.getItems().addAll("Detection", "Analysis", "Control", "Take Action");

        safetyRegulationStandardTableColumn.setCellValueFactory(new PropertyValueFactory<>("regulationStandard"));
        safetyRegulationVersionTableColumn.setCellValueFactory(new PropertyValueFactory<>("regulationVersion"));
        safetyStatusTableColumn.setCellValueFactory(new PropertyValueFactory<>("safetyStatus"));
        safetyProtectiveEquipmentRequiredTableColumn.setCellValueFactory(new PropertyValueFactory<>("protectiveEquipment"));
        safetyRiskAssessmentTableColumn.setCellValueFactory(new PropertyValueFactory<>("riskAssessment"));

        safetyTableView.getItems().setAll(dataList);

    }



    @javafx.fxml.FXML
    public void safetyShowComplianceDataButtonOnAction(ActionEvent actionEvent) {

        String regulationStandard = safetyRegulationStandardComboBox.getValue();
        String regulationVersion = safetyRegulationVersionComboBox.getValue();
        String protectiveEquipment = safetyProtectiveEquipmentRequiredTextField.getText();
        String riskAssessment = safetyRiskAssessmentComboBox.getValue();

        String progress = " ";

        if (safetyStatusPassedRadioButton.isSelected()) {
            progress = "Passed";
        }
        else if (safetyStatusFailedRadioButton.isSelected()) {
            progress = "Failed";
        }

    }


    @javafx.fxml.FXML
    public void backOnClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Apurbo_2110400/MarineEngineerView.fxml"));
        Node node = fxmlLoader.load();
        safetyMainPane.getChildren().setAll(node);
        
    }
}