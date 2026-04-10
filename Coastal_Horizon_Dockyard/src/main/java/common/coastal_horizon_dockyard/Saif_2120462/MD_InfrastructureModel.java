package common.coastal_horizon_dockyard.Saif_2120462;

public class MD_InfrastructureModel {

    private int proposalIDColumn;
    private int vendorIDColumn;
    private String vendorNameColumn;
    private String contractPeriodColumn;
    private Double estimatedCostColumn;
    private String statusColumn;
    private String currenCapacity;
    private String projectedCapacity;

    public MD_InfrastructureModel(int proposalIDColumn, int vendorIDColumn, String vendorNameColumn, String contractPeriodColumn, Double estimatedCostColumn, String statusColumn, String currenCapacity, String projectedCapacity) {
        this.proposalIDColumn = proposalIDColumn;
        this.vendorIDColumn = vendorIDColumn;
        this.vendorNameColumn = vendorNameColumn;
        this.contractPeriodColumn = contractPeriodColumn;
        this.estimatedCostColumn = estimatedCostColumn;
        this.statusColumn = statusColumn;
        this.currenCapacity = currenCapacity;
        this.projectedCapacity = projectedCapacity;
    }

    public int getProposalIDColumn() {
        return proposalIDColumn;
    }

    public void setProposalIDColumn(int proposalIDColumn) {
        this.proposalIDColumn = proposalIDColumn;
    }

    public int getVendorIDColumn() {
        return vendorIDColumn;
    }

    public void setVendorIDColumn(int vendorIDColumn) {
        this.vendorIDColumn = vendorIDColumn;
    }

    public String getVendorNameColumn() {
        return vendorNameColumn;
    }

    public void setVendorNameColumn(String vendorNameColumn) {
        this.vendorNameColumn = vendorNameColumn;
    }

    public String getContractPeriodColumn() {
        return contractPeriodColumn;
    }

    public void setContractPeriodColumn(String contractPeriodColumn) {
        this.contractPeriodColumn = contractPeriodColumn;
    }

    public Double getEstimatedCostColumn() {
        return estimatedCostColumn;
    }

    public void setEstimatedCostColumn(Double estimatedCostColumn) {
        this.estimatedCostColumn = estimatedCostColumn;
    }

    public String getStatusColumn() {
        return statusColumn;
    }

    public void setStatusColumn(String statusColumn) {
        this.statusColumn = statusColumn;
    }

    public String getCurrenCapacity() {
        return currenCapacity;
    }

    public void setCurrenCapacity(String currenCapacity) {
        this.currenCapacity = currenCapacity;
    }

    public String getProjectedCapacity() {
        return projectedCapacity;
    }

    public void setProjectedCapacity(String projectedCapacity) {
        this.projectedCapacity = projectedCapacity;
    }

    @Override
    public String toString() {
        return "MD_InfrastructureModel{" +
                "proposalIDColumn=" + proposalIDColumn +
                ", vendorIDColumn=" + vendorIDColumn +
                ", vendorNameColumn='" + vendorNameColumn + '\'' +
                ", contractPeriodColumn='" + contractPeriodColumn + '\'' +
                ", estimatedCostColumn=" + estimatedCostColumn +
                ", statusColumn='" + statusColumn + '\'' +
                ", currenCapacity='" + currenCapacity + '\'' +
                ", projectedCapacity='" + projectedCapacity + '\'' +
                '}';
    }
}
