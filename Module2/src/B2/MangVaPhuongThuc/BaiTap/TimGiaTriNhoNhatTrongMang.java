package B2.MangVaPhuongThuc.BaiTap;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        int [] array;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài mảng: ");
        array = new int [sc.nextInt()];
        for (int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*100);
        }
        for (Object data:array){
            System.out.print(data+"\t");
        }
        int min=array[0];
        for (int i=0;i<array.length;i++){
           if (min>array[i]){
               min=array[i];
           }
        }
        System.out.println("");
        System.out.println("Số nhỏ nhất là : "+min);
    }
}
