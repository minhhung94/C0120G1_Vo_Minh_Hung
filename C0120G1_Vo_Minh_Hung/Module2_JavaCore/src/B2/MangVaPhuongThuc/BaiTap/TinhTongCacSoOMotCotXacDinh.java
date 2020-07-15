package B2.MangVaPhuongThuc.BaiTap;

import java.util.Scanner;

public class TinhTongCacSoOMotCotXacDinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array;
        int row;
        int column;
        do {
            System.out.print("Nhập chiều rộng của mảng: ");
            row = sc.nextInt();
            if (row < 2 || row > 15) {
                System.out.println("Nhập chiều rộng của mảng từ 2-15");
            }
        } while (row < 2 || row > 15);
        do {
            System.out.print("Nhập chiều dài của mảng: ");
            column = sc.nextInt();
            if (column < 2 || column > 15) {
                System.out.println("Nhập chiều dài của mảng từ 2-15");
            }
        } while (column < 2 || column > 15);
        System.out.println("Hiển thị mảng tạo thành ngẫu nhiên");
        array = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = (int) (Math.random() * 15);
                System.out.print(array[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("Nhập cột cần tính tổng");
        int numberColumn = sc.nextInt();
        int sum=0;
        System.out.println("Hiển thị các phần tử trong cột");
        for (int i = 0; i < row; i++) {
            System.out.print(array[i][numberColumn-1]+"\t");
            sum += array[i][numberColumn - 1];
        }
        System.out.println("");
        System.out.println("Hiển thị tổng các phần tử trong cột");
        System.out.println(sum);
    }
}
