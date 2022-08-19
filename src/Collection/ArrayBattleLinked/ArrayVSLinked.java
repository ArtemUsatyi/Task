package Collection.ArrayBattleLinked;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayVSLinked {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("Добавление элементов в массив - Array/Linked");
        measureTimeAdd(arrayList);
        measureTimeAdd(linkedList);

        System.out.println("Получение элементов из массива - Array/Linked");
        measureTimeGet(arrayList);
        measureTimeGet(linkedList);

        arrayList.remove(1); // удаление элемента по индексу.
        System.out.println("Получение элента из массива ArrayList: " + arrayList.get(0));

        System.out.println("Нашлось совпадение по переданному элементу - true (нет - false): " + arrayList.contains(0));

        System.out.println("True - если ArrayList пустой, false - есть имеется в ArrayList: " + arrayList.isEmpty());

        System.out.println("Возвращает индекс по переданному значению (слову, строки), либо -1: " + arrayList.indexOf(1));

        System.out.println("Возвращает размер (количество) элементов в списке: " + arrayList.size());

        System.out.println("Изменить (положить) в указанный индекс, эначение(элемент): " + arrayList.set(0, 100) + " Новое число: " + arrayList.get(0));

        System.out.println("Полностью удаление (очищение) списка"); arrayList.clear();
    }

    public static void measureTimeAdd(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) list.add(i);
        long finish = System.currentTimeMillis();
        System.out.println(finish - start);
    }

    public static void measureTimeGet(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i : list) list.get(i);
        long finish = System.currentTimeMillis();
        System.out.println(finish - start);
    }

}
