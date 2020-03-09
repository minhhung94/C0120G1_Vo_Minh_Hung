package CaseStudy.Model.Dao;

public class Employee extends Person {
    private String literacy;
    private String position;
    private String salary;

    public Employee() {
    }

    public Employee(String fullName, String birthday, String idCard, String phoneNumber, String email, String literacy, String position, String salary) {
        super(fullName, birthday, idCard, phoneNumber, email);
        this.literacy = literacy;
        this.position = position;
        this.salary = salary;
    }

    public String getLiteracy() {
        return literacy;
    }

    public void setLiteracy(String literacy) {
        this.literacy = literacy;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
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
        return super.showInfor()+"Literacy: "+ this.getLiteracy()+
                "Position: "+this.getPosition()+"Salary: "+this.getSalary();
    }

    @Override
    public String toString() {
        return super.showInfor()+"\tLiteracy: "+ this.getLiteracy()+
                "\tPosition: "+this.getPosition()+"\tSalary: "+this.getSalary();
    }
}
