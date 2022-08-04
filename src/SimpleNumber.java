public class SimpleNumber {
    private static int number = 19;

    public static void main(String[] args) {

        simpleNumber();
    }

    private static void simpleNumber() {
        if (number%2 == 1) System.out.println(number + " - простое число");
        else System.out.println(number + "не простое число");
    }
}
