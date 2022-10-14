package com.thisSuper;

public class Ford extends Car {
    private int glass;

    public int getGlass() {
        return glass;
    }

    public Ford() {
        this(5,0,4);
    }

    public Ford(int gear, int motor, int glass) {
        super(gear, motor);
        this.glass = glass;
    }

    @Override
    public void single() {
        System.out.println("Настоящий звук Ford!");
    }
}
