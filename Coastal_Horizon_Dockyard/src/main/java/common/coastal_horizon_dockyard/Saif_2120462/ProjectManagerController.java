package common.coastal_horizon_dockyard.Saif_2120462;

import common.coastal_horizon_dockyard.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ProjectManagerController {

    @FXML
    void backToLoginOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "Login.fxml");

    }

    @FXML
    void opensDryDockingOperationsOnClick(ActionEvent event) {

    }

    @FXML
    void opensEngineeringTeamManagementOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "Saif_2120462/PM_EngTeamMgt.fxml");

    }

    @FXML
    void opensMaterialAlertsOnClick(ActionEvent event) {

    }

    @FXML
    void opensMaterialConsumptionOnClick(ActionEvent event) {

    }

    @FXML
    void opensSeaTrialsOnClick(ActionEvent event) {

    }

    @FXML
    void opensSubContractorsOnClick(ActionEvent event) {

    }

    @FXML
    void opensVesselConstructionOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "Saif_2120462/PM_VesselConstruction.fxml");

    }

    @FXML
    void opensVesselDesignsOnClick(ActionEvent event) {

    }

}
