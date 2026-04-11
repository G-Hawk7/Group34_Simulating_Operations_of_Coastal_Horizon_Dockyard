package common.coastal_horizon_dockyard.Razin_2420842;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class PermitSytemController
{
    @javafx.fxml.FXML
    private ToggleGroup GroupA;
    @javafx.fxml.FXML
    private TextField requestDetailsTextField;
    @javafx.fxml.FXML
    private TextField dateTextfield;
    @javafx.fxml.FXML
    private TableColumn<MS_PermitSystem ,String> dateCol;
    @javafx.fxml.FXML
    private TableView<MS_PermitSystem> fulltable;
    @javafx.fxml.FXML
    private TableColumn<MS_PermitSystem ,String> approvalcol;
    @javafx.fxml.FXML
    private TableColumn<MS_PermitSystem ,String> requestcol;
    @javafx.fxml.FXML
    private RadioButton norediobutton;
    @javafx.fxml.FXML
    private RadioButton yesRedioButton;
    @javafx.fxml.FXML
    private Label outputlabel;

    @javafx.fxml.FXML
    public void initialize() {
        dateCol.setCellValueFactory(new PropertyValueFactory<>("Date"));
        requestcol.setCellValueFactory(new PropertyValueFactory<>("request"));
        approvalcol.setCellValueFactory(new PropertyValueFactory<>("status"));
    }
    private ArrayList<MS_PermitSystem> permitList = new ArrayList<>();

    @javafx.fxml.FXML
    public void generatepermitButton(ActionEvent actionEvent) {
        String date = dateTextfield.getText();
        String request = requestDetailsTextField.getText();
        String status;
        if (yesRedioButton.isSelected()) {
            status = "Yes!";
        } else if (norediobutton.isSelected()) {
            status = "No";
        } else {
            outputlabel.setText("Please select approval status.");
            return;
        }

        MS_PermitSystem p = new MS_PermitSystem(date, request, status);
        permitList.add(p);

        fulltable.getItems().clear();
        fulltable.getItems().addAll(permitList);

        }


    @javafx.fxml.FXML
    public void nextButton(ActionEvent actionEvent) {
        
    }
}