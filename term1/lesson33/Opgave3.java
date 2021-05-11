package term1.lesson33;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Opgave3 {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\emili\\development\\datamatiker\\code\\term1\\lesson33\\tal.txt");
            Scanner scan = new Scanner(file);
            List<Integer> integers = new ArrayList<>();
            while (scan.hasNextLine()) {
                int num = Integer.parseInt(scan.nextLine());
                integers.add(num);
            }
            Collections.reverse(integers);
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
