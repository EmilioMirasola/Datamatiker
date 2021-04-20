package term1.lesson26.afleveringsopgave;

import java.util.Scanner;

public class BogApp {
    public static void main(String[] args) {
        Bog bog1 = new Bog("Harry Potter", false, 250);
        Bog bog2 = new Bog("Ringenes herre", true, 200);

        System.out.println("Titel: " + bog1.getTitel() + ", pris: " + bog1.getPris());
        System.out.println("Titel: " + bog2.getTitel() + ", pris: " + bog2.getPris());

        bog1.setPris(300);
        System.out.println(bog1.getTitel() + " ny pris: " + bog1.getPris());

        System.out.println(bog1.getTitel() + " udsalgspris: " + bog1.beregnUdsalgsPris());

        bog1.printBog();

        Scanner in = new Scanner(System.in);
        System.out.println("Angiv bogens titel");
        String title = in.next();

        System.out.println("Angiv bogens pris");
        double price = in.nextDouble();

        System.out.println("Er bogen paperback? (true/false)");
        boolean paperBack = in.nextBoolean();

        Bog bog3 = new Bog(title, paperBack, price);
        bog3.printBog();

    }
}
