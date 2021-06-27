package revision;

public class Car extends Vehicle{
    private int fuelCapacity;
    Engine engine;

    Car(){

    }

    //copy
    Car(Car origin){
        super(origin);
        this.fuelCapacity = origin.fuelCapacity;
        this.engine = origin.engine;
    }

    //arg based
    public Car(String color , int speed,int fuelCapacity, Engine engine) {
        super(color,speed)
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
