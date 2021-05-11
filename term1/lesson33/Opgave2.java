package term1.lesson33;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Opgave2 {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\emili\\development\\datamatiker\\code\\term1\\lesson33\\tal.txt");
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                int num = Integer.parseInt(scan.nextLine());
                System.out.println(num * 2);
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
