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
import java.util.PropertyResourceBundle;

public class ME_SystemsViewController
{
    @javafx.fxml.FXML
    private TableColumn<ME_SystemsModel, String> systemsPerformanceStatusTableColumn;
    @javafx.fxml.FXML
    private RadioButton systemsApprovedByEngineerApprovedRadioButton;
    @javafx.fxml.FXML
    private ComboBox<String> systemsSelectComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> systemsPerformanceStatusComboBox;
    @javafx.fxml.FXML
    private RadioButton systemsTestResultPassedRadioButton;
    @javafx.fxml.FXML
    private AnchorPane systemsMainPane;
    @javafx.fxml.FXML
    private TableView<ME_SystemsModel> systemsTableView;
    @javafx.fxml.FXML
    private RadioButton systemsApprovedByEngineerRejectedRadioButton;
    @javafx.fxml.FXML
    private TableColumn<ME_SystemsModel, String> systemsSelectedTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ME_SystemsModel, String> systemsOverallTestResultTableColumn;
    @javafx.fxml.FXML
    private DatePicker systemsTestingDateDP;
    @javafx.fxml.FXML
    private RadioButton systemsTestResultFailedRadioButton;
    @javafx.fxml.FXML
    private TableColumn<ME_SystemsModel, String> systemsApprovedByEngineerTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ME_SystemsModel, String> systemsTestingDateTableColumn;

    public static List<ME_SystemsModel> dataList = new ArrayList<>();

    ToggleGroup tg;


    @javafx.fxml.FXML
    public void initialize() {

        tg = new ToggleGroup();

        systemsApprovedByEngineerApprovedRadioButton.setToggleGroup(tg);
        systemsApprovedByEngineerRejectedRadioButton.setToggleGroup(tg);

        systemsTestResultPassedRadioButton.setToggleGroup(tg);
        systemsTestResultFailedRadioButton.setToggleGroup(tg);

        systemsSelectComboBox.getItems().addAll("Propulsion System", "Electrical System", "Fuel System", "Safety System");
        systemsPerformanceStatusComboBox.getItems().addAll("Excellent", "Good", "Moderate", "Poor");

        systemsSelectedTableColumn.setCellValueFactory(new PropertyValueFactory<>("systemSelect"));
        systemsPerformanceStatusTableColumn.setCellValueFactory(new PropertyValueFactory<>("performanceStatus"));
        systemsApprovedByEngineerTableColumn.setCellValueFactory(new PropertyValueFactory<>("approvedByEngineer"));
        systemsTestingDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("testingDate"));
        systemsOverallTestResultTableColumn.setCellValueFactory(new PropertyValueFactory<>("overallResult"));

        systemsTableView.getItems().setAll(dataList);

    }

    @javafx.fxml.FXML
    public void systemsDisplayResultsButtonOnAction(ActionEvent actionEvent) {

        String systemSelect = systemsSelectComboBox.getValue();
        String performanceStatus = systemsPerformanceStatusComboBox.getValue();
        LocalDate testingDate = systemsTestingDateDP.getValue();

        String progress = " ";

        if (systemsApprovedByEngineerApprovedRadioButton.isSelected()) {
            progress = "Approved";
        }
        else if (systemsApprovedByEngineerRejectedRadioButton.isSelected()) {
            progress = "Rejected";
        }


        if (systemsTestResultPassedRadioButton.isSelected()) {
            progress = "Passed";
        }
        else if (systemsTestResultFailedRadioButton.isSelected()) {
            progress = "Failed";
        }

    }



    @javafx.fxml.FXML
    public void backOnClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Apurbo_2110400/MarineEngineerView.fxml"));
        Node node = fxmlLoader.load();
        systemsMainPane.getChildren().setAll(node);

    }
}