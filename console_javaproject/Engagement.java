package JavaProject;

import java.io.Serializable;

public class Engagement implements Serializable {

    private static final long serialVersionUID = 1L;

    private String engagementId;
    private String alumniId;
    private String engagementType;
    private String description;
    private String date;
    private String location;
    private String status;

    public Engagement(String engagementId, String alumniId,
                      String engagementType, String description,
                      String date, String location, String status) {

        this.engagementId = engagementId;
        this.alumniId = alumniId;
        this.engagementType = engagementType;
        this.description = description;
        this.date = date;
        this.location = location;
        this.status = status;
    }

    public String getEngagementId() {
        return engagementId;
    }

    public String getAlumniId() {
        return alumniId;
    }

    public String getEngagementType() {
        return engagementType;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public String getStatus() {
        return status;
    }
}