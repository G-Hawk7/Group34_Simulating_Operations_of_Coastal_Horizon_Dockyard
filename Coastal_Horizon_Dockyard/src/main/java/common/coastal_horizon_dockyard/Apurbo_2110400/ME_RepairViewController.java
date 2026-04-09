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
import java.util.Locale;

public class ME_RepairViewController
{
    @javafx.fxml.FXML
    private TableView<ME_RepairModel> repairTableView;
    @javafx.fxml.FXML
    private TableColumn<ME_RepairModel, String> repairStatusTableColumn;
    @javafx.fxml.FXML
    private DatePicker repairDeadlineDP;
    @javafx.fxml.FXML
    private TextArea repairWorkSummaryTextArea;
    @javafx.fxml.FXML
    private ComboBox<String> repairEngineerComboBox;
    @javafx.fxml.FXML
    private TableColumn<ME_RepairModel, String> repairDeadlineTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> repairStatusComboBox;
    @javafx.fxml.FXML
    private TableColumn<ME_RepairModel, String> repairEngineerTableColumn;
    @javafx.fxml.FXML
    private AnchorPane repairMainPane;
    @javafx.fxml.FXML
    private TextField repairJobIDTextField;
    @javafx.fxml.FXML
    private TableColumn<ME_RepairModel, String> repairJobIDTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ME_RepairModel, String> repairWorkSummaryTableColumn;

    public static List<ME_RepairModel> dataList = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {

        repairStatusComboBox.getItems().addAll("Pending", "In-Progress", "Completed");
        repairEngineerComboBox.getItems().addAll("Full-Time", "Part-Time");

        repairJobIDTableColumn.setCellValueFactory(new PropertyValueFactory<>("jobID"));
        repairStatusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        repairEngineerTableColumn.setCellValueFactory(new PropertyValueFactory<>("engineer"));
        repairDeadlineTableColumn.setCellValueFactory(new PropertyValueFactory<>("deadline"));
        repairWorkSummaryTableColumn.setCellValueFactory(new PropertyValueFactory<>("workSummary"));

        repairTableView.getItems().setAll(dataList);

    }

    @javafx.fxml.FXML
    public void repairViewRepairReportOnAction(ActionEvent actionEvent) {

        String jobID = repairJobIDTextField.getText();
        String status = repairStatusComboBox.getValue();
        String engineer = repairEngineerComboBox.getValue();
        String workSummary = repairWorkSummaryTextArea.getText();
        LocalDate deadline = repairDeadlineDP.getValue();


        if(jobID.isEmpty()||status.isEmpty()||engineer.isEmpty()||workSummary.isEmpty()||deadline==null){
            Alert warning = new Alert(Alert.AlertType.ERROR);
            warning.setContentText("All Fields Must Be Filled!");
            warning.show();
            return;
        }

        ME_RepairModel newData = new ME_RepairModel(jobID, status, engineer, workSummary, deadline);
        repairTableView.getItems().add(newData);

        Alert success = new Alert(Alert.AlertType.INFORMATION);
        success.setContentText("Propulsion Data Added Successfully.");
        success.show();

    }

    @javafx.fxml.FXML
    public void backOnClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Apurbo_2110400/MarineEngineerView.fxml"));
        Node node = fxmlLoader.load();
        repairMainPane.getChildren().setAll(node);

    }
}