package common.coastal_horizon_dockyard.Apurbo_2110400;

import common.coastal_horizon_dockyard.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;


import java.io.IOException;

public class MarineEngineerViewController
{
    @javafx.fxml.FXML
    private AnchorPane marineEngineerDashboardPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void marineCheckSafetyComplianceButtonOnAction(ActionEvent actionEvent) throws IOException {

        SceneSwitcher.switchTo(actionEvent, "Apurbo_2110400/ME_SafetyView.fxml");

    }


    @javafx.fxml.FXML
    public void marineFuelEfficiencyAnalysisButtonOnAction(ActionEvent actionEvent) throws IOException {

        SceneSwitcher.switchTo(actionEvent, "Apurbo_2110400/ME_FuelView.fxml");

    }

    @javafx.fxml.FXML
    public void marineRepairMonitoringButtonOnAction(ActionEvent actionEvent) throws IOException {

        SceneSwitcher.switchTo(actionEvent, "Apurbo_2110400/ME_RepairView.fxml");

    }

    @javafx.fxml.FXML
    public void marineTestSystemsButtonOnAction(ActionEvent actionEvent) throws IOException {

        SceneSwitcher.switchTo(actionEvent, "Apurbo_2110400/ME_SystemsView.fxml");

    }

    @javafx.fxml.FXML
    public void marineEngineeringReportButtonOnAction(ActionEvent actionEvent) throws IOException {

        SceneSwitcher.switchTo(actionEvent, "Apurbo_2110400/ME_ReportView.fxml");

    }

    @javafx.fxml.FXML
    public void marineEngineDiagnosisButtonOnAction(ActionEvent actionEvent) throws IOException {

        SceneSwitcher.switchTo(actionEvent, "Apurbo_2110400/ME_DiagnosisView.fxml");

    }

    @javafx.fxml.FXML
    public void marinePropulsionInspectionButtonOnAction(ActionEvent actionEvent) throws IOException {

        SceneSwitcher.switchTo(actionEvent, "Apurbo_2110400/ME_PropulsionView.fxml");

    }

    @javafx.fxml.FXML
    public void marineMaintenanceButtonOnAction(ActionEvent actionEvent) throws IOException {

        SceneSwitcher.switchTo(actionEvent, "Apurbo_2110400/ME_MaintenanceView.fxml");

    }

    @javafx.fxml.FXML
    public void backOnClick(ActionEvent actionEvent) {

        SceneSwitcher.switchTo(actionEvent, "Login.fxml");

    }
}