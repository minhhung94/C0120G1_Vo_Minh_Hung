package CaseStudy.Controller;


import CaseStudy.Model.Dao.*;

import java.util.ArrayList;
import java.util.Scanner;

import static CaseStudy.Common.XuLyFile.xuLyDoc;
import static CaseStudy.Common.XuLyFile.xuLyLuu;
import static CaseStudy.Model.Bean.AddCustomer.addCustomer;
import static CaseStudy.Model.Bean.AddHouse.addHouse;
import static CaseStudy.Model.Bean.AddRoom.addRoom;
import static CaseStudy.Model.Bean.AddVilla.addVilla;

public class MainController {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Villa> listVilla= new ArrayList<>();
    public static ArrayList<House> listHouse= new ArrayList<>();
    public static ArrayList<Room> listRoom= new ArrayList<>();
    public static ArrayList<Customer> listCustomer = new ArrayList<>();
    public static ArrayList<Employee> listEmployee = new ArrayList<>();

    public static void displayMainMenu()
    {
        String showOptions = "1.Add new services\n" +
                "2.Show services\n" +
                "3.Add new customer\n" +
                "4.Show information customer\n" +
                "5.Add new booking resort\n" +
                "6.Show Information of Employee\n"+
                "7.Save File\n"+
                "8.Load File\n"+
                "9.Exit";
        short option;
        System.out.println(showOptions);
        option = sc.nextShort();
        switch (option)
        {
            case 1:
                addNewServices();
                break;
            case 2:
                showServices();
                break;
            case 3:
                addCustomer();
                displayMainMenu();
                break;
            case 4:
                showInformationCustomer();
                displayMainMenu();
                break;
            case 5:
                addNewBookingResort();
                displayMainMenu();
                break;
            case 6:
                showInformationEmployee();
                displayMainMenu();
                break;
            case 7:
                xuLyLuu();
                displayMainMenu();
                break;
            case 8:
                xuLyDoc();
                displayMainMenu();
                break;
            case 9:
                System.out.println("Cảm ơn bạn đã dùng phần mềm! bye bye!");
                System.exit(0);
            default:
                System.out.println("Faill! Please choose again!");
                break;
        }
    }

    public static void showInformationEmployee() {
    }


    public static void showServices() {
        String showOptions = "1.Display Service\n" +
                "2.Display villa\n" +
                "3.Display house\n" +
                "4.Display room\n" +
                "5.Display All Name Villa Not Duplicate\n" +
                "6.Display All Name House Not Duplicate\n"+
                "7.Display All Name Name Not Duplicate\n"+
                "8.Back to menu\n"+
                "9.Exit";
        short addOption;
        System.out.println(showOptions);
        addOption = sc.nextShort();
        switch (addOption)
        {
            case 1:
                deplayService();
                displayMainMenu();
                break;
            case 2:
                for (Villa vi:listVilla){
                    System.out.println(vi.showInfor());
                }
                displayMainMenu();
                break;
            case 3:
                for (House hs:listHouse){
                    System.out.println(hs.showInfor());
                }
                displayMainMenu();
                break;
            case 4:
                for (Room ro:listRoom){
                    System.out.println(ro.showInfor());
                }
                displayMainMenu();
                break;
            case 5:
                for (Villa vi:listVilla){
                    System.out.println(vi.getServiceName());
                }
                displayMainMenu();
                break;
            case 6:
                for (House hs:listHouse){
                    System.out.println(hs.getServiceName());
                }
                displayMainMenu();
                break;
            case 7:
                for (Room ro:listRoom){
                    System.out.println(ro.getServiceName());
                }
                displayMainMenu();
                break;
            case 8:
                displayMainMenu();
                break;
            default:
                System.out.println("Faill! Please choose again!");
                break;
        }
    }

    public static void deplayService() {
        System.out.println("Villa: ");
        for (Villa vi:listVilla){
            System.out.println(vi.showInfor());
        }
        System.out.println("House: ");
        for (House hs:listHouse){
            System.out.println(hs.showInfor());
        }
        System.out.println("Room: ");
        for (Room ro:listRoom){
            System.out.println(ro.showInfor());
        }
    }

    public static void addNewBookingResort()
    {

    }

    public static void showInformationCustomer()
    {
        for (Customer cus:listCustomer){
            System.out.println(cus.showInfor());
        }
    }

    public static void addNewServices()
    {
        String showOptions = "1.Add new villa\n" +
                "2.Add new house\n" +
                "3.Add new room\n" +
                "4.Back to menu\n" +
                "5.Exit";
        short addOption;
        System.out.println(showOptions);
        addOption = sc.nextShort();
        switch (addOption)
        {
            case 1:
                addVilla();
                displayMainMenu();
                break;
            case 2:
                addHouse();
                displayMainMenu();
                break;
            case 3:
                addRoom();
                displayMainMenu();
                break;
            case 4:
                displayMainMenu();
                break;
            case 5:
                break;
            default:
                System.out.println("Faill! Please choose again!");
                break;
        }
    }

}
