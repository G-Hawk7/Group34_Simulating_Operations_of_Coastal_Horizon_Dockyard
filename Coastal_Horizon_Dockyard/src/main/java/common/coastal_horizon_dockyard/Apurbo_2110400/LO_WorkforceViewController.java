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

public class LO_WorkforceViewController
{
    @javafx.fxml.FXML
    private TextField workforceWorkerIDTextField;
    @javafx.fxml.FXML
    private TextArea workforceWorkerDetailsTextArea;
    @javafx.fxml.FXML
    private TableColumn<LO_WorkforceModel, String> workforceWorkerShiftTableColumn;
    @javafx.fxml.FXML
    private RadioButton workforceWorkShiftNightRadioButton;
    @javafx.fxml.FXML
    private RadioButton workforceWorkShiftDayRadioButton;
    @javafx.fxml.FXML
    private TableColumn<LO_WorkforceModel, String> workforceWorkerNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<LO_WorkforceModel, String> workforceWorkerCategoryTableColumn;
    @javafx.fxml.FXML
    private TextField workforceWorkerNameTextField;
    @javafx.fxml.FXML
    private AnchorPane workforceMainPane;
    @javafx.fxml.FXML
    private ComboBox<String> workforceWorkerCategoryComboBox;
    @javafx.fxml.FXML
    private TableColumn<LO_WorkforceModel, String> workforceWorkerIDTableColumn;
    @javafx.fxml.FXML
    private TableView<LO_WorkforceModel> workforceTableView;
    @javafx.fxml.FXML
    private TableColumn<LO_WorkforceModel, String> workforceWorkerDetailsTableColumn;

    public static List<LO_WorkforceModel> dataList = new ArrayList<>();

    ToggleGroup tg;


    @javafx.fxml.FXML
    public void initialize() {

        tg = new ToggleGroup();

        workforceWorkShiftDayRadioButton.setToggleGroup(tg);
        workforceWorkShiftNightRadioButton.setToggleGroup(tg);

        workforceWorkerCategoryComboBox.getItems().addAll("Engineers", "Technicians", "Mechanics", "Welders", "Fabricators", "Supervisors & Managers", "Safety Officers");

        workforceWorkerIDTableColumn.setCellValueFactory(new PropertyValueFactory<>("workerID"));
        workforceWorkerNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("workerName"));
        workforceWorkerCategoryTableColumn.setCellValueFactory(new PropertyValueFactory<>("workerCategory"));
        workforceWorkerShiftTableColumn.setCellValueFactory(new PropertyValueFactory<>("workShift"));
        workforceWorkerDetailsTableColumn.setCellValueFactory(new PropertyValueFactory<>("workerDetails"));

        workforceTableView.getItems().setAll(dataList);

    }



    @javafx.fxml.FXML
    public void backOnClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Apurbo_2110400/LogisticsOfficerView.fxml"));
        Node node = fxmlLoader.load();
        workforceMainPane.getChildren().setAll(node);

    }





    @javafx.fxml.FXML
    public void workforceAddToWorkLogButtonOnAction(ActionEvent actionEvent) {

        String workerID = workforceWorkerIDTextField.getText();
        String workerName = workforceWorkerNameTextField.getText();
        String workerCategory = workforceWorkerCategoryComboBox.getValue();
        String workerDetails = workforceWorkerDetailsTextArea.getText();

        String progress = " ";

        if (workforceWorkShiftDayRadioButton.isSelected()) {
            progress = "Day-Shift";
        }
        else if (workforceWorkShiftNightRadioButton.isSelected()) {
            progress = "Night-Shift";
        }

    }
}