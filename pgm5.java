package java_Assignment;
/*
 * Demonstrate the difference between abstract class and interface by writing programs
as well as in keypoints.
 */
abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

// Concrete class extending abstract class
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Interface
interface Drawable {
    void draw();
}

// Concrete class implementing interface
class Square implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}


public class pgm5
{
	public static void main(String[] args)
	{
        Circle circle = new Circle(5);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        // Using interface
        Square square = new Square();
        square.draw();
  
	}
}
