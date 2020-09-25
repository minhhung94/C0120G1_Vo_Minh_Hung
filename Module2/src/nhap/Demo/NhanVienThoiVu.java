package nhap.Demo;

public class NhanVienThoiVu extends NhanVien {

    @Override
    public int xuatLuong() {
        return 100000;
    }

    @Override
    public String toString() {
        return super.toString()+"Vì là thời vụ";
    }
}
