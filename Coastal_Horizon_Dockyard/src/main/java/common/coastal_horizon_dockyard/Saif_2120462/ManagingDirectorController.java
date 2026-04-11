package common.coastal_horizon_dockyard.Saif_2120462;

import common.coastal_horizon_dockyard.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ManagingDirectorController {

    @FXML
    void backToLoginOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "Login.fxml");

    }

    @FXML
    void opensClientReportsOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "Saif_2120462/MD_ClientReport.fxml");

    }

    @FXML
    void opensDepartmentHeadManagementOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "Saif_2120462/MD_DepartmentHeadManagement.fxml");

    }

    @FXML
    void opensInfrastructureOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "Saif_2120462/MD_Infrastructure.fxml");

    }

    @FXML
    void opensRevenueExpenditureOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "Saif_2120462/MD_RevenueExpenditure.fxml");

    }

    @FXML
    void opensSafetyComplianceOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "Saif_2120462/MD_SafetyCompliance.fxml");

    }

    @FXML
    void opensShipConstructionOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "Saif_2120462/MD_ShipConstruction.fxml");

    }

    @FXML
    void opensShipyardDirectivesOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "Saif_2120462/MD_ShipyardDirectives.fxml");

    }

    @FXML
    void opensYardProjectsOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "Saif_2120462/MD_YardProjects.fxml");

    }

}
