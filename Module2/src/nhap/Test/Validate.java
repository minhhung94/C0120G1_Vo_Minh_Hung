package nhap.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Validate {
    public static int checkAndGetNumber(String contentError) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(contentError);
            }
        }
    }
}
