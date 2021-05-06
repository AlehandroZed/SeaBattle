import java.util.ArrayList;
import java.util.List;


public class MarineFleet {
    private final List<Ship> ships = new ArrayList<>();

    public void addShips() {  // добавляем корабли во флот
        int maxDNuOfDecks = 2; //  4!!!!!
        for (int j = maxDNuOfDecks; j > 0; j--) { //4
            System.out.println("Deck of ship" + j);
            for (int k = 0; k < maxDNuOfDecks + 1 - j; k++) {
                this.ships.add(new Ship(j));
                System.out.println("Ship is creating\n");
            }
        }

    }

    public List<Ship> getShips() {
        return ships;
    }


}

