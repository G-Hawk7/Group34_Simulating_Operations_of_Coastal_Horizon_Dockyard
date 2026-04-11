package common.coastal_horizon_dockyard.Razin_2420842;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class TrainingScheduleControlelr
{
    @javafx.fxml.FXML
    private TextField groupnameTextField;
    @javafx.fxml.FXML
    private ComboBox<String> modulecombobox;
    @javafx.fxml.FXML
    private TextField dateTextfield;
    @javafx.fxml.FXML
    private TableColumn<TrainingScheduleMS, String> datecolu;
    @javafx.fxml.FXML
    private TableColumn<TrainingScheduleMS, String> trainingMoCol;
    @javafx.fxml.FXML
    private TableColumn<TrainingScheduleMS, String> groupnamcol;
    @javafx.fxml.FXML
    private TableView<TrainingScheduleMS> TrainingTable;
    @javafx.fxml.FXML
    private TableColumn<TrainingScheduleMS , String> timeCol;
    @javafx.fxml.FXML
    private TextField timeTextfield;

    @javafx.fxml.FXML
    public void initialize() {
        datecolu.setCellValueFactory(new PropertyValueFactory<>("date"));
        trainingMoCol.setCellValueFactory(new PropertyValueFactory<>("trainingMo"));
        groupnamcol.setCellValueFactory(new PropertyValueFactory<>("groupname"));
        timeCol.setCellValueFactory(new PropertyValueFactory<>("time"));

        modulecombobox.getItems().addAll("Safety Protocol", "Equipment Handling", "Emergency Response");

    }
    ArrayList<TrainingScheduleMS> trainingList = new ArrayList<>();

    @javafx.fxml.FXML
    public void scheduleButton(ActionEvent actionEvent) {
        String date = dateTextfield.getText();
        String groupname = groupnameTextField.getText();
        String time = timeTextfield.getText();
        String trainingMo = modulecombobox.getValue();


        TrainingScheduleMS schedule = new TrainingScheduleMS(date, groupname, trainingMo, time);

        trainingList.add(schedule);


        TrainingTable.getItems().setAll(trainingList);


        dateTextfield.clear();
        groupnameTextField.clear();
        timeTextfield.clear();

    }

    @javafx.fxml.FXML
    public void nextButton(ActionEvent actionEvent) {
    }
}