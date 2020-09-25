package B2.MangVaPhuongThuc.BaiTap;


import java.util.Scanner;

public class TimPhanTuLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        int [][] array;
        Scanner sc=new Scanner(System.in);
        int row,colum;
        System.out.print("Nhập độ dài row: ");
        row=sc.nextInt();
        System.out.print("Nhập độ dài colum: ");
        colum=sc.nextInt();
        array = new int [row][colum];
        for (int i=0;i<row;i++){
            for (int j=0;j<colum;j++){
                array[i][j]=(int)(Math.random()*100);
            }
        }
        System.out.println("Mảng hiện taị là : ");
        for (int i=0;i<row;i++){
            for (int j=0;j<colum;j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("");
        }

        int max= array[0][0];
        String viTri="";
        for (int i=0;i<row;i++){
            for (int j=0;j<colum;j++){
                if (max < array[i][j]){
                    max = array[i][j];
                    viTri = " dòng " + (i+1) + " cột " + (j+1) ;
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là : " + max + " . Có vị trí là: "+viTri);
    }
}
