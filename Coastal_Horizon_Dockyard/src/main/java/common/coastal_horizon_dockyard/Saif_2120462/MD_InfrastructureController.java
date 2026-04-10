package common.coastal_horizon_dockyard.Saif_2120462;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;

public class MD_InfrastructureController {

    @FXML
    private RadioButton approveRadioButton;

    @FXML
    private Label approvedStatusLabel;

    @FXML
    private CheckBox budgetCheckBox;

    @FXML
    private TableColumn<?, ?> contractPeriodColumn;

    @FXML
    private ToggleGroup decisionGroup;

    @FXML
    private RadioButton disapproveRadioButton;

    @FXML
    private Label disapprovedStatusLabel;

    @FXML
    private CheckBox environmentalCheckBox;

    @FXML
    private TableColumn<?, ?> estimatedCostColumn;

    @FXML
    private TableView<?> infrastructureTableView;

    @FXML
    private TableColumn<?, ?> proposalIDColumn;

    @FXML
    private CheckBox safetyCheckBox;

    @FXML
    private TableColumn<?, ?> statusColumn;

    @FXML
    private TableColumn<?, ?> vendorIDColumn;

    @FXML
    private TableColumn<?, ?> vendorNameColumn;

    @FXML
    void approvesOnClick(ActionEvent event) {

    }

    @FXML
    void backToMDDashboardOnClick(ActionEvent event) {

    }

    @FXML
    void disapprovesOnClick(ActionEvent event) {

    }

    @FXML
    void loadsInfrastructureProposalsOnClick(ActionEvent event) {

    }

    @FXML
    void validationCriteriaOnAction(ActionEvent event) {

    }

}
