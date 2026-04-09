package common.coastal_horizon_dockyard.Saif_2120462;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class MD_RevenueAndExpenditureController {

    @FXML
    private TableColumn<?, ?> actualSpendingColumn;

    @FXML
    private TableColumn<?, ?> budgetedAmountColumn;

    @FXML
    private TableColumn<?, ?> expenseCategoryColumn;

    @FXML
    private TableView<?> financialVarianceTableView;

    @FXML
    private ComboBox<?> fiscalYearComboBox;

    @FXML
    private Label netProfitLossLabel;

    @FXML
    private Label operationalCostsLabel;

    @FXML
    private TableColumn<?, ?> reportIDColumn;

    @FXML
    private PieChart revenueExpenditurePieChart;

    @FXML
    private Label totalRevenueLabel;

    @FXML
    private TableColumn<?, ?> varianceColumn;

    @FXML
    void selectsYearOnDropdown(ActionEvent event) {

    }

}
