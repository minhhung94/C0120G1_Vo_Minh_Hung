package nhap.Hoc;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.text.DecimalFormat;

public class HocXuLyDinhDangSo {
    public static void main(String[] args) {
        double toan=5;
        double ly=6;
        double hoa=9;
        double dtb=(toan+ly+hoa)/3;
        System.out.println("Điểm trung bình = "+dtb);

        DecimalFormat dcf=new DecimalFormat("#.###");
        System.out.println("Điểm trung bình = "+dcf.format(dtb));
    }
}
