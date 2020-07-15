package B2.MangVaPhuongThuc.ThucHanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DaoNguocCacPhanTuCuaMang {
    public static void main(String[] args) {
        int size;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.print("Nhập độ dài của mảng:");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("Độ dài của mảng không lớn hơn 20");
        } while (size > 20);
        ArrayList arrayList = new ArrayList(size);
        for (int i=0;i<size;i++){
            System.out.print("Phần tử thứ " + (i+1) +" là: ");
            arrayList.add(sc.nextInt());
        }
        for (Object data: arrayList){
            System.out.print(data + "\t");
        }
        System.out.println("Mảng sau khi đảo ngược là :");
        Collections.reverse(arrayList);
        for (Object data: arrayList){
            System.out.print(data + "\t");
        }
    }
}
