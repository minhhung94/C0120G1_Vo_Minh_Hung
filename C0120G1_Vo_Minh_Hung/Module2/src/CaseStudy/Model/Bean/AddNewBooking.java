package CaseStudy.Model.Bean;

import CaseStudy.Model.Dao.Customer;
import CaseStudy.Model.Dao.House;
import CaseStudy.Model.Dao.Room;
import CaseStudy.Model.Dao.Villa;

import java.util.Scanner;

import static CaseStudy.Common.DocVaLuuFile.*;
import static CaseStudy.Controller.MainController.*;

public class AddNewBooking {
    private static Scanner sc=new Scanner(System.in);
    public static void addBooking(){
        int i = 1;
        loadFileCustomer();
        for (Customer customer : listCustomer) {
            System.out.println("-------------------------");
            System.out.println("Customer " + i +" : ");
            System.out.println(customer.showInfor());
            System.out.println("-------------------------");
            i++;
        }
        System.out.println("Choose Customer Booking");
        Customer customer = listCustomer.get(sc.nextInt() - 1);
        sc.nextLine();
        System.out.println("\n1. Booking Villa." +
                "\n2. Booking House." +
                "\n3. Booking Room.");
        System.out.println("Choose Service Booking");
        String choose = sc.nextLine();
        switch (choose) {
            case "1":
                i = 1;
               loadFileVilla();
                for (Villa villa : listVilla) {
                    System.out.println("-------------------------");
                    System.out.println("No : " + i);
                    System.out.println(villa.showInfor());
                    System.out.println("-------------------------");
                    i++;
                }
                System.out.println("Choose Villa Booking");
                int chooseVillaBooking;
                chooseVillaBooking = sc.nextInt();
                Villa villa = listVilla.get(chooseVillaBooking - 1);
                customer.setUserService(villa);
                break;
            case "2":
                loadFileHouse();
                i = 1;
                for (House house : listHouse) {
                    System.out.println("-------------------------");
                    System.out.println("No : " + i);
                    System.out.println(house.showInfor());
                    System.out.println("-------------------------");
                    i++;
                }
                System.out.println("Choose House Booking");
                int chooseHouseBooking;
                chooseHouseBooking = sc.nextInt();
                House house = listHouse.get(chooseHouseBooking - 1);
                customer.setUserService(house);
                break;
            case "3":
                loadFileRoom();
                i = 1;
                for (Room room : listRoom) {
                    System.out.println("-------------------------");
                    System.out.println("No : " + i);
                    System.out.println(room.showInfor());
                    System.out.println("-------------------------");
                    i++;
                }
                System.out.println("Choose Room Booking");
                int chooseRoomBooking;
                chooseRoomBooking = sc.nextInt();
                Room room = listRoom.get(chooseRoomBooking - 1);
                customer.setUserService(room);
                break;
            default:
                System.out.println("Add new booking failed!");
                addBooking();
                break;
        }
    }

}
