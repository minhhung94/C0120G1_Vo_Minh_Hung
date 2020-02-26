package nhap.Hoc;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HocXuLyNgayThang {
    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();
        //Hiển thị năm hiên tại
        int nam=cal.get(Calendar.YEAR);
        System.out.println("Năm nay là năm: "+nam);
        //Hiển thị tháng hiện tại (tháng chạy từ 0-->11) nên cộng thêm 1 khi hiển thị
        int thang=cal.get(Calendar.MONTH);
        System.out.println("Hôm nay là tháng: "+ (thang+1));
        //Hiển thị ngày hiện tại
        int ngay=cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("Hôm nay là ngày: "+ (ngay));

        Date t=cal.getTime();
        //Hiển thị ngày tháng năm hiện tại.
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Hôm nay: "+sdf.format(t));

        SimpleDateFormat sdf2=new SimpleDateFormat("d/M/yyyy");
        System.out.println("Hôm nay : " + sdf2.format(t));

        // HH : hiển thị 24 giờ .
        SimpleDateFormat sdf3=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Hôm nay : "+ sdf3.format(t));
        // hh : hiển thị 12 giờ nên có aaa để hiển thị AM và PM
        SimpleDateFormat sdf4=new SimpleDateFormat("hh:mm:ss aaa");
        System.out.println("Hôm nay là: "+sdf4.format(t));

    }

}
