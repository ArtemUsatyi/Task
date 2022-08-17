package Collection.TelephoneDirectory;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Person> person = new LinkedList<>();

        Person clark = new Person("Clark", "Kent", "+777", "Smallville");
        person.add(0, clark);

        Person steve = new Person("Steve", "Super", "+6666666", "Texas");
        person.add(0, steve);

        SearchCatalog search = new SearchCatalog();
        search.searchPrefix(person, "Clark");

    }
}
