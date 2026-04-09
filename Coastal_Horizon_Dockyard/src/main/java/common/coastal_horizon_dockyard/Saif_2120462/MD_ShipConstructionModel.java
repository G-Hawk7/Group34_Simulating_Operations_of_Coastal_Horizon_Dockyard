package common.coastal_horizon_dockyard.Saif_2120462;

public class MD_ShipConstructionModel {

    private int contractIDColumn;
    private String clientNameColumn;
    private String financialStatusColumn;
    private Double profitMarginColumn;
    private String capacityColumn;
    private String statusColumn;

    public MD_ShipConstructionModel(int contractIDColumn, String clientNameColumn, String financialStatusColumn, Double profitMarginColumn, String capacityColumn, String statusColumn) {
        this.contractIDColumn = contractIDColumn;
        this.clientNameColumn = clientNameColumn;
        this.financialStatusColumn = financialStatusColumn;
        this.profitMarginColumn = profitMarginColumn;
        this.capacityColumn = capacityColumn;
        this.statusColumn = "Pending";
    }

    public int getContractIDColumn() {
        return contractIDColumn;
    }

    public void setContractIDColumn(int contractIDColumn) {
        this.contractIDColumn = contractIDColumn;
    }

    public String getClientNameColumn() {
        return clientNameColumn;
    }

    public void setClientNameColumn(String clientNameColumn) {
        this.clientNameColumn = clientNameColumn;
    }

    public String getFinancialStatusColumn() {
        return financialStatusColumn;
    }

    public void setFinancialStatusColumn(String financialStatusColumn) {
        this.financialStatusColumn = financialStatusColumn;
    }

    public Double getProfitMarginColumn() {
        return profitMarginColumn;
    }

    public void setProfitMarginColumn(Double profitMarginColumn) {
        this.profitMarginColumn = profitMarginColumn;
    }

    public String getCapacityColumn() {
        return capacityColumn;
    }

    public void setCapacityColumn(String capacityColumn) {
        this.capacityColumn = capacityColumn;
    }

    public String getStatusColumn() {
        return statusColumn;
    }

    public void setStatusColumn(String statusColumn) {
        this.statusColumn = statusColumn;
    }

    @Override
    public String toString() {
        return "MD_ShipConstructionModel{" +
                "contractIDColumn=" + contractIDColumn +
                ", clientNameColumn='" + clientNameColumn + '\'' +
                ", financialStatusColumn='" + financialStatusColumn + '\'' +
                ", profitMarginColumn=" + profitMarginColumn +
                ", capacityColumn='" + capacityColumn + '\'' +
                ", statusColumn='" + statusColumn + '\'' +
                '}';
    }
}
