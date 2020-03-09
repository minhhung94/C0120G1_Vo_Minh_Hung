package CaseStudy.Model.Dao;

public class Customer extends Person {
    private String gender;
    private String typeCustomer;
    private String idService;
    private String address;
    public Service userService;

    public Customer() {
    }

    public Customer(String fullName, String birthday, String idCard, String phoneNumber, String email, String gender, String typeCustomer, String idService, String address, Service userService) {
        super(fullName, birthday, idCard, phoneNumber, email);
        this.gender = gender;
        this.typeCustomer = typeCustomer;
        this.idService = idService;
        this.address = address;
        this.userService = userService;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Service getUserService() {
        return userService;
    }

    public void setUserService(Service userService) {
        this.userService = userService;
    }

    @Override
    public String getFullName() {
        return super.getFullName();
    }

    @Override
    public void setFullName(String fullName) {
        super.setFullName(fullName);
    }

    @Override
    public String getBirthday() {
        return super.getBirthday();
    }

    @Override
    public void setBirthday(String birthday) {
        super.setBirthday(birthday);
    }

    @Override
    public String getIdCard() {
        return super.getIdCard();
    }

    @Override
    public void setIdCard(String idCard) {
        super.setIdCard(idCard);
    }

    @Override
    public String getPhoneNumber() {
        return super.getPhoneNumber();
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        super.setPhoneNumber(phoneNumber);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public String showInfor() {
        return super.showInfor()+"\tGiới tính: "+this.getGender()+
                "\tĐịa chỉ: "+this.getAddress()+"\tType Customer: "+ this.getTypeCustomer()+
                "\tId Service: "+this.getIdService();
    }
}
