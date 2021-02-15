package term1.lesson6;

import java.util.Scanner;

public class e51 {
    public static void main(String[] args) {
        System.out.println("Indtast et tal");
        Scanner scanner = new Scanner(System.in);
        int tal = scanner.nextInt();

        if (tal > 0) {
            System.out.println(tal + " Er positivt");
        } else if (tal < 0) {
            System.out.println(tal + " Er negativt");
        } else {
            System.out.println(tal + " Er nul");
        }
        scanner.close();
    }

}
