/**
 * Created by D.Cisero on 7/20/17.
 */

import java.util.ArrayList;
import java.util.Scanner;
//define second class
    //runs on console and needs main
public class CarApp {
    public static void main (String [] arg) {
        Scanner scan = new Scanner(System.in);

        int userInput;

        //push values to an array list, print list with a for loop
        ArrayList<Car> carInfo = new ArrayList<>();


        System.out.println("Welcome to the Grand Circus Motors admin console!");
        System.out.println();

        System.out.print("How many cars are you entering: ");
        userInput = scan.nextInt();
        System.out.println();

        //create for loop for user input
        for (int i = 0; i < userInput; i++) {
            Car car = new Car();

            System.out.print("Enter Car " + "#" +(i + 1) + " Make:");
            car.setMake(scan.next());

            System.out.print("Enter Car " + "#" +(i + 1) + " Model:");
            car.setModel(scan.next());

            System.out.print("Enter Car " + "#" +(i + 1) + " Year:");
            car.setYear(scan.nextInt());

            System.out.print("Enter Car " + "#" +(i + 1) + " Price:");
            car.setPrice(scan.nextDouble());
            System.out.println();

            carInfo.add(car);
        }
           System.out.println("...");
           System.out.println("Current Inventory:");

            for (Car car1 : carInfo) {
                System.out.println(car1.getMake() + "\t" + car1.getModel() + " " + "\t" +
                        car1.getYear() + "\t" + "$" + car1.getPrice());

            }
        }
        }


