package constructor;

public class Constructor {
    private static int value = 0;

    public Constructor() {
        value++;
    }

    public void method() {
        System.out.println(value);
    }

    public void method(String str){
        System.out.println(str + value);
    }
}
