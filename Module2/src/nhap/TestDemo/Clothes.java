package nhap.TestDemo;

public class Clothes extends DungChung1 implements Method{
    private String color;

    public Clothes() {
    }

    public Clothes(int id, String name, double size, String color) {
        super(id, name, size);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
