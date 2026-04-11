package common.coastal_horizon_dockyard.Razin_2420842;

public class MS_PermitSystem {
    private String date ;
    private String request ;
    private String status ;

    public MS_PermitSystem(String date, String request, String status) {
        this.date = date;
        this.request = request;
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
