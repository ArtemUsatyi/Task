public class Example02 {
    private int sum = 0;
    private int inverter;

    public void setSum(int sum) {
        if (sum > 0) this.sum = sum;
        else {
            System.out.println("Число : " + sum + " - не является палиндромом");
        }
    }

    public void palindrome(int palindrome) {
        while (sum > 0) {
            int remainder = sum % 10;
            inverter = (inverter * 10) + remainder;
            sum = sum / 10;
        }
        if (inverter == palindrome) System.out.println("Число: " + palindrome + " - является палиндромом");
        else System.out.println("Число: " + palindrome + " НЕ - является палиндромом");
    }
}
