package CaseStudy.Model.Bean;

import CaseStudy.Model.Dao.Room;
import CaseStudy.Model.Dao.Service;

import static CaseStudy.Controller.MainController.listRoom;
import static CaseStudy.Controller.MainController.sc;

public class AddRoom {
    public static void addRoom() {
        Service room = new Room();
        AddService.addService(room);
        System.out.println("Mời bạn nhập Free Service: ");
        ((Room) room).setFreeService(sc.nextLine());

        listRoom.add((Room) room);
    }
}
