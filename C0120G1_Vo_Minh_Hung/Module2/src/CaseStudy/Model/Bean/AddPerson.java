package CaseStudy.Model.Bean;

import CaseStudy.Model.Dao.Person;

import static CaseStudy.Common.Validate.checkString;
import static CaseStudy.Controller.MainController.sc;

public class AddPerson {
    public static Person addPerson(Person person){
        String regex="^([A-ZẠÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚÝĂĐĨŨƯƠ]?[a-zàáâãèéêìíòóôõùúýăđĩũơư-ỹ][ ]?)+$";
        System.out.println("Vui lòng nhập họ và tên: ");
        person.setFullName(checkString(regex,"Enter Full Name Failed!"));
        regex ="^((0[1-9]|1[0-9]|2[0-8])/(0[1-9]|1[0-2])/((199[0-9]|200[0-2])))$";
        System.out.println("Vui lòng nhập ngày sinh (dd/MM/yyyy): ");
        person.setBirthday(checkString(regex,"Enter Birthday Failed!"));
        regex="^[0-9]{9}$";
        System.out.println("Vui lòng nhập số CMND:");
        person.setIdCard(checkString(regex,"Enter Id Card Failed!"));
        regex="^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$";
        System.out.println("Vui lòng nhập email");
        person.setEmail(checkString(regex,"Enter Email Failed!"));
        System.out.println("Vui lòng nhập số điện thoại");
        person.setPhoneNumber(sc.nextLine());
        return person;
    }

}
