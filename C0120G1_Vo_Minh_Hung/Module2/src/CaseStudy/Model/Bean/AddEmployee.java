package CaseStudy.Model.Bean;

import CaseStudy.Model.Dao.Employee;
import CaseStudy.Model.Dao.Person;

import static CaseStudy.Common.DocVaLuuFile.loadFileEmployee;
import static CaseStudy.Common.DocVaLuuFile.saveFileEmployee;
import static CaseStudy.Common.Validate.checkInterger;
import static CaseStudy.Controller.MainController.listEmployee;
import static CaseStudy.Controller.MainController.sc;

public class AddEmployee {
    public static void addEmployee(){
        Person employee = new Employee();
        AddPerson.addPerson(employee);
        String regex = "^[0-9]{3}$";
        System.out.println("Enter IdEmployee: 3 numbers");
        ((Employee)employee).setIdEmployee(checkInterger(regex, "Enter IdEmployee failed"));
        regex = "^[1-9]|[0-9]{2}$";
        System.out.println("Enter AgeEmployee: 1-99");
        ((Employee)employee).setAgeEmployee(checkInterger(regex, "Enter AgeEmployee failed"));
        System.out.println("Vui lòng nhập trình độ học vấn: ");
        ((Employee)employee).setLiteracy(sc.nextLine());
        System.out.println("Vui lòng nhập chức vụ: ");
        ((Employee)employee).setPosition(sc.nextLine());
        System.out.println("Vui lòng nhập lương: ");
        ((Employee)employee).setSalary(sc.nextLine());

        loadFileEmployee();
        listEmployee.add((Employee)employee);
        saveFileEmployee();
    }
}
