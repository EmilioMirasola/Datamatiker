package term2.eksamensforberedelse.recursion;

public class Recursion {

	public int findTalVærdi(int tal) {
		if (tal < 3) {
			return 0;
		}
		if (tal % 2 == 0) {
			return 2 * findTalVærdi(tal - 3) - findTalVærdi(tal - 1);
		} else {
			return findTalVærdi(tal - 1) + findTalVærdi(tal - 2) + 3 * (tal + tal - 3);
		}
	}
}
