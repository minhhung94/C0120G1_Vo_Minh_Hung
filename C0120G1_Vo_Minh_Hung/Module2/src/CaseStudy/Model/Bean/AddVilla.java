package CaseStudy.Model.Bean;

import CaseStudy.Model.Dao.Service;
import CaseStudy.Model.Dao.Villa;

import static CaseStudy.Controller.MainController.listVilla;
import static CaseStudy.Common.Validate.*;

public class AddVilla {
    public static void addVilla() {
        Service villa = new Villa();
        String regex="";
        AddService.addService(villa);
        System.out.println("Mời bạn nhập Room Standard: (Diamond, Gold, Silver)");
        regex="^(Diamond|Gold|Silver)?$";
        ((Villa) villa).setRoomStandard(checkString(regex,"Room Standard Faill"));
        System.out.println("Mời bạn nhập Accompany Service: ");
        regex="^(Massage|Karaoke|Food|Drink|Car)?$";
        ((Villa) villa).setAccompanyService(checkString(regex,"Accompany Service Faill"));
        regex="^[1-9][0-9]|100$";
        System.out.println("Mời bạn nhập Area Pool: (from 10 to 100)");
        ((Villa) villa).setAreaPool(checkDouble(regex,"Area Pool Faill"));
        regex="^[1-9]|[1][0-9]|20$";
        System.out.println("Mời bạn nhập Number Off Floors: (from 1 to 20)");
        ((Villa) villa).setNumberOffFloors(checkInterger(regex,"Number Off Floors Faill"));

        listVilla.add((Villa) villa);
    }
}
