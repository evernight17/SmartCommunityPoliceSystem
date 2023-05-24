package police.model.pojo;

public class Device {
    private String deviceId;
    private String type;
    private String location;
    private String status;

    public Device() {
    }

    public Device(String deviceId, String location, String status) {
        this.deviceId = deviceId;
        this.location = location;
        this.status = status;
    }

    public Device(String deviceId, String type, String location, String status) {
        this.deviceId = deviceId;
        this.type = type;
        this.location = location;
        this.status = status;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Device{" +
                "deviceId='" + deviceId + '\'' +
                ", type='" + type + '\'' +
                ", location='" + location + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
