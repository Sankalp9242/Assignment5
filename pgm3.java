package java_Assignment;
/*Write a Java program that uses polymorphism by defining an interface called Shape
with methods to calculate the area and perimeter of a shape. Then create classes
that implement the Shape interface for different types of shapes, such as circles and
triangles.
 *
 */

interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

// Implement the Circle class
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Implement the Triangle class
class Triangle implements Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        // Using Heron's formula to calculate the area of a triangle
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

public class pgm3 
{
	public static void main(String[] args) 
	{
		  Shape circle = new Circle(5);
	        Shape triangle = new Triangle(3, 4, 5);

	        // Calculating and displaying area and perimeter of Circle
	        System.out.println("Circle - Area: " + circle.calculateArea() + ", Perimeter: " + circle.calculatePerimeter());

	        // Calculating and displaying area and perimeter of Triangle
	        System.out.println("Triangle - Area: " + triangle.calculateArea() + ", Perimeter: " + triangle.calculatePerimeter());
	}
}
