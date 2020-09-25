var bSuDungPin=0;
var bSacPin=0;

var Battery = function () {

    this.setEnergy = function (energy) {
        this.energy = energy;
    };

    this.getEnergy = function () {
        return this.energy;
    };

    this.decreaseEnergy = function () {
        if (this.energy > 0) {
            this.energy--;
        }
    }
};

var FlashLamp = function () {

    this.setBattery = function (battery) {
        this.battery = battery;
    };

    this.getBatteryInfo = function () {
        return this.battery.getEnergy();
    };

    this.light = function () {
        return this.status;
    };

    this.turnOn = function () {
        if(this.getBatteryInfo()>0)
        this.status = true;
    };

    this.turnOff = function () {
        this.status = false;
    }
};
var battery = new Battery();
battery.setEnergy(100);

var flashLamp = new FlashLamp();
flashLamp.setBattery(battery);
//Giảm % Pin khi sử dụng
function reduceBattery() {
    if(flashLamp.getBatteryInfo() > 0 && flashLamp.light() === true ){
        flashLamp.battery.decreaseEnergy();
        document.getElementById("percentPin").innerHTML="Percent of pin " + flashLamp.getBatteryInfo() + "%";
        bSuDungPin = setTimeout(reduceBattery,100);
    }else tatDen();
}

function sacPin() {
    document.images['imagesCharge'].src='images/icon.png';
    if(flashLamp.getBatteryInfo() < 100){
        flashLamp.battery.energy = flashLamp.getBatteryInfo() +1;
    }else {ngatSac();}
    document.getElementById("percentPin").innerHTML="Percent of pin " + flashLamp.getBatteryInfo() + "%";
    bSacPin = setTimeout(sacPin,80);
}

function ngatSac() {
    clearTimeout(bSacPin);
    document.images['imagesCharge'].src='';
}
function batDen() {
    flashLamp.turnOn();
    if(flashLamp.light()){
    document.images['imagesLamp'].src='images/pic_bulbon.gif';
    reduceBattery();
    }
}
function tatDen() {
    document.images['imagesLamp'].src='images/pic_bulboff.gif';
    flashLamp.turnOff();
}