import java.util.Scanner;

public class SodaDrink {
    private static String supplement;

    public static void main(String[] args) {

        String addition = new Scanner(System.in).nextLine();
        sodaMyDrink(addition);
    }

    public static void sodaMyDrink(String supplement) {
        if (!supplement.isEmpty()) System.out.println("Газировка с добавкой " + supplement);
        else System.out.println("Обычная газировка");
    }
}

