package common.coastal_horizon_dockyard.Razin_2420842;

import common.coastal_horizon_dockyard.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class DockAllocationController
{
    @javafx.fxml.FXML
    private ComboBox<String> dockcombobox;
    @javafx.fxml.FXML
    private TextField shipidTextField;
    @javafx.fxml.FXML
    private TextField arrivaldateTextField;
    @javafx.fxml.FXML
    private TextField sizeTextField;

    ArrayList<DockAllocationMS> allocationList = new ArrayList<>();
    @javafx.fxml.FXML
    private TableColumn<DockAllocationMS, String> arrivaldatecol;
    @javafx.fxml.FXML
    private TableColumn<DockAllocationMS, String> shipidcol;
    @javafx.fxml.FXML
    private TableColumn<DockAllocationMS, String> dockcol;
    @javafx.fxml.FXML
    private TableView<DockAllocationMS> TableDockallocation;
    @javafx.fxml.FXML
    private TableColumn<DockAllocationMS, String> sizecol;

    ArrayList<DockAllocationMS> alllist = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        dockcombobox.getItems().addAll("Dock A", "Dock B", "Dock C");

        shipidcol.setCellValueFactory(new PropertyValueFactory<>("shipID"));
        sizecol.setCellValueFactory(new PropertyValueFactory<>("size"));
        arrivaldatecol.setCellValueFactory(new PropertyValueFactory<>("arrivalDate"));
        dockcol.setCellValueFactory(new PropertyValueFactory<>("dock"));

    }

    @javafx.fxml.FXML
    public void AssignButton(ActionEvent actionEvent) {
        String id = shipidTextField.getText();
        String size = sizeTextField.getText();
        String date = arrivaldateTextField.getText();
        String dock = dockcombobox.getValue();

        DockAllocationMS newAllocation = new DockAllocationMS(id, size, date, dock);


        alllist.add(newAllocation);


        TableDockallocation.getItems().clear();
        TableDockallocation.getItems().addAll(alllist);

        shipidTextField.clear();
        sizeTextField.clear();
        arrivaldateTextField.clear();
        dockcombobox.getSelectionModel().clearSelection();
    }

    @javafx.fxml.FXML
    public void NExtButton(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"Razin_2420842/ScheduleTimeline.fxml");
    }
}