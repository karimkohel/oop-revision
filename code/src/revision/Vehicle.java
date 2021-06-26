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

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", color='" + color + '\'' +
                '}';
    }
}
