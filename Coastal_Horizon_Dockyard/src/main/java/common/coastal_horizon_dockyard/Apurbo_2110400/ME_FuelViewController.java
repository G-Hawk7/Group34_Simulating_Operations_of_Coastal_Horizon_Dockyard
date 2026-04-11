package common.coastal_horizon_dockyard.Apurbo_2110400;

import common.coastal_horizon_dockyard.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ME_FuelViewController
{
    @javafx.fxml.FXML
    private TextField fuelUsedTextField;
    @javafx.fxml.FXML
    private ComboBox<String> fuelEfficiencyClassComboBox;
    @javafx.fxml.FXML
    private TableColumn<ME_FuelModel, String> fuelDistanceCoveredTableColumn;
    @javafx.fxml.FXML
    private TextField fuelDistanceCoveredTextField;
    @javafx.fxml.FXML
    private TableColumn<ME_FuelModel, String> fuelUsedTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ME_FuelModel, String> fuelCostTableColumn;
    @javafx.fxml.FXML
    private AnchorPane fuelMainPane;
    @javafx.fxml.FXML
    private TableView<ME_FuelModel> fuelTableView;
    @javafx.fxml.FXML
    private TextField fuelCostTextField;
    @javafx.fxml.FXML
    private TableColumn<ME_FuelModel, String> fuelEfficiencyClassTableColumn;

    public static List<ME_FuelModel> dataList = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {

        fuelEfficiencyClassComboBox.getItems().addAll("Propulsive Efficiency", "Thermal Efficiency", "Operational Efficiency");

        fuelUsedTableColumn.setCellValueFactory(new PropertyValueFactory<>("fuelUsed"));
        fuelDistanceCoveredTableColumn.setCellValueFactory(new PropertyValueFactory<>("distanceCovered"));
        fuelCostTableColumn.setCellValueFactory(new PropertyValueFactory<>("cost"));
        fuelEfficiencyClassTableColumn.setCellValueFactory(new PropertyValueFactory<>("efficiencyClass"));

        fuelTableView.getItems().setAll(dataList);

    }

    @javafx.fxml.FXML
    public void fuelViewAnalysisOnAction(ActionEvent actionEvent) {

        String fuelUsed = fuelUsedTextField.getText();
        String distanceCovered = fuelDistanceCoveredTextField.getText();
        String cost = fuelCostTextField.getText();
        String efficiencyClass = fuelEfficiencyClassComboBox.getValue();

    }

    @javafx.fxml.FXML
    public void backOnClick(ActionEvent actionEvent) throws IOException {

        SceneSwitcher.switchTo(actionEvent, "Apurbo_2110400/MarineEngineerView.fxml");
        
    }
}