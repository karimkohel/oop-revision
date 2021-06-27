package revision;

public class Car extends Vehicle{
    private int fuelCapacity;
    private Engine engine;

    Car(){

    }

    Car(Car origin){
        this.fuelCapacity = origin.fuelCapacity;
        this.engine = origin.engine;
    }

    public Car(int fuelCapacity, Engine engine) {
        this.fuelCapacity = fuelCapacity;
        this.engine = engine;
    }

    public void printFuelRemain(){
        System.out.println("Fuel Remaining : "+ fuelCapacity); // TODO
    }

    @Override
    public String toString() {
        return super.toString() + "Car{" +
                "fuelCapacity=" + fuelCapacity +
                ", engine=" + engine +
                '}';
    }
}
