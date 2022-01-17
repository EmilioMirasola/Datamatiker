package term2.eksamensforberedelse.dobbelArray.opgave2Teater;

import java.util.Scanner;

public class TheaterFloorApp {
	static Scanner scanner = new Scanner(System.in);
	static TheaterFloor theater = new TheaterFloor();

	public static void main(String[] args) {


		System.out.println("Vil du købe en billet til en bestemt pris? (Y/N)");
		if (scanner.nextLine().equalsIgnoreCase("Y")) {
			purchaseByPrice();
		} else {
			purchaseBySeat();
		}
	}

	private static void purchaseBySeat() {
		boolean purchaseDone = false;
		while (!purchaseDone) {
			System.out.println("Indtast række");
			int row = scanner.nextInt();
			System.out.println("Indtast sæde");
			int seat = scanner.nextInt();

			try {
				theater.buySeat(row, seat);
				purchaseDone = true;
				System.out.println("Billet købt!");
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Dette sæde findes desværre ikke");
			}
		}
	}

	public static void purchaseByPrice() {
		System.out.println("Indtast pris");
		int price = scanner.nextInt();

		int i = theater.buySeat(price);

		if (i != 0) {
			System.out.println("Billet købt!");
		} else {
			System.out.println("Der er desværre ingen billetter til denne pris");
		}
	}
}
