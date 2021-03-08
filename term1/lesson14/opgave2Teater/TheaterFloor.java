package term1.lesson14.opgave2Teater;

import java.util.Arrays;

import term1.consoleColors.ConsoleColors;

public class TheaterFloor {
	int[][] seats = { { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
			{ 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
			{ 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 }, { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
			{ 20, 20, 30, 30, 40, 40, 30, 30, 20, 20 }, { 20, 30, 30, 40, 50, 50, 40, 30, 30, 20 },
			{ 30, 40, 50, 50, 50, 50, 50, 50, 40, 30 } };

	/**
	 * Hvis plads seat på række row er ledig reserveres pladsen og prisen på pladsen
	 * returneres. Der returneres 0 hvis pladsen er optaget.
	 *
	 * @param row
	 * @param seat
	 * @return
	 */

	public int buySeat(int row, int col) {
		int rowIndexConvert = row - 1;
		int colIndexConvert = col - 1;
		int buyingPrice = 0;
		if (rowIndexConvert < seats.length && colIndexConvert < seats[0].length) {
			buyingPrice = seats[rowIndexConvert][colIndexConvert];
			seats[rowIndexConvert][colIndexConvert] = 0;
		} else {
			buyingPrice = -1;
		}
		return buyingPrice;
	}

	/**
	 * Hvis der er en plads ledig med den pågældende pris, reserveres pladsen og
	 * prisen returneres. Der returneres 0, hvis der ikke er nogen pladser ledige
	 * til den pågældende pris.
	 *
	 * @param row
	 * @param seat
	 * @return
	 */
	public int buySeat(int price) {
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats.length; j++) {
				if (seats[i][j] == price) {
					int seatPrice = seats[i][j];
					seats[i][j] = 0;
					return seatPrice;
				}
			}
		}
		return -1;

	}

	public void printTheaterFloor() {
		System.out.println("Sæde\t:\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10");
		System.out.println("\t----------------------------------------------------------------------------------");
		for (int i = 0; i <= seats.length - 1; i++) {
			System.out.print("Række " + (i + 1) + "\t:\t");
			for (int j = 0; j <= seats.length; j++) {
				System.out.print(seats[i][j] + "\t");

			}
			System.out.println();
		}
	}
}
