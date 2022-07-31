import java.util.ArrayList;
import java.util.Scanner;

public class Example11 {
    private ArrayList<String> locationCells = new ArrayList<>();
    private boolean isAlive = true;

    private void setLocationCells(int array) {
        locationCells.add(String.valueOf(array));
        locationCells.add(String.valueOf(array + 1));
        locationCells.add(String.valueOf(array + 2));
    }

    private String checkYourSelf(String userInput) {
        String rezult = "Мимо";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                rezult = "Потопил";
            } else rezult = "Попал";
        }
        return rezult;
    }

    public static void main(String[] args) {
        Example11 game = new Example11();
        Scanner scanner = new Scanner(System.in);

        int randomNum = (int) (Math.random() * 5);
        game.setLocationCells(randomNum);

        while (game.isAlive) {
            String check = scanner.nextLine();
            String rezult = game.checkYourSelf(check);
            System.out.println(rezult);
            if (rezult.equals("Потопил")) {
                System.out.println("Все корабли потоплены");
                game.isAlive = false;
            }
        }
    }
}
