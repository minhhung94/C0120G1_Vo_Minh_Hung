package nhap.Test;

import java.util.Scanner;

public class nhap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
//        int maxValue =0;
//        for(int i =0; i<n; i++){
//            arr[i]= sc.nextInt();
//            if(maxValue<arr[i]){
//                maxValue= arr[i];
//            }
//        }
//        System.out.print(maxValue);
        String arr1="";
        for(int i =0; i<n; i++){
            arr[i]= sc.nextInt();
            if(arr[i]%2==0){
                arr1 += arr[i] + " ";
            }
        }
        System.out.print(arr1);
    }
}
