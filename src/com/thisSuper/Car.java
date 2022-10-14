package com.thisSuper;

public class Car {
    private int gear;
    private int motor;

    public Car(int gear, int motor) {
        this.gear = gear;
        this.motor = motor;
    }

    public void single() {
        System.out.println("Просто звук мотора!!!");
    }

    public int getGear() {
        return gear;
    }

    public int getMotor() {
        return motor;
    }
}
