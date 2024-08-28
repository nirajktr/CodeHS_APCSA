public class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}