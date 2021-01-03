package nhap.Test;

public class Gia_tri_khong_trung_lap {
    public static void main(String[] args) {
        int[] a = {2,4,4,14,7,8,4,6};
        int[] b = new int [a.length];
        int temp=0;
        for(int i=1 ; i<a.length;i++) {
            if (b[i] ==0) {
                if (a[temp] == a[i]) {
                    b[i] = 1;
                }
                temp++;
            }
        }
        for (int i=1 ; i<a.length;i++) {
            if (b[i] == 1) {
                System.out.println(a[i] + " ");
            }
        }
    }
}
