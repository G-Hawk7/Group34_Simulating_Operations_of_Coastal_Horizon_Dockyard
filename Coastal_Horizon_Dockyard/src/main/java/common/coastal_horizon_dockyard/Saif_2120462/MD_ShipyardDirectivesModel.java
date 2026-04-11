package common.coastal_horizon_dockyard.Saif_2120462;

import java.time.LocalDate;

public class MD_ShipyardDirectivesModel {

    private int noticeIDColumn;
    private String titleColumn;
    private LocalDate effectiveDateColumn;

    private String titleTextField;
    private String messageTextArea;

    public MD_ShipyardDirectivesModel(int noticeIDColumn, String titleColumn, LocalDate effectiveDateColumn, String titleTextField, String messageTextArea) {
        this.noticeIDColumn = noticeIDColumn;
        this.titleColumn = titleColumn;
        this.effectiveDateColumn = effectiveDateColumn;
        this.titleTextField = titleTextField;
        this.messageTextArea = messageTextArea;
    }

    public MD_ShipyardDirectivesModel(Integer id, String title, String message, LocalDate effectiveDate) {
    }

    public int getNoticeIDColumn() {
        return noticeIDColumn;
    }

    public void setNoticeIDColumn(int noticeIDColumn) {
        this.noticeIDColumn = noticeIDColumn;
    }

    public String getTitleColumn() {
        return titleColumn;
    }

    public void setTitleColumn(String titleColumn) {
        this.titleColumn = titleColumn;
    }

    public LocalDate getEffectiveDateColumn() {
        return effectiveDateColumn;
    }

    public void setEffectiveDateColumn(LocalDate effectiveDateColumn) {
        this.effectiveDateColumn = effectiveDateColumn;
    }

    public String getTitleTextField() {
        return titleTextField;
    }

    public void setTitleTextField(String titleTextField) {
        this.titleTextField = titleTextField;
    }

    public String getMessageTextArea() {
        return messageTextArea;
    }

    public void setMessageTextArea(String messageTextArea) {
        this.messageTextArea = messageTextArea;
    }

    @Override
    public String toString() {
        return "MD_ShipyardDirectivesModel{" +
                "noticeIDColumn=" + noticeIDColumn +
                ", titleColumn='" + titleColumn + '\'' +
                ", effectiveDateColumn=" + effectiveDateColumn +
                ", titleTextField='" + titleTextField + '\'' +
                ", messageTextArea='" + messageTextArea + '\'' +
                '}';
    }
}
