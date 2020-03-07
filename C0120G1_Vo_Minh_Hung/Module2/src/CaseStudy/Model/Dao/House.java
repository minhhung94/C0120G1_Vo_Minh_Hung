package CaseStudy.Model.Dao;

import java.io.Serializable;

public class House extends Service implements Serializable {
    private String roomStandard;
    private String accompanyService;
    private int numberOffFloors;

    public House() {
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getAccompanyService() {
        return accompanyService;
    }

    public void setAccompanyService(String accompanyService) {
        this.accompanyService = accompanyService;
    }

    public int getNumberOffFloors() {
        return numberOffFloors;
    }

    public void setNumberOffFloors(int numberOffFloors) {
        this.numberOffFloors = numberOffFloors;
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public void setId(String id) {
        super.setId(id);
    }

    @Override
    public String getServiceName() {
        return super.getServiceName();
    }

    @Override
    public void setServiceName(String serviceName) {
        super.setServiceName(serviceName);
    }

    @Override
    public double getAreaUser() {
        return super.getAreaUser();
    }

    @Override
    public void setAreaUser(double areaUser) {
        super.setAreaUser(areaUser);
    }

    @Override
    public double getRentalCosts() {
        return super.getRentalCosts();
    }

    @Override
    public void setRentalCosts(double rentalCosts) {
        super.setRentalCosts(rentalCosts);
    }

    @Override
    public int getMaxNumberOfPeople() {
        return super.getMaxNumberOfPeople();
    }

    @Override
    public void setMaxNumberOfPeople(int maxNumberOfPeople) {
        super.setMaxNumberOfPeople(maxNumberOfPeople);
    }

    @Override
    public String getTypeRent() {
        return super.getTypeRent();
    }

    @Override
    public void setTypeRent(String typeRent) {
        super.setTypeRent(typeRent);
    }

    @Override
    public String showInfor() {
        return super.showInfor()+"\tRoom Standard: "+this.getRoomStandard()+
                "\tAccompany Service: "+this.getAccompanyService()+
                "\tNumber Off Floors: "+this.getNumberOffFloors();
    }
}
