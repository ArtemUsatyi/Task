package Collection.TelephoneDirectory;

import Polymorphism.Cat;

import java.util.LinkedList;

public class SearchCatalog {
    private boolean search = true;
    private int amountChar = 0;

    public void searchPrefix(LinkedList<Person> person, String keyPrefix) {
        for (Person value : person) {
            if (value.getName().length() >= keyPrefix.length()) {
                if (value.getName().substring(0, keyPrefix.length()).equals(keyPrefix)) {
                    System.out.println("Есть совпадение - префикс: " + keyPrefix + " -> " + value.getName() + " " + value.getSurname() + " " + value.getPhone() + " " + value.getAddress());
                    search = false;
                }
            }
            if (value.getSurname().length() >= keyPrefix.length()) {
                if (value.getSurname().substring(0, keyPrefix.length()).equals(keyPrefix)) {
                    System.out.println("Есть совпадение - префикс: " + keyPrefix + " -> " + value.getSurname() + " " + value.getName() + " " + value.getPhone() + " " + value.getAddress());
                    search = false;
                }
            }
            if (value.getPhone().length() >= keyPrefix.length()) {
                if (value.getPhone().substring(0, keyPrefix.length()).equals(keyPrefix)) {
                    System.out.println("Есть совпадение - префикс: " + keyPrefix + " -> " + value.getPhone() + " " + value.getName() + " " + value.getSurname() + " " + value.getAddress());
                    search = false;
                }
            }
            if (value.getAddress().length() >= keyPrefix.length()) {
                if (value.getAddress().substring(0, keyPrefix.length()).equals(keyPrefix)) {
                    System.out.println("Есть совпадение - префикс: " + keyPrefix + " -> " + value.getAddress() + " " + value.getName() + " " + value.getSurname() + " " + value.getPhone());
                    search = false;
                }
            }
        }
        if (search) System.out.println("Совпадение в каталоге не найдено!");
    }

}

