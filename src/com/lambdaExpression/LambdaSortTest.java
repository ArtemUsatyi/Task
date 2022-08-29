package com.lambdaExpression;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaSortTest {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("hi");
        words.add("news");
        words.add("ho-ho-ho");

        System.out.println("Без сортировки : " + words);

        words.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) return 1;
                else if (o1.length() < o2.length()) return -1;
                else return 0;
            }
        });
        System.out.println("После возрастанию сортировки Comparator(): " + words);

        words.sort((o1, o2) -> {
            return Integer.compare(o2.length(), o1.length());
        });
        System.out.println("После убыванию сортировки Lambda: " + words);
    }
}
