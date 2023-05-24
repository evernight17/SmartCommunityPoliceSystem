package police.model.pojo;

public class Event {
    private String eventId;
    private String reporter;
    private String type;
    private String location;
    private String time;
    private String description;
    private String status;

    public Event() {
    }

    public Event(String eventId, String reporter, String type, String time, String status) {
        this.eventId = eventId;
        this.reporter = reporter;
        this.type = type;
        this.time = time;
        this.status = status;
    }

    public Event(String eventId, String reporter, String type, String location, String time, String description, String status) {
        this.eventId = eventId;
        this.reporter = reporter;
        this.type = type;
        this.location = location;
        this.time = time;
        this.description = description;
        this.status = status;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Device{" +
                "eventId='" + eventId + '\'' +
                ", reporter='" + reporter + '\'' +
                ", type='" + type + '\'' +
                ", location='" + location + '\'' +
                ", time='" + time + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
