package CaseStudy.Common;

import java.util.ArrayList;

import static CaseStudy.Common.FileFactory.docFile;
import static CaseStudy.Common.FileFactory.luuFile;
import static CaseStudy.Controller.MainController.*;
import static CaseStudy.View.Run.*;


public class DocVaLuuFile {
    public static void saveFileVilla() {
        saveFile(listVilla,pathVilla,"Villa");
    }
    public static void loadFileVilla() {
        listVilla=docFile(pathVilla);
    }
    public static void saveFileHouse() {
        saveFile(listHouse,pathHouse,"House");
    }
    public static void loadFileHouse() {
        listHouse=docFile(pathHouse);
    }
    public static void saveFileRoom() {
        saveFile(listRoom,pathRoom,"Room");
    }
    public static void loadFileRoom() {
        listRoom=docFile(pathRoom);
    }
    public static void saveBooking() {
        saveFile(listBooking,pathBooking,"Booking");
    }
    public static void loadBooking() {
        listBooking=docFile(pathBooking);
    }
    public static void saveFileEmployee() {
        saveFile(listEmployee,pathEmployee,"Employee");
    }
    public static void loadFileEmployee() {
        listEmployee=docFile(pathEmployee);
    }
    public static void saveFileCustomer() {
        saveFile(listCustomer,pathCustomer,"Customer");
    }
    public static void loadFileCustomer() {
        listCustomer=docFile(pathCustomer);
    }

    public static <T> void saveFile(ArrayList<T> listT, String path, String name) {
        boolean check=luuFile(listT,path);
        if (check) {
            System.out.println("Save "+name+" successfully");
        } else {
            System.out.println("Save "+name+" Failed,try again");
        }
    }
}
