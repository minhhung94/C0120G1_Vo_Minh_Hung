package nhap;

import java.util.Scanner;

public class MaTran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array;
        int size;
        do {
            System.out.println("Nhập độ dài cạnh của ma trận vuông: ");
            size = input.nextInt();
            if (size > 20 || size < 1) {
                System.out.println("Nhập độ dài cạnh của ma trận vuông từ 2-20");
            }
        } while (size > 20 || size < 2);
        System.out.println("Hiển thị ma trận tạo thành ngẫu nhiên: ");
        array = new int[size][size];
        String ketQua = "";
        String ketQua1 = "";
        int sum=0;
        int sum1=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * 15);
                System.out.print(array[i][j] + "\t");
                if (j==i) {
                    ketQua += array[i][j] + "\t";
                    sum += array[i][j];
                }

            }
            System.out.println("");
        }
        for (int i =0;i< array.length;i++){
            ketQua1+=array[i][array.length-1-i]+"\t";
            sum1 +=array[i][array.length-1-i];
        }
        System.out.println("Hiển thị  các phần tử ở đường chéo chính : ");
        System.out.println(ketQua);
        System.out.println("Hiển thị tổng các phần tử ở đường chéo chính");
        System.out.println(sum);
        System.out.println("Hiển thị  các phần tử ở đường chéo chính 1 : ");
        System.out.println(ketQua1);
        System.out.println("Hiển thị tổng các phần tử ở đường chéo chính 1:");
        System.out.println(sum1);
    }
}
