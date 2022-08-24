package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person(1, "Naitiry"));
        people.add(new Person(2, "George"));
        people.add(new Person (3,"Tim"));
        people.add(new Person(4, "Superman"));
        Collections.sort(people);
        System.out.println(people);
    }
}
class Person implements Comparable<Person>{
    private int id;
    private String name;

    public String getName() {
        return name;
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

    @Override
    public int compareTo(Person o) {
        if (this.name.length() < o.getName().length()) return 1;
        else if (this.name.length() > o.getName().length()) return -1;
        else return 0;
    }
}