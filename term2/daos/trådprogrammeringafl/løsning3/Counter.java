package term2.daos.trådprogrammeringafl.løsning3;

import java.util.Random;

public class Counter {
	private int count = 0;

	public Counter() {
	}

	public int getCount() {
		return count;
	}

	public synchronized void increment(int time) {
		int temp = count;
		randomTime(time);
		count = temp + 1;
	}

	public void randomTime(int max) {
		Random r = new Random();
		int newMax = Math.abs(r.nextInt()) % max + 1;
		for (int i = 0; i < newMax; i++) {
			for (int j = 0; j < newMax; j++) {
				int rand = i + j - j;
			}
		}
	}
}
