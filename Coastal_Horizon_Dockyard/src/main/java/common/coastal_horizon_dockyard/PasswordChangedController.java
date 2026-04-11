package common.coastal_horizon_dockyard;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class PasswordChangedController {

    @FXML
    void backToLoginOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "Login.fxml");

    }

}
