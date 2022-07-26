public class Example05 {
    private int[] array123 = new int[]{1, 11, 2, 4, 1, 2, 2, 5, 6};
    private boolean array = false;

    public void array123() {
        for (int i = 0; i < array123.length; i++) {
            if (array123[i] == 1) {
                if (array123[i + 1] == 2) {
                    if (array123[i + 2] == 3) {
                        array = true;
                        break;
                    }
                }
            }
        }
        if (array==true) System.out.println("array123 - " + true);
        else System.out.println("array123 - " + false);
    }
}
