package nhap.TestDemo;

public class Shoes extends DungChung1 implements Method{
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Shoes() {
    }

    public Shoes(int id, String name, double size, String brand) {
        super(id, name, size);
        this.brand = brand;
    }


    public String Delete() {
        return null;
    }


    public String Edit() {
        return null;
    }


    public String Add() {
        return null;
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
