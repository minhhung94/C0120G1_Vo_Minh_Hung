package nhap.Test;

public class nhap2 {
    public static void main(String[] args) {
        int[] n = {2,4,5,1,3,5,7,0};
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        for(int i =0; i< n.length;i++){
            if(a<n[i]){
                a=n[i];
                b=c;
                c=i;
                d = n[b];
            }
        }

//        for (int j=0;j<n.length;j++){
//            if (b==n[j]){
//                c=j;
//                break;
//            }
//        }
        System.out.println("Vị trí số lớn nhì là : " + (b+1)+" co gia tri la: "+d);
    }


}
