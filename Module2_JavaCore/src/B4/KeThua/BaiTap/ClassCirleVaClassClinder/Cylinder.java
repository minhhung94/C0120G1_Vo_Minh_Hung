package B4.KeThua.BaiTap.ClassCirleVaClassClinder;

public class Cylinder extends Circle {
    private int height;

    public Cylinder() {
        super();
    }

    public Cylinder(int radius, String color, int height) {
        super(radius, color);
        this.height = height;
    }

    public double volumetric(){
        return getArea()*height;
    }

    public String toString(){
        return "Thể tích hình trụ là : " + volumetric();
    }
}
