package common.coastal_horizon_dockyard.Apurbo_2110400;

import common.coastal_horizon_dockyard.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LO_EquipmentViewController
{
    @javafx.fxml.FXML
    private TextField equipmentNameTextField;
    @javafx.fxml.FXML
    private ComboBox<String> equipmentConditionStatusComboBox;
    @javafx.fxml.FXML
    private TableColumn<LO_EquipmentModel, String> equipmentAvailableLocationsTableColumn;
    @javafx.fxml.FXML
    private TableColumn<LO_EquipmentModel, String> equipmentQuantityInStockTableColumn;
    @javafx.fxml.FXML
    private TextField equipmentQuantityInStockTextField;
    @javafx.fxml.FXML
    private TableColumn<LO_EquipmentModel, String> equipmentAcquisitionDateTableColumn;
    @javafx.fxml.FXML
    private TableView<LO_EquipmentModel> equipmentTableView;
    @javafx.fxml.FXML
    private DatePicker equipmentAcquisitionDateDP;
    @javafx.fxml.FXML
    private ComboBox<String> equipmentAvailableLocationsComboBox;
    @javafx.fxml.FXML
    private TableColumn<LO_EquipmentModel, String> equipmentNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<LO_EquipmentModel, String> equipmentConditionStatusTableColumn;
    @javafx.fxml.FXML
    private AnchorPane equipmentMainPane;

    public static List<LO_EquipmentModel> dataList = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {

        equipmentConditionStatusComboBox.getItems().addAll("Top-Notch", "Moderately Good", "Poor");
        equipmentAvailableLocationsComboBox.getItems().addAll("Singapore", "Shanghai", "Dubai", "Rotterdam", "Hamburg", "Houston");

        equipmentNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("equipmentName"));
        equipmentQuantityInStockTableColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        equipmentConditionStatusTableColumn.setCellValueFactory(new PropertyValueFactory<>("conditionStatus"));
        equipmentAvailableLocationsTableColumn.setCellValueFactory(new PropertyValueFactory<>("locations"));
        equipmentAcquisitionDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("acquisitionDate"));

        equipmentTableView.getItems().setAll(dataList);

    }



    @javafx.fxml.FXML
    public void equipmentUpdateLogButtonOnAction(ActionEvent actionEvent) {

        String equipmentName = equipmentNameTextField.getText();
        String quantity = equipmentQuantityInStockTextField.getText();
        String conditionStatus = equipmentConditionStatusComboBox.getValue();
        String locations = equipmentAvailableLocationsComboBox.getValue();
        LocalDate acquisitionDate = equipmentAcquisitionDateDP.getValue();

    }

    @javafx.fxml.FXML
    public void backOnClick(ActionEvent actionEvent) throws IOException {

        SceneSwitcher.switchTo(actionEvent, "Apurbo_2110400/LogisticsOfficerView.fxml");

    }
}