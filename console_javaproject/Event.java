package JavaProject;

import java.io.Serializable;

public class Event implements Serializable {

    private static final long serialVersionUID = 1L;

    private String eventId;
    private String eventName;
    private String description;
    private String date;
    private String location;
    private String organizer;

    public Event(String eventId, String eventName, String description,
                 String date, String location, String organizer) {

        this.eventId = eventId;
        this.eventName = eventName;
        this.description = description;
        this.date = date;
        this.location = location;
        this.organizer = organizer;
    }

    public String getEventId() {
        return eventId;
    }

    public String getEventName() {
        return eventName;
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

    public String getOrganizer() {
        return organizer;
    }
}