
public class Vehicle {
    // private fields / internal data
    private int year;   // year the vehicle was manufactured
    private int miles; // miles on the total odometer
    private double mpg;  // miles per gallon the vehicle gets
    private String make; // make of the vehicle

    // public methods

    // constructor - used to create an object from the class
    public Vehicle() {
        year = 0;
        miles = 0;
        mpg = 0.0;
        make = "No car available";
    }


    public void vehiclePrint(String make, int year, int miles, double mpg) {
        System.out.println("Your car: " + make);
        System.out.println("Your year: " + year);
        System.out.println("Your miles: " + miles);
        System.out.println("Your MPG: " + mpg);
    }

    // setters (mutators) and getters (accessors)
    public int getYear() {
        return year;
    }

    public void setYear(int year) {

        this.year = year;
    }

    public int getMiles() {

        return miles;
    }

    public void setMiles(int miles) {

        this.miles = miles;
    }

    public double getMpg() {

        return mpg;
    }

    public void setMpg(double mpg) {

        this.mpg = mpg;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {

        this.make = make;
    }

    // instance methods
    public void drive(int miles) {

        this.miles += miles;
    }
}