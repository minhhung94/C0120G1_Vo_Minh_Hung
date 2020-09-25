package nhap.Test;

public class nhap3 {
    public static void main(String[] args) {
        String[][] a;
        String ketqua="";
        String ketqua1="";
        a = new String[9][5];
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[0].length; j++) {
//                if (j == 0) {
//                    a[i][j] = "*";
//                }else{
//                    a[i][j] = " ";
//                }
//                if ((j == i) || (j == (a.length - 1 - i))) {
//                    a[i][j] = "*";
//                }else{
//                    a[i][j] = " ";
//                }
//            }
//        }
        for (int i = 0; i < a.length; i++) {
            for (int j = a[0].length-1; j >=0; j--) {
                if (j == 0) {
                    a[i][j] = "*";
                }else{
                    a[i][j] = " ";
                }
//                System.out.println(a[i][j]+"\t");
                if ((j == i) || (j == (a.length - 1 - i))) {
                    a[i][j] = "*";
                }else{
                    a[i][j] = " ";
                }
                ketqua += a[i][j];
            }
            ketqua1 += ketqua + "\n";
        }
        System.out.println(ketqua1);

    }

}
