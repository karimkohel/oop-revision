package revision;

import java.util.*;

public class Boat extends Vehicle{
    public static final int MAXSPEED = 60;
    public List<Engine> engines = new ArrayList<Engine>(3);
    private int numCrew;

    Boat(){

    }


    public Boat(int speed, String color, List<Engine> engines, int numCrew) {
        super(speed, color);
        this.engines = engines;
        this.numCrew = numCrew;
    }

    Boat(Boat original){
        // for list use addAll method instead of for loop
        super(original);
        this.engines.addAll(original.engines);
        this.numCrew = original.numCrew;
    }

    public void printCrewNumber(){
        System.out.println("Crew num: " + numCrew);
    }

    @Override
    public String toString() {
        return super.toString() + "Boat{" +
                "engines=" + engines +
                ", numCrew=" + numCrew +
                '}';
    }
}
