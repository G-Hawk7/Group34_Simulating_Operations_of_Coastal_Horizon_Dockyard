package common.coastal_horizon_dockyard.Apurbo_2110400;

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

public class LO_OperationsViewController
{
    @javafx.fxml.FXML
    private TextField operationsShipNameTextField;
    @javafx.fxml.FXML
    private DatePicker operationsShipArrivalDockingDateDP;
    @javafx.fxml.FXML
    private ComboBox<String> operationsCargoUsedComboBox;
    @javafx.fxml.FXML
    private TableColumn<LO_OperationsModel, String> operationsCargoUsedTableColumn;
    @javafx.fxml.FXML
    private TableColumn<LO_OperationsModel, String> operationsShipArrivalDockingDateTableColumn;
    @javafx.fxml.FXML
    private TableView<LO_OperationsModel> operationsTableView;
    @javafx.fxml.FXML
    private TableColumn<LO_OperationsModel, String> operationsShipNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<LO_OperationsModel, String> operationsActiveDockingJobsTableColumn;
    @javafx.fxml.FXML
    private AnchorPane operationsMainPane;
    @javafx.fxml.FXML
    private TextField operationsActiveDockingJobsTextField;
    @javafx.fxml.FXML
    private TextArea operationsOverviewTextArea;
    @javafx.fxml.FXML
    private TableColumn<LO_OperationsModel, String> operationsOverviewTableColumn;

    public static List<LO_OperationsModel> dataList = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {

        operationsCargoUsedComboBox.getItems().addAll("Cranes", "Forklifts", "Conveyors");

        operationsShipNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("shipName"));
        operationsActiveDockingJobsTableColumn.setCellValueFactory(new PropertyValueFactory<>("activeDockingJobs"));
        operationsCargoUsedTableColumn.setCellValueFactory(new PropertyValueFactory<>("cargoUsed"));
        operationsShipArrivalDockingDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("arrivalDockingDate"));
        operationsOverviewTableColumn.setCellValueFactory(new PropertyValueFactory<>("overview"));

        operationsTableView.getItems().setAll(dataList);

    }



    @javafx.fxml.FXML
    public void backOnClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Apurbo_2110400/LogisticsOfficerView.fxml"));
        Node node = fxmlLoader.load();
        operationsMainPane.getChildren().setAll(node);

    }



    @javafx.fxml.FXML
    public void operationsShowOperationsDataSheetButtonOnAction(ActionEvent actionEvent) {

        String shipName = operationsShipNameTextField.getText();
        String activeDockingJobs = operationsActiveDockingJobsTextField.getText();
        String cargoUsed = operationsCargoUsedComboBox.getValue();
        String overview = operationsOverviewTextArea.getText();
        LocalDate arrivalDockingDate = operationsShipArrivalDockingDateDP.getValue();

    }
}