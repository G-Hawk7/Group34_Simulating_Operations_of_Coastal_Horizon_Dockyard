package common.coastal_horizon_dockyard.Saif_2120462;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;

public class MD_ShipConstructionController {

    @FXML
    private ToggleGroup approvalGroupForRadioButtons;

    @FXML
    private RadioButton approveRadioButton;

    @FXML
    private Label approvedLabel;

    @FXML
    private TableColumn<?, ?> capacityColumn;

    @FXML
    private TableColumn<?, ?> clientNameColumn;

    @FXML
    private TableColumn<?, ?> contractIDColumn;

    @FXML
    private RadioButton disapproveRadioButton;

    @FXML
    private Label disapprovedLabel;

    @FXML
    private TableColumn<?, ?> financialStatusColumn;

    @FXML
    private TableColumn<?, ?> profitMarginColumn;

    @FXML
    private TableView<?> shipConstructionContractsTableView;

    @FXML
    private TableColumn<?, ?> statusColumn;

    @FXML
    void approvesStatusOnClick(ActionEvent event) {

    }

    @FXML
    void backToMDDashboardOnClick(ActionEvent event) {

    }

    @FXML
    void disapprovesStatusOnClick(ActionEvent event) {

    }

    @FXML
    void displaysPendingContractsOnClick(ActionEvent event) {

    }

}
