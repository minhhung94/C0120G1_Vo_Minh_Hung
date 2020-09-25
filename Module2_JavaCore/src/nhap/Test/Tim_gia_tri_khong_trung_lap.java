package nhap.Test;

public class Tim_gia_tri_khong_trung_lap {
    public static void main(String[] args) {
//        int[] a = {2,4,14,14,4,4,14,7,8,4,6};
        int[] a = {2,2,102,2,2,4,14,14,4,4,14,7,8,4,6};
        int n = a.length;
        int temp=0;
        int temp1=0;
        for (int i = 1; i < n; i++)
        {
            for (int j = 0; j < i; j++)
            {
                if (a[i] == a[j])
                {
                    temp++;
                    temp1 = i;
                    for (int k = i; k < n; k++)
                    {
                        a[k] = a[k + 1];
                        n=a.length-temp;
                        i++;
                    }
//                    n=a.length-temp;
                    i=temp1-1;
                }
            }
        }
//        System.out.println(temp);
        for (int i = 0; i < n; i++)
        {
            System.out.println(i + ". "+ a[i]);
        }
    }
}
