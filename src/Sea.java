public class Sea {
    private final int width = 10;
    private final int height = 10;
    String[][] sea = new String[width][height];

    public Sea() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                sea[i][j] = "-";
            }
        }
    }

    public void printSea() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(sea[j][i]+" ");
            }
            System.out.println();
        }
    }

    public void createEmptySea() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                sea[i][j] = "-";
            }
        }
    }

    public void setShip(Ship ship){
        for (int i = 0; i < ship.getDeck(); i++) {
            int x = ship.getShip()[i][0]-1;
            int y = ship.getShip()[i][1]-1;
            sea[x][y] = "+";
        }
    }

    public String[][] getSea() {
        return sea;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
