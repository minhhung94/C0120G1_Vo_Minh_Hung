package B1.Ngon_Ngu_Lap_Trinh_Java.Thuc_Hanh;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        double a,b;
        Scanner reader = new Scanner(System.in);
        System.out.print("a = ");
        a = reader.nextDouble();
        System.out.print("b = ");
        b = reader.nextDouble();

        if (a==0) {
            if (b==0) {
                System.out.println("Phương trình có vô số nghiệm");
            }else{
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            System.out.println("Phương trình có nghiệm x = " + (-b/a));
        }

    }
}
