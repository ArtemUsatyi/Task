package com.regexp;

import java.util.Arrays;

public class RegExpTest {
    public static void main(String[] args) {
        /*
        https://regexlib.com/ - Библиотека Регулярных выражений.
        https://www.youtube.com/watch?v=_pLpx6btq6U - видео про регулярные выражения

            \\d  - только одна цифра
            \\d* - 0 или болле цифр
            \\d+ - 1 или более цифр
            \\D  - все что угодно, что цифр

            \\w  - только одна Английские буква [a]
            \\w* - 0 или болле Английские буква [a-zA-z]
            \\d+ - 1 или более Английские буква [a-zA-z]

            \\W  - любой символ, Кроме буквенного, Цифрового или подчеркивания.

            \\s  - символ пробела
            \\S  - Все кроме Пробела

            \\b - граница слова
            \\В - не граница слова

               ? - 0 или 1 символ До выражения
           (x|у) - логическое ИЛИ До выражения, где x,y - аргументы для сравнения.
                   Пример: (x="первый символ" | y="первый символ") -> true

           (a|b|c|d|e|f|g|h|i) = [a-i] - сокращенно можно сделать

           [a-z] - интервал Одного символа - До выражения. Воспринимает Английские и Русские [a-z],[а-я]
                   Пример: [a-z=a] -> true
           [a-z]+ - интервал символов от 1 и более - До выражения.
                   Пример: [a-z=hello] -> true
           [a-zA-Z] - интервал символа верхний/низкий регистр До выражения. Т.е. принимает любые регистры.
           [a-zб-я0-9] - интервал включает и символы и буквы.
                   Пример: [a-яА-Я0-9=пример1Супер] -> true
           [*]   - в квадратных скобках можно помешать: Английские/Русские/Цифры/Символы. Символы ->  !)(№#`~

           [0-9] = [\\d] - выражения одинаковые

           \\. - два обратных слеша, превращают из Любого символа в натуральную (просто) точку
           \\+ - два обратных слеша, превращают в символ + (1 и более) в простой смивол + "плюс"

           [^abc] - все символы, Кроме abc

           .  - точка, обозначает любой ОДИН символ.

           {2}   - может быть только 2 символа
           {2,} - может быть от 2 и более сиволов
           {2,7} - может быть от 2 до 7 сиволов
         */
        String test = "12345125";
        String test1 = "-1";
        String test2 = "+1";

        System.out.println("Множество цифр : " + test.matches("\\d*"));
        System.out.println("Множество цифр и исключение первого символа : " + test1.matches("-?\\d*"));
        System.out.println("Множество цифр и логическое ИЛИ (- или +) : " + test2.matches("([-+])?\\d*"));

        String test3 = "ы1212412414";
        System.out.println("Интервал Одного символа: " + test3.matches("[a-zа-я]\\d*"));

        String test4 = "Много1234567890РусскихСимволов123456";
        System.out.println("Много символов и Много цифр: test 4 " + test4.matches("[а-яА-Я\\d]+\\d*"));

        String test5 = "~!*%$#()1234";
        System.out.println("Исключение символов: " + test5.matches("[~*!%$#()]+\\d*"));

        String test6 = "abc1234";
        System.out.println("Все символы, кроме символа 'а': " + test6.matches("[^a]+\\d*"));

        String test7 = "http://www.mail.ru";
        System.out.println("Заспознание веб-сайта: " + test7.matches("http://www\\..+\\.(com|ru)"));

        String test8 = "Hello";
        System.out.println("Одна буква: " + test8.matches("\\w"));
        System.out.println("Множество букв в слове: " + test8.matches("\\w*"));
        System.out.println("Интервал букв: " + test8.matches("\\w{2,}"));

        String test9 = "hello";
        System.out.println("Сравнение начало строки: " + test9.matches("^h\\w+"));
        System.out.println("Сравнение конца строки: " + test9.matches("\\w*o$"));

        String test10 = "hello good";
        System.out.println("пример: " + test10.matches("^h\\w*\\s\\w*"));

        String test11 = "1242 2309 3457 2716";
        System.out.println("Проверка банковской карты: " + test11.matches("\\d{4}\\s\\d{4}\\s\\d{4}\\s\\d{4}"));

        String test12 = "test hello";
        String[] words = test12.split("\\s");
        System.out.println("SPLIT: " + Arrays.toString(words));

        String test13 = "test234525hello252523532hi";
        String[] words1 = test13.split("\\d+");// в данном случае не Разделение, а ЗАМЕНА всех цифр до следующего слова
        System.out.println("Split (замена): " + Arrays.toString(words1));

        String test14 = "Hello hi hi";
        String testTest = test14.replace(" ", ".");
        System.out.println("Replace (замена): "+ testTest);

        String test15 = "Hello89238947234hi203783527928hi";
        String testTest1 = test14.replaceAll("\\d", " ");
        System.out.println("ReplaceAll (замена символов): "+ testTest1);

    }
}
