package TestCaseStudy.Task1.view;

import TestCaseStudy.Task1.model.Service;
import TestCaseStudy.Task1.model.Villa;

import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Service villa=new Villa();
        villa.setId(UUID.randomUUID().toString().replace("-",""));
        System.out.println("Enter Name Service");
        villa.setNameService(sc.nextLine());
        System.out.println("Enter Area Used");
        villa.setAreaUser(sc.nextDouble());
        System.out.println("Enter Rental Costs");
        villa.setRentalCosts(sc.nextDouble());
        System.out.println("Enter Max Number Of People");
        villa.setMaxNumberOfPeople(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter Type Rent");
        villa.setTypeRent(sc.nextLine());
        System.out.println("Enter Room Standard");
        ((Villa)villa).setRoomStandard(sc.nextLine());
        System.out.println("Enter Convenient Description");
        ((Villa)villa).setConvenientDescription(sc.nextLine());
        System.out.println("Enter Area Pool");
        ((Villa)villa).setAreaPool(sc.nextDouble());
        System.out.println("Enter Number Off Floors");
        ((Villa)villa).setNumberOffFloors(sc.nextInt());
        System.out.println(villa.showInfor());
    }
}
