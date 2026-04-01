// Hình dạng và diện tích
import java.util.*;
abstract class Shape {
    protected String name;

    public Shape (String name) {
        this.name = name;
    }

    public abstract double calculateArea();

    public void displayInfo() {
        System.out.printf("Shape:%s|Area:%.2f\n", name, calculateArea());
    }
}

class Circle extends Shape {
    private double radius;

    public Circle (String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle (String name, double width, double length) {
        super(name);
        this.width = width;
        this.length = length;
    }

    public double calculateArea() {
        return length * width;
    }
}

public class INHERITANCE007 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-->0) {
            String type = sc.next();
            Shape shape;
            if (type.equals("Circle")) {
                double radius = sc.nextDouble();
                shape = new Circle("Circle", radius);
            } else {
                double width = sc.nextDouble();
                double length = sc.nextDouble();
                shape = new Rectangle("Rectangle", width, length);
            }
            shape.displayInfo();
        }
        sc.close();
    }
}