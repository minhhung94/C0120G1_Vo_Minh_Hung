package CaseStudy.Model.Bean;

import CaseStudy.Model.Dao.House;
import CaseStudy.Model.Dao.Room;
import CaseStudy.Model.Dao.Service;
import CaseStudy.Model.Dao.Villa;

import java.util.UUID;

import static CaseStudy.Common.Validate.*;
import static CaseStudy.Controller.MainController.sc;

public class AddService {
    public static Service addService(Service service){
        String regex = "";
        service.setId(UUID.randomUUID().toString().replace("-", ""));

        if (service instanceof Villa){
            System.out.println("Mời bạn nhập tên Villa: SVVL-XXXX (X: number) ");
            regex = "^SVVL[0-9]{4}$";
        }else if (service instanceof House){
            System.out.println("Mời bạn nhập tên House: SVHO-XXXX (X: number)");
            regex = "^SVHO[0-9]{4}$";
        }else if (service instanceof Room){
            System.out.println("Mời bạn nhập tên Room: SVRO-XXXX (X: number)");
            regex = "^SVRO[0-9]{4}$";
        }
        service.setServiceName(checkString(regex,"Name Service Failed"));
        System.out.println("Mời bạn nhập Area User: ");
        regex="^[1-4][0-9]{2}$";
        service.setAreaUser(checkInterger(regex,"Area User Faill"));
        System.out.println("Mời bạn nhập Rental Costs:");
        regex="^[1-9][0-9]{5,10}$";
        service.setRentalCosts(checkDouble(regex,"Rental Costs Faill"));
        System.out.println("Mời bạn nhập Number Of People:");
        regex="^([1-9]|[1][0-9])$";
        service.setMaxNumberOfPeople(checkInterger(regex,"Number of people Faill"));
        sc.nextLine();
        System.out.println("Mời bạn nhập Type Rent: (byYear, byMonth, byDay) ");
        regex="^byYear|byMonth|byDay$";
        service.setTypeRent(checkString(regex,"Type Rent Faill"));
        return service;
    }
}
