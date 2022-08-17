package Collection.TelephoneDirectory;

import Polymorphism.Cat;

import java.util.LinkedList;

public class SearchCatalog {
    LinkedList<Person> person = new LinkedList<>();
    private boolean search = true;

    public void searchPrefix(LinkedList<Person> person, String keyPrefix) {
        this.person = person;

        for (Person value : person) {
            if (value.getName().equals(keyPrefix)) {
                System.out.println("Совпадение по имени: " + value.getName() + " " + value.getSurname() + " " + value.getPhone() + " " + value.getAddress());
                search = false;
            } else if (value.getSurname().equals(keyPrefix)) {
                System.out.println("Совпадение по фамилии: " + value.getSurname() + " " + value.getName() + " " + value.getPhone() + " " + value.getAddress());
                search = false;
            } else if (value.getPhone().equals(keyPrefix)) {
                System.out.println("Совпадение по телефону: " + value.getPhone() + " " + value.getName() + " " + value.getSurname() + " " + value.getAddress());
                search = false;
            } else if (value.getAddress().equals(keyPrefix)) {
                System.out.println("Совпадение по адресу: " + value.getAddress() + " " + value.getName() + " " + value.getSurname() + " " + value.getPhone());
                search = false;
            }
        }
        if (search) System.out.println("Совпадение в каталоге не найдено!");
    }

}

