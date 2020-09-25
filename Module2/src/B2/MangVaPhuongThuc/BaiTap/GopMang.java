package B2.MangVaPhuongThuc.BaiTap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] array1;
        int [] array2;
        int [] array3;
        System.out.print("Nhập độ dài mảng array1: ");
        array1 = new int[sc.nextInt()];
        for (int i=0;i<array1.length;i++){
            array1[i]= (int)(Math.random()*100);
        }
        for (Object data:array1){
            System.out.print(data+"\t");
        }
        System.out.println("");
        System.out.print("Nhập độ dài mảng array2: ");
        array2 = new int[sc.nextInt()];

        for (int i=0;i<array2.length;i++){
            array2[i]= (int)(Math.random()*100);
        }
        for (Object data:array2){
            System.out.print(data+"\t");
        }
        System.out.println("");
        System.out.println("---------------");
        array3 = new int[array1.length+array2.length];
        for (int i=0;i<array1.length;i++){
            array3[i]=array1[i];
        }
        for (int j=0;j<array2.length;j++){
            int k=j+array1.length;
            array3[k]=array2[j];
        }
        System.out.println("Mảng array3 là: ");
        for (Object data:array3){
            System.out.print(data+"\t");
        }
    }
}
