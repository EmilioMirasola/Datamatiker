package term2.daos.lesson15.eksempel2;

public class TraadKlassen extends Thread {

	private final int[] ints;
	private int max;

	public TraadKlassen(int[] ints) {
		this.ints = ints;
	}

	public void run() {
		this.max = this.findMax();
	}

	private int findMax() {
		int max = 0;
		for (int i : ints) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}

	public int getMax() {
		return this.max;
	}
}
