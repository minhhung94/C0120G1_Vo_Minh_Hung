package TestCaseStudy.Task1.model;

public class House extends Service {
    private String roomStandard;
    private String convenientDescription;
    private int numberOffFloors;

    public House() {
    }

    public House(String id, String nameService, double areaUser, double rentalCosts, int maxNumberOfPeople, String typeRent, String roomStandard, String convenientDescription, int numberOffFloors) {
        super(id, nameService, areaUser, rentalCosts, maxNumberOfPeople, typeRent);
        this.roomStandard = roomStandard;
        this.convenientDescription = convenientDescription;
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
                "\nNumber Off Floors: "+this.getNumberOffFloors();
    }
}
