package TestCaseStudy.Task1.model;

public class Room extends Service {
    private String freeService;

    public Room() {
    }

    public Room(String id, String nameService, double areaUser, double rentalCosts, int maxNumberOfPeople, String typeRent, String freeService) {
        super(id, nameService, areaUser, rentalCosts, maxNumberOfPeople, typeRent);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String showInfor() {
        return "\nId Service: "+super.getId()+
                "\nName Service: "+super.getNameService()+
                "\nArea Used: "+super.getAreaUser()+
                "\nRent Cost: "+super.getRentalCosts()+
                "\nMax Number Of People: " + super.getMaxNumberOfPeople() +
                "\nType Rent: "+super.getTypeRent()+
                "\nRoom Standard: "+this.freeService;
    }
}
