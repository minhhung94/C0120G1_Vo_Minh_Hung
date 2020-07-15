package nhap.Hoc;

import java.util.Scanner;

public class HocSplit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhập vào số cần đọc (<10000) = ");
        String s= sc.nextLine();
        System.out.print(s+" đọc là: ");
        String[] words = s.split("");
        String nghin="";
        String chuc="";
        String tram="";
        String donVi="";
        if (words.length==4){
            nghin=  words[0];
            tram = words[1];
            chuc = words[2];
            donVi = words[3];
        }
        else if (words.length==3){
            tram = words[0];
            chuc = words[1];
            donVi = words[2];
        }else if (words.length==2){
            chuc = words[0];
            donVi = words[1];
        }else {
            donVi= words[0];
        }
        switch (nghin){
            case "0":
                break;
            case "1":
                System.out.print("một nghìn ");
                break;
            case "2":
                System.out.print("hai nghìn ");
                break;
            case "3":
                System.out.print("ba nghìn ");
                break;
            case "4":
                System.out.print("bốn nghìn ");
                break;
            case "5":
                System.out.print("năm nghìn ");
                break;
            case "6":
                System.out.print("sáu nghìn ");
                break;
            case "7":
                System.out.print("bảy nghìn ");
                break;
            case "8":
                System.out.print("tám nghìn ");
                break;
            case "9":
                System.out.print("chín nghìn ");
                break;
            default:
                break;
        }

        switch (tram){
            case "0":
                System.out.print("không trăm ");
                break;
            case "1":
                System.out.print("một trăm ");
                break;
            case "2":
                System.out.print("hai trăm ");
                break;
            case "3":
                System.out.print("ba trăm ");
                break;
            case "4":
                System.out.print("bốn trăm ");
                break;
            case "5":
                System.out.print("năm trăm ");
                break;
            case "6":
                System.out.print("sáu trăm ");
                break;
            case "7":
                System.out.print("bảy trăm ");
                break;
            case "8":
                System.out.print("tám trăm ");
                break;
            case "9":
                System.out.print("chín trăm ");
                break;
            default:
                break;
        }

        switch (chuc){
            case "0":
                System.out.print("lẻ ");
                break;
            case "1":
                System.out.print("mười ");
                break;
            case "2":
                System.out.print("hai mươi ");
                break;
            case "3":
                System.out.print("ba mươi ");
                break;
            case "4":
                System.out.print("bốn mươi ");
                break;
            case "5":
                System.out.print("năm mươi ");
                break;
            case "6":
                System.out.print("sáu mươi ");
                break;
            case "7":
                System.out.print("bảy mươi ");
                break;
            case "8":
                System.out.print("tám mươi ");
                break;
            case "9":
                System.out.print("chín mươi ");
                break;
            default:
                break;
        }

        switch (donVi){
            case "0":
                break;
            case "1":
                System.out.print("một");
                break;
            case "2":
                System.out.print("hai");
                break;
            case "3":
                System.out.print("ba");
                break;
            case "4":
                System.out.print("bốn");
                break;
            case "5":
                System.out.print("năm");
                break;
            case "6":
                System.out.print("sáu");
                break;
            case "7":
                System.out.print("bảy");
                break;
            case "8":
                System.out.print("tám");
                break;
            case "9":
                System.out.print("chín");
                break;
            default:
                System.out.println("Số không tồn tại vui lòng nhập lại.");
        }

    }
}
