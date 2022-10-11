package com.example;

public class StringEnd {
    public static void main(String[] args) {
        String test = "Hello-po";
        if (test.length() == 2) {
            System.out.println(test);
        } else {
            System.out.println(test.substring(test.length() - 2));
        }
    }
}
