package common.coastal_horizon_dockyard.Razin_2420842;

import common.coastal_horizon_dockyard.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class wasteMonitoringController
{
    @javafx.fxml.FXML
    private ComboBox<String> wastetypeCombobox;
    @javafx.fxml.FXML
    private ComboBox<String> disposalMethodCombobox;
    @javafx.fxml.FXML
    private Label outputLabel;
    @javafx.fxml.FXML
    private TextField quantityTextField;

    ArrayList<WasteMonitoringMS> wasteList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        wastetypeCombobox.getItems().addAll("Plastic", "Metal", "Chemical", "General");

        disposalMethodCombobox.getItems().addAll("Recycle", "Landfill", "Incineration", "Treat and Release");
    }

    @javafx.fxml.FXML
    public void calculateButton(ActionEvent actionEvent) {
        String quantity = quantityTextField.getText();
        String wasteType = wastetypeCombobox.getValue();
        String disposalMethod = disposalMethodCombobox.getValue();


        WasteMonitoringMS w = new WasteMonitoringMS(quantity, wasteType, disposalMethod);
        wasteList.add(w);
        outputLabel.setText(w.toString());

        quantityTextField.clear();
    }

    @javafx.fxml.FXML
    public void nextButton(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"Razin_2420842/TrainingSchedule.fxml");

    }
}