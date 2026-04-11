package common.coastal_horizon_dockyard.Saif_2120462;

import common.coastal_horizon_dockyard.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;

public class MD_SafetyComplianceController {

    @FXML
    private TableColumn<MD_SafetyComplianceModel, Integer> incidentLogIDColumn;

    @FXML
    private TableColumn<MD_SafetyComplianceModel, String> reportValidationColumn;

    @FXML
    private TableView<MD_SafetyComplianceModel> safetyAuditsTableView;

    @FXML
    private TableColumn<MD_SafetyComplianceModel, String> safetyReportsColumn;

    @FXML
    private TableColumn<MD_SafetyComplianceModel, String> summaryColumn;

    private ObservableList<MD_SafetyComplianceModel> safetyList =  FXCollections.observableArrayList();

    public ObservableList<MD_SafetyComplianceModel> getSafetyList() {
        return safetyList;
    }
    public void setSafetyList(ObservableList<MD_SafetyComplianceModel> safetyList) {
        this.safetyList = safetyList;
    }

    public void initialize() {
        incidentLogIDColumn.setCellValueFactory(new PropertyValueFactory<>("incidentLogIDColumn"));
        safetyReportsColumn.setCellValueFactory(new PropertyValueFactory<>("safetyReportsColumn"));
        reportValidationColumn.setCellValueFactory(new PropertyValueFactory<>("reportValidationColumn"));
        summaryColumn.setCellValueFactory(new PropertyValueFactory<>("summaryColumn"));

        safetyAuditsTableView.setItems(safetyList);
    }

    @FXML
    void backToMDDashboardOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "Saif_2120462/ManagingDirector.fxml");

    }

    @FXML
    void validatesReportOnClick(ActionEvent event) {
        MD_SafetyComplianceModel selected =  safetyAuditsTableView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.setReportValidationColumn("Yes");
            selected.setSummaryColumn("Incident verified and logs updated");
            safetyAuditsTableView.refresh();
        }

    }

    @FXML
    void viewsAuditsOnClick(ActionEvent event) {
        safetyList.clear();
        safetyList.add(new MD_SafetyComplianceModel(101, "Hull Scaffolding Check", "", ""));
        safetyList.add(new MD_SafetyComplianceModel(102, "Crane load certification", "", ""));

    }


}
