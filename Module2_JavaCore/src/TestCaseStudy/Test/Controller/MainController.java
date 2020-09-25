package TestCaseStudy.Test.Controller;

import TestCaseStudy.Test.Model.House;
import TestCaseStudy.Test.Model.Room;
import TestCaseStudy.Test.Model.Services;
import TestCaseStudy.Test.Model.Villa;

import java.util.ArrayList;
import java.util.Scanner;

public class MainController {

    public static void main(String[] args)
    {
        displayMainMenu();
    }
    public static ArrayList<Services> listServices= new ArrayList<>();
    public static ArrayList<Villa> listVilla= new ArrayList<>();
    public static ArrayList<House> listHouse= new ArrayList<>();
    public static ArrayList<Room> listRoom= new ArrayList<>();


    public static void displayMainMenu()
    {
        Scanner input = new Scanner(System.in);
        String showOptions = "1.Add new services\n" +
                "2.Show services\n" +
                "3.Add new customer\n" +
                "4.Show information customer\n" +
                "5.Add new booking resort\n" +
                "6.Exit";
        short option;
        System.out.println(showOptions);
        option = input.nextShort();
        switch (option)
        {
            case 1:
                addNewServices();
                break;
            case 2:
                showServices();
                break;
            case 3:
                addNewCustomer();
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
            default:
                System.out.println("Faill! Please choose again!");
                break;
        }
    }

    private static void addNewCustomer() {
    }

    private static void showServices() {
    }

    public static void addNewBookingResort()
    {
        //String options="1.Booking"
    }


    public static void showInformationCustomer()
    {
//        try
//        {
////            FuncReadFileCSV.sortMe();
//        } catch (IOException e)
//        {
////            e.printStackTrace();
//        }
    }

    public static void addNewServices()
    {
        Scanner input = new Scanner(System.in);
        String showOptions = "1.Add new villa\n" +
                "2.Add new house\n" +
                "3.Add new room\n" +
                "4.Back to menu\n" +
                "5.Exit";
        short addOption;
        System.out.println(showOptions);
        addOption = input.nextShort();
        switch (addOption)
        {
            case 1:
                new House();
                displayMainMenu();
                break;
            case 2:
                addNewHouse();
                displayMainMenu();
                break;
            case 3:
                addNewRoom();
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


    private static void addNewVilla() {

    }
    private static void addNewHouse() {

    }
    private static void addNewRoom() {

    }
}
