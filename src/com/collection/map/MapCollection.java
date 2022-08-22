package com.collection.map;

import java.util.*;


public class MapCollection {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        Map<Integer, String> map1 = new LinkedHashMap<>();
        Map<Integer, String> map2 = new TreeMap<>();

        putList(map);
        putList(map1);
        putList(map2);

        System.out.println(map);
        System.out.println(map1);
        System.out.println(map2);

        System.out.println("Если указать использованный ключ, значение перепишется: " + map.put(21, "MASHA"));
        System.out.println("Возвращает значение из списка: " + map.values());
        System.out.println("Возвращает ключи из списка: " + map2.keySet());
        System.out.println("Получить по 1-му ключу значение: " + map2.get(3));

        for (Map.Entry<Integer, String> entry : map2.entrySet()) {
            System.out.println("Вывести ключ - " + entry.getKey() + ", вывести значение - " + entry.getValue());
        }
    }

    private static void putList(Map list) {
        list.put(19, "Petr");
        list.put(21, "Sasha");
        list.put(3, "Artem");
    }
}
