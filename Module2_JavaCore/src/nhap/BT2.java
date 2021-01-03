package nhap;

public class BT2 {
    static int divisible(int a, int b, int c ,int d){
        int h =0;
        int m =0;
        for(int i=0; i <4;i++){
            if(a<3){
                if(b<4){
                    h = a*10 + b;
                }
            }
        }

        return h;
    }

    // Driver Code
    public static void main(String[] args)
    {
        int a = 1;
        int b = 8;
        int c = 3;
        int d = 2;
        System.out.println(divisible(a,b,c,d));
    }
}
