package common.coastal_horizon_dockyard.Razin_2420842;

public class safetyInspection {
    private String Date;
    private String issue1;
    private String issue2;
    private String issue3;
    private String safetyChecklist;

    public safetyInspection(String date, String issue1, String issue2, String safetyChecklist, String issue3) {
        Date = date;
        this.issue1 = issue1;
        this.issue2 = issue2;
        this.safetyChecklist = safetyChecklist;
        this.issue3 = issue3;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getIssue1() {
        return issue1;
    }

    public void setIssue1(String issue1) {
        this.issue1 = issue1;
    }

    public String getIssue2() {
        return issue2;
    }

    public void setIssue2(String issue2) {
        this.issue2 = issue2;
    }

    public String getIssue3() {
        return issue3;
    }

    public void setIssue3(String issue3) {
        this.issue3 = issue3;
    }

    public String getSafetyChecklist() {
        return safetyChecklist;
    }

    public void setSafetyChecklist(String safetyChecklist) {
        this.safetyChecklist = safetyChecklist;
    }
}