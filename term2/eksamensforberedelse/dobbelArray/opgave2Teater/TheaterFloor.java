package term2.eksamensforberedelse.dobbelArray.opgave2Teater;

public class TheaterFloor {
	int[][] seats = {{10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
			{10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
			{10, 10, 20, 20, 20, 20, 20, 20, 10, 10}, {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
			{20, 20, 30, 30, 40, 40, 30, 30, 20, 20}, {20, 30, 30, 40, 50, 50, 40, 30, 30, 20},
			{30, 40, 50, 50, 50, 50, 50, 50, 40, 30}};

	/**
	 * Hvis plads seat på række row er ledig reserveres pladsen og prisen på pladsen
	 * returneres. Der returneres 0 hvis pladsen er optaget.
	 *
	 * @param row
	 * @param seat
	 * @return
	 */

	public int buySeat(int row, int seat) {
		int price = seats[row][seat];

		if (price == 0) {
			return 0;
		}

		seats[row][seat] = 0;
		return price;
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
				int seatPrice = seats[i][j];
				if (seatPrice == price) {
					seats[i][j] = 0;
					return seatPrice;
				}
			}
		}
		return 0;
	}

	public void printTheaterFloor() {

	}
}
