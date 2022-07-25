public class Example01 {
    int[] mas = new int[]{10, 20, 9, 2, 7, 11, 5, 0, 2};
    int rezult = mas[0];

    public void minNumber() {
        for (int i = 0; i < mas.length; i++) {
            if (rezult > mas[i]) rezult = mas[i];
        }
        System.out.println(rezult);
    }
}
