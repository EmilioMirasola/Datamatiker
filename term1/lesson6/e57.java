package term1.lesson6;

import java.util.Scanner;

public class e57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tal 1: ");
        int tal1 = scanner.nextInt();
        
        System.out.println("Tal 2: ");
        int tal2 = scanner.nextInt();
        
        System.out.println("Tal 3: ");
        int tal3 = scanner.nextInt();

        if (tal2 > tal1 && tal3 > tal2) {
            System.out.println("Increasing");
        } else if (tal2 < tal1 && tal3 < tal2) {
            System.out.println("Decreasind");
        } else {
            System.out.println("Neither");
        }

        scanner.close();
    }
}
