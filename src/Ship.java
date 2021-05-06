public class Ship {
    private String[][] ship;// = new int[4][4];

    public Ship() {
        this.ship = new String[10][10];
    }

    public void createShip2() {
        Deck [] decks = new Deck[3];
        decks[0] = new Deck();
        decks[1] = new Deck();
        decks[2] = new Deck();
        ship[decks[0].getX()][decks[0].getY()] = "+";
        ship[decks[1].getX()][decks[1].getY()] = "+";
        ship[decks[2].getX()][decks[2].getY()] = "+";
    }

    public void createShip1() {
        Deck deck = new Deck();
        ship[deck.getX()][deck.getY()] = "+";

    }

    public String[][] getShip() {
        return ship;
    }
    //    private final int deck;
//
//    private final int[][] ship;
//
//    public Ship(int deck) {  // создаем корабль
//        this.deck = deck;
//        this.ship = new int[deck][2];
//        for (int i = 0; i < deck; i++) {
//
//            //EnterCoordinate enterCoordinate = new EnterCoordinate();
//
//            System.out.println("Введите координату X: ");
//            int x = new EnterCoordinate().go();
//
//
//            System.out.println("Введите координату Y: ");
//            int y = new EnterCoordinate().go();
//
//            System.out.println(x+" - "+y);
//
//            if (i > 0) {
//                if ((ship[i - 1][0] == x) || (ship[i - 1][1] == y)) {
//                    ship[i][0] = x;
//                    ship[i][1] = y;
//                } else {
//                    System.out.println("Координаты палубы не корректны!");
//                    i--;
//                }
//            } else {
//                ship[i][0] = x;
//                ship[i][1] = y;
//            }
//
//
//            System.out.println("deck № " + i + " is creating");
//
//        }
//        System.out.println("Ship is creating\n");
//    }
//
//    public int getDeck() {
//        return deck;
//    }
//
//
//    public int[][] getShip() {
//        return ship;
//    }
//
//    public boolean coordinateChecking(int i) {
//        return true;
//    }
}
