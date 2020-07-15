package nhap.Test;

import java.util.Scanner;

public class vetamgiac {
    public static void main(String[] args) {
//        int num, n;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập n: ");
//        num = sc.nextInt();
//        System.out.println();
//        n = num;
//        // vẽ phần tam giác ngược
//        for (int r = 1; r <= num; r++) {
//            // phần 1
//            for (int sp = 1; sp <= r; sp++) {
//                System.out.print(" ");
//            }
//            // phần 2
//            for (int c = 1; c <= n; c++) {
//                System.out.print("*");
//            }
//            // phần 3
//            for (int c = num - r; c >= 1; c--) {
//                System.out.print("*");
//            }
//            n--;
//            System.out.println();
//        }

        int height;
        int i;
        Scanner sc = new Scanner(System.in);;
        System.out.print("height = ");
        height = sc.nextInt();

        for(i = height; i >=0 ; i--) {
            for(int j = 1; j <= height-i; j++) {
                System.out.print("  ");
            }
            for(int k = 1; k <= 2*i-1; k++) {
                if(k == 1 || k == 2*i-1 || i == height) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

        sc.close();
    }
}
