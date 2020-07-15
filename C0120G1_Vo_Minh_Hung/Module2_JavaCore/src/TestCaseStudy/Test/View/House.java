package TestCaseStudy.Test.View;


import java.util.Scanner;

import static TestCaseStudy.Test.Controller.MainController.listHouse;
import static TestCaseStudy.Test.Controller.MainController.listServices;

public class House {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TestCaseStudy.Test.Model.House hs = new TestCaseStudy.Test.Model.House();
        System.out.println("Mời bạn nhập mã: ");
        hs.setId(sc.nextLine());
        System.out.println("Mời bạn nhập tên: ");
        hs.setServiceName(sc.nextLine());
        System.out.println("Mời bạn nhập Area User: ");
        hs.setAreaUser(sc.nextDouble());
        System.out.println("Mời bạn nhập Rental Costs:");
        hs.setRentalCosts(sc.nextLong());
        System.out.println("Mời bạn nhập Number Of People:");
        hs.setMaxNumberOfPeople(sc.nextInt());
        System.out.println("Mời bạn nhập Type Rent: ");
        hs.setTypeRent(sc.nextLine());
        System.out.println("Mời bạn nhập Room Standard: ");
        hs.setRoomStandard(sc.nextLine());
        System.out.println("Mời bạn nhập Convenient Description: ");
        hs.setConvenientDescription(sc.nextLine());
        System.out.println("Mời bạn nhập Number Off Floors: ");
        hs.setNumberOffFloors(sc.nextInt());
        System.out.println("Mời bạn nhập Accompany Service: ");
        hs.setAccompanyService(sc.nextLine());

        listHouse.add(hs);
        listServices.add(hs);

    }

}
