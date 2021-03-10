package term1.lesson14.opgave2Teater;

import java.util.Scanner;

import term1.consoleColors.ConsoleColors;

public class TheaterFloorApp {

	public static void main(String[] args) {
		TheaterFloor theater = new TheaterFloor();
		boolean finished = false;

		// while (!finished) {
			System.out.println("Hvordan vil du købe en billet? (pris, plads)");
			Scanner in = new Scanner(System.in);
			String buyType = in.nextLine();
			if (buyType.equalsIgnoreCase("pris")) {
				pricePurchase(theater, in);
			} else if (buyType.equalsIgnoreCase("plads")) {
				seatingPurchase(theater, in);
			}
			// System.out.println("Vil du købe flere pladser? (Ja/nej)");
			// String response = in.nextLine();
			// if (response.equalsIgnoreCase("nej")) {
			// 	finished = true;
				in.close();
				theater.printTheaterFloor();
			// }
		// }
	}

	private static void seatingPurchase(TheaterFloor theater, Scanner in) {
		theater.printTheaterFloor();
		System.out.println(ConsoleColors.YELLOW + "Angiv række" + ConsoleColors.RESET);
		int row = in.nextInt();
		System.out.println(ConsoleColors.YELLOW + "Angiv sæde" + ConsoleColors.RESET);
		int seat = in.nextInt();

		int buyPrice = theater.buySeat(row, seat);

		if (buyPrice != -1) {
			System.out
					.println(ConsoleColors.GREEN + "Køb foretaget. Billetprisen er: " + buyPrice + ConsoleColors.RESET);
			System.out.println("Opdateret siddeplan:");
		} else {
			System.out.println(ConsoleColors.RED + "Pladsen findes ikke. Køb ikke foretaget" + ConsoleColors.RESET);
			System.out.println("Siddeplan ikke ændret");
		}
	}

	private static void pricePurchase(TheaterFloor theater, Scanner in) {
		theater.printTheaterFloor();
		System.out.println(ConsoleColors.YELLOW + "Til hvilken pris?" + ConsoleColors.RESET);
		int price = in.nextInt();

		int buyPrice = theater.buySeat(price);

		if (buyPrice != -1) {
			System.out
					.println(ConsoleColors.GREEN + "Køb foretaget. Billetprisen er: " + buyPrice + ConsoleColors.RESET);
			System.out.println("Opdateret siddeplan:");
		} else {
			System.out.println(ConsoleColors.RED + "Ingen biletter fundet til prisen: " + price
					+ ". Køb ikke gennemført" + ConsoleColors.RESET);
			System.out.println("Siddeplan ikke ændret");
		}
	}
}
