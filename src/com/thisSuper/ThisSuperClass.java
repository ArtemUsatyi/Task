package com.thisSuper;

import com.polymorphism.DaysOfTheWeek;
import com.polymorphism.FruitEnum;

public class ThisSuperClass {
    public static void main(String[] args) {
        System.out.println("----- Конструктора----");
        Ford ford = new Ford(4, 1, 2);
        ford.single();
        Ford ford2 = new Ford();
        System.out.println("Вызов конструктора по умолчанию с Определенными параметрами - Колес" +
                ford2.getGear() + ";  Моторов - " + ford2.getMotor() + "Стекл - " + ford2.getGlass());
        System.out.println("Стекл ford: " + ford.getGlass());
        System.out.println("Колес ford: " + ford.getGear());
        System.out.println("Мотор ford: " + ford.getMotor());

        Ferrari ferrari = new Ferrari(4, 1);
        ferrari.single();

        System.out.println("-----DaysOfTheWeek Enum-----");
        DaysOfTheWeek day = DaysOfTheWeek.Friday;
        if (day == DaysOfTheWeek.Friday) {
            System.out.println("Да, сегодня Пятница!");
        }

        for (DaysOfTheWeek WeekDay : DaysOfTheWeek.values()) System.out.println(WeekDay);

        System.out.println("-----FruitEnum-----");

        System.out.println(FruitEnum.Orange.kilo + " - " + FruitEnum.Orange.price);
    }
}
