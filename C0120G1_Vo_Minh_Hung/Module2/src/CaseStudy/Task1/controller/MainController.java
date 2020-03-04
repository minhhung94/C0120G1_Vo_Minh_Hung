package CaseStudy.Task1.controller;

import CaseStudy.Task1.model.Service;

import java.util.ArrayList;
import java.util.Scanner;

public class MainController {
    private static Scanner sc= new Scanner(System.in);
    public static void displayMainMenu(){
        System.out.println("1.Add New Villa\n"+
                "2.Show Information Villa\n"+
                "3.Exit");
        String choose = sc.nextLine();
        switch (choose){
            case "1":
                addNewService();
                break;
            case "2":
                showInformation();
                break;
            case "3":
                break;
            default:
                System.out.println("Faill! Please choose again! ");
                sc.nextLine();
                displayMainMenu();
        }
    }


    private static void addNewService() {
        ArrayList<Service> listService = new ArrayList<Service>();
        System.out.println("Add New Servicer complete! Enter to continue...");
        sc.nextLine();
        displayMainMenu();
    }

    private static void showInformation() {

        System.out.println("Enter to continue...");
        sc.nextLine();
        displayMainMenu();
    }
}
