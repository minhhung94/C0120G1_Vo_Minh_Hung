package CaseStudy.Common;

import CaseStudy.Model.Dao.Employee;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (Integer.parseInt(o1.getIdEmployee()) > Integer.parseInt(o2.getIdEmployee())) {
            return 1;
        } else if (Integer.parseInt(o1.getIdEmployee()) < Integer.parseInt(o2.getIdEmployee())) {
            return -1;
        } else {
            return 0;
        }
    }
}
