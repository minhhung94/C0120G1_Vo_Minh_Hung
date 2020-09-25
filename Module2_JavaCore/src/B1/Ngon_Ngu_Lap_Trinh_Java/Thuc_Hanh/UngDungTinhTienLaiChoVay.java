package B1.Ngon_Ngu_Lap_Trinh_Java.Thuc_Hanh;

import java.util.Scanner;

public class UngDungTinhTienLaiChoVay {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double money, interset_rate;
        int month = 1;
        System.out.print("money = ");
        money = reader.nextDouble();
        System.out.print("interset_rate = ");
        interset_rate = reader.nextDouble();
        double total_interset = 0;
        for(int i = 0; i < month; i++){
            total_interset = money * (interset_rate/100)/12*3 ;
        }
        System.out.println("Total of interset: " + total_interset);
    }

}
