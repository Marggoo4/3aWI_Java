package at.bischof.oo.script.vehicle;

//• In the main() method of your program:
//	• Create an instance of Car.
//	• Call startEngine() and honk() methods on the Car instance.
//	• Print the number of doors of the car.

public class Main {
    public static void main (String[]args) {

        Car c1 = new Car ("Dodge", 4);
        c1.startEngine();
        c1.honk();

        System.out.println(c1.getNumberOfDoors() + " " + c1.getBrand());


    }
}
