package at.bischof.oo.script.shape;

//• Create another subclass called Rectangle that extends Shape and includes:
//	• Two double fields: length and width.
//	• A constructor that initializes the length and width fields.
//	• Override the area() method to calculate and return the area of the rectangle (length * width).
//	• Overload the describe() method with:
//		○ A version that takes no arguments (overrides the base class method).
//		○ A version that takes a String argument and prints: "This is a rectangle described as: <description>".

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }


    @Override
    public double area() {
        return length * width;
    }

    @Override
    public void describe() {
        System.out.println("Length" + length + "Width" + width);
    }


    public void describe(String description) {
        System.out.println("This is a rectangle described as: " + description);
    }


    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
