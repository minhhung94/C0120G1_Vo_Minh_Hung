package CaseStudy.Model.Bean;

import CaseStudy.Model.Dao.Employee;
import CaseStudy.Model.Dao.Person;

import static CaseStudy.Controller.MainController.listEmployee;
import static CaseStudy.Controller.MainController.sc;

public class AddEmployee {
    public static void addEmployee(){
        Person employee = new Employee();
        AddPerson.addPerson(employee);
        System.out.println("Vui lòng nhập trình độ học vấn: ");
        ((Employee)employee).setLiteracy(sc.nextLine());
        System.out.println("Vui lòng nhập chức vụ: ");
        ((Employee)employee).setPosition(sc.nextLine());
        System.out.println("Vui lòng nhập lương: ");
        ((Employee)employee).setSalary(sc.nextLine());

        listEmployee.add((Employee)employee);
    }
}
