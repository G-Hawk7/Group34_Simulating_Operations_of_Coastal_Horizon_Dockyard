package common.coastal_horizon_dockyard.Razin_2420842;

import common.coastal_horizon_dockyard.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class PPEInventoryController
{
    @javafx.fxml.FXML
    private TextField requestitemTextField;
    @javafx.fxml.FXML
    private TextField quantityTextField;
    @javafx.fxml.FXML
    private TableColumn<PPEInventoryMS, String> AvailableCol;
    @javafx.fxml.FXML
    private TableColumn<PPEInventoryMS, String> quantityCol;
    @javafx.fxml.FXML
    private TableColumn<PPEInventoryMS, String> requestIteamCol;
    @javafx.fxml.FXML
    private TableView<PPEInventoryMS> ppeTable;

    ArrayList<PPEInventoryMS> ppeList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        requestIteamCol.setCellValueFactory(new PropertyValueFactory<>("iteam"));
        quantityCol.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        AvailableCol.setCellValueFactory(new PropertyValueFactory<>("Available"));
    }

    @javafx.fxml.FXML
    public void sendrequestButton(ActionEvent actionEvent) {
        String item = requestitemTextField.getText();
        String quantity = quantityTextField.getText();
        String available = "Checking...";

        PPEInventoryMS newRequest = new PPEInventoryMS(item, quantity, available);
        ppeList.add(newRequest);

        ppeTable.getItems().setAll(ppeList);


        requestitemTextField.clear();
        quantityTextField.clear();
    }

    @javafx.fxml.FXML
    public void nextButton(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"Razin_2420842/EquipmentCertificate.fxml");
    }
}