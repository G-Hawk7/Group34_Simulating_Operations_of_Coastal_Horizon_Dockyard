package common.coastal_horizon_dockyard.Apurbo_2110400;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ME_DiagnosisViewController
{
    @javafx.fxml.FXML
    private TableColumn<ME_DiagnosisModel, String> diagnosisFaultDetailsTableColumn;
    @javafx.fxml.FXML
    private TextArea diagnosisFaultDetailsTextArea;
    @javafx.fxml.FXML
    private TextField diagnosisEngineIDTextField;
    @javafx.fxml.FXML
    private TableView<ME_DiagnosisModel> diagnosisTableView;
    @javafx.fxml.FXML
    private TableColumn<ME_DiagnosisModel, String> diagnosisErrorCodeTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> diagnosisFaultStatusComboBox;
    @javafx.fxml.FXML
    private TableColumn<ME_DiagnosisModel, Integer> diagnosisEngineIDTableColumn;
    @javafx.fxml.FXML
    private TextField diagnosisErrorCodeTextField;
    @javafx.fxml.FXML
    private TableColumn<ME_DiagnosisModel, String> diagnosisFaultStatusTableColumn;
    @javafx.fxml.FXML
    private AnchorPane diagnosisMainPane;


    public static List<ME_DiagnosisModel> dataList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        diagnosisFaultStatusComboBox.getItems().addAll("Minor Faults", "Partially Damaged", "Critical Failure");

        diagnosisEngineIDTableColumn.setCellValueFactory(new PropertyValueFactory<>("engineID"));
        diagnosisErrorCodeTableColumn.setCellValueFactory(new PropertyValueFactory<>("errorCode"));
        diagnosisFaultStatusTableColumn.setCellValueFactory(new PropertyValueFactory<>("faultStatus"));
        diagnosisFaultDetailsTableColumn.setCellValueFactory(new PropertyValueFactory<>("faultDetails"));

        diagnosisTableView.getItems().setAll(dataList);

    }


    @javafx.fxml.FXML
    public void diagnosisRunDiagnosticsButtonOnAction(ActionEvent actionEvent) {

       String engineID = diagnosisEngineIDTextField.getText();
       String errorCode = diagnosisErrorCodeTextField.getText();
       String faultStatus = diagnosisFaultStatusComboBox.getValue();
       String faultDetails = diagnosisFaultDetailsTextArea.getText();

       if(engineID.isEmpty()||errorCode.isEmpty()||faultStatus.isEmpty()||faultDetails.isEmpty()){
           Alert warning = new Alert(Alert.AlertType.ERROR);
           warning.setContentText("All Fields Must Be Filled!");
           warning.show();
           return;
       }

       ME_DiagnosisModel newData = new ME_DiagnosisModel(engineID, errorCode, faultStatus, faultDetails);
       diagnosisTableView.getItems().add(newData);

       Alert success = new Alert(Alert.AlertType.INFORMATION);
       success.setContentText("Diagnostics Ran Successfully");
       success.show();

    }

    @javafx.fxml.FXML
    public void backOnClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Apurbo_2110400/MarineEngineerView.fxml"));
        Node node = fxmlLoader.load();
        diagnosisMainPane.getChildren().setAll(node);
    }
}