public class Example03 {
    private int[] array = new int[]{190, 8, 15, 1, 3, 120, 0};
    private int buffer;

    public void sortArrayIncrement() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    buffer = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buffer;
                }
            }
        }
        for (int element : array) {
            System.out.println(element + " ");
        }
    }

    public void sortArrayDecrement() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    buffer = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buffer;
                }
            }
        }
        for (int element : array) {
            System.out.println(element + " ");
        }
    }
}
