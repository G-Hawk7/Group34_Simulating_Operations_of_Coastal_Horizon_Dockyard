package common.coastal_horizon_dockyard.Saif_2120462;

import common.coastal_horizon_dockyard.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;


public class MD_YardProjectsController {

    @FXML
    private Label approvedStatusLabel;

    @FXML
    private TableColumn<MD_YardProjectModel, String> areaNameColumn;

    @FXML
    private CheckBox envCheckBox;

    @FXML
    private TableColumn<MD_YardProjectModel, Double> estimatedCostColumn;

    @FXML
    private TableColumn<MD_YardProjectModel, Integer> expansionIDColumn;

    @FXML
    private TableView<MD_YardProjectModel> expansionTableView;

    @FXML
    private CheckBox permitCheckBox;

    @FXML
    private TextArea planTextArea;

    @FXML
    private TableColumn<MD_YardProjectModel, String> statusColumn;

    @FXML
    private Button approveExpansionButton;

    private ObservableList<MD_YardProjectModel> expansionList = FXCollections.observableArrayList();

    public ObservableList<MD_YardProjectModel> getExpansionList() {
        return expansionList;
    }
    public void setExpansionList(ObservableList<MD_YardProjectModel> expansionList) {
        this.expansionList = expansionList;
    }

    @FXML
    public void initialize() {
        expansionIDColumn.setCellValueFactory(new PropertyValueFactory<>("expansionIDColumn"));
        areaNameColumn.setCellValueFactory(new PropertyValueFactory<>("areaNameColumn"));
        estimatedCostColumn.setCellValueFactory(new PropertyValueFactory<>("estimatedCostColumn"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("statusColumn"));

        expansionTableView.setItems(expansionList);
        approvedStatusLabel.setVisible(false);
        approveExpansionButton.setDisable(true);
        planTextArea.setEditable(false);

        expansionTableView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                planTextArea.setText(newValue.getPlanTextArea());
                approvedStatusLabel.setVisible(false);
            }
        });
    }

    @FXML
    void approveExpansionOnClick(ActionEvent event) {
        MD_YardProjectModel selected = expansionTableView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.setStatusColumn("Approved");
            expansionTableView.refresh();
            approvedStatusLabel.setVisible(true);
        }

    }

    @FXML
    void backToMDDashboardOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "Saif_2120462/ManagingDirector.fxml");

    }

    @FXML
    void validationCriteriaOnAction(ActionEvent event) {
        boolean bothChecked = permitCheckBox.isSelected() && envCheckBox.isSelected();
        approveExpansionButton.setDisable(!bothChecked);

    }

    @FXML
    void viewExpansionPlansOnClick(ActionEvent event) {
        expansionList.clear();
        expansionList.add(new MD_YardProjectModel(001, "North Dock Extension", 250000.0, "Reviewing", "500m seawall construction. Impact: Minimal. Cost includes dredging."));
        expansionList.add(new MD_YardProjectModel(002, "South Storage Yard", 850000.0, "Reviewing", "12000 sq ft concrete flooring. Impact: 0. Includes solar panel grid"));

    }

}
