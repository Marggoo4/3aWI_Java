package at.bischof.oo.script.vehicle;

//• Create a subclass called Car that extends Vehicle and includes:
//	• An additional int field named numberOfDoors.
//	• A method honk() that prints: "The <brand> car is honking!"
//	• A constructor that initializes both the brand and numberOfDoors.

public class Car extends Vehicle {

    private int numberOfDoors;

    public Car (String brand, int numberOfDoors) {
        super(brand);
        this.numberOfDoors = numberOfDoors;

    }

    public void honk () {
        System.out.println("The " + getBrand() + " car is honking!");
    }


    public int getNumberOfDoors() {
        return numberOfDoors;
    }


    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

}
