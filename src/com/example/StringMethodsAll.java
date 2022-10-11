package com.example;

import javax.sound.midi.Soundbank;

public class StringMethodsAll {
    public static void main(String[] args) {
        String test = "Hello World!";
        String test1 = "Hello world!";

        //метод length() - возвращает ДЛИНУ строки
        System.out.println("length() - " + test.length());
        System.out.println("-----");

        //метод charAt() - возвращает символ по указанному индексу
        System.out.println("charAt() - " + test.charAt(4));
        System.out.println("-----");

        //метод indexOf('H') - возвращает ИНДЕКС в слове, в формате int
        System.out.println("indexOf() - " + test.indexOf('H'));
        System.out.println("-----");

        //метод isEmpty() - возвращает TRUE, если в строке нет символов. FALSE-если есть хоть 1(один) символ
        System.out.println("isEmpty() - " + test.isEmpty());
        System.out.println("-----");

        //метод equals() - возвращает TRUE, если строки одинаковые по объекту. Сравнивает эту строку с указанным объектом.
        //метод equalsIgnoreCase() - когда при сравнении строк нам не важен регистр.
        System.out.println("equals() - " + test.equals(test1));
        System.out.println("equalsIgnoreCase() -" + test.equalsIgnoreCase(test1));
        System.out.println("-----");

        //метод split() - разбиение строк по любому из символов в строке.
        // REGEX - принимает параметр по какому символу разбивать строку (пример : 'Пробел', 1, =, -)
        String[] words = test.split(" ");
        for (String word : words) System.out.println("split() - " + word);
        System.out.println("-----");

        //метод substring() - возвращает строку с определенного места.
        // Также substring(int beginIndex, int endIndex) - можно указать интервал вывода строки
        System.out.println("substring() - " + test.substring(2));
        System.out.println("substring() - " + test.substring(0, 5));
        System.out.println("-----");

        //метод valueOf() - переводит из Любого примитивного типа к строковую представлению
        System.out.println("valueOf() int  - " + test.valueOf(10));
        System.out.println("valueOf() long  - " + test.valueOf(10L));
        System.out.println("valueOf() float  - " + test.valueOf(10.1F));
        System.out.println("valueOf() double  - " + test.valueOf(10.1D));
        System.out.println("-----");

        //метод Integer.parseInt()/Double.parseInt() - переводит из строки примитивного типа к числовому значению.
        int i = Integer.parseInt("12");
        double d = Double.parseDouble("12.13245D");
        System.out.println("Integer.parseInt - " + i + ", Double.parseDouble - " + d);
        System.out.println("-----");

        //метод trim() - удаляет пробелы в начале и в конце строки и возвращает обратно строку.
        String test2 = "                   Много пробелов, убрать лишнее!                     ";
        System.out.println("не убраны пробелы -> " + test2);
        System.out.println("trim() ->" + test2.trim());
        System.out.println("-----");

        //метод toLowerCase()/toUpperCase - перевод строки в нижний/верний регистр.
        System.out.println("нижний регистр Lower - " + test.toLowerCase());
        System.out.println("верхний регистр Upper - " + test.toUpperCase());
        System.out.println("-----");

        // метод repeat() - повторяем строку строку, сколько указано в параметрах Count.
        System.out.println("repeat() - " + test.repeat(2));
        System.out.println("-----");

        // метод replace() - заменяет смиволы/слова в строке.
        //replace(char, char); - замена символа
        //replace(CharSequence, CharSequence); - заменяет слова
        //replaceFirst(String, String); - заменяет ПЕРВОЕ слова в строке
        //replaceAll(String regex, String replacement). - заменяет слова в строке.
        //в качестве первого аргумента regex возможно использование регулярного выражения.
        System.out.println("replace() - " + test.replace("World", "WORLD"));
        System.out.println("-----");
    }
}
