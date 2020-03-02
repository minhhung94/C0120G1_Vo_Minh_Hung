package B5.AdvancedObjectOrientedDesign.ThucHanh.TrienKhaiInterfaceComparable;

public class Circle extends Shape {
    private double radius=1.0;

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius,String color, boolean filled) {
        super(color,filled);
        this.radius = radius;
    }
    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
