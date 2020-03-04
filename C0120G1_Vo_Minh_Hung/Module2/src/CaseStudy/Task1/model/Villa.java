package CaseStudy.Task1.model;

public class Villa extends Service {
    private String roomStandard;
    private String convenientDescription;
    private double areaPool;
    private int numberOffFloors;

    public Villa() {
    }

    public Villa(String id, String nameService, double areUser, double rentalCosts, int maxNumberOfPeople, String typeRent, String roomStandard, String convenientDescription, double areaPool, int numberOffFloors) {
        super(id, nameService, areUser, rentalCosts, maxNumberOfPeople, typeRent);
        this.roomStandard = roomStandard;
        this.convenientDescription = convenientDescription;
        this.areaPool = areaPool;
        this.numberOffFloors = numberOffFloors;
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

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberOffFloors() {
        return numberOffFloors;
    }

    public void setNumberOffFloors(int numberOffFloors) {
        this.numberOffFloors = numberOffFloors;
    }

    @Override
    public String showInfor() {
        return "\nId Service: "+super.getId()+
                "\nName Service: "+super.getNameService()+
                "\nArea Used: "+super.getAreaUser()+
                "\nRent Cost: "+super.getRentalCosts()+
                "\nMax Number Of People: " + super.getMaxNumberOfPeople() +
                "\nType Rent: "+super.getTypeRent()+
                "\nRoom Standard: "+this.getRoomStandard()+
                "\nConvenient Description: "+this.getConvenientDescription()+
                "\nArea Pool: "+this.getAreaPool()+
                "\nNumber Off Floors: "+this.getNumberOffFloors();
    }
}
