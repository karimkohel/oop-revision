package revision;

public class Printer {
    public static void vehiclePrinter(Vehicle v){
        // use instanceof to compare objects and their types
        // in generic methods question
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
