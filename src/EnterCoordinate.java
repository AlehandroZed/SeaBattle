import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class EnterCoordinate {
    Scanner scanner;

    public int go() {
        while (true) {
            scanner = new Scanner(System.in);
            int coordinate = 0;
            try {
                coordinate = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Введите число!:");
                // e = null;
                continue;
            }

            if (!checkingOfField(coordinate)) {
                continue;
            }
            return coordinate;
        }
    }



    public static boolean checkingOfField(int coordinate) {
        if (coordinate < 1 || coordinate > new Sea().getHeight()) {
            System.out.println("Координаты вне поля!");
            System.out.println("Введите корректную координату:");
            return false;
        } else {
            return true;
        }
    }

}
