public class Sea {
    public static final int SIZE = 10;
    public static final int WIDTH = SIZE;
    public static final int HEIGHT = SIZE;
    public static String[][] sea;

    public Sea() {//**********************************
        sea = new String[WIDTH][HEIGHT];
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                sea[i][j] = "-";
            }
        }
    }

    public void printSea() {//**********************
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                System.out.print(sea[j][i] + " ");
            }
            System.out.println();
        }
    }

    public void createEmptySea() {
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                sea[i][j] = "-";
            }
        }
    }

//    public void setShip(Ship ship) {
//        for (int i = 0; i < ship.getDeck(); i++) {
//            int x = ship.getShip()[i][0] - 1;
//            int y = ship.getShip()[i][1] - 1;
//
//        }
//    }

    public String[][] getSea() {
        return sea;
    }

    public int getWidth() {
        return WIDTH;
    }

    public int getHeight() {
        return HEIGHT;
    }


    public void setDeck(int x, int y) {
        sea[x][y] = "+";
    }

    public void getDeck(int x, int y) {

    }

    public void setShips() {//+++++++++++++++++++++++++++++
        MarineFleet fleet = new MarineFleet();// СОЗДАТЬ НОВЫЙ ФЛОТ!!!

        fleet.createFleet();// ЗАПОЛНИТЬ ФЛОТ КОРАБЛЯМИ!!!

        sendAFleet(fleet);// СПУСТИТЬ КОРАБЛИ НА ВОДУ!!!
    }

    private void sendAFleet(MarineFleet fleet) {
        String[][] newFleet = fleet.getFleet();
        for (int i = 0; i < newFleet.length; i++) {
            for (int j = 0; j < newFleet[0].length; j++) {
                if (newFleet[i][j] != null) {
                    sea[i][j] = newFleet[i][j];
                }
            }
        }
    }
}
