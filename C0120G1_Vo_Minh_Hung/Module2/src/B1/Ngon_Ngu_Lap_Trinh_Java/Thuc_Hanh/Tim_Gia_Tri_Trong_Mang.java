package B1.Ngon_Ngu_Lap_Trinh_Java.Thuc_Hanh;

import java.util.Scanner;

public class Tim_Gia_Tri_Trong_Mang {
    public static void main(String[] args) {
        String [] Students = {"Long","Quoc","Cuong","Thong","Ha","Tan"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name's sudent: ");
        String input_name = sc.nextLine();
        boolean isExit = false;
        for (int i=0;i<Students.length;i++){
            if(Students[i].equals(input_name)){
                System.out.println("Position of the student in the list " + input_name + " in: " + (i+1));
                isExit = true;
                break;
            }
        }
        if (!isExit){
            System.out.println("Not Found "+ input_name + " int the list");
        }
    }
}
