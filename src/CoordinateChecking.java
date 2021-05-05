import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class CoordinateChecking {

    public int go() {
        Scanner scanner = new Scanner(System.in);
        int coordinate = scanner.nextInt();
        if (coordinate <0 ||coordinate> new Sea().getHeight()){

        }

        return coordinate;
    }

}
