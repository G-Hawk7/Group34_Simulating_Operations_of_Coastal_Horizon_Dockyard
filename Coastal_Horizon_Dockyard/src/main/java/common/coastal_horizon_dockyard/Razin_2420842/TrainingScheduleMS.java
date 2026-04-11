package common.coastal_horizon_dockyard.Razin_2420842;

public class TrainingScheduleMS {
    private String date;
    private String groupname;
    private String trainingMo;
    private String time;

    public TrainingScheduleMS(String date, String groupname, String trainingMo, String time) {
        this.date = date;
        this.groupname = groupname;
        this.trainingMo = trainingMo;
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public String getTrainingMo() {
        return trainingMo;
    }

    public void setTrainingMo(String trainingMo) {
        this.trainingMo = trainingMo;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
