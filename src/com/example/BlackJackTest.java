package com.example;

public class BlackJackTest {
    public static void main(String[] args) {
        blackJackSearch(21, 19);
    }

    private static void blackJackSearch(int a, int b) {
        if (a < 22) {
            if (b < 22) {
                if (a < b) System.out.println("Наибольшее число второе: " + b);
                else if (b < a) System.out.println("Наибольшее число первое: " + a);
            } else System.out.println("Наибольшее число первое: " + a);
        } else if (b < 22) {
            if (a < 22) {
                if (a < b) System.out.println("Наибольшее число второе: " + b);
                else if (b < a) System.out.println("Наибольшее число первое: " + a);
            } else System.out.println("Наибольшее число второе: " + b);
        } else System.out.println("Все значения больше числа -  22");
    }
}
