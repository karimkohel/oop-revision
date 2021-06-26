package revision;

public class Printer {
    public static void vehiclePrinter(Vehicle v){
        if(v instanceof Boat){
            ((Boat) v).printCrewNumber();
        }
        else if(v instanceof Car){
            ((Car) v).printFuelRemain();
        }
        else{
            System.out.println("Unsupported type of vehicle");
        }
    }
}
