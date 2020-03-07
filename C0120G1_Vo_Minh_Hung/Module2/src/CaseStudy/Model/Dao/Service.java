package CaseStudy.Model.Dao;

public abstract class Service {
    protected String id;
    protected String serviceName;
    protected double areaUser;
    protected double rentalCosts;
    protected int maxNumberOfPeople;
    protected String typeRent;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getAreaUser() {
        return areaUser;
    }

    public void setAreaUser(double areaUser) {
        this.areaUser = areaUser;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaxNumberOfPeople() {
        return maxNumberOfPeople;
    }

    public void setMaxNumberOfPeople(int maxNumberOfPeople) {
        this.maxNumberOfPeople = maxNumberOfPeople;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    public String showInfor(){
        return "Id: "+this.getId()+
                "\tService Name: "+this.getServiceName()+
                "\tArea User: "+this.getAreaUser()+
                "\tRental Costs: "+this.getRentalCosts()+
                "\tNumber Of People: "+ this.getMaxNumberOfPeople() +
                "\tType Rent: "+this.getTypeRent();
    }
}
