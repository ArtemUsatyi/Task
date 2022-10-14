package com.thisSuper;

public class Ferrari extends Car {

    public Ferrari(int gear, int motor) {
        super(gear, motor);
    }

    @Override
    public void single() {
        super.single();
        System.out.println("Так звучит настоящий Ferrari!");
    }
}
