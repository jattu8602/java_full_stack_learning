// ---- Interface (contract) ----
interface Drawable {
    void draw();                    // implicitly public abstract
    default void print() {          // default method (Java 8+)
        System.out.println("Printing...");
    }
}

// ---- Another interface ----
interface Resizable {
    void resize(double factor);
}

// ---- Abstract class ----
abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();  // abstract method

    public String getColor() {         // concrete method
        return color;
    }
}

// ---- Concrete class implementing interfaces + extending abstract ----
class Circle extends Shape implements Drawable, Resizable {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " circle");
    }

    @Override
    public void resize(double factor) {
        radius *= factor;
        System.out.println("New radius: " + radius);
    }
}

public class InterfacesAndAbstract {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Color: " + circle.getColor());
        circle.draw();
        circle.resize(2.0);
        circle.print();  // default method from interface
    }
}
