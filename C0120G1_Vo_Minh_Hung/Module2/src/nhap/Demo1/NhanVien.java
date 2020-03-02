package nhap.Demo1;

public class NhanVien implements Comparable<NhanVien>{
    private int ma;
    private String ten;

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

    public NhanVien(int ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public NhanVien() {
    }

    //Trả về 0 --> bằng nhau
    //Trả về >0 --> đối tượng 1 > đối tượng 2
    //Trả về <0 --> đối tượng 1 < đối tượng 2
    //compareToIgnoreCase so sánh không phân biệt hoa thường
    @Override
    public int compareTo(NhanVien o) {
        //sắp xếp theo tên
//        return this.ten.compareToIgnoreCase(o.getTen());
        //sắp xếp theo ma
//        if (this.ma==o.ma)
//            return 0;
//        if (this.ma >o.ma)
//            return 1;
//        return -1;
        //Sắp xếp theo tên nếu cùng tên thì sắp xếp theo mã giảm dần
        int ssTen = this.ten.compareToIgnoreCase(o.getTen());
        if(ssTen==0){
            if (this.ma==o.ma)
                return 0;
            if (this.ma >o.ma)
                return -1;
        return 1;
        }
        return ssTen;
    }
}
