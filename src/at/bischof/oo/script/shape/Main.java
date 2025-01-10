package at.bischof.oo.script.shape;

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

public class Main {
    public static void main (String[]args) {
        Circle c1 = new Circle(4);
        c1.area();
        c1.describe();


        Rectangle r1 = new Rectangle(6,8);
        r1.area();
        r1.describe();


    }
}
