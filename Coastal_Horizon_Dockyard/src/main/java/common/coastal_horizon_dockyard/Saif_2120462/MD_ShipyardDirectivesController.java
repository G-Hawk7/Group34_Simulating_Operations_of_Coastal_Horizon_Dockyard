package common.coastal_horizon_dockyard.Saif_2120462;

import common.coastal_horizon_dockyard.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import java.time.LocalDate;

public class MD_ShipyardDirectivesController {

    @FXML
    private Button broadcastButton;

    @FXML
    private Label broadcastSuccesLabel;

    @FXML
    private TableView<MD_ShipyardDirectivesModel> directiveTableView;

    @FXML
    private TableColumn<MD_ShipyardDirectivesModel, LocalDate> effectiveDateColumn;

    @FXML
    private DatePicker effectiveDatePicker;

    @FXML
    private TextArea messageTextArea;

    @FXML
    private TableColumn<MD_ShipyardDirectivesModel, Integer> noticeIDColumn;

    @FXML
    private TableColumn<MD_ShipyardDirectivesModel, String> titleColumn;

    @FXML
    private TextField titleTextField;

    private ObservableList<MD_ShipyardDirectivesModel> historyList = FXCollections.observableArrayList();

    public ObservableList<MD_ShipyardDirectivesModel> getHistoryList() {
        return historyList;
    }
    public void setHistoryList(ObservableList<MD_ShipyardDirectivesModel> historyList) {
        this.historyList = historyList;
    }

    private int idCounter = 100;

    public int getIdCounter() {
        return idCounter;
    }
    public void setIdCounter(int idCounter) {
        this.idCounter = idCounter;
    }

    @FXML
    public void initialize() {
        noticeIDColumn.setCellValueFactory(new PropertyValueFactory<>("noticeIDColumn"));
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("titleColumn"));
        effectiveDateColumn.setCellValueFactory(new PropertyValueFactory<>("effectiveDateColumn"));

        directiveTableView.setItems(historyList);
        broadcastSuccesLabel.setVisible(false);
    }

    @FXML
    void backToMDDashboardOnClick(ActionEvent event) {

        SceneSwitcher.switchTo(event, "Saif_2120462/ManagingDirector.fxml");

    }

    @FXML
    void broadcastMessageOnClick(ActionEvent event) {
        idCounter++;
        Integer id = idCounter;
        String title = titleTextField.getText();
        String message = messageTextArea.getText();
        LocalDate effectiveDate = effectiveDatePicker.getValue();

        MD_ShipyardDirectivesModel newDirective = new MD_ShipyardDirectivesModel(id, title, message, effectiveDate);

        historyList.add(newDirective);
        broadcastSuccesLabel.setVisible(true);

    }

}
   // Invalid info showing in the table when running this scene, probably build error//