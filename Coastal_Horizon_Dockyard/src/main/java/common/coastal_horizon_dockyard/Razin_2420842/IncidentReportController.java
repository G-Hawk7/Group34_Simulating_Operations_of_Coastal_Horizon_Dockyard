package common.coastal_horizon_dockyard.Razin_2420842;

import common.coastal_horizon_dockyard.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class IncidentReportController
{
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private ComboBox<String> SeverityCombobox;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private TextField dateTextField;
    @javafx.fxml.FXML
    private TableColumn<IncidentReportMS, String> idcol;
    @javafx.fxml.FXML
    private TableColumn<IncidentReportMS, String> severitycol;
    @javafx.fxml.FXML
    private TableView<IncidentReportMS> incedentReportTa;
    @javafx.fxml.FXML
    private TableColumn<IncidentReportMS, String> EmployeeNamecol;
    @javafx.fxml.FXML
    private TableColumn<IncidentReportMS, String> descriptioncol;
    @javafx.fxml.FXML
    private TableColumn<IncidentReportMS, String> dateCol;
    @javafx.fxml.FXML
    private TextField DescriptionTextField;

    @javafx.fxml.FXML
    public void initialize() {
        dateCol.setCellValueFactory(new PropertyValueFactory<>("Date"));
        EmployeeNamecol.setCellValueFactory(new PropertyValueFactory<>("name"));
        idcol.setCellValueFactory(new PropertyValueFactory<>("id"));
        severitycol.setCellValueFactory(new PropertyValueFactory<>("severity"));
        descriptioncol.setCellValueFactory(new PropertyValueFactory<>("description"));


        SeverityCombobox.getItems().addAll("Low", "Medium", "High", "Critical");
    }
    ArrayList<IncidentReportMS> reportList = new ArrayList<>();

    @javafx.fxml.FXML
    public void saveButton(ActionEvent actionEvent) {
        String name = nameTextField.getText();
        String id = idTextField.getText();
        String date = dateTextField.getText();
        String severity = SeverityCombobox.getValue();
        String description = DescriptionTextField.getText();

        IncidentReportMS report = new IncidentReportMS(name, id, date, severity ,description );
        reportList.add(report);

        incedentReportTa.getItems().setAll(reportList);

        nameTextField.clear();
        idTextField.clear();
        dateTextField.clear();
        DescriptionTextField.clear();
    }

    @javafx.fxml.FXML
    public void NextpageBUtton(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"Razin_2420842/wasteMonitoring.fxml");
    }
}