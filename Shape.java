package mphasis.com.shape;
import java.util.*;

abstract class Shape1 {
    // Abstract method for calculating area. Each shape will define its own version.
    public abstract int CalculateArea();
}

class Circle extends Shape1 {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int CalculateArea() {
        return 3 * radius * radius; // Approximating the value of Pi as 3
    }
}

class Rectangle extends Shape1 {
    private int length, breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public int CalculateArea() {
        return length * breadth;
    }
}

class Triangle extends Shape1 {
    private int breadth, height;

    public Triangle(int breadth, int height) {
        this.breadth = breadth;
        this.height = height;
    }

    @Override
    public int CalculateArea() {
        return (breadth * height) / 2; // Area of triangle = 1/2 * base * height
    }
}

public class Shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length, breadth, height, and radius:");

        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int height = sc.nextInt();
        int radius = sc.nextInt();

        // Create objects of different shapes
        Shape1 circle = new Circle(radius);
        System.out.println("The area of the circle is: " + circle.CalculateArea());

        Shape1 rectangle = new Rectangle(length, breadth);
        System.out.println("The area of the rectangle is: " + rectangle.CalculateArea());

        Shape1 triangle = new Triangle(breadth, height);
        System.out.println("The area of the triangle is: " + triangle.CalculateArea());
    }
}
