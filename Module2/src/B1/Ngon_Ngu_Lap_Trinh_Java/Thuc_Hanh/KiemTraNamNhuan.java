package B1.Ngon_Ngu_Lap_Trinh_Java.Thuc_Hanh;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        boolean isLeapYear = false;
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter a year: ");
        year = scanner.nextInt();
        boolean isDivisibleBy4 = year % 4 == 0;
        if(isDivisibleBy4){
            boolean isDivisibleBy100 = year % 100 == 0;
            if(isDivisibleBy100){
                boolean isDivisibleBy400 = year % 400 == 0;
                if(isDivisibleBy400){
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if(isLeapYear){
            System.out.printf("%d là năm nhuận", year);
        } else {
            System.out.printf("%d không phải năm nhuận", year);
        }
    }
}
