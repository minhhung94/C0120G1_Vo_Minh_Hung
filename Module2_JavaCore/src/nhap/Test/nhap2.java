package nhap.Test;

public class nhap2 {
    public static void main(String[] args) {
        int[] n = {9,9,9,9,3,5,9,0};
        int a=0;
        int b=0;
        int max = n[0];
        int max2 = 0;

        for(int i =0; i< n.length;i++){
            if(max<n[i]){
                max=n[i];
            }
        }
        for(int i =0; i< n.length;i++){
            if(max2<n[i] && n[i] != max){
                max2=n[i];
            }
        }

        System.out.println("Số lớn nhì là : " + max2);
    }


}
