package nhap.Hoc;

import java.util.ArrayList;

public class HocArrayList {
    public static void main(String[] args) {
       /* ArrayList ds=new ArrayList();
        ds.add("x");
        ds.add(9+"");

        ArrayList ds2=new ArrayList();
        ds2.add("1.5");*/

        ArrayList ds3=new ArrayList();
        ds3.add("An");
        ds3.add("Bình");
        ds3.add("Giải");
        ds3.add("Thoát");

        for (int i=0;i<ds3.size();i++){
            String x=ds3.get(i) +"";
            System.out.println(x);
        }
        System.out.println("---------------------------");
        for (Object data: ds3){
            System.out.println(data);
        }
    }
}
