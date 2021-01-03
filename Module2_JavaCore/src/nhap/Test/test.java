package nhap.Test;

import java.util.ArrayList;

public class test {
    public static void main(String[] args){
           ArrayList<Integer> list = new ArrayList<Integer>();
           for(int i=2;i<=7;i++){
               list.add(i);
           }
           for(int j= 0; j<list.size();j++){
               int a = list.get(j);
               String b = "";
               while (a/2==0){
                   b += a%2;
                   a /= 2 ;
               }
           }
        System.out.println(list);
    }
}
