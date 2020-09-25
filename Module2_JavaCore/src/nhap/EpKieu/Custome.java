package nhap.EpKieu;

public class Custome {
    String name;

    public Custome() {
    }

    public Custome(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Custome{" +
                "name='" + name + '\'' +
                '}';
    }
}
