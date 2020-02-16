
// Khởi tạo lớp nhân viên
let Employee = function () {
    this.setNameEmployee = function (name) {
        this.name = name;
    };
    this.getNameEmployee= function () {
        return this.name;
    };
    this.setIdCardEmployee = function (idCard) {
        this.idCard = idCard;
    };
    this.getIdCardEmployee = function () {
        return this.idCard;
    };
    this.setBirthdayEmployee = function (birthDay) {
        this.birthDay = birthDay;
    };
    this.getBirthdayEmployee = function () {
        return this.birthDay;
    };
    this.setEmailEmployee = function (email) {
        this.email = email;
    };
    this.getEmailEmployee = function () {
        return this.email;
    };
    this.setPhoneNumber = function (phoneNumber) {
        this.phoneNumber = phoneNumber;
    };
    this.getPhoneNumber = function () {
        return this.phoneNumber;
    };
    this.setAddressEmployee = function (address) {
        this.adress = address;
    };
    this.getAddressEmployee = function () {
        return this.adress;
    };
    this.setEducation = function (education) {
        this.education = education;
    };
    this.getEducation = function () {
        return this.education;
    };
    this.setPosition = function (position) {
        this.position = position;
    };
    this.getPosition = function () {
        return this.position;
    };
    this.setSalary = function (salary) {
        this.salary = salary;
    };
    this.getSalary = function () {
        if (this.position==="Manager") {
            return parseInt(this.salary) + 500;
        }
        else if (this.position==="Sale") {
            return  parseInt(this.salary) + 300;
        }
        else if (this.position==="Marketing") {
            return parseInt(this.salary) + 200;
        }
        else
            return this.salary;
    };
};