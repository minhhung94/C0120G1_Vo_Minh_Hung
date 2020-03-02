package nhap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XoaPhanTuTrongArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài mảng: ");
        int dem=sc.nextInt();
        List<Integer> ds1=new ArrayList();
        for (int i=0;i<dem;i++){
            ds1.add((int) (Math.random()*100));
        }
        for (Object data: ds1){
            System.out.print(data+"\t");
        }
        System.out.println("");
        System.out.print("Nhập giá trị cần xoá: ");
        int x=sc.nextInt();
        for (int i=0;i<ds1.size();i++){
            if ((ds1.get(i))==x){
                ds1.remove(i);
            }
        }
        System.out.println("----");
        for (Object data: ds1){
            System.out.print(data+"\t");
        }
    }

}
