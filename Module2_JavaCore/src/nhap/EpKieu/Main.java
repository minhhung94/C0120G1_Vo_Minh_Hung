package nhap.EpKieu;

public class Main {
    public static void main(String[] args) {
        Custome custome =new CustomeChild();
        CustomeChild customeChild=new CustomeChild();

        custome.setName("Codegym");


        customeChild.setName("Quoc");
        customeChild.setAge("22");
        customeChild=(CustomeChild) custome;
        ((CustomeChild) custome).setAge("26");
        System.out.println(custome);
        System.out.println(customeChild);
    }
}
