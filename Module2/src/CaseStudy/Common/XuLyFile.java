package CaseStudy.Common;

import static CaseStudy.Controller.MainController.*;

public class XuLyFile {
    public static void xuLyLuu(){
        boolean kt= FileFactory.luuFile(listVilla, "D:\\Codegym\\C0120G1_Vo_Minh_Hung\\Module2\\src\\CaseStudy\\data\\Villa.csv");
        boolean kt1= FileFactory.luuFile(listHouse, "D:\\Codegym\\C0120G1_Vo_Minh_Hung\\Module2\\src\\CaseStudy\\data\\House.csv");
        boolean kt2= FileFactory.luuFile(listRoom, "D:\\Codegym\\C0120G1_Vo_Minh_Hung\\Module2\\src\\CaseStudy\\data\\Room.csv");
        boolean kt3= FileFactory.luuFile(listCustomer,"D:\\Codegym\\C0120G1_Vo_Minh_Hung\\Module2\\src\\CaseStudy\\data\\Customer.csv");
        if(kt&&kt1&&kt2&&kt3) {
            System.out.println("Đã lưu file thành công");
        } else {
            System.out.println("Đã lưu file thất bại");
        }
    }
    public static void xuLyDoc(){
        listVilla=FileFactory.docFile("D:\\Codegym\\C0120G1_Vo_Minh_Hung\\Module2\\src\\CaseStudy\\data\\Villa.csv");
        listHouse=FileFactory.docFile("D:\\Codegym\\C0120G1_Vo_Minh_Hung\\Module2\\src\\CaseStudy\\data\\House.csv");
        listRoom=FileFactory.docFile("D:\\Codegym\\C0120G1_Vo_Minh_Hung\\Module2\\src\\CaseStudy\\data\\Room.csv");
        listCustomer=FileFactory.docFile("D:\\Codegym\\C0120G1_Vo_Minh_Hung\\Module2\\src\\CaseStudy\\data\\Customer.csv");

        System.out.println("Đã đọc 4" + " file thành công");
    }
}
