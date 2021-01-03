package nhap.Test;

import java.util.Scanner;

public class vnnhnlm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine().trim().toLowerCase();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || str.charAt(i - 1) == ' '&& str.charAt(i)!=' ') {
                result += Character.toString(str.charAt(i)).toUpperCase();
                continue;
            }
            if (str.charAt(i) == ' ' && str.charAt(i + 1) == ' ') {
                continue;
            }
            result += Character.toString(str.charAt(i));
        }
        System.out.println(result);

    }
}
