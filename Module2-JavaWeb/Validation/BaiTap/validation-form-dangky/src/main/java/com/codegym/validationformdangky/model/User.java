package com.codegym.validationformdangky.model;

import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @NotNull(message = "Không được để trống")
    @Size(min=5,max = 45,message = "Tên phải gồm từ 5-45 ký tự")
    @Pattern(regexp = "(\\b[A-ZẠÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚÝĂĐĨŨƯƠ][a-zàáâãèéêìíòóôõùúýăđĩũơư-ỹ]*\\b)",message = "Tên phải viết hoa chữ cái đầu tiên")
    private String firstName;

    @NotNull(message = "Không được để trống")
    @Size(min=5,max = 45,message = "Họ phải gồm từ 5-45 ký tự")
    @Pattern(regexp = "(\\b[A-ZẠÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚÝĂĐĨŨƯƠ][a-zàáâãèéêìíòóôõùúýăđĩũơư-ỹ]*( [A-ZẠÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚÝĂĐĨŨƯƠ][a-zàáâãèéêìíòóôõùúýăđĩũơư-ỹ]*)*\\b)",message = "Tên phải viết hoa chữ cái đầu tiên")
    private String lastName;

//    @NumberFormat
    @Pattern(regexp ="((1)[8-9])|([2-9][0-9])", message = "Vui long nhap so vaf tu 18-99")
//    @Min(value = 18,message = "Tuổi phải >=18")
    private String age;

    @NotNull(message = "Không được để trống")
    @Pattern(regexp = "(0)[0-9]{9}", message ="Số ĐT phải có 10 số và bắt đầu bằng số 0" )
    private String phoneNumber;

    @Email(message = "Email không đúng định dạng")
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
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
}
