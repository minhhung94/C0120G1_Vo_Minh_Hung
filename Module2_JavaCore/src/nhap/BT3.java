package nhap;

import java.io.Serializable;
import java.util.ArrayList;

public class BT3 {
    static int divisible(String num)
    {
        int n = num.length();
        int c=0;

        String[] a = num.split("");
        if(n ==1){
           return c;
        }
        for (int i=0; i<n; i++){
            int f =0;
            int b =0;
            int e = 0;
            for(int j = 0; j<n; j++){
                f += Integer.parseInt(a[j]);
                if(j == i){
                    e=Integer.parseInt(a[j]);
                    continue;
                }
                b += Integer.parseInt(a[j]);
            }
            for(int k = 0; k<10; k++){
                if(k != e){
                    int d= b+ k;
                    System.out.println("b = " + b + "; k =" + k + "; d = " + d);
                    if(d%3==0){
                        c++;
                    }
                }
            }
            if(f%3==0 && i==(n-1)){
                c +=1;
            }
        }
        return c;
    }

    // Driver Code
    public static void main(String[] args)
    {
        String num = "022";
        System.out.println(divisible(num));
    }
}
