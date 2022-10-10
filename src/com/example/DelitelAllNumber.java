package com.example;

import java.util.Scanner;

public class DelitelAllNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число: ");
        String test = scanner.nextLine();
        int number = Integer.parseInt(test);
        int levelSquared = 0;
        int levelThird = 0;
        int levelFive = 0;
        int levelSeven = 0;
        int levelNine = 0;
        int simpleNum = 0;

        while (number / 2 >= 1) {
            if (number % 2 == 0) {
                levelSquared++;
                number = number / 2;
            } else break;
        }
        while (number / 3 >= 1) {
            if (number % 3 == 0) {
                levelThird++;
                number = number / 3;
            } else break;
        }
        while (number / 5 >= 1) {
            if (number % 5 == 0) {
                levelFive++;
                number = number / 5;
            } else break;
        }
        while (number / 7 >= 1) {
            if (number % 7 == 0) {
                levelSeven++;
                number = number / 7;
            } else break;
        }
        while (number / 9 >= 1) {
            if (number % 9 == 0) {
                levelNine++;
                number = number / 9;
            } else break;
        }
        levelSquared = levelSquared + 1;
        levelThird = levelThird + 1;
        levelFive = levelFive + 1;
        levelSeven = levelSeven + 1;
        levelNine = levelNine + 1;
        if (levelSquared == 1 && levelThird == 1 && levelFive == 1 && levelSeven == 1 && levelNine == 1) simpleNum = 1;

        int delitelAllNum = levelSquared * levelThird * levelFive * levelSeven * levelNine + simpleNum;
        if (simpleNum == 0)
            System.out.println("Все делители числа: " + delitelAllNum);
        else System.out.println("Число является простым: " + delitelAllNum);
    }
}
