package term1.lesson33;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Opgave4 {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\emili\\development\\datamatiker\\code\\term1\\lesson33\\nyeTal.txt");
            PrintWriter pw = new PrintWriter(file);
            for (int i = 0; i < 100; i++) {
                if (i % 2 != 0) {
                    pw.println(i);
                }
            }
            pw.flush();
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
