package pgm03;

// File: GeometryProgram.java

class CircleArea {
    double radius;

    // Constructor to initialize radius
    public CircleArea(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate perimeter (circumference)
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    // Display method
    public void displayCircleDetails() {
        System.out.println("Circle Details:");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

class RectanglePerimeter {
    double length;
    double breadth;

    // Constructor to initialize values
    public RectanglePerimeter(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * breadth;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }

    // Display method
    public void displayRectangleDetails() {
        System.out.println("Rectangle Details:");
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

public class GeometryProgram {
    public static void main(String[] args) {
        // Circle area and perimeter
        CircleArea circle = new CircleArea(7.0);
        circle.displayCircleDetails();

        System.out.println();

        // Rectangle area and perimeter
        RectanglePerimeter rectangle = new RectanglePerimeter(10.0, 5.0);
        rectangle.displayRectangleDetails();
    }
}
