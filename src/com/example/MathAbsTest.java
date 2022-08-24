package com.example;

import java.util.Scanner;

public class MathAbsTest {
    public static void main(String[] args) {
        int number1 = new Scanner(System.in).nextInt();
        int number2 = new Scanner(System.in).nextInt();
        int rezult = 6;
        if (number1 == rezult) System.out.println("Число 1 = " + rezult);
        else if (number2 == rezult) System.out.println("Число 2 = " + rezult);
        else if (Math.abs((number1 + number2)) == rezult) System.out.println("Сумма чисел равна: " + rezult);
        else if (Math.abs((number1 - number2)) == rezult) System.out.println("Разность чисел равна: " + rezult);
        else System.out.println("Число 1 и 2, ни разность, ни сумма Не равно: " + rezult);

    }
}
