package classroom;

public class Car {

    private int doorCount;
    private String label;
    private String color;

    public void setColor(String color) {
        this.color = color;
    }


    public String getColor() {
        return color;
    }

    public Car(String label) {
        this.label = label;
    }


    public Car() {
    }

    public String getLabel() {
        return label;
    }
}

