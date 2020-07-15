package B1.Ngon_Ngu_Lap_Trinh_Java.Bai_Tap;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhập vào số cần đọc (<1000) = ");
        String s= sc.nextLine();
        String[] words = s.split("");
        String chuc="";
        String tram="";
        String donVi="";
        if (words.length==3){
            tram = words[0];
            chuc = words[1];
            donVi = words[2];
        }else if (words.length==2){
            chuc = words[0];
            donVi = words[1];
        }else {
            donVi= words[0];
        }
        switch (tram){
            case "1":
                System.out.print("Một trăm ");
                break;
            case "2":
                System.out.print("Hai trăm ");
                break;
            case "3":
                System.out.print("Ba trăm ");
                break;
            case "4":
                System.out.print("Bốn trăm ");
                break;
            case "5":
                System.out.print("Năm trăm ");
                break;
            case "6":
                System.out.print("Sáu trăm ");
                break;
            case "7":
                System.out.print("Bảy trăm ");
                break;
            case "8":
                System.out.print("Tám trăm ");
                break;
            case "9":
                System.out.print("Chín trăm ");
                break;
            default:
                break;
        }

        switch (chuc){
            case "0":
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
                if (chuc ==""){
                    System.out.print("một");
                    break;
                }
                if (parseInt(chuc)>1){
                    System.out.print("mốt");
                }else {System.out.print("một");}
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
                if (parseInt(chuc)>0){
                    System.out.print("lăm");
                }else {
                    System.out.print("năm");
                }
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
