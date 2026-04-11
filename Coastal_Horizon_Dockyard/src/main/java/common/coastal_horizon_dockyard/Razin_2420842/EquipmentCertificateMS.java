package common.coastal_horizon_dockyard.Razin_2420842;

public class EquipmentCertificateMS {
    private String id;
    private String status;

    public EquipmentCertificateMS(String id, String status) {
        this.id = id;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "EquipmentCertificateMS{" +
                "id='" + id + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
