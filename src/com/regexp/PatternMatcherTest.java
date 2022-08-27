package com.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest {
    public static void main(String[] args) {
        String text = "Привет вы ввели Hello электронный адрес artem@mail.com и другой электронный\n " +
                "адрес superartem@mail.ru и есть еще электронный адрес SUP12442qwa@yandex.ru";

        Pattern email = Pattern.compile("(\\w+)@(mail|yandex|gmail|ya)\\.(com|ru)");
        Matcher matcher = email.matcher(text);

        System.out.println("Вывести все сразу: ");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        System.out.println("Вывести только в 1-ую группу (w+)");
        matcher = email.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
        matcher = email.matcher(text);
        System.out.println("Вывести только в 2-ую группе (mail, yandex, ya, gmail)");
        while (matcher.find()) {
            System.out.println(matcher.group(2));
        }
        matcher = email.matcher(text);
        System.out.println("Вывести только в 3-ую группе (com и ru)");
        while (matcher.find()) {
            System.out.println(matcher.group(3));
        }
    }
}
