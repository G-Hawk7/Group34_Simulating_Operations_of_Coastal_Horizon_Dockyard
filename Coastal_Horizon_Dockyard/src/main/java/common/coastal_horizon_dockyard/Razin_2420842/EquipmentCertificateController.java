package common.coastal_horizon_dockyard.Razin_2420842;

import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class EquipmentCertificateController
{
    @javafx.fxml.FXML
    private CheckBox safecheckbox;
    @javafx.fxml.FXML
    private TextField equipmentTextField;
    @javafx.fxml.FXML
    private Label outputLabel;
    @javafx.fxml.FXML
    private CheckBox unsafecheckbox;

    ArrayList<EquipmentCertificateMS> certificateList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void checkButton(ActionEvent actionEvent) {
        String id = equipmentTextField.getText();
        String status ;

        if (safecheckbox.isSelected()) {
            status = "SAFE";
        } else if (unsafecheckbox.isSelected()) {
            status = "UNSAFE";
        } else {
            outputLabel.setText("Please select a status!");
            return;
        }

        if (id.isEmpty()) {
            outputLabel.setText("Please enter Equipment ID!");
            return;
        }


        EquipmentCertificateMS cert = new EquipmentCertificateMS(id, status);


        certificateList.add(cert);
        equipmentTextField.clear();
        outputLabel.setText(cert.toString());
    }
}