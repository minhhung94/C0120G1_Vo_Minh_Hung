package B5.AdvancedObjectOrientedDesign.BaiTap.TrienKhaiInterfaceResizeable;

import java.util.Random;

public class TestSquare {
    public static void main(String[] args) {
        Random rd=new Random();
        Square square=new Square();
        System.out.println(square);
        double random=rd.nextDouble();
        square.resize(random);
        System.out.println("A Square with radom"+(random*100));
    }
}
