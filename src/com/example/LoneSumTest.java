package com.example;

public class LoneSumTest {
    public static void main(String[] args) {

        System.out.println("Сумма чисел равна: " + loneSumma(2, 2, 2));
    }

    private static int loneSumma(int a, int b, int c) {
        if (a == b && b == c) return 0;
        else if (a == b) return c;
        else if (b == c) return a;
        else if (a == c) return b;
        return a + b + c;
    }
}
