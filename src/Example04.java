public class Example04 {
    private int[] array = new int[]{1, 2, 3, 4, 5, 7, 12, 1};
    private int halfArray = array.length / 2;
    private int buffer;

    public void changeNumber() {
        for (int i = 0; i < halfArray; i++) {
            buffer = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i];
            array[i] = buffer;
        }
        for(int element : array){
            System.out.println(element);
        }
    }
}
