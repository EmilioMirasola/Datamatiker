package term1.lesson33;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FilUtil {
    public FilUtil() {
    }

    private Scanner readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        return new Scanner(file);
    }

    public int max(String fileName) throws IOException {
        Scanner scan = readFile(fileName);

        int max = scan.nextInt();
        while (scan.hasNextInt()) {
            int current = scan.nextInt();
            if (current > max) {
                max = current;
            }
        }
        scan.close();
        return max;
    }

    public int min(String fileName) throws IOException {
        Scanner scan = readFile(fileName);

        int min = scan.nextInt();
        while (scan.hasNextInt()) {
            int current = scan.nextInt();
            if (current < min) {
                min = current;
            }
        }
        scan.close();
        return min;
    }

    public double gennemsnit(String fileName) throws IOException {
        Scanner scan = readFile(fileName);
        double sum = 0;
        int numOfLines = 0;
        while (scan.hasNextInt()) {
            sum += scan.nextInt();
            numOfLines++;
        }
        scan.close();
        return sum / numOfLines;
    }
}
