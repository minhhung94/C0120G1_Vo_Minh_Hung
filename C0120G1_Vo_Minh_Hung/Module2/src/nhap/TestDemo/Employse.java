package nhap.TestDemo;

public class Employse extends DungChung implements Method{
    private double salary;
    private String address;

    public Employse() {
    }

    public Employse(int id, String name, double salary, String address) {
        super(id, name);
        this.salary = salary;
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
