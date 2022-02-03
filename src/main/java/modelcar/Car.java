package modelcar;

public class Car {
    private String modelCar;
    private String color;
    private int count;

    public Car(String modelCar, String color, int count) {
        this.modelCar = modelCar;
        this.color = color;
        this.count = count;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModel(String model) {
        this.modelCar = modelCar;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
