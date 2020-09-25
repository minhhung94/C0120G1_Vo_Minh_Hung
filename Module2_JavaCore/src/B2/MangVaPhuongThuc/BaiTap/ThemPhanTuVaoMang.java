package B2.MangVaPhuongThuc.BaiTap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int [] array;
        array = new int[5];
        Scanner sc=new Scanner(System.in);
        int index;
        System.out.print("Nhập số cần chèn vào array: ");
        int x= sc.nextInt();
        boolean check=false ;
        do {
            System.out.print("Nhập vị trí cần chèn vào array: ");
            index= sc.nextInt();
            if (index<1 || index>=array.length-1){
                System.out.println("Không chèn được phần tử vào mảng");
            }else {
                array[index-1] = x;
                check=true;
            }
        }while (!check);

        /*for (Object data: array){
            System.out.print(data+"\t");
        }*/
        for (int t: array){
            System.out.print(t+"\t");
        }

    }
}
