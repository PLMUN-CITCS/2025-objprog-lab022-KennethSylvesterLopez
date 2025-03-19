// Define the Car class
class Car {
    // Declare instance variables (attributes)
    String make;
    String model;
    int year;

    // Method to display car information
    public void displayInfo() {
        System.out.println("Car: " + year + " " + make + " " + model);
    }
}

// Main class where the program starts
public class CarDemo {
    public static void main(String[] args) {
        // Create a Car object named myCar
        Car myCar = new Car();

        // Assign values to the attributes
        myCar.make = "Toyota";
        myCar.model = "Corolla";
        myCar.year = 2020;

        // Call the displayInfo() method
        myCar.displayInfo();
    }
}
