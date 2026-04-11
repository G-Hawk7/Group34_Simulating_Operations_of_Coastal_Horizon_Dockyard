package common.coastal_horizon_dockyard.Apurbo_2110400;

import common.coastal_horizon_dockyard.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LogisticsOfficerViewController
{
    @javafx.fxml.FXML
    private AnchorPane logisticsOfficerDashboardPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void logisticsWorkforceAllocationButtonOnAction(ActionEvent actionEvent) throws IOException {

        SceneSwitcher.switchTo(actionEvent, "Apurbo_2110400/LO_WorkforceView.fxml");

    }




    @javafx.fxml.FXML
    public void logisticsTrackShipmentButtonOnAction(ActionEvent actionEvent) throws IOException {

        SceneSwitcher.switchTo(actionEvent, "Apurbo_2110400/LO_ShipmentView.fxml");

    }




    @javafx.fxml.FXML
    public void logisticsDockSchedulingButtonOnAction(ActionEvent actionEvent) throws IOException {

        SceneSwitcher.switchTo(actionEvent, "Apurbo_2110400/LO_ScheduleView.fxml");

    }




    @javafx.fxml.FXML
    public void logisticsOperationsButtonOnAction(ActionEvent actionEvent) throws IOException {

        SceneSwitcher.switchTo(actionEvent, "Apurbo_2110400/LO_OperationsView.fxml");

    }




    @javafx.fxml.FXML
    public void logisticsLogisticsReportButtonOnAction(ActionEvent actionEvent) throws IOException {

        SceneSwitcher.switchTo(actionEvent, "Apurbo_2110400/LO_ReportView.fxml");

    }




    @javafx.fxml.FXML
    public void logisticsCreatePurchaseOrderButtonOnAction(ActionEvent actionEvent) throws IOException {

        SceneSwitcher.switchTo(actionEvent, "Apurbo_2110400/LO_PurchaseView.fxml");

    }




    @javafx.fxml.FXML
    public void logisticsEquipmentManagementButtonOnAction(ActionEvent actionEvent) throws IOException {

        SceneSwitcher.switchTo(actionEvent, "Apurbo_2110400/LO_EquipmentView.fxml");

    }




    @javafx.fxml.FXML
    public void logisticsInventoryManagementButtonOnAction(ActionEvent actionEvent) throws IOException {

        SceneSwitcher.switchTo(actionEvent, "Apurbo_2110400/LO_InventoryView.fxml");

    }

    @javafx.fxml.FXML
    public void backOnClick(ActionEvent actionEvent) {
    }
}