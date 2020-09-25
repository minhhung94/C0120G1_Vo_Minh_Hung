package B2.MangVaPhuongThuc.ThucHanh;

import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.print("Nhập độ dài của mảng:");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("Độ dài của mảng không lớn hơn 20");
        } while (size > 20);
        array = new int[size];
        int i=0;
        while (i < array.length) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " : ");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.print("Danh sách mảng: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("| Số lớn nhất trong mảng là: " + max + " ,là phần tử thứ: " + index);
    }
}
