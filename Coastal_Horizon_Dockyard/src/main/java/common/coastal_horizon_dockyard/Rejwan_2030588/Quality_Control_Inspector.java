package common.coastal_horizon_dockyard.Rejwan_2030588;

import common.coastal_horizon_dockyard.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Quality_Control_Inspector {

    @FXML
    void JumpsToEnsureComplianceStandardsOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "Rejwan_2030588/Ensure Compliance Standards.fxml");

    }

    @FXML
    void JumpsToFinalShipInspectionApprovalOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "Rejwan_2030588/Final Ship Construction Quality.fxml");

    }

    @FXML
    void JumpsToGenerateQualityReportsOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "Rejwan_2030588/Generate Quality Reports.fxml");

    }

    @FXML
    void JumpsToInspectShipConstructionQualityOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "Rejwan_2030588/Inspect Ship Constriction Quality.fxml");

    }

    @FXML
    void JumpsToLoginOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "Login.fxml");

    }

    @FXML
    void JumpsToMonitorReworkProgressOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "Rejwan_2030588/Monitor Rework Progress.fxml");

    }

    @FXML
    void JumpsToRecordDefectsOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "Rejwan_2030588/Record Defects.fxml");

    }

    @FXML
    void JumpsToTestMachineryInstallationOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "Rejwan_2030588/Test Machinery Installation.fxml");

    }

    @FXML
    void JumpsToVerifyWeldingQualityONClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "Rejwan_2030588/Verify welding quality.fxml");

    }

}
