package common.coastal_horizon_dockyard;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class OTPScreenController {

    @FXML
    private TextField enterOTPTextField;

    @FXML
    void backToForgotIDPasswordOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "ForgotIDPassword.fxml");

    }

    @FXML
    void verifiesOTPOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "PasswordChanged.fxml");

    }

}
