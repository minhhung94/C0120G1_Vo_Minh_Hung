let listCustomer = [];

let validateBirthday = /(((0|1)[0-9]|2[0-9]|3[0-1])\/(0[1-9]|1[0-2])\/\d{4})$/;
let validateEmail = /^[a-z][a-z0-9_\.]{5,32}@[a-z0-9]{2,}(\.[a-z0-9]{2,4}){1,2}$/;
let validateIdCard = /^[0-9]{6,}$/;
let validateNumber = /^[0-9]*$/;
let checkEditCustomer = false;
let checkDeleteCustomer = false;
let checkDisplayTotalPay = false;
displayMainMenu();
function displayMainMenu() {
    choose = prompt(
        "1. Add new Customer\n" +
        "2. Display Information Customer\n" +
        "3. Display TotalPay Customer\n" +
        "4. Edit information customer\n" +
        "5. Delete Customer.\n" +
        "6. Exit\n" +
        "Chọn menu:"
    );
    switch (choose) {
        case "1":
            addNewCustomer();
            break;
        case "2":
            alert(displayCustomer());
            displayMainMenu();
            break;
        case "3":
            chooseDisplayTotalPay();
            break;
        case "4":
            chooseCustomerEdit();
            break;
        case "5":
            chooseDeleteCustomer();
            break;
        case "6":
            return;
        default:
            alert("Chọn lại");
            displayMainMenu();
            break;
    }
}

function addNewCustomer() {
    let checkBirthday = false;
    let checkEmail = false;
    let checkIdCard = false;
    let checkNumber = false;
    let cus = new Customer();
    cus.setNameCustomer(prompt("Enter name customer: "));
    do {
        cus.setIdCard(prompt("Enter id card customer: "));
        if (validateIdCard.test(cus.getIdCard())){
            checkIdCard = true;
        }else {
            alert("Id Card is invalid. Please try again");
        }
    }while (!checkIdCard);

    do{
        cus.setBirthdayCustomer(prompt("Enter birthday customer (dd/mm/yyyy): "));
        if (validateBirthday.test(cus.getBirthdayCustomer())){
            checkBirthday = true;
        }else {
            alert("Birthday is invalid. Please try again");
        }
    }
    while (!checkBirthday);
    do {
        cus.setEmailCustomer(prompt("Enter Email customer: "));
        if (validateEmail.test(cus.getEmailCustomer())){
            checkEmail = true;
        }else {
            alert("Email is invalid. Please try again");
        }
    }
    while (!checkEmail);
    cus.setAddressCustomer(prompt("Enter Address customer: "));
    cus.setTypeCustomer(prompt("Enter Type customer: "));
    do {
        cus.setDiscount(prompt("Enter Discount customer: "));
        if (validateNumber.test(cus.getDiscount())){
            checkNumber = true;
        }else {
            alert("Please enter number!");
        }
    }while (!checkNumber);
    do {
        cus.setNumberOfAccompanying(prompt("Enter Number of Accompanying: "));
        if (validateNumber.test(cus.getNumberOfAccompanying())){
            checkNumber = false;
        }else {
            alert("Please enter number!");
        }
    }while (checkNumber);

    cus.setTypeRoom(prompt("Enter TypeRoom customer: "));
    do {
        cus.setRentDays(prompt("Enter RentDays customer: "));
        if (validateNumber.test(cus.getRentDays())){
            checkNumber = true;
        }else {
            alert("Please enter number!");
        }
    }while (!checkNumber);

    cus.setTypeService(prompt("Enter TypeService customer: "));
    listCustomer.push(cus);
    displayMainMenu();
}
function displayCustomer(){
    let result = "";
    for (var i = 0; i < listCustomer.length; i++) {
        result += "\n" + (i + 1) + ". Name: " + listCustomer[i].getNameCustomer() + " , Id : " + listCustomer[i].getIdCard();
    }
    result += "\n" + (listCustomer.length + 1) + ". Back to menu.";
    let chooseDisplayInfo = prompt(result);
    if(chooseDisplayInfo.toString() !== (listCustomer.length + 1).toString()){
        if(!checkDeleteCustomer && !checkDisplayTotalPay){
            displayInformationCustomer(Number.parseInt(chooseDisplayInfo)-1);
        }else if(checkDeleteCustomer) {
            deleteCustomer(Number.parseInt(chooseDisplayInfo)-1)
        }else {
            displayTotalPay(Number.parseInt(chooseDisplayInfo)-1)
        }
    }else {
        checkDisplayTotalPay = false;
        checkDeleteCustomer = false;
        checkEditCustomer = false;
        displayMainMenu();
    }
}
//hàm hiển thị thông tin Customer
function displayInformationCustomer(index) {
    if(checkEditCustomer){
        let chooseInfoEdit = prompt(
            "1.Name: " + listCustomer[index].getNameCustomer()+
            "\n2.IdCard: " + listCustomer[index].getIdCard()+
            "\n3.Birthday: " + listCustomer[index].getBirthdayCustomer()+
            "\n4.Email: " + listCustomer[index].getEmailCustomer()+
            "\n5.Address: " + listCustomer[index].getAddressCustomer()+
            "\n6.TypeCustomer: " + listCustomer[index].getTypeCustomer()+
            "\n7.Discount: " +listCustomer[index].getDiscount()+
            "\n8.Number of Accompanying: " + listCustomer[index].getNumberOfAccompanying()+
            "\n9.TypeRoom: " + listCustomer[index].getTypeRoom()+
            "\n10.RentDay: " + listCustomer[index].getRentDays()+
            "\n11.TypeService: " + listCustomer[index].getTypeService()+
            "\n12.Back. "
        );
        if(chooseInfoEdit.toString() !== "12"){
            editCustomer(Number.parseInt(chooseInfoEdit)-1);
        }else {
            checkEditCustomer = false;
            displayMainMenu();
        }
    }else {
        alert("InformationCustomer: \n" +
            "Name: " + listCustomer[index].getNameCustomer()+
            "\nIdCard: " + listCustomer[index].getIdCard()+
            "\nBirthday: " + listCustomer[index].getBirthdayCustomer()+
            "\nEmail: " + listCustomer[index].getEmailCustomer()+
            "\nAddress: " + listCustomer[index].getAddressCustomer()+
            "\nTypeCustomer: " + listCustomer[index].getTypeCustomer()+
            "\nDiscount: " +listCustomer[index].getDiscount()+
            "\nNumber of Accompanying: " + listCustomer[index].getNumberOfAccompanying()+
            "\nTypeRoom: " + listCustomer[index].getTypeRoom()+
            "\nRentDay: " + listCustomer[index].getRentDays()+
            "\nTypeService: " + listCustomer[index].getTypeService()
        );
        displayMainMenu(); }
}
function chooseDisplayTotalPay() {
    checkDisplayTotalPay = true;
    displayCustomer();
}
function displayTotalPay(index) {
    alert(listCustomer[index].totalPays());
    checkDisplayTotalPay = false;
    displayMainMenu();
}

function chooseCustomerEdit() {
    checkEditCustomer = true;
    displayCustomer();
}
function editCustomer(index) {
    let indexEdit = prompt("Enter Info You Want Change: ");
    switch (index) {
        case 0:
            listCustomer[index].setNameCustomer(indexEdit);
            break;
        case 1:
            listCustomer[index].setIdCard(indexEdit);
            break;
        case 2:
            listCustomer[index].setBirthdayCustomer(indexEdit);
            break;
        case 3:
            listCustomer[index].setEmailCustomer(indexEdit);
            break;
        case 4:
            listCustomer[index].setAddressCustomer(indexEdit);
            break;
        case 5:
            listCustomer[index].setTypeCustomer(indexEdit);
            break;
        case 6:
            listCustomer[index].setDiscount(indexEdit);
            break;
        case 7:
            listCustomer[index].setNumberOfAccompanying(indexEdit);
            break;
        case 8:
            listCustomer[index].setTypeRoom(indexEdit);
            break;
        case 9:
            listCustomer[index].setRentDays(indexEdit);
            break;
        case 10:
            listCustomer[index].setTypeService(indexEdit);
            break;
        default:
            alert("Faild!!!!!!!!");
            break;
    }
    checkEditCustomer = false;
    displayMainMenu();
}

function chooseDeleteCustomer() {
    checkDeleteCustomer = true;
    displayCustomer();
}

//Hàm Xoá Customer
function deleteCustomer(index) {
    let chooseConfirm = prompt(
        "Are you sure delete Customer: Name: " + listCustomer[index].getNameCustomer() +
        "; IdCard: " + listCustomer[index].getIdCard()+
        "\n1.Yes\n2.No" );
    if(chooseConfirm === "1"){
        listCustomer.splice(index,1);
        alert("Delete Complete!!!")
    }
    checkDeleteCustomer = false;
    displayMainMenu();
}