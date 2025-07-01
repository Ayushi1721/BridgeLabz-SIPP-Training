package Day2_LevelConstructor.Level1;
public class Circle {
    double radius;
    public Circle() {
        this(1.0);  // Constructor chaining
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

