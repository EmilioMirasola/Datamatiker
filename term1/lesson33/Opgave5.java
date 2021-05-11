package term1.lesson33;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Opgave5 {
    public static void main(String[] args) {
        try {
            System.out.println("Hvilke tal skal skrives til filen? Adskil med mellemrum");
            Scanner scan = new Scanner(System.in);
            PrintWriter pw = new PrintWriter("C:\\Users\\emili\\development\\datamatiker\\code\\term1\\lesson33\\opg5Tal.txt");

            int tal = 0;
            while (tal != -1) {
                System.out.println("Indtast et heltal. Afslut med -1");
                try {
                    tal = scan.nextInt();
                    if (tal != -1) {
                        pw.println(tal);
                    }
                } catch (InputMismatchException e) {
                    scan.nextLine();
                    System.out.println(e.getMessage());
                }
            }
            //pw.flush();
            pw.close();
            scan.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
