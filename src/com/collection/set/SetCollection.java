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

        linkedHashSetId.add(100);
        linkedHashSetId.add(1);
        linkedHashSetId.add(2);
        linkedHashSetId.add(3);
        linkedHashSetId.add(4);
        linkedHashSetId.add(5);
        linkedHashSetId.add(6);

        setMethod(hashSetId);
        setMethod(treeHashSetId);
        System.out.println("Метод add() у HashSep - вызывает метод put() у HashMap, НО без ключа!");
        System.out.println("HashSet");
        System.out.println("Не соблюдает порядок при добавлении и не сортирует: " + hashSetId);
        System.out.println("LinkedHashSet");
        System.out.println("Сохраняет порядок при добавлении, но не сортирует: " + linkedHashSetId);
        System.out.println("TreeSet");
        System.out.println("При добавлении сортирует список: " + treeHashSetId);
        System.out.println("Другие методы");
        System.out.println("Возвращает True/False, если найдено значение: " + hashSetId.contains(5));
        System.out.println("Размер списка: " + linkedHashSetId.size());
        System.out.println("Получить HashCode HashSet: " + hashSetId.hashCode());
        System.out.println("Получить HashCode LinkedHashSet: " + linkedHashSetId.hashCode());
        System.out.println("Удаляет элемент по значению и возвращает True/False: " + treeHashSetId.remove(10));
        System.out.println("Сохраняет порядок при добавлении, но не сортирует: " + treeHashSetId);
        System.out.println("Выводит первый элемент в списке: " + linkedHashSetId.iterator().next());

        // объединение множеств
        Set<Integer> union = new LinkedHashSet<>(linkedHashSetId);
        System.out.println(union);
        System.out.println("Выводит True/False если произошло добавление: "  + union.addAll(treeHashSetId));
        System.out.println(union);

        // intersection -пересечение множеств
        Set<Integer> intersection = new LinkedHashSet<>(linkedHashSetId);
        System.out.println("Выводит True/False если произошло пересечение: "  + intersection.retainAll(treeHashSetId));
        System.out.println(intersection);

        // difference - пересечение множеств
        Set<Integer> difference = new LinkedHashSet<>(linkedHashSetId);
        System.out.println("Выводит True/False если произошло разность (вычитание): "  + difference.removeAll(treeHashSetId));
        System.out.println(difference);


    }

    private static void setMethod(Set<Integer> list) {
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10); // не добавляет одинаковые значения в список
    }
}
