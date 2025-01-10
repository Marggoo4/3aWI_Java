package at.bischof.oo.script.vehicle;

// Aufgabe 1
//
//• Create a base class called Vehicle with the following:
//	• A String field named brand.
//	• A method startEngine() that prints: "The engine of <brand> is starting."
//	• A constructor that initializes the brand field.

//• Create a subclass called Car that extends Vehicle and includes:
//	• An additional int field named numberOfDoors.
//	• A method honk() that prints: "The <brand> car is honking!"
//	• A constructor that initializes both the brand and numberOfDoors.

//• In the main() method of your program:
//	• Create an instance of Car.
//	• Call startEngine() and honk() methods on the Car instance.
//	• Print the number of doors of the car.
//
//
// Output:
// The engine of Toyota is starting.
// The Toyota car is honking!
// The car has 4 doors.



public class Vehicle {

    private String brand;

    // Constructor
    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Method to start the engine
    public void startEngine() {
        System.out.println("The engine of " + brand + " is starting.");
    }

    // Getter
    public String getBrand() {
        return brand;
    }

    // Setter
    public void setBrand(String brand) {
        this.brand = brand;
    }
}

