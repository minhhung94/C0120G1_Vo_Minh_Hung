package TestCaseStudy.Test.View;

import java.util.Scanner;

import static TestCaseStudy.Test.Controller.MainController.listRoom;
import static TestCaseStudy.Test.Controller.MainController.listServices;

public class Room {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TestCaseStudy.Test.Model.Room ro = new TestCaseStudy.Test.Model.Room();
        System.out.println("Mời bạn nhập mã: ");
        ro.setId(sc.nextLine());
        System.out.println("Mời bạn nhập tên: ");
        ro.setServiceName(sc.nextLine());
        System.out.println("Mời bạn nhập Area User: ");
        ro.setAreaUser(sc.nextDouble());
        System.out.println("Mời bạn nhập Rental Costs:");
        ro.setRentalCosts(sc.nextLong());
        System.out.println("Mời bạn nhập Number Of People:");
        ro.setMaxNumberOfPeople(sc.nextInt());
        System.out.println("Mời bạn nhập Type Rent: ");
        ro.setTypeRent(sc.nextLine());
        System.out.println("Mời bạn nhập Free Service: ");
        ro.setFreeService(sc.nextLine());
        System.out.println("Mời bạn nhập Accompany Service: ");
        ro.setAccompanyService(sc.nextLine());

        listRoom.add(ro);
        listServices.add(ro);
    }
}
