package nhap.QLKH.Model;

import java.io.Serializable;

public class KhachHang implements Serializable,Comparable<KhachHang> {
    private int ma;
    private String ten;
    private String namSinh;
    private String phone;

    public KhachHang(int ma, String ten, String namSinh, String phone) {
        this.ma = ma;
        this.ten = ten;
        this.namSinh = namSinh;
        this.phone = phone;
    }

    public KhachHang() {

    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return  "ma=" + ma +
                ", ten='" + ten + '\'' +
                ", namSinh='" + namSinh + '\'' +
                ", phone='" + phone;
    }

    public int compareTo(KhachHang o){
        return this.phone.compareToIgnoreCase(o.phone);
    }
}
