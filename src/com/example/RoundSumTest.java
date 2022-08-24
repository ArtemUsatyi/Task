package com.example;

public class RoundSumTest {
    public static void main(String[] args) {

        roundSumma(11, 12, 14);
    }

    private static void roundSumma(int a, int b, int c) {
        boolean flag = false;
        float aa = a;
        float bb = b;
        float cc = c;

        if ((aa % 10) >= 5 || (bb % 10) >= 5 || (cc % 10) >= 5) flag = true;

        if (flag)
            System.out.println("Число округлилось в большую сторону- " + Math.round(Math.ceil(((aa + bb + cc) / 10)) * 10));
        else
            System.out.println("Число округлилось в меньшую сторону- " + Math.round(Math.floor(((aa + bb + cc) / 10)) * 10));
    }
}
