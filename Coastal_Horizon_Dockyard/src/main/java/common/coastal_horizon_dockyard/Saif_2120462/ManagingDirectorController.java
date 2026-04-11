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

    }

    @FXML
    void opensInfrastructureOnClick(ActionEvent event) {

    }

    @FXML
    void opensRevenueExpenditureOnClick(ActionEvent event) {

    }

    @FXML
    void opensSafetyComplianceOnClick(ActionEvent event) {

    }

    @FXML
    void opensShipConstructionOnClick(ActionEvent event) {

    }

    @FXML
    void opensShipyardDirectivesOnClick(ActionEvent event) {

    }

    @FXML
    void opensYardProjectsOnClick(ActionEvent event) {

    }

}
