package com.collection.comparataror;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Bob");
        names.add("John");
        names.add("Mike");
        names.add("Artem");
        Collections.sort(names);
        System.out.println(names);

        List<Integer> number = new ArrayList<>();
        number.add(2);
        number.add(-10);
        number.add(1);
        number.add(100);
        number.add(24);
        number.sort(new BackwardsNumber());
        System.out.println(number);


        List<Person> people = new ArrayList<>();
        people.add(new Person(7, "Katy"));
        people.add(new Person(9, "Vova"));
        people.add(new Person(1, "Tim"));
        people.add(new Person(-3, "Lana"));
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getId() > o2.getId()) return 1;
                else if (o1.getId() < o2.getId()) return -1;
                else return 0;
            }
        });
        System.out.println(people);

    }
}

class BackwardsNumber implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 > o2) return -1;
        else if (o1 < o2) return 1;
        else return 0;
    }
}

class Person {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
