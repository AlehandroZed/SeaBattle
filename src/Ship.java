public class Ship {
    private final int deck;

    private final int[][] ship;

    public Ship(int deck) {  // создаем корабль
        this.deck = deck;
        this.ship = new int[deck][2];
        for (int i = 0; i < deck; i++) {

            //EnterCoordinate enterCoordinate = new EnterCoordinate();

            System.out.println("Введите координату X: ");
            int x = new EnterCoordinate().go();


            System.out.println("Введите координату Y: ");
            int y = new EnterCoordinate().go();

            System.out.println(x+" - "+y);

            if (i > 0) {
                if ((ship[i - 1][0] == x) || (ship[i - 1][1] == y)) {
                    ship[i][0] = x;
                    ship[i][1] = y;
                } else {
                    System.out.println("Координаты палубы не корректны!");
                    i--;
                }
            } else {
                ship[i][0] = x;
                ship[i][1] = y;
            }


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

    public boolean coordinateChecking(int i) {
        return true;
    }
}
