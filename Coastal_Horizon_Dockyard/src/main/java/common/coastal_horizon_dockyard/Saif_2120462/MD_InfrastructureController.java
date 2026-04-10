package common.coastal_horizon_dockyard.Saif_2120462;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class MD_InfrastructureController {

    @FXML
    private RadioButton approveRadioButton;

    @FXML
    private Label approvedStatusLabel;

    @FXML
    private CheckBox budgetCheckBox;

    @FXML
    private TableColumn<MD_InfrastructureModel, String> contractPeriodColumn;

    @FXML
    private ToggleGroup decisionGroup;

    @FXML
    private RadioButton disapproveRadioButton;

    @FXML
    private Label disapprovedStatusLabel;

    @FXML
    private CheckBox environmentalCheckBox;

    @FXML
    private TableColumn<MD_InfrastructureModel, Double> estimatedCostColumn;

    @FXML
    private TableView<MD_InfrastructureModel> infrastructureTableView;

    @FXML
    private TableColumn<MD_InfrastructureModel, Integer> proposalIDColumn;

    @FXML
    private CheckBox safetyCheckBox;

    @FXML
    private TableColumn<MD_InfrastructureModel, String> statusColumn;

    @FXML
    private TableColumn<MD_InfrastructureModel, Integer> vendorIDColumn;

    @FXML
    private TableColumn<MD_InfrastructureModel, String> vendorNameColumn;

    @FXML
    private Label currentCapacityLabel;

    @FXML
    private Label projectedCapacityLabel;

    private ObservableList<MD_InfrastructureModel> proposalList = FXCollections.observableArrayList();

    public ObservableList<MD_InfrastructureModel> getProposalList() {
        return proposalList;
    }
    public void setProposalList(ObservableList<MD_InfrastructureModel> proposalList) {
        this.proposalList = proposalList;
    }

    public void initialize() {
        proposalIDColumn.setCellValueFactory(new PropertyValueFactory<>("proposalIDColumn"));
        vendorIDColumn.setCellValueFactory(new PropertyValueFactory<>("vendorIDColumn"));
        vendorNameColumn.setCellValueFactory(new PropertyValueFactory<>("vendorNameColumn"));
        contractPeriodColumn.setCellValueFactory(new PropertyValueFactory<>("contractPeriodColumn"));
        estimatedCostColumn.setCellValueFactory(new PropertyValueFactory<>("estimatedCostColumn"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("statusColumn"));

        infrastructureTableView.setItems(proposalList);

        approvedStatusLabel.setVisible(false);
        disapprovedStatusLabel.setVisible(false);
        approveRadioButton.setDisable(true);
        disapproveRadioButton.setDisable(true);

    }

    @FXML
    void approvesOnClick(ActionEvent event) {
        MD_InfrastructureModel selected = infrastructureTableView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.setStatusColumn("Approved");
            infrastructureTableView.refresh();
            approvedStatusLabel.setVisible(true);
            disapprovedStatusLabel.setVisible(false);
        }

    }

    @FXML
    void backToMDDashboardOnClick(ActionEvent event) {

    }

    @FXML
    void disapprovesOnClick(ActionEvent event) {
        MD_InfrastructureModel selected = infrastructureTableView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.setStatusColumn("Disapproved");
            infrastructureTableView.refresh();
            approvedStatusLabel.setVisible(false);
            disapprovedStatusLabel.setVisible(true);
        }

    }

    @FXML
    void loadsInfrastructureProposalsOnClick(ActionEvent event) {
        proposalList.clear();
        proposalList.add(new MD_InfrastructureModel(001, 101, "Steel Core", "6 months", 150000.0, "Pending", "80%", "92%"));
        proposalList.add(new MD_InfrastructureModel(002, 205, "Aqua Docks", "12 months", 500000.0, "Pending", "80%", "98%"));


    }

    @FXML
    void validationCriteriaOnAction(ActionEvent event) {
        boolean allChecked = safetyCheckBox.isSelected() && budgetCheckBox.isSelected() && environmentalCheckBox.isSelected();
        approveRadioButton.setDisable(!allChecked);
        disapproveRadioButton.setDisable(!allChecked);

    }


}
