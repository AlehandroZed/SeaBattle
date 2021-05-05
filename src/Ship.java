import java.util.Scanner;

public class Ship {
    private final int deck;

    private final int[][] ship;

    public Ship(int deck) {  // создаем корабль
        this.deck = deck;
        this.ship = new int[deck][2];
        for (int i = 0; i < deck; i++) {

            CoordinateChecking coordinateChecking = new CoordinateChecking();

            System.out.println("Введите координату X: ");
            ship[i][0] = coordinateChecking.go();

            System.out.println("Введите координату Y: ");
            ship[i][1] = coordinateChecking.go();

            System.out.println("deck № " + i + " is creating");

        }
        System.out.println("Ship is creating\n");
    }

    public int getDeck() {
        return deck;
    }


    public int[][] getShip() {
        return ship;
    }
}
