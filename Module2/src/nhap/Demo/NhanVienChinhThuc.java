package nhap.Demo;

public class NhanVienChinhThuc extends NhanVien {
    @Override
    public int xuatLuong() {
        return 500000;
    }

    @Override
    public String toString() {
        return super.toString()+"Vì là nhân viên tạp vụ";
    }
}
