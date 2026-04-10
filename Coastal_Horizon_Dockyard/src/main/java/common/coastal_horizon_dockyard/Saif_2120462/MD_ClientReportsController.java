package common.coastal_horizon_dockyard.Saif_2120462;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

//This contains a notification alert code use it for Login later//

public class MD_ClientReportsController {

    @FXML
    private TableColumn<MD_ClientReportsModel, String> clientNameColumn;

    @FXML
    private TableColumn<MD_ClientReportsModel, Integer> disputeIDColumn;

    @FXML
    private TableView<MD_ClientReportsModel> disputeTableView;

    @FXML
    private TextArea projectLogsTextArea;

    @FXML
    private TableColumn<MD_ClientReportsModel, String> projectNameColumn;

    @FXML
    private ComboBox<String> resolutionStatusComboBox;

    @FXML
    private TableColumn<MD_ClientReportsModel, String> statusColumn;

    private ObservableList<MD_ClientReportsModel> disputeList =  FXCollections.observableArrayList();

    public ObservableList<MD_ClientReportsModel> getDisputeList() {
        return disputeList;
    }
    public void setDisputeList(ObservableList<MD_ClientReportsModel> disputeList) {
        this.disputeList = disputeList;
    }

    public void initialize() {
        disputeIDColumn.setCellValueFactory(new PropertyValueFactory<>("disputeIDColumn"));
        clientNameColumn.setCellValueFactory(new PropertyValueFactory<>("clientNameColumn"));
        projectNameColumn.setCellValueFactory(new PropertyValueFactory<>("projectNameColumn"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("statusColumn"));

        disputeList.add(new MD_ClientReportsModel(901, "Global Shipping Co.", "Hull Alpha", "Active", "1/03/26: Client complained about welding quality. \n5/03/26: Inspector found 2% variance. \n10/03/26: Legal review initiated"));
        disputeList.add(new MD_ClientReportsModel(905, "Oceanic Logistics", "Dry Dock B", "Active", "15/02/26: Delivery delayed by 3 weeks. \n20/02/26: Force majeure claimed by yard. \n2/03/26: Client demanding refund"));

        disputeTableView.setItems(disputeList);

        resolutionStatusComboBox.getItems().addAll("Refund Issued", "Claim denied", "Revised Timeline,", "Sent to legal");

        disputeTableView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                projectLogsTextArea.setText(newValue.getProjectLogsTextArea());
            }
        });
    }

    @FXML
    void backToMDDashboardOnClick(ActionEvent event) {

    }

    @FXML
    void updatesClientPortalOnClick(ActionEvent event) {
        MD_ClientReportsModel selectedDispute = disputeTableView.getSelectionModel().getSelectedItem();
        String selectedResolutionStatus = resolutionStatusComboBox.getSelectionModel().getSelectedItem();

        if (selectedDispute != null && selectedResolutionStatus != null) {
            selectedDispute.setStatusColumn(selectedResolutionStatus);
            disputeTableView.refresh();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Portal Updated");
            alert.setHeaderText(null);
            alert.setContentText("Status Updated to: " + selectedResolutionStatus + "\nClient has been notified");
            alert.showAndWait();
        }
        else {
            Alert error = new Alert(Alert.AlertType.WARNING);
            error.setContentText("Please select a dispute and resolution first");
            error.showAndWait();
        }

    }


}
