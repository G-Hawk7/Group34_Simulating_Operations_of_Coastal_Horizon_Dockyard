package common.coastal_horizon_dockyard.Saif_2120462;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class PM_VesselConstructionController {

    @FXML
    private RadioButton completeRadioButton;

    @FXML
    private Label completedLabel;

    @FXML
    private Button insertInfoButton;

    @FXML
    private Label pendingLabel;

    @FXML
    private RadioButton pendingRadioButton;

    @FXML
    private Label progressLabel;

    @FXML
    private RadioButton progressRadioButton;

    @FXML
    private TableColumn<PM_VesselConstructionModel, String> shipNameColumn;

    @FXML
    private TextField shipNameTextField;

    @FXML
    private TableColumn<PM_VesselConstructionModel, String> statusColumn;

    @FXML
    private ToggleGroup statusGroup;

    @FXML
    private TableColumn<PM_VesselConstructionModel, String> timelineColumn;

    @FXML
    private TextField timelineTextField;

    @FXML
    private TableColumn<PM_VesselConstructionModel, Integer> vesselIDColumn;

    @FXML
    private TextField vesselIDTextField;

    @FXML
    private TableView<PM_VesselConstructionModel> vesselTableView;

    private ObservableList<PM_VesselConstructionModel> vesselList =  FXCollections.observableArrayList();
    public ObservableList<PM_VesselConstructionModel> getVesselList() {
        return vesselList;
    }
    public void setVesselList(ObservableList<PM_VesselConstructionModel> vesselList) {
        this.vesselList = vesselList;
    }

    @FXML
    public void initialize() {
        vesselIDColumn.setCellValueFactory(new PropertyValueFactory<>("vesselIDColumn"));
        shipNameColumn.setCellValueFactory(new PropertyValueFactory<>("shipNameColumn"));
        timelineColumn.setCellValueFactory(new PropertyValueFactory<>("timelineColumn"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("statusColumn"));

        vesselTableView.setItems(vesselList);

        pendingLabel.setVisible(false);
        progressLabel.setVisible(false);
        completedLabel.setVisible(false);
    }

    @FXML
    void backToPMDashboardOnClick(ActionEvent event) {

    }

    @FXML
    void insertInfoOnClick(ActionEvent event) {
        PM_VesselConstructionModel newVessel = new PM_VesselConstructionModel(
                Integer.parseInt(vesselIDTextField.getText()),
                shipNameTextField.getText(),
                timelineTextField.getText()
        );
        vesselList.add(newVessel);
        vesselIDTextField.clear();
        shipNameTextField.clear();
        timelineTextField.clear();
    }

    @FXML
    void showsCompleteOnClick(ActionEvent event) {
        PM_VesselConstructionModel selected = vesselTableView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.setStatusColumn("Complete");

            pendingLabel.setVisible(false);
            progressLabel.setVisible(false);
            completedLabel.setVisible(true);
            vesselTableView.refresh();
        }

    }

    @FXML
    void showsInProgressOnClick(ActionEvent event) {
        PM_VesselConstructionModel selected = vesselTableView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.setStatusColumn("In Progress");

            pendingLabel.setVisible(false);
            progressLabel.setVisible(true);
            completedLabel.setVisible(false);
            vesselTableView.refresh();
        }

    }

    @FXML
    void showsPendingOnClick(ActionEvent event) {
        PM_VesselConstructionModel selected = vesselTableView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.setStatusColumn("Pending");

            pendingLabel.setVisible(true);
            progressLabel.setVisible(false);
            completedLabel.setVisible(false);
            vesselTableView.refresh();
        }

    }

}
