package nhap.Demo1;

import java.util.ArrayList;
import java.util.Collections;

public class TestNhanVien {
    public static void main(String[] args) {
        ArrayList<NhanVien> danhsach= new ArrayList<NhanVien>();
        danhsach.add(new NhanVien(4,"Hao"));
        danhsach.add(new NhanVien(2,"Thong"));
        danhsach.add(new NhanVien(3,"Anh"));
        danhsach.add(new NhanVien(5,"Cuong"));
        danhsach.add(new NhanVien(1,"Quoc"));
        danhsach.add(new NhanVien(6,"Anh"));

        System.out.println("Danh sách nhân viên: ");
        for (NhanVien nv:danhsach){
            System.out.println(nv.getMa()+" "+nv.getTen());
        }
        Collections.sort(danhsach);
        System.out.println("Danh sách nhân viên đã sort: ");
        for (NhanVien nv:danhsach){
            System.out.println(nv.getMa()+" "+nv.getTen());
        }
    }
}
