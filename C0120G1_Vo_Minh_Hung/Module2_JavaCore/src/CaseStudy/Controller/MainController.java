package CaseStudy.Controller;


import CaseStudy.Common.CustomerComparator;
import CaseStudy.Model.Dao.*;

import java.util.*;

import static CaseStudy.Model.Bean.AddCustomer.addCustomer;
import static CaseStudy.Model.Bean.AddEmployee.addEmployee;
import static CaseStudy.Model.Bean.AddHouse.addHouse;
import static CaseStudy.Model.Bean.AddNewBooking.addBooking;
import static CaseStudy.Model.Bean.AddRoom.addRoom;
import static CaseStudy.Model.Bean.AddVilla.addVilla;

public class MainController {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Villa> listVilla= new ArrayList<>();
    public static ArrayList<House> listHouse= new ArrayList<>();
    public static ArrayList<Room> listRoom= new ArrayList<>();
    public static ArrayList<Customer> listCustomer = new ArrayList<>();
    public static ArrayList<Customer> listBooking= new ArrayList<>();
    public static ArrayList<Employee> listEmployee = new ArrayList<>();

    public static void displayMainMenu()
    {
        System.out.println("\n------------MAIN MENU------------");
        String showOptions = "1.Add new services\n" +
                "2.Show services\n" +
                "3.Add new customer\n" +
                "4.Show information customer\n" +
                "5.Add new booking resort\n" +
                "6.Show Booking Customer\n"+
                "7.Add New Employee\n"+
                "8.Show Information Employee\n"+
                "9.Add Cinema 4D\n"+
                "10.Exit";
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
                addBooking();
                displayMainMenu();
                break;
            case 6:
                showBookingResort();
                displayMainMenu();
                break;
            case 7:
                addEmployee();
                displayMainMenu();
                break;
            case 8:
                showInformationEmployee();
                displayMainMenu();
                break;
            case 9:
                addCinema4D();
                displayMainMenu();
                break;
            case 10:
                System.out.println("Cảm ơn bạn đã dùng phần mềm! bye bye!");
                System.exit(0);
            default:
                System.out.println("Faill! Please choose again!");
                break;
        }
    }

    private static void showBookingResort() {
        System.out.println("\n************** List Booking **************");
        CustomerComparator comparator = new CustomerComparator();
        Collections.sort(listBooking,comparator);
        int i=1;
        for (Customer customer : listBooking) {
            System.out.println("Số thứ tự: "+i+"\n"+customer.showInfor()+"\n"+
                    "************Register Service**************\n"
                    +customer.getUserService().showInfor()+"\n");
            i++;
        }
    }

    private static void addCinema4D() {
        int i = 1;
        for (Customer cus : listCustomer) {
            System.out.println("No: " + i);
            System.out.println(cus.showInfor());
            System.out.println("\n----------------------------------");
            i++;
        }
        Queue<Customer> queue = new LinkedList<>();
        int choose;
        int soLuongVe = 10;
        do {
            System.out.println("Con "+soLuongVe +" ve.");
            System.out.println("Choose Customer Booking, 0 to stop");
            choose = sc.nextInt();
            if (choose == 0) {
                break;
            }

            soLuongVe--;
            queue.add(listCustomer.get(choose - 1));

            if (soLuongVe == 0) {
                System.out.println("Het ve!!!!");
                break;
            }
        } while (true);
        System.out.println("-------------------------------------");
        System.out.println("Enter to Show information of Customer bought ticket");
        sc.nextLine();
        sc.nextLine();
        for (Customer item : queue) {
            System.out.println(item.showInfor());
        }
        System.out.println("Enter to back to menu...");
        sc.nextLine();
        displayMainMenu();

    }

    public static void showInformationEmployee() {
        sc.nextLine();
        Map mapEmployee = new HashMap();
        for (Employee employee : listEmployee) {
            mapEmployee.put(employee.getIdEmployee(), employee.getFullName());
        }
        Set set = mapEmployee.keySet();
        for (Object key : set) {
            System.out.println(key + " " + mapEmployee.get(key));
        }
        displayMainMenu();
    }


    public static void showServices() {
        System.out.println("------------MENU DISPLAY------------\n");
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
                displayService();
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

    public static void displayService() {
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


    public static void showInformationCustomer()
    {
        for (Customer cus:listCustomer){
            System.out.println(cus.showInfor());
        }
    }

    public static void addNewServices()
    {
        System.out.println("----------MENU ADD SERVICE----------\n");
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
