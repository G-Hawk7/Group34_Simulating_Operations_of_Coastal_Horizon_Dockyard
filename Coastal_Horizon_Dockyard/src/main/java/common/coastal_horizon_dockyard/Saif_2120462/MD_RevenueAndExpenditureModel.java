package common.coastal_horizon_dockyard.Saif_2120462;

public class MD_RevenueAndExpenditureModel {

    private int reportIdColumn;
    private String expenseCategoryColumn;
    private Double budgetedAmountColumn;
    private Double actualSpendingColumn;
    private Double varianceColumn;

    public MD_RevenueAndExpenditureModel(int reportIdColumn, String expenseCategoryColumn, Double budgetedAmountColumn, Double actualSpendingColumn, Double varianceColumn) {
        this.reportIdColumn = reportIdColumn;
        this.expenseCategoryColumn = expenseCategoryColumn;
        this.budgetedAmountColumn = budgetedAmountColumn;
        this.actualSpendingColumn = actualSpendingColumn;
        this.varianceColumn = actualSpendingColumn -  budgetedAmountColumn;
    }

    public int getReportIdColumn() {
        return reportIdColumn;
    }

    public void setReportIdColumn(int reportIdColumn) {
        this.reportIdColumn = reportIdColumn;
    }

    public String getExpenseCategoryColumn() {
        return expenseCategoryColumn;
    }

    public void setExpenseCategoryColumn(String expenseCategoryColumn) {
        this.expenseCategoryColumn = expenseCategoryColumn;
    }

    public Double getBudgetedAmountColumn() {
        return budgetedAmountColumn;
    }

    public void setBudgetedAmountColumn(Double budgetedAmountColumn) {
        this.budgetedAmountColumn = budgetedAmountColumn;
    }

    public Double getActualSpendingColumn() {
        return actualSpendingColumn;
    }

    public void setActualSpendingColumn(Double actualSpendingColumn) {
        this.actualSpendingColumn = actualSpendingColumn;
    }

    public Double getVarianceColumn() {
        return varianceColumn;
    }

    public void setVarianceColumn(Double varianceColumn) {
        this.varianceColumn = varianceColumn;
    }

    @Override
    public String toString() {
        return "MD_RevenueAndExpenditureModel{" +
                "reportIdColumn=" + reportIdColumn +
                ", expenseCategoryColumn='" + expenseCategoryColumn + '\'' +
                ", budgetedAmountColumn=" + budgetedAmountColumn +
                ", actualSpendingColumn=" + actualSpendingColumn +
                ", varianceColumn=" + varianceColumn +
                '}';
    }
}
