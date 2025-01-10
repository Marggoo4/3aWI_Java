package at.bischof.oo.script.shape;

//• Create a subclass called Circle that extends Shape and includes:
//	• A double field named radius.
//	• A constructor that initializes the radius field.
//	• Override the area() method to calculate and return the area of the circle (π * radius * radius).
//	• Override the describe() method to print: "This is a circle with radius <radius>."


public class Circle extends Shape{
    private double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void describe() {
        System.out.println("This is a circle with radius " + radius);
    }

    public void setRadius (double radius) {
        this.radius = radius;
    }

    public double getRadius () {
        return radius;
    }



}
