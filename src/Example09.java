import java.util.Scanner;

class Example09 {

    private int[] locationCells = new int[]{0, 1, 2, 3};
    private int numOfHits = 0;
    private int check;
    private String rezult = "Мимо";

    public void checkYourself() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            check = Integer.parseInt(scanner.nextLine());
            rezult = "Мимо";
            for (int cells : locationCells) {
                if (cells == check) {
                    locationCells[cells] = -1;
                    rezult = "Попал";
                    numOfHits++;
                }
            }
            System.out.println(rezult);
            if (numOfHits == 4) {
                System.out.println("Все корабли потоплены");
                break;
            }

        }
    }

    public static void main(String[] args) {
        Example09 game = new Example09();
        game.checkYourself();
    }
}

