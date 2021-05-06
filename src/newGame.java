public class newGame {
    public final int WIDTH = 10;
    public final int HEIGHT = 10;
    String[][] field = new String[WIDTH][HEIGHT];

    public static void main(String[] args) {

        newGame game =new newGame();
        game.createEmptySea();

        game.setShip(7,7);
        game.setShip(1,1);
        game.setShip(1,10);
        game.setShip(7,7);
        game.setShip(10,10);
        game.printSea();
    }

    public void createEmptySea() {
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                field[i][j] = "-";
            }
        }
    }

    public void printSea() {
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                System.out.print(field[j][i] + " ");
            }
            System.out.println();
        }
    }
    public void setShip(int x,int y){
        if (field[x - 1][y - 1].equals("+")){
            System.out.println("Ячейка занята");
        }
        field[x-1][y-1]="+";
    }
}
