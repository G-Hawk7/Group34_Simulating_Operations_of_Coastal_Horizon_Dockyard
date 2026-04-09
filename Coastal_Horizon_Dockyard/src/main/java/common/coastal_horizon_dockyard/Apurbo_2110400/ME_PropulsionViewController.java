package common.coastal_horizon_dockyard.Apurbo_2110400;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ME_PropulsionViewController
{
    @javafx.fxml.FXML
    private TableView<ME_PropulsionModel> propulsionDataTableView;
    @javafx.fxml.FXML
    private TableColumn<ME_PropulsionModel, String> propulsionConditionStatusTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> propulsionConditionStatusComboBox;
    @javafx.fxml.FXML
    private DatePicker propulsionInspectionDateDP;
    @javafx.fxml.FXML
    private TableColumn<ME_PropulsionModel, LocalDate> propulsionInspectionDateTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ME_PropulsionModel, String> propulsionRemarksTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> propulsionEngineComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> propulsionShipComboBox;
    @javafx.fxml.FXML
    private TextArea propulsionRemarksTextArea;
    @javafx.fxml.FXML
    private TableColumn<ME_PropulsionModel, String> propulsionShipTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ME_PropulsionModel, String> propulsionEngineTableColumn;


    public static List<ME_PropulsionModel> dataList = new ArrayList<>();
    @javafx.fxml.FXML

    private AnchorPane propulsionMainPane;


    @javafx.fxml.FXML
    public void initialize() {

        propulsionShipComboBox.getItems().addAll("Container", "Bulk Carrier", "Oil Tanker", "Cruise", "Ferry", "Icebreaker", "Dredger");
        propulsionEngineComboBox.getItems().addAll("Two-Stroke Diesel", "Four-Stroke Diesel", "Slow-Speed Marine", "High-Speed Marine", "Steam Turbine", "Gas Turbine", "Hybrid Electric", "Turbo Electric");
        propulsionConditionStatusComboBox.getItems().addAll("Fine", "Caution", "Danger");

        propulsionShipTableColumn.setCellValueFactory(new PropertyValueFactory<>("ship"));
        propulsionEngineTableColumn.setCellValueFactory(new PropertyValueFactory<>("engine"));
        propulsionInspectionDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("inspectionDate"));
        propulsionConditionStatusTableColumn.setCellValueFactory(new PropertyValueFactory<>("conditionStatus"));
        propulsionRemarksTableColumn.setCellValueFactory(new PropertyValueFactory<>("remarks"));

        propulsionDataTableView.getItems().setAll(dataList);

    }


    @javafx.fxml.FXML
    void propulsionAddPropulsionDataButtonOnAction(ActionEvent actionEvent) {

        String ship = propulsionShipComboBox.getValue();
        String engine = propulsionEngineComboBox.getValue();
        String conditionStatus = propulsionConditionStatusComboBox.getValue();
        String remarks = propulsionRemarksTextArea.getText();
        LocalDate inspectionDate = propulsionInspectionDateDP.getValue();

        if(ship.isEmpty()||engine.isEmpty()||conditionStatus.isEmpty()||remarks.isEmpty()||inspectionDate==null){
            Alert warning = new Alert(Alert.AlertType.ERROR);
            warning.setContentText("All Fields Must Be Filled!");
            warning.show();
            return;
        }

        ME_PropulsionModel newData = new ME_PropulsionModel(ship, engine, conditionStatus, remarks, inspectionDate);
        propulsionDataTableView.getItems().add(newData);

        Alert success = new Alert(Alert.AlertType.INFORMATION);
        success.setContentText("Propulsion Data Added Successfully.");
        success.show();
    }



    @javafx.fxml.FXML
    public void backOnClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Apurbo_2110400/MarineEngineerView.fxml"));
        Node node = fxmlLoader.load();
        propulsionMainPane.getChildren().setAll(node);

    }
}