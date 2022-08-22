package com.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class SetCollection {
    public static void main(String[] args) {
        Set<Integer> hashSetId = new HashSet<>();
        Set<Integer> linkedHashSetId = new LinkedHashSet<>();
        Set<Integer> treeHashSetId = new TreeSet<>();

        setMethod(hashSetId);
        setMethod(linkedHashSetId);
        setMethod(treeHashSetId);
        System.out.println("Метод add() у HashSep - вызывает метод put() у HashMap, НО без ключа!");
        System.out.println("HashSet");
        System.out.println("Не соблюдает порядок при добавлении и не сортирует: " + hashSetId);
        System.out.println("LinkedHashSet");
        System.out.println("Сохраняет порядок при добавлении, но не сортирует: " + linkedHashSetId);
        System.out.println("TreeSet");
        System.out.println("При добавлении сортирует список: " + treeHashSetId);
        System.out.println("Другие методы");
        System.out.println("Возвращает True/False, если найдено значение: " + hashSetId.contains(22));
        System.out.println("Размер списка: " + linkedHashSetId.size());
        System.out.println("Получить HashCode HashSet: " + hashSetId.hashCode());
        System.out.println("Получить HashCode LinkedHashSet: " + linkedHashSetId.hashCode());
        System.out.println("Удаляет элемент по значению и возвращает True/False: " + treeHashSetId.remove(1));
        System.out.println("Сохраняет порядок при добавлении, но не сортирует: " + treeHashSetId);
        System.out.println("Выводит первый элемент в списке: " + linkedHashSetId.iterator().next());
    }

    private static void setMethod(Set<Integer> list) {
        list.add(133);
        list.add(22);
        list.add(1);
        list.add(42);
        list.add(9);
        list.add(25);
        list.add(25); // не добавляет одинаковые значения в список
    }
}
