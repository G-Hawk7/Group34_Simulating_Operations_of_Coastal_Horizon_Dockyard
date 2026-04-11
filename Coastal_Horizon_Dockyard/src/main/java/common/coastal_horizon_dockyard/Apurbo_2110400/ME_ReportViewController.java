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

public class ME_ReportViewController
{
    @javafx.fxml.FXML
    private TextField reportOnDutyEngineerNameTextField;
    @javafx.fxml.FXML
    private TableColumn<ME_ReportModel, String> reportOnDutyEngineerNameTableColumn;
    @javafx.fxml.FXML
    private TableView<ME_ReportModel> reportTableView;
    @javafx.fxml.FXML
    private TableColumn<ME_ReportModel, String> reportSummaryTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ME_ReportModel, String> reportDateTableColumn;
    @javafx.fxml.FXML
    private TextArea reportSummaryTextArea;
    @javafx.fxml.FXML
    private TableColumn<ME_ReportModel, String> reportStatusTableColumn;
    @javafx.fxml.FXML
    private AnchorPane reportMainPane;
    @javafx.fxml.FXML
    private TableColumn<ME_ReportModel, String> reportTypeTableColumn;
    @javafx.fxml.FXML
    private RadioButton reportStatusApprovedRadioButton;
    @javafx.fxml.FXML
    private RadioButton reportStatusDeclinedRadioButton;
    @javafx.fxml.FXML
    private ComboBox<String> reportTypeComboBox;
    @javafx.fxml.FXML
    private DatePicker reportDateDP;

    public static List<ME_ReportModel> dataList = new ArrayList<>();

    ToggleGroup tg;


    @javafx.fxml.FXML
    public void initialize() {

        tg = new ToggleGroup();
        reportStatusApprovedRadioButton.setToggleGroup(tg);
        reportStatusDeclinedRadioButton.setToggleGroup(tg);

        reportTypeComboBox.getItems().addAll("Inspection Report", "Maintenance Report", "Fault Diagnosis Report", "Test Report", "Fuel Efficiency Report", "Safety Compliance Report");

        reportOnDutyEngineerNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("engineerName"));
        reportTypeTableColumn.setCellValueFactory(new PropertyValueFactory<>("reportType"));
        reportDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("reportDate"));
        reportStatusTableColumn.setCellValueFactory(new PropertyValueFactory<>("reportStatus"));
        reportSummaryTableColumn.setCellValueFactory(new PropertyValueFactory<>("reportSummary"));

        reportTableView.getItems().setAll(dataList);

    }


    @javafx.fxml.FXML
    public void backOnClick(ActionEvent actionEvent) throws IOException {

        SceneSwitcher.switchTo(actionEvent, "Apurbo_2110400/MarineEngineerView.fxml");

    }


    @javafx.fxml.FXML
    public void reportGenerateEngineeringReportButtonOnAction(ActionEvent actionEvent) {

        String engineerName = reportOnDutyEngineerNameTextField.getText();
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