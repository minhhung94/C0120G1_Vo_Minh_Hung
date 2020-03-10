package CaseStudy.Model.Dao;

import java.io.Serializable;

public class Customer extends Person implements Serializable,Comparable<Customer> {
    private String gender;
    private String typeCustomer;
    private String address;
    public Service userService;

    public Customer() {
    }

    public Customer(String fullName, String birthday, String idCard, String phoneNumber, String email, String address, String gender, String typeCustomer, String address1, Service userService) {
        super(fullName, birthday, idCard, phoneNumber, email, address);
        this.gender = gender;
        this.typeCustomer = typeCustomer;
        this.address = address1;
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

    public Customer(String fullName, String birthday, String idCard, String phoneNumber, String email, String address) {
        super(fullName, birthday, idCard, phoneNumber, email, address);
    }

    @Override
    public String showInfor() {
        return super.showInfor()+"\tGiới tính: "+this.getGender()+
                "\tĐịa chỉ: "+this.getAddress()+"\tType Customer: "+ this.getTypeCustomer();
    }

    @Override
    public int compareTo(Customer o) {
        int ssTen = this.fullName.compareToIgnoreCase(o.getFullName());
        if(ssTen==0){
            if (this.birthday==o.birthday)
                return 0;
            if (Integer.parseInt(this.birthday) >Integer.parseInt(o.birthday))
                return -1;
            return 1;
        }
        return ssTen;
    }
}
