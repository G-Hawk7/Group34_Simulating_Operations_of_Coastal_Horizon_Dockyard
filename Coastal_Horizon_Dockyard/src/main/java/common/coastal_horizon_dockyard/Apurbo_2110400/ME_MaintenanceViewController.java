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

public class ME_MaintenanceViewController
{
    @javafx.fxml.FXML
    private TableColumn<ME_MaintenanceModel, String> maintenanceScheduledTableColumn;
    @javafx.fxml.FXML
    private AnchorPane maintenanceMainPane;
    @javafx.fxml.FXML
    private TableColumn<ME_MaintenanceModel, String> maintenanceShipTableColumn;
    @javafx.fxml.FXML
    private TableView<ME_MaintenanceModel> maintenanceScheduledJobsTableView;
    @javafx.fxml.FXML
    private ComboBox<String> maintenanceShipComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> maintenancePriorityComboBox;
    @javafx.fxml.FXML
    private TableColumn<ME_MaintenanceModel, String> maintenancePriorityTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ME_MaintenanceModel, String> maintenanceTypeTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ME_MaintenanceModel, String> maintenanceDateTableColumn;
    @javafx.fxml.FXML
    private DatePicker maintenanceDateDP;
    @javafx.fxml.FXML
    private RadioButton maintenanceScheduledNoRadioButton;
    @javafx.fxml.FXML
    private ComboBox<String> maintenanceTypeComboBox;
    @javafx.fxml.FXML
    private RadioButton maintenanceScheduledYesRadioButton;


    public static List<ME_MaintenanceModel> dataList = new ArrayList<>();

    ToggleGroup tg;


    @javafx.fxml.FXML
    public void initialize() {

        tg = new ToggleGroup();
        maintenanceScheduledYesRadioButton.setToggleGroup(tg);
        maintenanceScheduledNoRadioButton.setToggleGroup(tg);

        maintenanceShipComboBox.getItems().addAll("Cargo", "Commercial", "Passenger", "Specialized", "Military");
        maintenanceTypeComboBox.getItems().addAll("Preventive", "Corrective", "Predictive", "Condition-Based", "Emergency");
        maintenancePriorityComboBox.getItems().addAll("Primary", "Secondary", "Tertiary");

        maintenanceShipTableColumn.setCellValueFactory(new PropertyValueFactory<>("ship"));
        maintenanceTypeTableColumn.setCellValueFactory(new PropertyValueFactory<>("maintenanceType"));
        maintenanceDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("maintenanceDate"));
        maintenanceScheduledTableColumn.setCellValueFactory(new PropertyValueFactory<>("scheduledForMaintenance"));
        maintenancePriorityTableColumn.setCellValueFactory(new PropertyValueFactory<>("priority"));

        maintenanceScheduledJobsTableView.getItems().setAll(dataList);

    }



    @javafx.fxml.FXML
    public void maintenanceScheduleButtonOnAction(ActionEvent actionEvent) {

        String ship = maintenanceShipComboBox.getValue();
        String maintenanceType = maintenanceTypeComboBox.getValue();
        LocalDate maintenanceDate = maintenanceDateDP.getValue();
        String priority = maintenancePriorityComboBox.getValue();

        String progress = " ";

        if (maintenanceScheduledYesRadioButton.isSelected()) {
            progress = "Yes";
        }
        else if (maintenanceScheduledNoRadioButton.isSelected()) {
            progress = "No";
        }

    }

    @javafx.fxml.FXML
    public void backOnClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Apurbo_2110400/MarineEngineerView.fxml"));
        Node node = fxmlLoader.load();
        maintenanceMainPane.getChildren().setAll(node);

    }
}