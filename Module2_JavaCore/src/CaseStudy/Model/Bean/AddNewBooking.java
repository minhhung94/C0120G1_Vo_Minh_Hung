package CaseStudy.Model.Bean;

import CaseStudy.Model.Dao.House;
import CaseStudy.Model.Dao.Room;
import CaseStudy.Model.Dao.Villa;

import java.util.Scanner;

import static CaseStudy.Common.DocVaLuuFile.saveBooking;
import static CaseStudy.Common.DocVaLuuFile.saveFileCustomer;
import static CaseStudy.Controller.MainController.*;
import static CaseStudy.Model.Bean.AddHouse.addHouse;
import static CaseStudy.Model.Bean.AddRoom.addRoom;
import static CaseStudy.Model.Bean.AddVilla.addVilla;

public class AddNewBooking {
    private static Scanner sc=new Scanner(System.in);
    static int numberSelectCustomer;
    public static void addBooking() {
        System.out.println("Information Customer");
        if (listCustomer.size() == 0) {
            System.out.println("List information customer is null.Please add new Customer");
            displayMainMenu();
        } else {
            showStastusCustomer();
        }
        System.out.println("Select Information Customer");
        numberSelectCustomer=Integer.parseInt(sc.nextLine());
        if (numberSelectCustomer > listCustomer.size()) {
            System.out.println("Select error,please try again");
            addBooking();
        } else {
            if ((listCustomer.get(numberSelectCustomer  - 1).getUserService() == null)) {
                addNewBooking2();
            } else {
                 addNewBooking2();

            }
        }
    }
    public static void addNewBooking2() {
        System.out.println("1.Booking Villa\n" + "2.Booking House\n" + "3.Booking Room\n"+
                "4.Back to menu");
        switch (Integer.parseInt(sc.nextLine())) {
            case 1:
                if (listVilla.size() == 0) {
                    System.out.println("List information Villa is null.Please add new Villa");
                    System.out.println("Do you want register a Villa?\n1.Yes\n2.No");
                    switch (Integer.parseInt(sc.nextLine())) {
                        case 1:
                            addVilla();
                            System.out.println("Add Booking successfully");
                            listCustomer.get(numberSelectCustomer-1).setUserService(listVilla.get(0));
                            listBooking.add(listCustomer.get(numberSelectCustomer-1));
                            saveBooking();
                            addNewBooking2();
                            break;
                        case 2:
                            displayMainMenu();
                            break;
                        default:
                            System.out.println("Enter error.Auto back to menu.");
                            displayMainMenu();
                    }
                } else {
                    for (int i=0;i<listVilla.size();i++) {
                        System.out.println("Số thứ tự "+(i+1)+":\n"+listVilla.get(i).showInfor());
                    }
                    System.out.println("Select Villa you want booking:");
                    int numberSelectVilla = Integer.parseInt(sc.nextLine());
                    if (numberSelectVilla > listVilla.size()) {
                        System.out.println("Select error,please try again");
                        addNewBooking2();
                    } else {
                        listCustomer.get(numberSelectCustomer-1).setUserService(listVilla.get(numberSelectVilla-1));
                        listBooking.add(listCustomer.get(numberSelectCustomer-1));
                        saveBooking();
                        saveFileCustomer();
                        displayMainMenu();
                    }
                }
                break;
            case 2:
                if (listHouse.size() == 0) {
                    System.out.println("List information House is null.Please add new House");
                    System.out.println("Do you want register a House?\n1.Yes\n2.No");
                    switch (Integer.parseInt(sc.nextLine())) {
                        case 1:
                            addHouse();
                            listCustomer.get(numberSelectCustomer-1).setUserService(listHouse.get(0));
                            listBooking.add(listCustomer.get(numberSelectCustomer-1));
                            saveBooking();
                            saveFileCustomer();
                            addNewBooking2();
                            break;
                        case 2:
                            displayMainMenu();
                            break;
                        default:
                            System.out.println("Enter error.Auto back to menu.");
                            displayMainMenu();
                    }
                } else {
                    for (int i=0;i<listHouse.size();i++) {
                        System.out.println("Số thứ tự "+(i+1)+":\n"+listHouse.get(i).showInfor());
                    }
                    System.out.println("Select House you want booking:");
                    int numberSelectHouse = Integer.parseInt(sc.nextLine());
                    if (numberSelectHouse > listHouse.size()) {
                        System.out.println("Select error,please try again");
                        addNewBooking2();
                    } else {
                        listCustomer.get(numberSelectCustomer-1).setUserService(listHouse.get(numberSelectHouse-1));
                        listBooking.add(listCustomer.get(numberSelectCustomer-1));
                        saveBooking();
                        saveFileCustomer();
                        displayMainMenu();
                    }
                }
                break;
            case 3:
                if (listRoom.size() == 0) {
                    System.out.println("List information Room is null.Please add new Room");
                    System.out.println("Do you want register a Room?\n1.Yes\n2.No");
                    switch (Integer.parseInt(sc.nextLine())) {
                        case 1:
                            addRoom();
                            listCustomer.get(numberSelectCustomer-1).setUserService(listRoom.get(0));
                            listBooking.add(listCustomer.get(numberSelectCustomer-1));
                            saveBooking();
                            saveFileCustomer();
                            addNewBooking2();
                            break;
                        case 2:
                            displayMainMenu();
                            break;
                        default:
                            System.out.println("Enter error.Auto back to menu.");
                            displayMainMenu();
                    }
                } else {
                    for (int i=0;i<listRoom.size();i++) {
                        System.out.println("Số thứ tự "+(i+1)+":\n"+listRoom.get(i).showInfor());
                        System.out.println("Select Room you want booking:");
                        int numberSelectRoom = Integer.parseInt(sc.nextLine());
                        if (numberSelectRoom > listRoom.size()) {
                            System.out.println("Select error,please try again");
                            addNewBooking2();
                        } else {
                            listCustomer.get(numberSelectCustomer-1).setUserService(listRoom.get(numberSelectRoom-1));
                            listBooking.add(listCustomer.get(numberSelectCustomer-1));
                            saveBooking();
                            saveFileCustomer();
                            displayMainMenu();
                        }
                    }
                }
                break;
            case 4:
                displayMainMenu();
                break;
            default:
                System.out.println("Enter error,please try again");
                addNewBooking2();
        }
    }
    public static void showStastusCustomer() {
        for (int i=0;i<listCustomer.size();i++) {
            if (listCustomer.get(i).getUserService() == null) {
                System.out.println("Số thứ tự: "+(i+1)+"\nName: "+listCustomer.get(i).getFullName() +
                        "\nIdCustomer: "+listCustomer.get(i).getIdCard()+"\nStatus : Not registered");
            } else {
                if (listCustomer.get(i).getUserService() instanceof Villa) {
                    System.out.println("Số thứ tự: "+(i+1)+"\nName: "+listCustomer.get(i).getFullName()+
                            "\nIdCustomer: "+listCustomer.get(i).getIdCard()+"\nStatus : Registered Villa");
                }
                if (listCustomer.get(i).getUserService() instanceof House) {
                    System.out.println("Số thứ tự: "+(i+1)+"\nName:"+listCustomer.get(i).getFullName() +
                            "\nIdCustomer: "+listCustomer.get(i).getIdCard()+"\nStatus : Registered House");
                }
                if (listCustomer.get(i).getUserService() instanceof Room) {
                    System.out.println("Số thứ tự: "+(i+1)+"\nName:"+listCustomer.get(i).getFullName() +
                            "\nIdCustomer: "+listCustomer.get(i).getIdCard()+"\nStatus : Registered Room");
                }
            }
        }
    }
}
