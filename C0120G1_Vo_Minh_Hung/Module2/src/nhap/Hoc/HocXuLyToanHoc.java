package nhap.Hoc;

import java.text.DecimalFormat;

public class HocXuLyToanHoc {
    public static void main(String[] args) {
        int n=25;
        System.out.println("Căn bậc 2 của 25 = "+ Math.sqrt(n));
        int x=8;
        int y=3;
        System.out.println(x+"^"+y+"="+Math.pow(x,y));

        int k=-113;
        System.out.println("|"+k+"| = "+Math.abs(k));

        int banKinh=5;
        double cv=2*Math.PI*banKinh;
        double dt=Math.PI*Math.pow(banKinh,2);
        System.out.println("CV = "+cv+"; DT = "+dt);

        DecimalFormat dcf=new DecimalFormat("#.###");
        System.out.println("CV = "+dcf.format(cv)+"; DT = "+dcf.format(dt));
        System.out.println("-------------------------------------------");
        int goc=55;
        double rad=Math.PI*goc/180;
        System.out.println("sin("+goc+")="+Math.sin(rad));
        System.out.println("cos("+goc+")="+Math.cos(rad));
        System.out.println("tan("+goc+")="+Math.tan(rad));
        System.out.println("cotan("+goc+")="+Math.cos(rad)/Math.sin(rad));
    }
}
