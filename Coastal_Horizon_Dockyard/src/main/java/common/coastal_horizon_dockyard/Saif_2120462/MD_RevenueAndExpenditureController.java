package common.coastal_horizon_dockyard.Saif_2120462;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;

public class MD_RevenueAndExpenditureController {

    @FXML
    private TableColumn<MD_RevenueAndExpenditureModel, Double> actualSpendingColumn;

    @FXML
    private TableColumn<MD_RevenueAndExpenditureModel, Double> budgetedAmountColumn;

    @FXML
    private TableColumn<MD_RevenueAndExpenditureModel, String> expenseCategoryColumn;

    @FXML
    private TableView<MD_RevenueAndExpenditureModel> financialVarianceTableView;

    @FXML
    private ComboBox<String> fiscalYearComboBox;

    @FXML
    private Label netProfitLossLabel;

    @FXML
    private Label operationalCostsLabel;

    @FXML
    private TableColumn<MD_RevenueAndExpenditureModel, Integer> reportIDColumn;

    @FXML
    private PieChart revenueExpenditurePieChart;

    @FXML
    private Label totalRevenueLabel;

    @FXML
    private TableColumn<MD_RevenueAndExpenditureModel, Double> varianceColumn;


    private ObservableList<MD_RevenueAndExpenditureModel> financialVarianceList =  FXCollections.observableArrayList();

    public ObservableList<MD_RevenueAndExpenditureModel> getFinancialVarianceList() {
        return financialVarianceList;
    }

    public void setFinancialVarianceList(ObservableList<MD_RevenueAndExpenditureModel> financialVarianceList) {
        this.financialVarianceList = financialVarianceList;
    }

    public void initialize() {
        reportIDColumn.setCellValueFactory(new PropertyValueFactory<>("reportIDColumn"));
        expenseCategoryColumn.setCellValueFactory(new PropertyValueFactory<>("expenseCategoryColumn"));
        budgetedAmountColumn.setCellValueFactory(new PropertyValueFactory<>("budgetedAmountColumn"));
        actualSpendingColumn.setCellValueFactory(new PropertyValueFactory<>("actualSpendingColumn"));
        varianceColumn.setCellValueFactory(new PropertyValueFactory<>("varianceColumn"));

        financialVarianceTableView.setItems(financialVarianceList);
        fiscalYearComboBox.getItems().addAll("2024", "2025", "2026");

    }

    @FXML
    void selectsYearOnDropdown(ActionEvent event) {
        String selectedYear = fiscalYearComboBox.getSelectionModel().getSelectedItem();
        if (selectedYear == null) return;

        financialVarianceList.clear();
        revenueExpenditurePieChart.getData().clear();

        double totalRevenue = 0.0;

        switch (selectedYear) {
            case "2024":
                totalRevenue = 1500000.0;
                financialVarianceList.add(new MD_RevenueAndExpenditureModel(24-01, "Hull Assembly", 600000.0, 580000.0));
                financialVarianceList.add(new MD_RevenueAndExpenditureModel(24-02, "Crane Repair", 50000.0, 75000.0));
                break;

            case "2025":
                totalRevenue = 1800000.0;
                financialVarianceList.add(new MD_RevenueAndExpenditureModel(25-01, "Luxury Yacht Project", 900000.0, 950000.0));
                financialVarianceList.add(new MD_RevenueAndExpenditureModel(25-02, "IT Infrastructure", 100000.0, 90000.0));
                break;

            case "2026":
                totalRevenue = 2200000.0;
                financialVarianceList.add(new MD_RevenueAndExpenditureModel(26-01, "Cargo Ship Alpha", 1200000.0, 1150000.0));
                financialVarianceList.add(new MD_RevenueAndExpenditureModel(26-02, "Fuel Depot Expansion", 400000.0, 420000.0));
                break;
        }

        double totalExpenditure = 0.0;

        for (MD_RevenueAndExpenditureModel reportModel : financialVarianceList) {
            totalExpenditure += reportModel.getActualSpendingColumn();
        }
        double netProfitLoss = totalRevenue -  totalExpenditure;

        totalRevenueLabel.setText(String.format("%.2f", totalRevenue));
        operationalCostsLabel.setText(String.format("%.2f", totalExpenditure));
        netProfitLossLabel.setText(String.format("%.2f", netProfitLoss));

        PieChart.Data slice1 = new PieChart.Data("Revenue", totalRevenue);
        PieChart.Data slice2 = new PieChart.Data("Expenditure", totalExpenditure);
        revenueExpenditurePieChart.getData().addAll(slice1, slice2);

    }

    @FXML
    void backToMDDashboardOnClick(ActionEvent event) {

    }


}
