package B4.KeThua.BaiTap.ClassCirleVaClassClinder;

public class Circle {
    protected int radius;
    protected String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle() {
    }

    public int getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public String toString(){
        return "Diện tích hình tròn là : " +getArea();
    }

}
