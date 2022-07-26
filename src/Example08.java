public class Example08 {
    public void doubleChar(String string) {
        String[] symbol = string.split("");
        for (String str : symbol) {
            System.out.print(str+str);
        }
    }
}
