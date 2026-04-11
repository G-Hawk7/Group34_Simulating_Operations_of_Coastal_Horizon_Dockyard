package common.coastal_horizon_dockyard.Razin_2420842;

import common.coastal_horizon_dockyard.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class EquipmentManagementController
{
    @javafx.fxml.FXML
    private TextField projectIDTextField;
    @javafx.fxml.FXML
    private ComboBox<String> equipmentTextField;
    @javafx.fxml.FXML
    private TableColumn<EquipmentManagement_MS, String> projectCal;
    @javafx.fxml.FXML
    private TableColumn<EquipmentManagement_MS, String> selectCol;
    @javafx.fxml.FXML
    private TableView<EquipmentManagement_MS> euipmentTable;

    ArrayList<EquipmentManagement_MS> equipmentList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        equipmentTextField.getItems().addAll("Crane", "Welding Machine", "Excavator", "Forklift");

        projectCal.setCellValueFactory(new PropertyValueFactory<>("projectID"));
        selectCol.setCellValueFactory(new PropertyValueFactory<>("equipmentName"));
    }

    @javafx.fxml.FXML
    public void AssignButtonAction(ActionEvent actionEvent) {
        String projectID = projectIDTextField.getText();
        String equipmentName = equipmentTextField.getValue();

        if (projectID.isEmpty()) {
            System.out.println("Please Enter Project ID.");
        }
        else if (equipmentName == null) {
            System.out.println("Please Enter Project ID.");
        }
        else {
            EquipmentManagement_MS newEntry = new EquipmentManagement_MS(projectID, equipmentName);
            equipmentList.add(newEntry);

            euipmentTable.getItems().clear();
            euipmentTable.getItems().addAll(equipmentList);

            projectIDTextField.clear();
            equipmentTextField.getSelectionModel().clearSelection();
            System.out.println(equipmentName + " assigned to Project " + projectID);
        }
    }

    @javafx.fxml.FXML
    public void NextpageButton(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"Razin_2420842/ShipProgress.fxml");
    }
}