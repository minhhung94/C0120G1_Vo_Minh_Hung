package TestCaseStudy.Test.Model;

public abstract class Services {
    protected String serviceName;
    protected double areaUser;
    protected long rentalCosts;
    protected int maxNumberOfPeople;
    protected String typeRent;
    protected String id;
    protected String accompanyService;
    public abstract String getServiceName();

    public abstract void setServiceName(String serviceName);

    public abstract double getAreaUser();

    public abstract void setAreaUser(double areaUser);

    public abstract long getRentalCosts();

    public abstract void setRentalCosts(long rentalCosts);

    public abstract int getMaxNumberOfPeople();

    public abstract void setMaxNumberOfPeople(int maxNumberOfPeople);

    public abstract String getTypeRent();

    public abstract void setTypeRent(String typeRent);

    public abstract String showInfor();

    public abstract String getId();

    public abstract void setId(String id);

    public abstract String getAccompanyService();

    public abstract void setAccompanyService(String accompanyService);
}
