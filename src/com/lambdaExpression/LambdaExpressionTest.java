package com.lambdaExpression;


import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class LambdaExpressionTest {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        List<Integer> list1 = new ArrayList<>();

        fillArray(array1);
        fillList(list1);
        System.out.println(Arrays.toString(array1));
        System.out.println(list1);

        //map method
        System.out.println(" ------ map ------");
        array1 = Arrays.stream(array1).map(a -> a + 1).toArray();
        list1 = list1.stream().map(a -> a + 2).collect(Collectors.toList());
        System.out.println("map array + 1: " + Arrays.toString(array1));
        System.out.println("map list  + 2: " + list1);

        //filter method
        System.out.println(" ------ filter ------");
        array1 = Arrays.stream(array1).filter(a -> a % 2 == 1).toArray();
        list1 = list1.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
        System.out.println("filter array нечетные: " + Arrays.toString(array1));
        System.out.println("filter list четные: " + list1);

        //forEach method
        System.out.println(" ------ forEach ------");
        Arrays.stream(array1).forEach(System.out::println);
        list1.forEach(System.out::println);

        //reduce method
        int[] array2 = new int[10];
        List<Integer> list2 = new ArrayList<>();
        fillArray(array2);
        fillList(list2);
        System.out.println(" ------ reduce ------");
        int countArr = Arrays.stream(array2).reduce(Integer::sum).getAsInt();
        int countList = list2.stream().reduce((accum, b) -> accum * b).get();
        System.out.println("Сумма всех чисел в массиве: " + countArr);
        System.out.println("Произведение всех чисел в листе (масииве): " + countList);
    }

    private static void fillArray(int[] array) {
        for (int i = 0; i < 10; i++)
            array[i] = array[i] + (i + 1);
    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < 10; i++)
            list.add(i, i + 1);
    }
}
