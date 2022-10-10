package com.example;

import java.util.Arrays;

public class BinarySearchFromJava {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 4, 6, 8, 9, 12, 15, 17, 18, 19, 21, 23, 35, 46, 57, 68, 789};
        int key = 17;

        int foundItemIndex = Arrays.binarySearch(array, key);
        System.out.println("Найденный элемент в массиве: " + foundItemIndex + " элемент =  " + array[foundItemIndex]);
    }
}
