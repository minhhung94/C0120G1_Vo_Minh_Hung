package nhap;

import java.util.Scanner;

public class GiaiThua {

    public static void main(String[] args) {
        long i,a;
        Scanner sc= new Scanner(System.in);
        System.out.print("a = ");
        a = sc.nextInt();
        long n=1;
        for(i=1;i<=a;i++){
            n*=i;
        }
        System.out.println(a+" giai thua = "+n);
    }
}
