package common.coastal_horizon_dockyard;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ForgotIDPasswordController {

    @FXML
    private TextField emailVerifyTextField;

    @FXML
    private Label newPasswordVerifyErrorLabel;

    @FXML
    private TextField newPasswordVerifyTextField;

    @FXML
    public void initialize() {
        newPasswordVerifyErrorLabel.setVisible(false);
    }

    @FXML
    void backToLoginOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "Login.fxml");

    }

    @FXML
    void requestsOTPOnClick(ActionEvent event) {
        String email = emailVerifyTextField.getText();
        String newPassword = newPasswordVerifyTextField.getText();

        if (email.isEmpty() || newPassword.isEmpty()) {
            newPasswordVerifyErrorLabel.setText("Please fill in both fields");
        }
        else if (!isAlphanumeric(newPassword)) {
            newPasswordVerifyErrorLabel.setText("Passwords must be combination of alphanumeric");
            newPasswordVerifyErrorLabel.setVisible(true);
        }
        else {
            newPasswordVerifyErrorLabel.setVisible(false);

            SceneSwitcher.switchTo(event, "OTPScreen.fxml");
        }

    }

    private boolean isAlphanumeric(String string) {
        return string.matches(("^[a-zA-Z0-9_-]*$"));
    }

}
