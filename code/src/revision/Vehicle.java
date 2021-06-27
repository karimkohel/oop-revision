package revision;

public abstract class Vehicle {
    private int speed;
    protected String color;

    public Vehicle() {
    }

    public Vehicle(Vehicle original){
        this.speed = original.speed;
        this.color = original.color;
    }

    public Vehicle(int speed, String color) {
        this.speed = speed;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", color='" + color + '\'' +
                '}';
    }
}
