package CaseStudy.Model.Bean;

import CaseStudy.Model.Dao.Customer;
import CaseStudy.Model.Dao.Person;

import static CaseStudy.Common.DocVaLuuFile.loadFileCustomer;
import static CaseStudy.Common.DocVaLuuFile.saveFileCustomer;
import static CaseStudy.Common.Validate.checkStringLowerCase;
import static CaseStudy.Controller.MainController.listCustomer;
import static CaseStudy.Controller.MainController.sc;

public class AddCustomer {
    public static void addCustomer(){
        Person customer = new Customer();
        AddPerson.addPerson(customer);
        String regex="^(?i)(male|female|unknow)$";
        System.out.println("Vui lòng nhập giới tính (Male, Female hoặc Unknow):");
        ((Customer)customer).setGender(checkStringLowerCase(regex,"Enter Gender Failed!"));
        System.out.println("Vui lòng nhập địa chỉ: ");
        ((Customer)customer).setAddress(sc.nextLine());
        System.out.println("Vui lòng nhập loại khách hàng (Diamond, Platinium, Gold, Silver, Member):");
        regex = "(?i)(diamond|platinium|gold|silver|member)";
        ((Customer)customer).setTypeCustomer(checkStringLowerCase(regex,"Enter Type Customer Failed!"));

        loadFileCustomer();
        listCustomer.add(((Customer)customer));
        saveFileCustomer();
    }

}
