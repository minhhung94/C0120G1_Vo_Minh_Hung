package B5.AdvancedObjectOrientedDesign.BaiTap.TrienKhaiInterfaceResizeable;

public class Circle implements Resizeable {
    private double radius=1.0;

    public Circle(double radius) {
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
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    @Override
    public void resize(double percent) {

    }
}
