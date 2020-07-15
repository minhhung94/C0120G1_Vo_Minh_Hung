package CaseStudy.Model.Dao;

import java.io.Serializable;

public class Room extends Service implements Serializable,Comparable<Room> {
    private String freeService;

    public Room() {
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
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
        return super.showInfor()+"\tFree Service"+this.getFreeService();
    }

    @Override
    public int compareTo(Room o) {
        int ssTen = this.serviceName.compareToIgnoreCase(o.getServiceName());
        if(ssTen==0){
            if (this.id==o.id)
                return 0;
            if (Integer.parseInt(this.id) >Integer.parseInt(o.id))
                return -1;
            return 1;
        }
        return ssTen;
    }
}
