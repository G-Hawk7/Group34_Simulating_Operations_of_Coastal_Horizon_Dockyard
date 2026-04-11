package common.coastal_horizon_dockyard.Razin_2420842;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class ScheduleTimelineController
{
    @javafx.fxml.FXML
    private Label outputLabel;
    @javafx.fxml.FXML
    private TextField projectidTextField;
    @javafx.fxml.FXML
    private TextField DurationTextfield;

    ArrayList<ScheduleTimeMS> scheduleList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void CreateButtonAction(ActionEvent actionEvent) {
        String idInput = projectidTextField.getText();
        String duration = DurationTextfield.getText();

        // 2. Validation using if-else if
        if (idInput.isEmpty()) {
            outputLabel.setText("Error: Project ID cannot be empty."); //
        }
        else if (duration.isEmpty()) {
            outputLabel.setText("Error: Duration cannot be empty."); //
        }
        else {
            ScheduleTimeMS newSchedule = new ScheduleTimeMS(idInput, duration);


            scheduleList.add(newSchedule);


            outputLabel.setText("ID: " + idInput + "Duration: " + duration);

            projectidTextField.clear();
            DurationTextfield.clear();
        }
    }

    @javafx.fxml.FXML
    public void nextActionButton(ActionEvent actionEvent) {
    }
}