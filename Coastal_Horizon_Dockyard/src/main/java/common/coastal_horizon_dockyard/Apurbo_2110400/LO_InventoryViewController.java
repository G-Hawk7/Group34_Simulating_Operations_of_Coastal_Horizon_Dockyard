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

public class LO_InventoryViewController
{
    @javafx.fxml.FXML
    private TextField inventoryQuantityInStockTextField;
    @javafx.fxml.FXML
    private ComboBox<String> inventoryUsageRateComboBox;
    @javafx.fxml.FXML
    private TableColumn<LO_InventoryModel, String> inventoryTypeTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> inventoryStorageCrateCategoryComboBox;
    @javafx.fxml.FXML
    private TableColumn<LO_InventoryModel, String> inventoryQuantityInStockTableColumn;
    @javafx.fxml.FXML
    private TableColumn<LO_InventoryModel, String> inventoryStorageCrateCategoryTableColumn;
    @javafx.fxml.FXML
    private TableColumn<LO_InventoryModel, String> inventoryRestockingDateTableColumn;
    @javafx.fxml.FXML
    private TableColumn<LO_InventoryModel, String> inventoryItemNameTableColumn;
    @javafx.fxml.FXML
    private TextField inventoryItemNameTextField;
    @javafx.fxml.FXML
    private TableView<LO_InventoryModel> inventoryTableView;
    @javafx.fxml.FXML
    private ComboBox<String> inventoryTypeComboBox;
    @javafx.fxml.FXML
    private DatePicker inventoryRestockingDateDP;
    @javafx.fxml.FXML
    private TableColumn<LO_InventoryModel, String> inventoryUsageRateTableColumn;

    public static List<LO_InventoryModel> dataList = new ArrayList<>();

    @javafx.fxml.FXML
    private AnchorPane inventoryMainPane;


    @javafx.fxml.FXML
    public void initialize() {

        inventoryStorageCrateCategoryComboBox.getItems().addAll("Wooden", "Plastic", "Metal", "Insulated", "Stackable");
        inventoryTypeComboBox.getItems().addAll("Slot-Based", "Attaché Case");
        inventoryUsageRateComboBox.getItems().addAll("10%", "20%", "30%", "40%", "50%", "60%", "70%", "80%", "90%", "100%");

        inventoryItemNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("itemName"));
        inventoryQuantityInStockTableColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        inventoryStorageCrateCategoryTableColumn.setCellValueFactory(new PropertyValueFactory<>("storageCategory"));
        inventoryTypeTableColumn.setCellValueFactory(new PropertyValueFactory<>("inventoryType"));
        inventoryUsageRateTableColumn.setCellValueFactory(new PropertyValueFactory<>("usageRate"));
        inventoryRestockingDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("restockingDate"));

        inventoryTableView.getItems().setAll(dataList);

    }



    @javafx.fxml.FXML
    public void inventoryUpdateLogButtonOnAction(ActionEvent actionEvent) {

        String itemName = inventoryItemNameTextField.getText();
        String quantity = inventoryQuantityInStockTextField.getText();
        String storageCategory = inventoryStorageCrateCategoryComboBox.getValue();
        String inventoryType = inventoryTypeComboBox.getValue();
        String usageRate = inventoryUsageRateComboBox.getValue();
        LocalDate restockingDate = inventoryRestockingDateDP.getValue();

    }



    @javafx.fxml.FXML
    public void backOnClick(ActionEvent actionEvent) throws IOException {

        SceneSwitcher.switchTo(actionEvent, "Apurbo_2110400/LogisticsOfficerView.fxml");

    }
}