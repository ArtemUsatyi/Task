import java.util.ArrayList;

public class Example10 {

    private void arrayList() {
        ArrayList<String> myList = new ArrayList<>();
        String s = "Ура";
        myList.add(s);
        String a = "Welcome";
        myList.add(a);
        int theSize = myList.size(); // Array хранит два объекта, поэтому метод size() возращает 2
        System.out.println("Сколько объектов в myList = " + theSize);

        boolean isIn = myList.contains(s); // Сравнивает объекты и возвращает True/False
        System.out.println("Сравниваем объекты = " + isIn);

        int index = myList.indexOf(a);// Возвращает в метод indexOf - индексацию элементов, если они есть. -1 такого объекта нет
        System.out.println("Какой индекс у объекта 'а' в myList = " + index);

        boolean empty = myList.isEmpty(); // false - не пустой, true - пустой.
        System.out.println("Массив: false - не пустой, true - пустой = " + empty);

        myList.remove(1); // удаление по индексу или по имени объекта
        System.out.println("Сколько объектов в myList = " + myList.size());
    }

    public static void main(String[] args) {
        Example10 array = new Example10();
        array.arrayList();
    }
}
