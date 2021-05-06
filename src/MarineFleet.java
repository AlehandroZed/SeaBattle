public class MarineFleet {
   // private List<Ship> ships = new ArrayList<>();
    private final String[][] fleet;//************************

    public MarineFleet() {//**************************
        this.fleet = new String[10][10];
    }

//    public void addShips() {  // добавляем корабли во флот
//        int maxDNuOfDecks = 2; //  4!!!!!
//        for (int j = maxDNuOfDecks; j > 0; j--) { //4
//            System.out.println("Deck of ship" + j);
//            for (int k = 0; k < maxDNuOfDecks + 1 - j; k++) {
//                this.ships.add(new Ship(j));
//                System.out.println("Ship is creating\n");
//            }
//        }
//
//    }
//
//    public List<Ship> getShips() {
//        return ships;
//    }

    public String[][] getFleet() {
        return fleet;
    }


    public void createFleet() {
        Ship[]ships = new Ship[3];

//        for (int i = 0; i < ships.length; i++) {// новая версия
//            ships[i] = new Ship();
//            ships[i].createShip1(1,1);
//        }

        ships[0] = new Ship();
        ships[0].createShip1();

        ships[1] = new Ship();
        ships[1].createShip2();

        ships[2] = new Ship();
        ships[2].createShip1();

        sendAShip(ships);// ОТПРАВИТЬ КОРАБЛИ ВО ФЛОТ!!!
    }

    private void sendAShip(Ship[] ships) {
        for (Ship ship: ships
             ) {
            String[][] newShip = ship.getShip();
            for (int i = 0; i < newShip.length; i++) {
                for (int j = 0; j < newShip[0].length; j++) {
                    if (newShip[i][j] != null) {
                        fleet[i][j] = newShip[i][j];
                    }
                }
            }
        }
    }

}

