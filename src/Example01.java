public class Example01 {
    int[] mas = new int[]{10, 20, 9, 1, 7, 11, 5, 3, 2};
    int rezult = mas[0];

    public void minNumber() {
        for (int i = 0; i < mas.length; i++) {
            if (rezult < mas[i]) {
            } else rezult = mas[i];
        }
        System.out.println(rezult);
    }
}
