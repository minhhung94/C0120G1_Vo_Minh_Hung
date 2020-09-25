package B5.AdvancedObjectOrientedDesign.BaiTap.TrienKhaiInterfaceResizeable;

import java.util.Random;

public class TestRectangle {
    public static void main(String[] args) {
        Random rd = new Random();
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Pre-Area");
        System.out.println(rectangle1.getArea());
        double random = rd.nextDouble();
        System.out.println("After-Area with random length,width: "+(random*100));
        rectangle1.resize(random);
        System.out.println(rectangle1.getArea());
    }
}
