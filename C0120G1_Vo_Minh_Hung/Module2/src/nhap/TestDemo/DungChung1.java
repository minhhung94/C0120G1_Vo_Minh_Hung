package nhap.TestDemo;

public abstract class DungChung1 extends DungChung {
    private double size;

    public DungChung1() {
    }


    public void finById() {

    }

    public DungChung1(int id, String name, double size) {
        super(id, name);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

}
