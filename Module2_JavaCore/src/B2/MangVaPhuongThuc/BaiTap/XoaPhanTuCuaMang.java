package B2.MangVaPhuongThuc.BaiTap;

import java.util.Scanner;

public class XoaPhanTuCuaMang {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] array;
        System.out.print("Nhập độ dài mảng: ");
        array = new int [sc.nextInt()];
        for (int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*10);
        }
        for (Object data:array){
            System.out.print(data+"\t");
        }
        System.out.println("");
        System.out.print("Nhập giá trị muốn xoá: ");
        int x=sc.nextInt();
        String index = "";
        int dem=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                index += (i + 1)+"\t";
                dem++;
            }
        }
        int[] array2=new int [array.length-dem];
        System.out.println("Giá trị muốn xóa được tìm thấy "+dem+" lần, tại các vị trí " + index);
        int j=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]!=x){
                array2[j] = array[i];
                j++;
            }
        }
        System.out.println("Mảng sau khi xóa là:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]+"\t");
        }
    }
}
