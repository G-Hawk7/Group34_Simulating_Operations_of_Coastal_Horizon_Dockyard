package common.coastal_horizon_dockyard.Razin_2420842;

public class IncidentReportMS {
    private String name;
    private String id;
    private String date;
    private String severity;
    private String Description;

    public IncidentReportMS(String name, String id, String date, String severity, String description) {
        this.name = name;
        this.id = id;
        this.date = date;
        this.severity = severity;
        Description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
