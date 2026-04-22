package common.coastal_horizon_dockyard.Rejwan_2030588;

import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class Menu
{
    @javafx.fxml.FXML
    private TextField NameTextFeild;
    @javafx.fxml.FXML
    private ComboBox<Integer> designationComboBox;
    @javafx.fxml.FXML
    private TextField IDTextField;

    @javafx.fxml.FXML
    public void initialize() {
        designationComboBox.getItems().addAll(0, 1, 2, 3, 4, 5, 6);

    }}