package common.coastal_horizon_dockyard.Saif_2120462;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TitledPane;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class PM_EngTeamMgtController {

    @FXML
    private Button assignButton;

    @FXML
    private TextArea confirmationTextArea;

    @FXML
    private TableColumn<PM_EngTeamMgtModel, Integer> memberCountColumn;

    @FXML
    private TableColumn<PM_EngTeamMgtModel, String> specializationColumn;

    @FXML
    private TitledPane tasksTitledPane;

    @FXML
    private TableColumn<PM_EngTeamMgtModel, Integer> teamIDColumn;

    @FXML
    private TableColumn<PM_EngTeamMgtModel, String> teamNameColumn;

    @FXML
    private TableView<PM_EngTeamMgtModel> teamTableView;

    @FXML
    private Button viewTeamsButton;

    private ObservableList<PM_EngTeamMgtModel> teamList = FXCollections.observableArrayList();
    public ObservableList<PM_EngTeamMgtModel> getTeamList() {
        return teamList;
    }
    public void setTeamList(ObservableList<PM_EngTeamMgtModel> teamList) {
        this.teamList = teamList;
    }

    @FXML
    public void initialize() {
        teamIDColumn.setCellValueFactory(new PropertyValueFactory<>("teamIDColumn"));
        teamNameColumn.setCellValueFactory(new PropertyValueFactory<>("teamNameColumn"));
        specializationColumn.setCellValueFactory(new PropertyValueFactory<>("specializationColumn"));
        memberCountColumn.setCellValueFactory(new PropertyValueFactory<>("memberCountColumn"));

        teamTableView.setItems(teamList);
        confirmationTextArea.setEditable(false);
    }

    @FXML
    void assignTeamOnClick(ActionEvent event) {
        PM_EngTeamMgtModel selectedTeam = teamTableView.getSelectionModel().getSelectedItem();
        if (selectedTeam != null) {
            String teamName = selectedTeam.getTeamNameColumn();
            String message = teamName + " has been successfully assigned to: Hull bulding task. ";
            confirmationTextArea.setText(message);
        }
        else {
            confirmationTextArea.setText("Please select a team from the table first!");
        }

    }

    @FXML
    void backToPMDashboardOnClick(ActionEvent event) {

    }

    @FXML
    void viewAvailableTeamsOnClick(ActionEvent event) {
        teamList.clear();
        teamList.add(new PM_EngTeamMgtModel(101, "Alpha Team", "Short time building", 12));
        teamList.add(new PM_EngTeamMgtModel(102, "Bravo Team", "Electrical", 8));
        teamList.add(new PM_EngTeamMgtModel(103, "Delta Team", "Hull construction", 15));

    }

}
