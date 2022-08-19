package Collection;

import java.util.ArrayList;

public class ArrayListNames {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        names.add("Artem");
        names.add("Sergei");
        names.add("Vasia");

        //for (Object value : names) System.out.println(value);
        System.out.println(names.get(0));
    }
}
