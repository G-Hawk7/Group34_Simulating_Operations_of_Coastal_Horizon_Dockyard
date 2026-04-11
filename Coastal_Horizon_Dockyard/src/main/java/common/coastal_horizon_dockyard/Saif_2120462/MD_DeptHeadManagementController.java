package common.coastal_horizon_dockyard.Saif_2120462;

import common.coastal_horizon_dockyard.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;


public class MD_DeptHeadManagementController {

    @FXML
    private Label appointmentMessageLabel;

    @FXML
    private TableColumn<MD_DeptHeadManagementModel, String> appointmentStatusColumn;

    @FXML
    private TableColumn<MD_DeptHeadManagementModel, Integer> deptHeadIDColumn;

    @FXML
    private TableColumn<MD_DeptHeadManagementModel, String> deptHeadNameColumn;

    @FXML
    private TableView<MD_DeptHeadManagementModel> deptHeadTableView;

    @FXML
    private TableColumn<MD_DeptHeadManagementModel, String> emailColumn;

    @FXML
    private TableColumn<MD_DeptHeadManagementModel, String> qualificationColumn;

    private ObservableList<MD_DeptHeadManagementModel> headList = FXCollections.observableArrayList();

    public ObservableList<MD_DeptHeadManagementModel> getHeadList() {
        return headList;
    }
    public void setHeadList(ObservableList<MD_DeptHeadManagementModel> headList) {
        this.headList = headList;
    }

    @FXML
    public void initialize() {
        deptHeadIDColumn.setCellValueFactory(new PropertyValueFactory<>("deptHeadIDColumn"));
        deptHeadNameColumn.setCellValueFactory(new PropertyValueFactory<>("deptHeadNameColumn"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<>("emailColumn"));
        qualificationColumn.setCellValueFactory(new PropertyValueFactory<>("qualificationColumn"));
        appointmentStatusColumn.setCellValueFactory(new PropertyValueFactory<>("appointmentStatusColumn"));

        deptHeadTableView.setItems(headList);

    }

    @FXML
    void appointsSeniorDeptHeadOnClick(ActionEvent event) {
        MD_DeptHeadManagementModel selectedCandidate = deptHeadTableView.getSelectionModel().getSelectedItem();
        if (selectedCandidate != null) {
            selectedCandidate.setAppointmentStatusColumn("Appointed");
            deptHeadTableView.refresh();
            appointmentMessageLabel.setText("New Senior Department Head appointed!: " + selectedCandidate.getDeptHeadNameColumn() + "!");
            appointmentMessageLabel.setVisible(true);
        }

    }

    @FXML
    void backToMDDashboardOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "Saif_2120462/ManagingDirector.fxml");

    }

    @FXML
    void viewsHeadListOnClick(ActionEvent event) {
        headList.clear();
        appointmentMessageLabel.setVisible(false);

        headList.add(new MD_DeptHeadManagementModel(001, "Sarah Ahmed", "sarah@dockyard.com", "PhD in Marine Engineering", "Pending"));
        headList.add(new MD_DeptHeadManagementModel(002, "Kamal Hassan", "kamal@dockyard.com", "MSc in Naval Architecture", "Pending"));

    }


}
