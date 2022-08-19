package Collection.TelephoneDirectory;

import java.util.LinkedList;

public class ReplacePerson {
    private LinkedList<Person> person = new LinkedList<Person>();
    private boolean replace=true;

    public void replaceName(LinkedList<Person> person, String toNamePerson, String withNamePerson) {
        this.person = person;
        for (Person value : person) {
            if (value.getName().equals(toNamePerson)) {
                value.setName(withNamePerson);
                System.out.println("Имя заменено: "+value.getName()+" "+value.getSurname()+" "+value.getPhone()+" "+value.getAddress());
                replace = false;
            }
        }
        if (replace) System.out.println("Совпадений не найдено!");
    }
}
