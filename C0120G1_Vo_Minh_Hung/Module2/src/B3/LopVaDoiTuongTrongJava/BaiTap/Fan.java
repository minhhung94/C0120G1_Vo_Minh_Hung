package B3.LopVaDoiTuongTrongJava.BaiTap;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    public int speed = SLOW;
    public boolean on = false;
    public double radius = 5;
    public String color = new String("blue");

    boolean fanOn() {
        on = true;
        return on;
    }

    boolean fanOff() {
        on = false;
        return on;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed ==1){
            speed = FAST;
        }else if (speed==2){
            speed = MEDIUM;
        }else {
            speed = SLOW;
        }
        this.speed = speed;
    }

    double setRadius(double rad) {
        radius = rad ;
        return radius;
    }

    String setColor(String colorType) {
        color = colorType;
        return color;
    }

    public String toString() {
        return ("Speed:" + getSpeed() + "\nRadius:" + radius + "\nColor: "+ color + "\nOn: " + on);
    }
}
class testFan{
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setColor("yellow");
        fan1.setSpeed(1);
        fan1.setRadius(10);
        fan1.fanOn();
        System.out.println(fan1.toString());

        Fan fan2 = new Fan();
        fan2.setColor("blue");
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.fanOff();
        System.out.println(fan2.toString());
    }
}