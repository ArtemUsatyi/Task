package com.example;

public class BinarySearchElement {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 5, 8, 12, 22, 25, 29, 34, 56, 92, 100, 101, 102, 110, 120, 130, 131};
        int searchElement = 131;

        int firstElemArr = 0;
        int lastElemArr = array.length;
        int mid = (lastElemArr - firstElemArr) / 2;
        short flagLast = 0;
        short flagFirst = 0;

        while (true) {
            if (array[mid] == searchElement) {
                System.out.println("Число найдено, это число: " + array[mid] + ", элемент в массиве - " + mid);
                break;
            } else if (array[mid] == array[0] || array[mid] == array[array.length - 1] || flagFirst==10 || flagLast==10) {
                System.out.println("Число не найдено в массиве");
                break;
            } else if (array[mid] > searchElement) {
                lastElemArr = mid;
                mid = (lastElemArr - firstElemArr) / 2;
                flagLast = 0;
                flagFirst++;
            } else if (array[mid] < searchElement) {
                firstElemArr = mid;
                mid = (lastElemArr + firstElemArr) / 2;
                flagLast++;
                flagFirst = 0;
            }
        }
    }
}
