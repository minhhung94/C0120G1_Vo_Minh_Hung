package nhap.Demo;

public class TestNhanVien {
    public static void main(String[] args) {
        NhanVien Quoc = new NhanVienChinhThuc();
        Quoc.setTen("Lê Đình Quốc");
        System.out.println(Quoc);

        Quoc = new NhanVienThoiVu();
        Quoc.setTen("Lê Đình Quốc");
        System.out.println(Quoc);
    }
}
