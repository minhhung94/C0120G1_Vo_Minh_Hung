package nhap.Hoc;

import java.util.HashMap;

public class HocHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> ds=new HashMap<Integer, String>();
        ds.put(113, "Nguyễn Đức Thông, quê ở Trường Sa");
        ds.put(114, "Lê Đình Quốc, quê ở Hoàng Sa , nên bị si đa");
        ds.put(115, "Phạm Thái Cường, quê ở Cà Mau");

        String nv=ds.get(114);

        System.out.println(nv);
        System.out.println("===============================");
        System.out.println("Toàn bộ học sinh của Codegym là: ");
        for (String ten: ds.values())
        {
            System.out.println(ten);
        }
//        ds.remove(115);
//        System.out.println("===============================");
//        System.out.println("Toàn bộ học sinh của Codegym sau khi xoá là: ");
//        for (String ten: ds.values())
//        {
//            System.out.println(ten);
//        }
    }
}
