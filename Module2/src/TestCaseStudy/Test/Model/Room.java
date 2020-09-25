package TestCaseStudy.Test.Model;

import java.io.Serializable;

public class Room extends Services implements Serializable,Comparable<Room> {
    private String freeService;

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
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
        return "Room";
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
    public int compareTo(Room o) {
        return 0;
    }
}
