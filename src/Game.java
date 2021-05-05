public class Game {
    public static void main(String[] args) {

//        Game game = new Game();
        Sea sea = new Sea();
        sea.createEmptySea();

        MarineFleet marineFleetUser1 = new MarineFleet();
        marineFleetUser1.addShips();

        System.out.println(marineFleetUser1.getShips().size());

        for (Ship s : marineFleetUser1.getShips()) {
            sea.setShip(s);
        }

//        Ship ship1 = new Ship(3,1,1);
//        Ship ship2 = new Ship(1,3,4);
//        Ship ship3 = new Ship(2,5,7);
//        Ship ship4 = new Ship(4,2,9);
//
//        sea.setShip(ship1);
//        sea.setShip(ship2);
//        sea.setShip(ship3);
//        sea.setShip(ship4);

        sea.printSea();


    }
}
