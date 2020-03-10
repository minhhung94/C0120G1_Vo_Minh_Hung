package CaseStudy.Model.Dao;

import java.io.Serializable;

public abstract class Person implements Serializable {
    protected String fullName;
    protected String birthday;
    protected String idCard;
    protected String phoneNumber;
    protected String email;
    protected String address;

    public Person() {
    }

    public Person(String fullName, String birthday, String idCard, String phoneNumber, String email, String address) {
        this.fullName = fullName;
        this.birthday = birthday;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String showInfor(){
        return "Full Name: "+this.getFullName()+"\tBirthday: "+
                this.getBirthday()+"\tId Card: "+this.getIdCard()+
                "\tPhone Number: "+this.getPhoneNumber()+
                "\tEmail: "+this.getEmail()+"\tAddress: "+this.getAddress();
    };
}
