package B3.LopVaDoiTuongTrongJava.BaiTap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDenta()
    {
        return b * b - 4 * a * c;
    }

    public double getRoot1()
    {
        return (-b + Math.sqrt(this.getDenta())) / (2 * a);
    }

    public double getRoot2()
    {
        return (-b - Math.sqrt(this.getDenta())) / (2 * a);
    }
}

class PhuongTrinhBacHai{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.print("Enter a: ");
        a = scanner.nextDouble();
        System.out.print("Enter b ");
        b = scanner.nextDouble();
        System.out.print("Enter c: ");
        c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDenta() > 0)
        {
            System.out.println("Phương trình có hai nhiệm: " + quadraticEquation.getRoot1()
                    + " và " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDenta() == 0)
        {
            System.out.println("Phương trình có một nghiệm " + quadraticEquation.getRoot1());
        } else
        {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}