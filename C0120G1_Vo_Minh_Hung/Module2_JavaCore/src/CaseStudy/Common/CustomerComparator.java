package CaseStudy.Common;

import CaseStudy.Model.Dao.Customer;

import java.util.Comparator;

public class CustomerComparator  implements Comparator<Customer> {

    @Override
    public int compare(Customer o1, Customer o2) {
        if (!o1.getFullName().equals(o2.getFullName())) {
            return o1.getFullName().compareTo(o2.getFullName());
        } else {
            int year1=Integer.parseInt(o1.getBirthday().substring(6));
            int year2=Integer.parseInt(o2.getBirthday().substring(6));
            if (year1 > year2) {
                return 1;
            } else if (year1 < year2) {
                return -1;
            } else {
                int month1=Integer.parseInt(o1.getBirthday().substring(3,5));
                int month2=Integer.parseInt(o2.getBirthday().substring(3,5));
                if (month1 > month2) {
                    return 1;
                } else if (month1 < month2) {
                    return -1;
                } else {
                    int day1=Integer.parseInt(o1.getBirthday().substring(0,2));
                    int day2=Integer.parseInt(o2.getBirthday().substring(0,2));
                    if (day1 > day2) {
                        return 1;
                    } else if (day1 < day2) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            }
        }
    }
}
