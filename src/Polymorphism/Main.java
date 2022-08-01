package Polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String animalType = new Scanner(System.in).next();

        Animal animal = zooService(animalType);

        animal.eat();
    }

    public static Animal zooService(String animalType) {
        if (animalType.equals("Кошка")) {
            return new Cat();

        } else if (animalType.equals("Собака")) {
            return new Dog();
        }
        return new Animal();
    }
}
