let SwitchButton = function () {

    this.getStatus = function () {
        return this.status ;
    };
    this.setStatus = function (status) {
        this.status = status;
    };
    this.switchOn = function () {
        this.status = true;
    }
    this.switchOff = function () {
        this.status = false
    }
};

let ElectricLamp = function () {
    this.setLampStatus = function (switchButton) {
        this.lampStatus = switchButton;
    };
    this.getLampStatus = function () {
        return this.lampStatus.getStatus();
    };
    this.turnOn = function () {
        return this.lampStatus.switchOn();
    };
    this.turnOff = function () {
        return this.lampStatus.switchOff();
    };
    this.light = function () {
            if(this.getLampStatus()){
                document.getElementById("imagesLamp").src = 'images/lampon.png';
                document.getElementById("imagesSwitch").src = 'images/turnoff.png';
            }else {
                document.getElementById("imagesLamp").src = 'images/lampoff.png';
                document.getElementById("imagesSwitch").src = 'images/turnon.png';
            }
    };
};
let switchButton = new SwitchButton();
switchButton.setStatus(true);
let electricLamp = new ElectricLamp();
electricLamp.setLampStatus(switchButton);

function check() {
    if(electricLamp.getLampStatus()){
        electricLamp.turnOff();electricLamp.light();
    }else {
        electricLamp.turnOn();electricLamp.light();
    }
}