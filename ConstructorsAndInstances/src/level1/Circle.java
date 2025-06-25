package level1;

public class Circle {
    double radius;

    // Default constructor
    public Circle() {
        this(1.0); // constructor chaining
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public void display() {
        System.out.println("Radius: " + radius);
    }
}
