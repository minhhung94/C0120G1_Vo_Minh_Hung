package CaseStudy.Test.View;

import CaseStudy.Test.Model.Services;

import java.util.Scanner;
import static CaseStudy.Test.Controller.MainController.listServices;

public class House {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Services hs = new CaseStudy.Test.Model.House();
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
        ((CaseStudy.Test.Model.House) hs).setRoomStandard(sc.nextLine());
        System.out.println("Mời bạn nhập Convenient Description: ");
        ((CaseStudy.Test.Model.House) hs).setConvenientDescription(sc.nextLine());
        System.out.println("Mời bạn nhập Number Off Floors: ");
        ((CaseStudy.Test.Model.House) hs).setNumberOffFloors(sc.nextInt());
        System.out.println("Mời bạn nhập Accompany Service: ");
        hs.setAccompanyService(sc.nextLine());

        listServices.add(hs);

    }

}
