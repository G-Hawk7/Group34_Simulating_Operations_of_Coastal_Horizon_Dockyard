package common.coastal_horizon_dockyard.Saif_2120462;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;

public class MD_ShipConstructionController {

    private ObservableList<MD_ShipConstructionModel> contractList = FXCollections.observableArrayList();

    @FXML
    private ToggleGroup approvalGroupForRadioButtons;

    @FXML
    private RadioButton approveRadioButton;

    @FXML
    private Label approvedLabel;

    @FXML
    private TableColumn<MD_ShipConstructionModel, String> capacityColumn;

    @FXML
    private TableColumn<MD_ShipConstructionModel, String> clientNameColumn;

    @FXML
    private TableColumn<MD_ShipConstructionModel, Integer> contractIDColumn;

    @FXML
    private RadioButton disapproveRadioButton;

    @FXML
    private Label disapprovedLabel;

    @FXML
    private TableColumn<MD_ShipConstructionModel, String> financialStatusColumn;

    @FXML
    private TableColumn<MD_ShipConstructionModel, Double> profitMarginColumn;

    @FXML
    private TableView<MD_ShipConstructionModel> shipConstructionContractsTableView;

    @FXML
    private TableColumn<MD_ShipConstructionModel, String> statusColumn;

    @FXML
    void approvesStatusOnClick(ActionEvent event) {
        MD_ShipConstructionModel selectedContract = shipConstructionContractsTableView.getSelectionModel().getSelectedItem();
        if (selectedContract != null) {
            selectedContract.setStatusColumn("Approved");
            shipConstructionContractsTableView.refresh();
            approvedLabel.setVisible(true);
            disapprovedLabel.setVisible(false);
        }

    }

    @FXML
    void backToMDDashboardOnClick(ActionEvent event) {

    }

    @FXML
    void disapprovesStatusOnClick(ActionEvent event) {
        MD_ShipConstructionModel selectedContract = shipConstructionContractsTableView.getSelectionModel().getSelectedItem();
        if (selectedContract != null) {
            selectedContract.setStatusColumn("Disapproved");
            shipConstructionContractsTableView.refresh();
            approvedLabel.setVisible(false);
            disapprovedLabel.setVisible(true);
        }

    }

    @FXML
    void displaysPendingContractsOnClick(ActionEvent event) {
        contractList.clear();
        contractList.add(new MD_ShipConstructionModel(101, "Global Shipping Co.", "Stable", 15.5, "High", "Pending"));
        contractList.add(new MD_ShipConstructionModel(102, "Horizon Logistics", "Excellent", 22.0, "Medium", "Pending"));
        contractList.add(new MD_ShipConstructionModel(103, "Oceanic Tides Ltd.", "At Risk", 8.2, "Low", "Pending"));


    }

    public ObservableList<MD_ShipConstructionModel> getContractList() {
        return contractList;
    }

    public void setContractList(ObservableList<MD_ShipConstructionModel> contractList) {
        this.contractList = contractList;
    }

    public void initialize() {
        contractIDColumn.setCellValueFactory(new PropertyValueFactory<>("contractIDColumn"));
        clientNameColumn.setCellValueFactory(new PropertyValueFactory<>("clientNameColumn"));
        financialStatusColumn.setCellValueFactory(new PropertyValueFactory<>("financialStatusColumn"));
        profitMarginColumn.setCellValueFactory(new PropertyValueFactory<>("profitMarginColumn"));
        capacityColumn.setCellValueFactory(new PropertyValueFactory<>("capacityColumn"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("statusColumn"));

        shipConstructionContractsTableView.setItems(contractList);

        approvedLabel.setVisible(false);
        disapprovedLabel.setVisible(false);
    }
}
