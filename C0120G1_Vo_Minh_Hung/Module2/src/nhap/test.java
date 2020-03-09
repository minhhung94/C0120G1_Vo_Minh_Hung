package nhap;

import java.util.Scanner;

import static CaseStudy.Controller.MainController.sc;

public class test {
    Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        String regex= "^([A-ZẠÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚÝĂĐĨŨƯƠ]?[a-zàáâãèéêìíòóôõùúýăđĩũơư-ỹ][ ]?){2,}$";
        System.out.println("vui long nhap:");
        System.out.println(checkString(regex,"ddddd"));
    }
    public static  String checkString(String regex, String errorMess) {
        while (true) {
            String input= sc.nextLine();
            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println(errorMess);
            }
        }
    }
}