package nhap.DaTienTrinh;

public class TestMyThread1 {
    public static void main(String[] args) {
        MyThread1 th1 = new MyThread1();
        th1.setName("Tien trinh 1");
        th1.start();//Kich hoat tien trinh (goi la tieu trinh)

        MyThread1 th2 = new MyThread1();
        th2.setName("Tien trinh 2");
        th2.start();
    }
}
