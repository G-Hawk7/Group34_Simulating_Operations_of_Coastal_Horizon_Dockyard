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

public class LO_ReportViewController
{
    @javafx.fxml.FXML
    private TableColumn<LO_ReportModel, String> reportOnDutyLogisticsOfficerNameTableColumn;
    @javafx.fxml.FXML
    private TableView<LO_ReportModel> reportTableView;
    @javafx.fxml.FXML
    private TableColumn<LO_ReportModel, String> reportSummaryTableColumn;
    @javafx.fxml.FXML
    private TableColumn<LO_ReportModel, String> reportDateTableColumn;
    @javafx.fxml.FXML
    private TextArea reportSummaryTextArea;
    @javafx.fxml.FXML
    private TableColumn<LO_ReportModel, String> reportStatusTableColumn;
    @javafx.fxml.FXML
    private AnchorPane reportMainPane;
    @javafx.fxml.FXML
    private TableColumn<LO_ReportModel, String> reportTypeTableColumn;
    @javafx.fxml.FXML
    private RadioButton reportStatusApprovedRadioButton;
    @javafx.fxml.FXML
    private TextField reportOnDutyLogisticsOfficerNameTextField;
    @javafx.fxml.FXML
    private RadioButton reportStatusDeclinedRadioButton;
    @javafx.fxml.FXML
    private ComboBox<String> reportTypeComboBox;
    @javafx.fxml.FXML
    private DatePicker reportDateDP;

    public static List<LO_ReportModel> dataList = new ArrayList<>();

    ToggleGroup tg;


    @javafx.fxml.FXML
    public void initialize() {

        tg = new ToggleGroup();
        reportStatusApprovedRadioButton.setToggleGroup(tg);
        reportStatusDeclinedRadioButton.setToggleGroup(tg);

        reportTypeComboBox.getItems().addAll("Dock Scheduling Report", "Inventory Status Report", "Purchase Order Report", "Shipment Report", "Equipment Utilization Report", "Workforce Allocation Report");

        reportOnDutyLogisticsOfficerNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("logisticsOfficerName"));
        reportTypeTableColumn.setCellValueFactory(new PropertyValueFactory<>("reportType"));
        reportDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("reportDate"));
        reportStatusTableColumn.setCellValueFactory(new PropertyValueFactory<>("reportStatus"));
        reportSummaryTableColumn.setCellValueFactory(new PropertyValueFactory<>("reportSummary"));

        reportTableView.getItems().setAll(dataList);

    }




    @javafx.fxml.FXML
    public void backOnClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Apurbo_2110400/LogisticsOfficerView.fxml"));
        Node node = fxmlLoader.load();
        reportMainPane.getChildren().setAll(node);

    }




    @javafx.fxml.FXML
    public void reportGenerateLogisticsReportButtonOnAction(ActionEvent actionEvent) {

        String logisticsOfficerName = reportOnDutyLogisticsOfficerNameTextField.getText();
        String reportType = reportTypeComboBox.getValue();
        String reportSummary = reportSummaryTextArea.getText();
        LocalDate reportDate = reportDateDP.getValue();

        String progress = " ";

        if (reportStatusApprovedRadioButton.isSelected()) {
            progress = "Approved";
        }
        else if (reportStatusDeclinedRadioButton.isSelected()) {
            progress = "Declined";
        }

    }
}