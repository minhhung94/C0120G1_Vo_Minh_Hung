package CaseStudy.Common;

import static CaseStudy.Controller.MainController.sc;

public class Validate {
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
    public static int checkInteger(String regex,String errorMess){
        while (true) {
            int input= sc.nextInt();
            if ((input+"").matches(regex)) {
                return input;
            } else {
                System.out.println(errorMess);
            }
        }
    }
    public static double checkDouble(String regex,String errorMess){
        while (true) {
            double input= sc.nextDouble();
            if (((int)(input)+"").matches(regex)) {
                return input;
            } else {
                System.out.println(errorMess);
            }
        }
    }
    public static  String checkStringLowerCase(String regex, String errorMess) {
        while (true) {
            String input= sc.nextLine();
            if (input.matches(regex)) {
                return input.toLowerCase();
            } else {
                System.out.println(errorMess);
            }
        }
    }
}
