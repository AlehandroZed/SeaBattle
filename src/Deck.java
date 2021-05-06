import java.util.Scanner;

public class Deck {
    private final boolean isEmpty;
    private final int x;
    private final int y ;

    public Deck() {
        int[] coordinates = getCoordinates();// ПОЛУЧИТЬ КООРДИНАТЫ ДЛЯ УСТАНОВКИ ПАЛУБЫ!!!
        this.x = coordinates[0];
        this.y = coordinates[1];
        this.isEmpty = false;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

//    public int[][] getCoordinates() {
//        return coordinates;
//    }
//        private final int[] coordinates;
//    private final boolean isEmpty;


//    public Deck() {
//        this.coordinates = getCoordinates();
//        this.x = coordinates[0];
//        this.y = coordinates[1];
//        this.isEmpty = false;
//    }

    public int[] getCoordinates() {
        int[] coordinates = new int[2];
        int x;
        int y;
       // do {
            System.out.println("Введите координату X: ");
            x = enterCoordinate();// ПОЛУЧИТЬ КООРДИНАТУ Х!!!

            System.out.println("Введите координату Y: ");
            y = enterCoordinate();// ПОЛУЧИТЬ КООРДИНАТУ Y!!!

       // } while (!coordinateIsEmpty(coordinates));// ПОВТОРЯТЬ ЗАПРОС ПОКА НЕ БУДУТ ВВЕДЕНЫ СВОБОДНЫЕ КООРДИНАТЫ!!!

        coordinates[0] = x;// КООРДИНАТЫ ВЕРНЫ!!!
        coordinates[1] = y;

        return coordinates;// ОТПРАВИТЬ КООРДИНАТЫ!!!
    }


    public int enterCoordinate() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int coordinate;
            try {
                coordinate = scanner.nextInt();// ПРОВЕРИТЬ ЧТО ВВЕДЕНО ЧИСЛО !!!
            } catch (Exception e) {
                System.out.println("Введите число!:");
                continue;
            }
            if (!coordinateInSea(coordinate)) { // ПРОВЕРИТЬ, ЧТО КООРДИНАТА НАХОДИТЬСЯ В МОРЕ!!!
                continue;
            }
            return coordinate; // ОТПРАВИТЬ КООРДИНАТУ!!!
        }
    }



    private boolean coordinateInSea(int coordinate) {
        if (coordinate < 1 || coordinate > Sea.SIZE) {
            System.out.println("Координаты вне поля!");
            System.out.println("Введите корректную координату:");
            return false;
        } else {
            return true;

        }
    }
}
