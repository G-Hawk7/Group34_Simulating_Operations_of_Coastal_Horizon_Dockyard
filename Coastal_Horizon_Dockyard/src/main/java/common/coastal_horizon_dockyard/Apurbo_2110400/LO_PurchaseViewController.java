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

public class LO_PurchaseViewController
{
    @javafx.fxml.FXML
    private TableView<LO_PurchaseModel> purchaseTableView;
    @javafx.fxml.FXML
    private TextField purchaseCostTextField;
    @javafx.fxml.FXML
    private AnchorPane purchaseMainPane;
    @javafx.fxml.FXML
    private TableColumn<LO_PurchaseModel, String> purchaseItemsRequiredTableColumn;
    @javafx.fxml.FXML
    private TableColumn<LO_PurchaseModel, String> purchaseQuantityTableColumn;
    @javafx.fxml.FXML
    private TextField purchaseQuantityTextField;
    @javafx.fxml.FXML
    private TableColumn<LO_PurchaseModel, String> purchaseSupplierTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> purchaseOrderProgressComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> purchaseSupplierComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> purchaseItemsRequiredComboBox;
    @javafx.fxml.FXML
    private TableColumn<LO_PurchaseModel, String> purchaseOrderProgressTableColumn;
    @javafx.fxml.FXML
    private TableColumn<LO_PurchaseModel, String> purchaseCostTableColumn;

    public static List<LO_PurchaseModel> dataList = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {

        purchaseItemsRequiredComboBox.getItems().addAll("Engine & Mechanical Parts", "Electrical Components", "Fuel System Items", "Safety Equipment", "General Dockyard Supplies");
        purchaseSupplierComboBox.getItems().addAll("Oceanic Marine Supplies Ltd.", "BlueWave Maritime Services", "Apex Industrial Parts", "Titan Mechanical Works", "PowerGrid Solutions Ltd.", "SafeSea Equipment Co.");
        purchaseOrderProgressComboBox.getItems().addAll("Confirmed", "On-Hold", "Dispatched");

        purchaseItemsRequiredTableColumn.setCellValueFactory(new PropertyValueFactory<>("itemsRequired"));
        purchaseQuantityTableColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        purchaseSupplierTableColumn.setCellValueFactory(new PropertyValueFactory<>("supplier"));
        purchaseCostTableColumn.setCellValueFactory(new PropertyValueFactory<>("cost"));
        purchaseOrderProgressTableColumn.setCellValueFactory(new PropertyValueFactory<>("orderProgress"));

        purchaseTableView.getItems().setAll(dataList);

    }



    @javafx.fxml.FXML
    public void purchasePlacePurchaseOrderButtonOnAction(ActionEvent actionEvent) {

        String itemsRequired = purchaseItemsRequiredComboBox.getValue();
        String quantity = purchaseQuantityTextField.getText();
        String supplier = purchaseSupplierComboBox.getValue();
        String cost = purchaseCostTextField.getText();
        String orderProgress = purchaseOrderProgressComboBox.getValue();

    }



    @javafx.fxml.FXML
    public void backOnClick(ActionEvent actionEvent) throws IOException {

        SceneSwitcher.switchTo(actionEvent, "Apurbo_2110400/LogisticsOfficerView.fxml");

    }
}