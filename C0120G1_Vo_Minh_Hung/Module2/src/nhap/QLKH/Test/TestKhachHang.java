package nhap.QLKH.Test;

import nhap.QLKH.IO.SerializeFileFactory;
import nhap.QLKH.Model.KhachHang;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestKhachHang {
    static ArrayList<KhachHang> dsKH=new ArrayList<KhachHang>();
    public static void menu(){
        System.out.println("1.Nhập Khách Hàng");
        System.out.println("2.Xuất Khách Hàng");
        System.out.println("3.Tìm kiếm Khách Hàng");
        System.out.println("4.Sắp xếp Khách Hàng");
        System.out.println("5.Lưu Khách Hàng");
        System.out.println("6.Đọc Khách Hàng");
        System.out.println("7.Thống kê theo nhà mạng");
        System.out.println("8.Thoát");
        int chon=0;
        System.out.println("Bạn hãy chọn chức năng [1..8]:");
        chon=new Scanner(System.in).nextInt();
        switch(chon)
        {
            case 1:
                xuLyNhap();
                break;
            case 2:
                xuLyXuat();
                break;
            case 3:
                xuLyTim();
                break;
            case 4:
                xuLySapXep();
                break;
            case 5:
                xuLyLuu();
                break;
            case 6:
                xuLyDoc();
                break;
            case 7:
                xuLyThongKe();
                break;
            case 8:
                xuLyThoat();
                break;
            default:
                break;
        }
    }
    public static void main(String[] args) {
        while(true)
        {
            menu();
        }
    }
    private static void xuLyThoat() {
        System.out.println("Cảm ơn bạn đã dùng phần mềm! bye bye!");
        System.exit(0);
    }

    private static void xuLyThongKe() {
        int n=0;
        for(KhachHang kh: dsKH)
        {
            if(kh.getPhone().startsWith("098"))
            {
                n++;
            }
        }
        System.out.println("Có: "+n+" khách hàng Viettel");
    }

    private static void xuLyDoc() {
        dsKH=SerializeFileFactory.docfile("d:\\dulieukhachhang.db");
        System.out.println("Đã đọc 1"
                + " file thành công");
    }

    private static void xuLyLuu() {
        boolean kt= SerializeFileFactory.luuFile(dsKH, "d:\\dulieukhachhang.db");
        if(kt==true)
        {
            System.out.println("Đã lưu file thành công");
        }
        else
        {
            System.out.println("Đã lưu file thất bại");
        }
    }

    private static void xuLySapXep() {
        Collections.sort(dsKH);
        System.out.println("Đã sắp xếp số điện thoại xong rồi");
    }

    private static void xuLyTim() {
        String phone="090";
        System.out.println("===========================");
        System.out.println("Khách hàng có đầu số 090:");
        System.out.println("Mã\tTên\tPhone");
        for(KhachHang kh: dsKH)
        {
            if(kh.getPhone().startsWith(phone))
            {
                System.out.println(kh);
            }
        }
        System.out.println("===========================");
    }

    private static void xuLyXuat() {
        System.out.println("=========================================");
        System.out.println("Mã\tTên\tPhone");
        for(KhachHang kh:dsKH)
        {
            System.out.println(kh);
        }
        System.out.println("=========================================");

    }

    private static void xuLyNhap() {
        KhachHang kh=new KhachHang();
        System.out.println("Mời bạn nhập mã:");
        int ma=new Scanner(System.in).nextInt();
        System.out.println("Mời bạn nhập tên:");
        String ten=new Scanner(System.in).nextLine();
        System.out.println("Mời bạn nhập ngày sinh:");
        String namsinh=new Scanner(System.in).nextLine();
        System.out.println("Mời bạn nhập số phone:");
        String phone=new Scanner(System.in).nextLine();

        kh.setMa(ma);
        kh.setTen(ten);
        kh.setNamSinh(namsinh);
        kh.setPhone(phone);

        dsKH.add(kh);
    }
}
