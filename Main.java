// Abstract class Shape
public abstract class Shape {
    // Abstract method to calculate the area
    public abstract double area();
}

// Subclass Triangle
public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

// Subclass Rectangle
public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

// Subclass Circle
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 10);
        Rectangle rectangle = new Rectangle(4, 7);
        Circle circle = new Circle(6);

        System.out.println("Triangle area: " + triangle.area());
        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Circle area: " + circle.area());
    }
}
