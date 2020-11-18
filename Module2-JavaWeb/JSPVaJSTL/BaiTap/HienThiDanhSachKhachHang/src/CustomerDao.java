import java.util.ArrayList;
import java.util.List;

public class CustomerDao {
    private static final List<Customer> listCustomer = new ArrayList<Customer>();
    static {
        initData();
    }
    private static void initData() {
        Customer cus1 = new Customer("Tran Ngoc Tan","12/12/1998","Da Nang","img/tan.png");
        Customer cus2= new Customer("Nguyen Dinh Hoa", "02/08/1994", "Quang Nam", "img/hoa.png");
        Customer cus3= new Customer("Le Dinh Quoc", "11/06/1998", "Quang Nam", "img/quoc.png");
        Customer cus4= new Customer("Pham Thai Cuong", "09/02/1996", "Nha Trang", "img/cuong.png");
        listCustomer.add(cus1);
        listCustomer.add(cus2);
        listCustomer.add(cus3);
        listCustomer.add(cus4);

    }
    // Truy vấn bảng Department.
    public static List<Customer> queryCustomers() {
        return listCustomer;
    }

}
