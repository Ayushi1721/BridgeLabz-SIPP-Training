package Day2_constructor.Level1;

public class Circle {
    double radius;

    // Default constructor
    public Circle() {
        this.radius = 1.0;
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(3.5);

        System.out.println("Circle 1 -> Radius: " + c1.radius + ", Area: " + c1.getArea());
        System.out.println("Circle 2 -> Radius: " + c2.radius + ", Area: " + c2.getArea());
    }
}
