package common.coastal_horizon_dockyard.Saif_2120462;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class MD_ClientReportsController {

    @FXML
    private TableColumn<?, ?> clientNameColumn;

    @FXML
    private TableColumn<?, ?> disputeIDColumn;

    @FXML
    private TableView<?> disputeTableView;

    @FXML
    private TextArea projectLogsTextArea;

    @FXML
    private TableColumn<?, ?> projectNameColumn;

    @FXML
    private ComboBox<?> resolutionStatusComboBox;

    @FXML
    private TableColumn<?, ?> statusColumn;

    @FXML
    void backToMDDashboardOnClick(ActionEvent event) {

    }

    @FXML
    void updatesClientPortalOnClick(ActionEvent event) {

    }

}
