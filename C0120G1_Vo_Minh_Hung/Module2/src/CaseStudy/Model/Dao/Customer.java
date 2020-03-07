package CaseStudy.Model.Dao;

import TestCaseStudy.Test.Model.Services;

import java.util.ArrayList;

public class Customer extends Person {
    private String gender;
    private String idService;
    private String address;
    public ArrayList<Services> services = new ArrayList<>();
    public Customer() {
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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
        return super.showInfor()+"Giới tính: "+this.getGender()+
                "Địa chỉ: "+this.getAddress()+"Id Service: "+this.getIdService();
    }
}
