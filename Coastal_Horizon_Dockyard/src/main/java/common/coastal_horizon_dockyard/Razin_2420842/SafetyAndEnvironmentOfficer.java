package common.coastal_horizon_dockyard.Razin_2420842;

import common.coastal_horizon_dockyard.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.event.Event;

public class SafetyAndEnvironmentOfficer
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void IncidentReportButton(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"Razin_2420842/IncidentReport.fxml");
    }

    @javafx.fxml.FXML
    public void PPEInventoryBUtton(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"Razin_2420842/PPEInventory.fxml");
    }

    @javafx.fxml.FXML
    public void PermitSystemButton(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"Razin_2420842/PermitSystem.fxml");
    }

    @javafx.fxml.FXML
    public void MonthlyReportBUtton(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"Razin_2420842/MonthlyReport.fxml");
    }

    @javafx.fxml.FXML
    public void EquipmentCertificateButton(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"Razin_2420842/EquipmentCertificate.fxml");
    }

    @javafx.fxml.FXML
    public void WasteMonitoringBUtton(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"Razin_2420842/wasteMonitoring.fxml");
    }

    @javafx.fxml.FXML
    public void TrainingScheduleBUtton(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"Razin_2420842/TrainingSchedule.fxml");
    }


    @javafx.fxml.FXML
    public void SafetyInspectionBUtton(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"Razin_2420842/SafetyInspection.fxml");
    }
}