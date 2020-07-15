package B2.MangVaPhuongThuc.ThucHanh;

import java.util.Scanner;

public class UngDungDemSoLuongSinhVienThiDo {
    public static void main(String[] args) {
        System.out.println();
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập số lượng sinh viên:");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Số lượng sinh viên không lớn hơn 30");
        } while (size > 30 || size<1);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập điểm của sinh viên thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.println("Danh sách điểm: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println("Sinh viên thứ " + (j+1) +" điểm là: "+array[j]);
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.print("\n Số lượng sinh viên thi đỗ là: " + count);
    }
}
