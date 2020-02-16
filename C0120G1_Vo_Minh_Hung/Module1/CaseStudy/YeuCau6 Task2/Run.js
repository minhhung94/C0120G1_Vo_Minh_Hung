let listEmployees = [];

let editcheck = false;

//#region Hiển thị menu chính
function displayMainMenu() {
    choose = prompt(
        "1. Add New Employee\n"
        + "2. Display Information Employee\n"
        + "3. Edit Information Employee\n"
        + "4. Delete Employee\n"
        + "5. Exit\n");
    switch (choose) {
        case "1":
            addNewEmployee();
            break;
        case "2":
            displayInformationEmployee();
            break;
        case "3":
            editInformationEmployee();
            break;
        case "4":
            deleteInformationEmployee();
            break;
        case "5":
            return;
        default:
            alert("failed!");
            displayMainMenu();
    }
}

//#endregion

//#region Thêm mới nhân viên
function addNewEmployee() {
    let employee = new Employee();
    employee.setNameEmployee(prompt("Enter Name Employee:"));
    employee.setIdCardEmployee(prompt("Enter Id Card Employee:"));
    employee.setBirthdayEmployee((prompt("Enter Birthday Employee (dd/MM/YYYY):")));
    employee.setEmailEmployee((prompt("Enter email Employee:")));
    employee.setAddressEmployee(prompt("Enter Address Employee:"));
    employee.setEducation(prompt("Enter Education Employee:"));
    employee.setPosition(prompt("Enter Position"));
    employee.setSalary(prompt("Enter Salary:"));

    listEmployees.push(employee);
    displayMainMenu();
}
//#endregion

//#region Hiển thị thông tin nhân viên

function displayInformationEmployee() {

    let choose = prompt("Vui lòng chọn nhân viên! \n"
        + getNameAndIdentityCard() + "\n"
        + (listEmployees.length + 1) + " .Back to menu");
    choose--;
    if (choose >= 0 && choose < listEmployees.length) {
        switch (choose) {
            case (listEmployees.length):
                displayMainMenu();
                break;
            default:
                displayEmployee(choose);
        }
    }
    displayMainMenu();
}

function getNameAndIdentityCard() {
    let result = "";
    for (let i = 0; i < listEmployees.length; i++) {
        result += i + 1 + ". " + "Name: "
            + listEmployees[i].getNameEmployee()
            + " - " + "ID: " + listEmployees[i].getIdCardEmployee() + "\n";
    }
    return result;
}

function displayEmployee(index) {
    if (editcheck) {
        let numberInfo = prompt(getInformationEmployee(index));
        editcheck= false;
        switch (parseInt(numberInfo)) {
            case 1:
                listEmployees[numberInfo - 1].setNameEmployee(prompt("Enter name you want edit!"));
                break;
            case 2:
                listEmployees[numberInfo - 1].setNameEmployee(prompt("Enter name you want edit!"));
                break;
            case 3:
                listEmployees[numberInfo - 1].setBirthdayEmployee(prompt("Enter name you want edit!"));
                break;
            case 4:
                listEmployees[numberInfo - 1].setEmailEmployee(prompt("Enter name you want edit!"));
                break;
            case 5:
                listEmployees[numberInfo - 1].setAddressEmployee(prompt("Enter name you want edit!"));
                break;
            case 6:
                listEmployees[numberInfo - 1].setTypeCustomer(prompt("Enter name you want edit!"));
                break;
            case 7:
                listEmployees[numberInfo - 1].setEducation(prompt("Enter name you want edit!"));
                break;
            case 8:
                listCustomers[numberInfo - 1].setPosition(prompt("Enter name you want edit!"));
                break;
            case 9:
                listCustomers[numberInfo - 1].setSalary(prompt("Enter name you want edit!"));
                break;
            default:
                alert("failed");
                displayMainMenu();
        }
    } else {
        alert(getInformationEmployee(index));
    }
}

function getInformationEmployee(index) {
    if (editcheck) {
        return "1. Name: " + " " + listEmployees[index].getNameEmployee() + "\n"
            + "2. ID Card: " + " " + listEmployees[index].getIdCardEmployee() + "\n"
            + "3. Birthday: " + " " + listEmployees[index].getBirthdayEmployee() + "\n"
            + "4. Email: " + " " + listEmployees[index].getEmailEmployee() + "\n"
            + "5. Address: " + " " + listEmployees[index].getAddressEmployee() + "\n"
            + "6. Education: " + " " + listEmployees[index].getEducation() + "\n"
            + "7. Position: " + " " + listEmployees[index].getPosition() + "\n"
            + "8. Salary: " + " " + listEmployees[index].getSalary() + "\n"
            + "9. Back";
    } else {
        return"1. Name: " + " " + listEmployees[index].getNameEmployee() + "\n"
            + "2. ID Card: " + " " + listEmployees[index].getIdCardEmployee() + "\n"
            + "3. Birthday: " + " " + listEmployees[index].getBirthdayEmployee() + "\n"
            + "4. Email: " + " " + listEmployees[index].getEmailEmployee() + "\n"
            + "5. Address: " + " " + listEmployees[index].getAddressEmployee() + "\n"
            + "6. Education: " + " " + listEmployees[index].getEducation() + "\n"
            + "7. Position: " + " " + listEmployees[index].getPosition() + "\n"
            + "8. Salary: " + " " + listEmployees[index].getSalary() + "\n"
    }
}

//#endregion

//#region Sửa thông tin nhân viên
function editInformationEmployee() {
    editcheck= true;
    displayInformationEmployee();
}

//#endregion

//#region Xóa thông tin nhân viên
function deleteInformationEmployee() {
    let numRemove = prompt(getNameAndIdentityCard() + "\n" + (listEmployees.length + 1) + " .Back ");
    if (parseInt(numRemove) === (listEmployees.length + 1)) {
        displayMainMenu();
    }
    listEmployees.splice(numRemove - 1, 1);
    displayMainMenu();
}

//#endregion

displayMainMenu(); //#region Hiển thị menu chính
function displayMainMenu() {
    choose = prompt(
        "1. Add New Employee\n"
        + "2. Display Information Employee\n"
        + "3. Edit Information Employee\n"
        + "4. Delete Employee\n"
        + "5. Exit\n");
    switch (choose) {
        case "1":
            addNewEmployee();
            break;
        case "2":
            displayInformationEmployee();
            break;
        case "3":
            editInformationEmployee();
            break;
        case "4":
            deleteInformationEmployee();
            break;
        case "5":
            return;
        default:
            alert("failed!");
            displayMainMenu();
    }
}

//#endregion

//#region Thêm mới nhân viên
function addNewEmployee() {
    let employee = new Employee();
    employee.setNameEmployee(prompt("Enter Name Employee:"));
    employee.setIdCardEmployee(prompt("Enter Id Card Employee:"));
    employee.setBirthdayEmployee((prompt("Enter Birthday Employee (dd/MM/YYYY):")));
    employee.setEmailEmployee((prompt("Enter email Employee:")));
    employee.setAddressEmployee(prompt("Enter Address Employee:"));
    employee.setEducation(prompt("Enter Education Employee:"));
    employee.setPosition(prompt("Enter Position"));
    employee.setSalary(prompt("Enter Salary:"));

    listEmployees.push(employee);
    displayMainMenu();
}
//#endregion

//#region Hiển thị thông tin nhân viên

function displayInformationEmployee() {

    let choose = prompt("Vui lòng chọn nhân viên! \n"
        + getNameAndIdentityCard() + "\n"
        + (listEmployees.length + 1) + " .Back to menu");
    choose--;
    if (choose >= 0 && choose < listEmployees.length) {
        switch (choose) {
            case (listEmployees.length):
                displayMainMenu();
                break;
            default:
                displayEmployee(choose);
        }
    }
    displayMainMenu();
}

function getNameAndIdentityCard() {
    let result = "";
    for (let i = 0; i < listEmployees.length; i++) {
        result += i + 1 + ". " + "Name: "
            + listEmployees[i].getNameEmployee()
            + " - " + "ID: " + listEmployees[i].getIdCardEmployee() + "\n";
    }
    return result;
}

function displayEmployee(index) {
    if (editcheck) {
        let numberInfo = prompt(getInformationEmployee(index));
        editcheck = false;
        switch (parseInt(numberInfo)) {
            case 1:
                listEmployees[numberInfo - 1].setNameEmployee(prompt("Enter name you want edit!"));
                break;
            case 2:
                listEmployees[numberInfo - 1].setNameEmployee(prompt("Enter name you want edit!"));
                break;
            case 3:
                listEmployees[numberInfo - 1].setBirthdayEmployee(prompt("Enter name you want edit!"));
                break;
            case 4:
                listEmployees[numberInfo - 1].setEmailEmployee(prompt("Enter name you want edit!"));
                break;
            case 5:
                listEmployees[numberInfo - 1].setAddressEmployee(prompt("Enter name you want edit!"));
                break;
            case 6:
                listEmployees[numberInfo - 1].setTypeCustomer(prompt("Enter name you want edit!"));
                break;
            case 7:
                listEmployees[numberInfo - 1].setEducation(prompt("Enter name you want edit!"));
                break;
            case 8:
                listEmployees[numberInfo - 1].setPosition(prompt("Enter name you want edit!"));
                break;
            case 9:
                listEmployees[numberInfo - 1].setSalary(prompt("Enter name you want edit!"));
                break;
            default:
                alert("failed");
                displayMainMenu();
        }
    } else {
        alert(getInformationEmployee(index));
    }
}

function getInformationEmployee(index) {
    if (editcheck) {
        return "1. Name: " + " " + listEmployees[index].getNameEmployee() + "\n"
            + "2. ID Card: " + " " + listEmployees[index].getIdCardEmployee() + "\n"
            + "3. Birthday: " + " " + listEmployees[index].getBirthdayEmployee() + "\n"
            + "4. Email: " + " " + listEmployees[index].getEmailEmployee() + "\n"
            + "5. Address: " + " " + listEmployees[index].getAddressEmployee() + "\n"
            + "6. Education: " + " " + listEmployees[index].getEducation() + "\n"
            + "7. Position: " + " " + listEmployees[index].getPosition() + "\n"
            + "8. Salary: " + " " + listEmployees[index].getSalary() + "\n"
            + "9. Back";
    } else {
        return"1. Name: " + " " + listEmployees[index].getNameEmployee() + "\n"
            + "2. ID Card: " + " " + listEmployees[index].getIdCardEmployee() + "\n"
            + "3. Birthday: " + " " + listEmployees[index].getBirthdayEmployee() + "\n"
            + "4. Email: " + " " + listEmployees[index].getEmailEmployee() + "\n"
            + "5. Address: " + " " + listEmployees[index].getAddressEmployee() + "\n"
            + "6. Education: " + " " + listEmployees[index].getEducation() + "\n"
            + "7. Position: " + " " + listEmployees[index].getPosition() + "\n"
            + "8. Salary: " + " " + listEmployees[index].getSalary() + "\n"
    }
}

//#endregion

//#region Sửa thông tin nhân viên
function editInformationEmployee() {
    editcheck = true;
    displayInformationEmployee();
}

//#endregion

//#region Xóa thông tin nhân viên
function deleteInformationEmployee() {
    let numRemove = prompt(getNameAndIdentityCard() + "\n" + (listEmployees.length + 1) + " .Back ");
    if (parseInt(numRemove) === (listEmployees.length + 1)) {
        displayMainMenu();
    }
    listEmployees.splice(numRemove - 1, 1);
    displayMainMenu();
}

//#endregion

displayMainMenu();