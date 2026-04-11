package common.coastal_horizon_dockyard.Razin_2420842;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class MonthlyReportController {
    @javafx.fxml.FXML
    private ComboBox<String> monthCombobox;
    @javafx.fxml.FXML
    private TableView<MonthlyReportMS> MOnthlyReportTable;
    @javafx.fxml.FXML
    private TableColumn<MonthlyReportMS, String> monthlyCol;
    @javafx.fxml.FXML
    private TableColumn<MonthlyReportMS, String> reportCol;

    ArrayList<MonthlyReportMS> reportList = new ArrayList<>();
    @javafx.fxml.FXML
    private ComboBox<String> reportCombobox;

    @javafx.fxml.FXML
    public void initialize() {

        monthCombobox.getItems().addAll("March", "April", "May", "June");
        reportCombobox.getItems().addAll("Safety Report", "Incident Summary", "Permit Log");

        monthlyCol.setCellValueFactory(new PropertyValueFactory<>("month"));
        reportCol.setCellValueFactory(new PropertyValueFactory<>("reportDetails"));
    }

    @javafx.fxml.FXML
    public void generateButton(ActionEvent actionEvent) {
        String selectedMonth = monthCombobox.getValue();
        String selectedType = reportCombobox.getValue();

        if (selectedMonth == null) {
            System.out.println("Error: Please select a Month!");
        }
        else if (selectedType == null) {
            System.out.println("Error: Please select a Report Type!");
        }

        String dummySummary = selectedType + " - Inspections: 10, Incidents: 2";


        MonthlyReportMS newReport = new MonthlyReportMS(selectedMonth, dummySummary);
        reportList.add(newReport);

        MOnthlyReportTable.getItems().setAll(reportList);
    }

    @javafx.fxml.FXML
    public void NextButton(ActionEvent actionEvent) {
    }
}