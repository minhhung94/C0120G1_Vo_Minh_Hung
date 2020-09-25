package nhap.TestDemo;

public class Customer extends DungChung implements Method{
    private String address;
    private double age;

    public Customer() {
    }

    public Customer(int id, String name, String address, double age) {
        super(id, name);
        this.address = address;
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public void addNew() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void getAll() {

    }

    @Override
    public void findById() {

    }
}
