package com.driver;

public class F1 extends Car {

    public F1(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats, boolean isManualF1) {
        super(name, wheels, doors, gears, isManual, type, seats);
        setManual(isManualF1);
    }

    public void accelerate(int rate){
        int newSpeed = super.getCurrentSpeed() + rate;

        if(newSpeed == 0) {
            changeGear(1);
        }
        else if(newSpeed >= 1 && newSpeed <= 50){
            changeGear(1);
        }
        else if(newSpeed >= 51 && newSpeed <= 100){
            changeGear(2);
        }
        else if(newSpeed >= 101 && newSpeed <= 150){
            changeGear(3);
        }
        else if(newSpeed >= 151 && newSpeed <= 200){
            changeGear(4);
        }
        else if(newSpeed >= 201 && newSpeed <= 250){
            changeGear(5);
        }
        else if(newSpeed > 250){
            changeGear(6);
        }

        if(newSpeed > 0) {
            changeSpeed(newSpeed, super.getCurrentDirection());
        }
    }
}