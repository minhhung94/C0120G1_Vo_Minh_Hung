package CaseStudy.Model.Dao;

public abstract class Person {
    private String fullName;
    private String birthday;
    private String idCard;
    private String phoneNumber;
    private String email;

    public Person() {
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

    public String showInfor(){
        return "Full Name: "+this.getFullName()+"Birthday: "+
                this.getBirthday()+"Id Card: "+this.getIdCard()+
                "Phone Number: "+this.getPhoneNumber()+"Email: "+this.getEmail();
    };
}
