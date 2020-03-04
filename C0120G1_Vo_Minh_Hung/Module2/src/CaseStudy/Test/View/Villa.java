package CaseStudy.Test.View;

import CaseStudy.Test.Model.Services;

import java.util.Scanner;

import static CaseStudy.Test.Controller.MainController.listServices;

public class Villa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Services vl = new CaseStudy.Test.Model.Villa();
        System.out.println("Mời bạn nhập mã: ");
        vl.setId(sc.nextLine());
        System.out.println("Mời bạn nhập tên: ");
        vl.setServiceName(sc.nextLine());
        System.out.println("Mời bạn nhập Area User: ");
        vl.setAreaUser(sc.nextDouble());
        System.out.println("Mời bạn nhập Rental Costs:");
        vl.setRentalCosts(sc.nextLong());
        System.out.println("Mời bạn nhập Number Of People:");
        vl.setMaxNumberOfPeople(sc.nextInt());
        System.out.println("Mời bạn nhập Type Rent: ");
        vl.setTypeRent(sc.nextLine());
        System.out.println("Mời bạn nhập Room Standard: ");
        ((CaseStudy.Test.Model.Villa) vl).setRoomStandard(sc.nextLine());
        System.out.println("Mời bạn nhập Convenient Description: ");
        ((CaseStudy.Test.Model.Villa) vl).setConvenientDescription(sc.nextLine());
        System.out.println("Mời bạn nhập Area Pool: ");
        ((CaseStudy.Test.Model.Villa) vl).setAreaPool(sc.nextDouble());
        System.out.println("Mời bạn nhập Number Off Floors: ");
        ((CaseStudy.Test.Model.Villa) vl).setNumberOffFloors(sc.nextInt());
        System.out.println("Mời bạn nhập Accompany Service: ");
        vl.setAccompanyService(sc.nextLine());

        listServices.add(vl);
    }
}
