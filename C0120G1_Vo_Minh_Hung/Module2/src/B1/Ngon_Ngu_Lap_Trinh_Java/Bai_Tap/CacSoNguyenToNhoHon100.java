package B1.Ngon_Ngu_Lap_Trinh_Java.Bai_Tap;

public class CacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
       for (int number=2;number<100;number++){
           if (number < 2){
               System.out.println(number + " khong phai so nguyen to");
           } else {
               int i = 2;
               boolean check = true;
               while (i <= Math.sqrt(number)) {
                   if (number % i == 0) {
                       check = false;
                       break;
                   }
                   i++;
               }
               if (check){
                   System.out.print(number + "\t");
               } else{
                   continue;
               }
           }
       }

    }
}
