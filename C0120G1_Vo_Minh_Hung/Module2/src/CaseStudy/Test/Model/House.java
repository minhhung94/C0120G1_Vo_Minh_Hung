package CaseStudy.Test.Model;

import java.io.Serializable;

public class House extends Services implements Serializable,Comparable<House>{
    private String roomStandard;
    private String convenientDescription;
    private int numberOffFloors;

    public House() {
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getConvenientDescription() {
        return convenientDescription;
    }

    public void setConvenientDescription(String convenientDescription) {
        this.convenientDescription = convenientDescription;
    }

    public int getNumberOffFloors() {
        return numberOffFloors;
    }

    public void setNumberOffFloors(int numberOffFloors) {
        this.numberOffFloors = numberOffFloors;
    }

    @Override
    public String getServiceName() {
        return this.serviceName;
    }

    @Override
    public void setServiceName(String serviceName) {
        this.serviceName=serviceName;
    }

    @Override
    public double getAreaUser() {
        return this.areaUser;
    }

    @Override
    public void setAreaUser(double areaUser) {
        this.areaUser=areaUser;
    }

    @Override
    public long getRentalCosts() {
        return this.rentalCosts;
    }

    @Override
    public void setRentalCosts(long rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    @Override
    public int getMaxNumberOfPeople() {
        return this.maxNumberOfPeople;
    }

    @Override
    public void setMaxNumberOfPeople(int maxNumberOfPeople) {
        this.maxNumberOfPeople=maxNumberOfPeople;
    }

    @Override
    public String getTypeRent() {
        return this.typeRent;
    }

    @Override
    public void setTypeRent(String typeRent) {
        this.typeRent=typeRent;
    }

    @Override
    public String showInfor() {
        return "House";
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void setId(String id) {
        this.id=id;
    }

    @Override
    public String getAccompanyService() {
        return this.accompanyService;
    }

    @Override
    public void setAccompanyService(String accompanyService) {
        this.accompanyService = accompanyService;
    }

    @Override
    public int compareTo(House o) {
        return 0;
    }
}
