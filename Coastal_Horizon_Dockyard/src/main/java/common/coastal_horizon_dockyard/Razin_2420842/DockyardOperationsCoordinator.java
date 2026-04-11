package common.coastal_horizon_dockyard.Razin_2420842;

import common.coastal_horizon_dockyard.SceneSwitcher;
import javafx.event.ActionEvent;

public class DockyardOperationsCoordinator
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void MaterialCoordinationButton(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"Razin_2420842/MaterialCoordination.fxml");
    }

    @javafx.fxml.FXML
    public void ArrivalDepartureLogButton(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"Razin_2420842/ArrivalDepartureLog.fxml");
    }

    @javafx.fxml.FXML
    public void EquipmentManagementutton(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"Razin_2420842/EquipmentManagement.fxml");
    }

    @javafx.fxml.FXML
    public void DockAllocationButton(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"Razin_2420842/DockAllocation.fxml");
    }

    @javafx.fxml.FXML
    public void ShipProgressButton(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"Razin_2420842/ShipProgress.fxml");
    }

    @javafx.fxml.FXML
    public void ScheduleTimelineButton(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"Razin_2420842/ScheduleTimeline.fxml");
    }


    @javafx.fxml.FXML
    public void ConflictResolutionBUtton(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"Razin_2420842/ConflictResolution.fxml");
    }

    @javafx.fxml.FXML
    public void DockReportBUtton(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"Razin_2420842/DockReport.fxml");
    }
}