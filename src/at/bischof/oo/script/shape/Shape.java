package at.bischof.oo.script.shape;

// Aufgabe 1
//
//• Create a base class called Shape with the following:
//	• A method area() that returns 0 (to be overridden later).
//	• A method describe() that prints: "This is a generic shape."

//• Create a subclass called Circle that extends Shape and includes:
//	• A double field named radius.
//	• A constructor that initializes the radius field.
//	• Override the area() method to calculate and return the area of the circle (π * radius * radius).
//	• Override the describe() method to print: "This is a circle with radius <radius>."

//• Create another subclass called Rectangle that extends Shape and includes:
//	• Two double fields: length and width.
//	• A constructor that initializes the length and width fields.
//	• Override the area() method to calculate and return the area of the rectangle (length * width).
//	• Overload the describe() method with:
//		○ A version that takes no arguments (overrides the base class method).
//		○ A version that takes a String argument and prints: "This is a rectangle described as: <description>".

//• In the main() method of your program:
//	• Create instances of Circle and Rectangle.
//	• Call area() and describe() methods for each instance.
//	• Call the overloaded version of describe() for the rectangle.
//
//
// Ergebnis:
// This is a circle with radius 5.0.
// Area of the circle: 78.5398...
// This is a rectangle
// Area of the rectangle: 20.0
// This is a rectangle described as: A large blue rectangle.

public class Shape {

    public double area() {
        return 0;
    }

    public void describe() {
        System.out.println("This is a generic shape.");
    }
}
