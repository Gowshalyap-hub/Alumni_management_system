package JavaProject;

import java.io.Serializable;

public class Report implements Serializable {

    private static final long serialVersionUID = 1L;

    private String reportId;
    private String reportType;
    private String date;
    private String reportDetails;

    public Report(String reportId, String reportType,
                  String date, String reportDetails) {

        this.reportId = reportId;
        this.reportType = reportType;
        this.date = date;
        this.reportDetails = reportDetails;
    }

    public String getReportId() {
        return reportId;
    }

    public String getReportType() {
        return reportType;
    }

    public String getDate() {
        return date;
    }

    public String getReportDetails() {
        return reportDetails;
    }
}