package service;

import model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServicelmpl implements CustomerService {
    private static Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1,"Le Dinh Quoc","dinhquoc@gmail.com","Da nang"));
        customers.put(2, new Customer(2,"Nguyen Duc Thong","thongnguyen@gmail.com","Hue"));
        customers.put(3,new Customer(3,"Le Hoang Long","longle@gmail.com","Quang Nam"));
        customers.put(4,new Customer(4,"Pham Thai Cuong","thaicuong@gmail.com","Nghe An"));
        customers.put(5,new Customer(4,"Tran Ngoc Tan","tantran@gmail.com","Da Nang"));

    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id,customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
