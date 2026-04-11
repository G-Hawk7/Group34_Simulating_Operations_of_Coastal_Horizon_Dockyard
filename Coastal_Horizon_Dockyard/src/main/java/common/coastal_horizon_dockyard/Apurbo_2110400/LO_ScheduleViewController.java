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

public class LO_ScheduleViewController
{
    @javafx.fxml.FXML
    private ComboBox<String> scheduleShipComboBox;
    @javafx.fxml.FXML
    private AnchorPane scheduleMainPane;
    @javafx.fxml.FXML
    private TableColumn<LO_ScheduleModel, String> schedulePierNumberTableColumn;
    @javafx.fxml.FXML
    private TableView<LO_ScheduleModel> scheduleTableView;
    @javafx.fxml.FXML
    private DatePicker scheduleArrivalDateDP;
    @javafx.fxml.FXML
    private DatePicker scheduleDepartureDateDP;
    @javafx.fxml.FXML
    private TableColumn<LO_ScheduleModel, String> scheduleShipTableColumn;
    @javafx.fxml.FXML
    private TableColumn<LO_ScheduleModel, String> scheduleDockNumberTableColumn;
    @javafx.fxml.FXML
    private TableColumn<LO_ScheduleModel, String> scheduleDepartureDateTableColumn;
    @javafx.fxml.FXML
    private TableColumn<LO_ScheduleModel, String> scheduleArrivalDateTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> scheduleDockNumberComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> schedulePierNumberComboBox;

    public static List<LO_ScheduleModel> dataList = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {

        scheduleShipComboBox.getItems().addAll("Container", "Bulk Carrier", "Oil Tanker", "Cruise", "Ferry", "Icebreaker", "Dredger");
        scheduleDockNumberComboBox.getItems().addAll("Dock 01", "Dock 02", "Dock 03", "Dock 04", "Dock 05", "Dock 06");
        schedulePierNumberComboBox.getItems().addAll("Pier A", "Pier B", "Pier C", "Pier D", "Pier E", "Pier F");

        scheduleShipTableColumn.setCellValueFactory(new PropertyValueFactory<>("ship"));
        scheduleDockNumberTableColumn.setCellValueFactory(new PropertyValueFactory<>("dockNumber"));
        schedulePierNumberTableColumn.setCellValueFactory(new PropertyValueFactory<>("pierNumber"));
        scheduleArrivalDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("arrivalDate"));
        scheduleDepartureDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("departureDate"));

        scheduleTableView.getItems().setAll(dataList);

    }


    @javafx.fxml.FXML
    public void scheduleViewDockScheduleButtonOnAction(ActionEvent actionEvent) {

        String ship = scheduleShipComboBox.getValue();
        String dockNumber = scheduleDockNumberComboBox.getValue();
        String pierNumber = schedulePierNumberComboBox.getValue();
        LocalDate arrivalDate = scheduleArrivalDateDP.getValue();
        LocalDate departureDate = scheduleDepartureDateDP.getValue();

    }



    @javafx.fxml.FXML
    public void backOnClick(ActionEvent actionEvent) throws IOException {

        SceneSwitcher.switchTo(actionEvent, "Apurbo_2110400/LogisticsOfficerView.fxml");

    }
}