package CaseStudy.Model.Bean;

import CaseStudy.Model.Dao.House;
import CaseStudy.Model.Dao.Service;

import static CaseStudy.Common.Validate.checkInterger;
import static CaseStudy.Common.Validate.checkString;
import static CaseStudy.Controller.MainController.listHouse;
import static CaseStudy.Controller.MainController.sc;

public class AddHouse {

    public static void addHouse() {
        String regex="^Diamond|Gold|Silver$";
        Service house = new House();
        AddService.addService(house);
        System.out.println("Mời bạn nhập Room Standard: ");
        ((House) house).setRoomStandard(checkString(regex,"Room Standard Faill"));
        System.out.println("Mời bạn nhập Accompany Service: ");
        ((House) house).setAccompanyService(sc.nextLine());
        regex="^[1-9]|[1][0-9]|20$";
        System.out.println("Mời bạn nhập Number Off Floors: (from 1 to 20)");
        ((House) house).setNumberOffFloors(checkInterger(regex,"Number Off Floors Faill"));

        listHouse.add( ((House) house));
    }
}
