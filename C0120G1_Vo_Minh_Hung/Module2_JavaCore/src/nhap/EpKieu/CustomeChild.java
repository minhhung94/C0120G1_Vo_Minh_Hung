package nhap.EpKieu;

public class CustomeChild extends Custome {
    String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "CustomeChild{" +
                "age='" + age + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
