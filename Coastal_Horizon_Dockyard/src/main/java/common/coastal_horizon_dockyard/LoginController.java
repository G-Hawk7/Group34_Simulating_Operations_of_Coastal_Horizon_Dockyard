package common.coastal_horizon_dockyard;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;

public class LoginController {

    @FXML
    private Label displaysErrorLabel;

    @FXML
    private TextField idTextField;

    @FXML
    private TextField passwordTextField;

    @FXML
    private ComboBox<String> roleComboBox;

    @FXML
    public void initialize() {
        ObservableList<String> roles = FXCollections.observableArrayList(
                "Managing Director", "Project Manager", "Marine Engineer", "Logistics Officer", "Quality Control Inspector", "Inventory & Store Keeper", "Safety & Environment Officer", "Dockyard Operations Coordinator"
        );
        roleComboBox.setItems(roles);
        displaysErrorLabel.setVisible(false);
    }

    @FXML
    void handleForgotIDPasswordOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "ForgotIDPassword.fxml");

    }

    @FXML
    void handleLoginOnClick(ActionEvent event) {
        String id = idTextField.getText();
        String password = passwordTextField.getText();
        String selectedRole = roleComboBox.getValue();

        if (selectedRole == null || id.isEmpty() || password.isEmpty()) {
            displaysErrorLabel.setText("Fill all the fields and select a role!");
            displaysErrorLabel.setVisible(true);
            return;
        }

        switch (selectedRole) {
            case "Managing Director":
                SceneSwitcher.switchTo(event, "Saif_2120462/ManagingDirector.fxml");
                break;

            case "Project Manager":
                SceneSwitcher.switchTo(event, "Saif_2120462/ProjectManager.fxml");
                break;

            case "Marine Engineer":
                SceneSwitcher.switchTo(event, "Apurbo_2110400/MarineEngineerView.fxml");
                break;

            case "Logistics Officer":
                SceneSwitcher.switchTo(event, "Apurbo_2110400/LogisticsOfficerView.fxml");
                break;

            case "Quality Control Inspector":
                SceneSwitcher.switchTo(event, "Rejwan_2030588/Quality Control Inspector.fxml");
                break;

            case "Inventory & Store Keeper":
                SceneSwitcher.switchTo(event, "Rejwan_2030588/Inventory and Store Keeper.fxml");
                break;

            case "Safety & Environment Officer":
                SceneSwitcher.switchTo(event, "Razin_2420842/Safety And Environment Officer.fxml");
                break;

            case "Dockyard Operations Coordinator":
                SceneSwitcher.switchTo(event, "Razin_2420842/DockyardOperationsCoordinator.fxml");
                break;

            default:
                displaysErrorLabel.setText("Dashboard not found for this user!");
                displaysErrorLabel.setVisible(true);
        }

    }

}
