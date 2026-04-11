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

public class LO_ShipmentViewController
{
    @javafx.fxml.FXML
    private TextArea shipmentHistoryTextArea;
    @javafx.fxml.FXML
    private AnchorPane shipmentMainPane;
    @javafx.fxml.FXML
    private TableColumn<LO_ShipmentModel, String> shipmentHistoryTableColumn;
    @javafx.fxml.FXML
    private TableColumn<LO_ShipmentModel, String> shipmentDeliveryDateTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> shipmentStatusComboBox;
    @javafx.fxml.FXML
    private TableColumn<LO_ShipmentModel, String> shipmentStatusTableColumn;
    @javafx.fxml.FXML
    private DatePicker shipmentDeliveryDateDP;
    @javafx.fxml.FXML
    private TableColumn<LO_ShipmentModel, String> shipmentIDTableColumn;
    @javafx.fxml.FXML
    private TextField shipmentIDTextField;
    @javafx.fxml.FXML
    private TableView<LO_ShipmentModel> shipmentTableView;
    @javafx.fxml.FXML
    private TableColumn<LO_ShipmentModel, String> shipmentDeliveryProgressTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> shipmentDeliveryProgressComboBox;

    public static List<LO_ShipmentModel> dataList = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {

        shipmentStatusComboBox.getItems().addAll("Booked", "Packed", "Loaded");
        shipmentDeliveryProgressComboBox.getItems().addAll("Confirmed", "On-Hold", "Dispatched");

        shipmentIDTableColumn.setCellValueFactory(new PropertyValueFactory<>("shipmentID"));
        shipmentStatusTableColumn.setCellValueFactory(new PropertyValueFactory<>("shipmentStatus"));
        shipmentDeliveryProgressTableColumn.setCellValueFactory(new PropertyValueFactory<>("deliveryProgress"));
        shipmentDeliveryDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("deliveryDate"));
        shipmentHistoryTableColumn.setCellValueFactory(new PropertyValueFactory<>("shipmentHistory"));

        shipmentTableView.getItems().setAll(dataList);

    }


    @javafx.fxml.FXML
    public void backOnClick(ActionEvent actionEvent) throws IOException {

        SceneSwitcher.switchTo(actionEvent, "Apurbo_2110400/LogisticsOfficerView.fxml");

    }



    @javafx.fxml.FXML
    public void shipmentTrackShipmentButtonOnAction(ActionEvent actionEvent) {

        String shipmentID = shipmentIDTextField.getText();
        String shipmentStatus = shipmentStatusComboBox.getValue();
        String deliveryProgress = shipmentDeliveryProgressComboBox.getValue();
        String shipmentHistory = shipmentHistoryTextArea.getText();
        LocalDate deliveryDate = shipmentDeliveryDateDP.getValue();

    }
}