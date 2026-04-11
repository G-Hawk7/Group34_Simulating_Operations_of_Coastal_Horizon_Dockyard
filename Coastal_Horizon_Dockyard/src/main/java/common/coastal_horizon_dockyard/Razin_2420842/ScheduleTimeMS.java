package common.coastal_horizon_dockyard.Razin_2420842;

public class ScheduleTimeMS {
    private String projectID;
    private String duration;

    public ScheduleTimeMS(String projectID, String duration) {
        this.projectID = projectID;
        this.duration = duration;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "ScheduleTimeMS{" +
                "projectID='" + projectID + '\'' +
                ", duration=" + duration +
                '}';
    }
}
