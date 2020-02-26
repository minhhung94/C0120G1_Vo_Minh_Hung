package nhap.Hoc;

import java.util.Random;


public class HocSoNgauNhien {
    public static void main(String[] args) {
        int []M=new int [10];
        Random rd=new Random();
        for(int i=0;i<M.length;i++){
            M[i]=rd.nextInt(100);
        }
        System.out.println("Mảng ngẫu nhiên là: ");
        for(int i=0;i<M.length;i++)
        {
            System.out.print(M[i]+"\t");
        }
    }
}
