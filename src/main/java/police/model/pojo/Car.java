package police.model.pojo;

public class Car {
    private String carId;
    private String ownerName;
    private String model;
    private String color;

    public Car() {
    }

    public Car(String carId, String ownerName) {
        this.carId = carId;
        this.ownerName = ownerName;
    }

    public Car(String carId, String ownerName, String model, String color) {
        this.carId = carId;
        this.ownerName = ownerName;
        this.model = model;
        this.color = color;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId='" + carId + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
