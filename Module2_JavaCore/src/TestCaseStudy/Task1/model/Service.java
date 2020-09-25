package TestCaseStudy.Task1.model;

public abstract class Service {
    private String id;
    private String nameService;
    private double areaUser;
    private double rentalCosts;
    private int maxNumberOfPeople;
    private String typeRent;

    public Service(String id, String nameService, double areaUser, double rentalCosts, int maxNumberOfPeople, String typeRent) {
        this.id = id;
        this.nameService = nameService;
        this.areaUser = areaUser;
        this.rentalCosts = rentalCosts;
        this.maxNumberOfPeople = maxNumberOfPeople;
        this.typeRent = typeRent;
    }

    public Service() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
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

    public abstract String showInfor();
}
