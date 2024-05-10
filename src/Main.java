import java.util.Scanner;

/*
This program essentially plays around with getters, setters, constructors, and user input to provide given information
for each vehicle object created for the vehicle class. The access modifier for the vehicle class properties is set to private
so that the initial values can't be tampered with. This is one good example of encapsulation, one of the four principles
of object-oriented programming.

The first vehicle created will display the hard coded values for vehicle 1

The second vehicle object created will display values taken in from the scnr object and then set the values for the
constructor that was created for vehicle 2.

The third vehicle object created will display values taken in from the scnr object and then set the values for the
constructor that was created for vehicle 2.
 */

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle vehicle1 = new Vehicle(); // VEHICLE 1
        Vehicle vehicle2 = new Vehicle(); // VEHICLE 2
        Vehicle vehicle3 = new Vehicle(); // VEHICLE 3


        System.out.println(vehicle.getMake() + " | " + vehicle.getYear() + " | " + vehicle.getMiles() + " | " + vehicle.getMpg());
        vehicle3.vehiclePrint("Honda", 2021, 23000, 23.0);


        Scanner scnr = new Scanner(System.in); //INPUT
        System.out.println("Please enter the make of vehicle 1: ");
        vehicle1.setMake(scnr.nextLine());

        System.out.println("Please enter the year of vehicle 1: ");
        vehicle1.setYear(scnr.nextInt());

        System.out.println("Please enter the miles of vehicle 1: ");
        vehicle1.setMiles(scnr.nextInt());

        System.out.println("Please enter the MPG of vehicle 1: ");
        vehicle1.setMpg(scnr.nextDouble());

        System.out.println("How many miles will you DRIVE on vehicle 1");
        vehicle1.drive(scnr.nextInt());


        System.out.print("Your MAKE: " + vehicle1.getMake() + " | ");
        System.out.print(" Your YEAR: " + vehicle1.getYear() + " | ");
        System.out.print(" Your MILES: " + vehicle1.getMiles() + " | ");
        System.out.print(" Your MPG: " + vehicle1.getMpg() + " | ");
        System.out.println("You car's MILES after driving: " + vehicle1.getMiles() + " | ");


        System.out.println("Please enter the make of vehicle 2: ");
        vehicle2.setMake(scnr.next());

        System.out.println("Please enter the year of veicle 2: ");
        vehicle2.setYear(scnr.nextInt());

        System.out.println("Please enter the miles of vehicle 2 ");
        vehicle2.setMiles(scnr.nextInt());

        System.out.println("Please enter the MPG of vehicle 2 ");
        vehicle2.setMpg(scnr.nextDouble());

        System.out.println("How many miles will you DRIVE on vehicle 2");
        vehicle2.drive(scnr.nextInt());

        System.out.print("Your MAKE: " + vehicle2.getMake() + " | ");
        System.out.print(" Your YEAR: " + vehicle2.getYear() + " | ");
        System.out.print(" Your MILES: " + vehicle2.getMiles() + " | ");
        System.out.print(" Your MPG: " + vehicle2.getMpg() + " | ");
        System.out.println("You car's MILES after driving: " + vehicle2.getMiles() + " | ");


    }

}
