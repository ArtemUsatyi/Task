package constructor;

public class Main {
    public static void main(String[] args) {
        Constructor constructor1 = new Constructor();
        Constructor constructor2 = new Constructor();

        constructor1.method();
        constructor2.method("Статическая переменная value: ");
    }
}
