package common.coastal_horizon_dockyard.Saif_2120462;

public class PM_EngTeamMgtModel {

    private int teamIDColumn;
    private String teamNameColumn;
    private String specializationColumn;
    private int memberCountColumn;

    public PM_EngTeamMgtModel(int teamIDColumn, String teamNameColumn, String specializationColumn, int memberCountColumn) {
        this.teamIDColumn = teamIDColumn;
        this.teamNameColumn = teamNameColumn;
        this.specializationColumn = specializationColumn;
        this.memberCountColumn = memberCountColumn;
    }

    public int getTeamIDColumn() {
        return teamIDColumn;
    }

    public void setTeamIDColumn(int teamIDColumn) {
        this.teamIDColumn = teamIDColumn;
    }

    public String getTeamNameColumn() {
        return teamNameColumn;
    }

    public void setTeamNameColumn(String teamNameColumn) {
        this.teamNameColumn = teamNameColumn;
    }

    public String getSpecializationColumn() {
        return specializationColumn;
    }

    public void setSpecializationColumn(String specializationColumn) {
        this.specializationColumn = specializationColumn;
    }

    public int getMemberCountColumn() {
        return memberCountColumn;
    }

    public void setMemberCountColumn(int memberCountColumn) {
        this.memberCountColumn = memberCountColumn;
    }

    @Override
    public String toString() {
        return "PM_EngTeamMgtModel{" +
                "teamIDColumn=" + teamIDColumn +
                ", teamNameColumn='" + teamNameColumn + '\'' +
                ", specializationColumn='" + specializationColumn + '\'' +
                ", memberCountColumn=" + memberCountColumn +
                '}';
    }
}
