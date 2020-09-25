package nhap.Demo;

public abstract class NhanVien {
    private String ten;
    private String cmnd;
    public abstract int xuatLuong();

    public NhanVien(String ten, String cmnd) {
        this.ten = ten;
        this.cmnd = cmnd;
    }

    public NhanVien() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "ten='" + ten + '\'' +
                ", luong='" + xuatLuong() + '\'' +
                '}';
    }
    public int compareTo(NhanVien o){
        return this.ten.compareToIgnoreCase(o.getTen());
    }
}
