package B5.AdvancedObjectOrientedDesign.BaiTap.TrienKhaiInterfaceResizeable;

import java.util.Random;

public class TestCircle {
    public static void main(String[] args) {
        Random rd=new Random();
        Circle circle1 = new Circle();
        System.out.println("Pre-Area");
        System.out.println(circle1.getArea());
        double random=rd.nextDouble();
        circle1.resize(random);
        System.out.println("After-Area with random Radius: "+(random*100));
        System.out.println(circle1.getArea());
    }
}
