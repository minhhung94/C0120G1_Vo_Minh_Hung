package CaseStudy.Model.Bean;

import CaseStudy.Model.Dao.Person;

import static CaseStudy.Common.Validate.checkString;
import static CaseStudy.Controller.MainController.sc;

public class AddPerson {
    public static Person addPerson(Person person){
        sc.nextLine();
        String regex="^([A-ZẠÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚÝĂĐĨŨƯƠ]?[a-zàáâãèéêìíòóôõùúýăđĩũơư-ỹ][ ]?)+$";
        System.out.println("Vui lòng nhập họ và tên: ");
        person.setFullName(checkString(regex,"Phải viết hoa chữ cái đầu tiên mỗi từ"));
        regex ="^((0[1-9]|1[0-9]|2[0-8])/(0[1-9]|1[0-2])/((199[0-9]|200[0-2])))$";
        System.out.println("Vui lòng nhập ngày sinh (dd/MM/yyyy): ");
        person.setBirthday(checkString(regex,"Enter Birthday Failed!"));
        regex="^[0-9]{9}$";
        System.out.println("Vui lòng nhập số CMND: 9 Number");
        person.setIdCard(checkString(regex,"Số CMND phải là 9 số"));
        regex="^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$";
        System.out.println("Vui lòng nhập email");
        person.setEmail(checkString(regex,"Enter Email Failed!"));
        regex="^[0-9]{10}$";
        System.out.println("Vui lòng nhập số điện thoại: 10 Number");
        person.setPhoneNumber(checkString(regex,"SĐT phải là 10 số"));
        return person;
    }

}
