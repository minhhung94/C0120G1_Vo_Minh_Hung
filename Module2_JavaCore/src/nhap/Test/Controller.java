package nhap.Test;

import java.util.Scanner;

public class Controller {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        addPhone();

    }

    public static void addPhone() {
        Phone phone = new Phone();
        System.out.println("asdsd");
        phone.setId(Validate.checkAndGetNumber("Id is invalid !!! please try again"));
    }
}
