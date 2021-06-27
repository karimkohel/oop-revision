package revision;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Car color: ");
        String color = scan.nextLine();
        System.out.print("Enter Car speed: ");
        int speed = scan.nextInt();
        System.out.print("Enter Car Fuel capacity: ");
        int fuelCap = scan.nextInt();

        Engine engine = new Engine(1600, 210);

        Car c = new Car(fuelCap, engine, speed, color);

        System.out.println("Car = " + c.toString());

    }

    public static void forExample(){
        int[] array = {1,2,3,4,5};
        // example for for-loop
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
            // or to add in array
//            array[i] = i;
        }
        //enhanced for-loops
        for(int num : array){
            System.out.println(num);
        }
    }


}


